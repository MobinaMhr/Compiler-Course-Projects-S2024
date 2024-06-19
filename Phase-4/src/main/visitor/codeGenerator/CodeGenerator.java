package main.visitor.codeGenerator;

import com.sun.jdi.VoidType;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.compileError.typeErrors.AccessIndexIsNotInt;
import main.compileError.typeErrors.ListElementsInconsistentType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.util.Stack;
import java.util.HashMap;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;
    private Stack<String> loopDoStartStack = new Stack<>();
    private Stack<String> loopDoExitStack = new Stack<>();
    private String curLoopStartL;
    private String curLoopExitL;

    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "Ljava/util/ArrayList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> type += "V";
        }
        return type;
    }
    public String getClass(Type element){
        String className = "";
        switch (element){
            case StringType stringType -> className += "java/lang/String";
            case IntType intType -> className += "java/lang/Integer";
            case BoolType boolType -> className += "java/lang/Boolean";
            case null -> className += "java/lang/Object";
            default -> {}
        }
        return className;
    }
    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException ignored){}
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException ignored){}
    }
    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException ignored){}
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException ignored){}
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }
    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        slots.clear();
        slotOf("__Main__");
        SymbolTable.push(new SymbolTable());

        String commands = "";
        String args = "(";
        int i = 0;
        for (var arg : functionDeclaration.getArgs()) {
            Type argType = curFunction.getArgumentTypes().get(i);
            args += getType(argType);
            slotOf(arg.getName().getName());
            VarItem newVarItem = new VarItem(arg.getName());
            newVarItem.setType(argType);
            i++;
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists ignored){
                VarItem item = null;
                try {
                    item = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + newVarItem.getName());
                } catch (ItemNotFound ignored1) {}
                assert item != null;
                item.setType(this.curFunction.getArgumentTypes().get(i));
            }
        }
        args += ")";
        String returnType = "";
        returnType += getType(curFunction.getReturnType());
        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += args + returnType + "\n";

        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";

        boolean hasReturn = false;
        for (var stmt : functionDeclaration.getBody()) {
            String command = stmt.accept(this);
            if (command != null) {
                commands += command;
            }
            if (stmt instanceof ReturnStatement){
                hasReturn = true;
            }
        }
        if (!hasReturn) {
            commands += "return\n";
        }
        commands += ".end method\n";

        addCommand(commands);
        SymbolTable.pop();
        return null;
    }
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();
        slotOf("__Main__");

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody()) {
            String command = statement.accept(this);
            if (command != null) {
                commands += command;
            }
        }
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(AccessExpression accessExpression){
        String commands = "";

        if (accessExpression.isFunctionCall()) {
            Identifier functionIdentifier = (Identifier) accessExpression.getAccessedExpression();
            String funcName = "";
            Type funcType = functionIdentifier.accept(typeChecker);
            FunctionItem functionItem = null;
            if (funcType instanceof FptrType fptr){
                funcName += fptr.getFunctionName();
            } else {
                funcName += functionIdentifier.getName();
            }

            try {
                functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + funcName);
            } catch(ItemNotFound ignored) {}

            commands += "aload 0\n";
            int argCount = 0;
            String args = "(";
            for (Expression arg : accessExpression.getArguments()){
                Type argType = arg.accept(typeChecker);
                args += getType(argType);
                commands += arg.accept(this);
                if (argType instanceof BoolType) {
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                }
                else if (argType instanceof IntType) {
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                }
                argCount++;
            }
            for (int i = argCount; i < functionItem.getArgumentTypes().size(); i++){
                Type argType = functionItem.getArgumentTypes().get(i);
                args += getType(argType);
                commands += functionItem.getFunctionDeclaration().getArgs().get(i).getDefaultVal().accept(this);
                if (argType instanceof BoolType) {
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                }
                else if (argType instanceof IntType) {
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                }
            }
            args += ")";

            Type returnType = functionItem.getReturnType();
            commands += "invokevirtual Main/" + funcName + args + getType(returnType) + "\n";
            if (returnType instanceof BoolType) {
                commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            }
            else if (returnType instanceof IntType) {
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
            }
            return commands;
        }
        else {
            commands += accessExpression.getAccessedExpression().accept(this);

            for (Expression expr : accessExpression.getDimentionalAccess()) {
                commands += expr.accept(this);
            }

            Type type = accessExpression.getAccessedExpression().accept(typeChecker);
            ListType typeClass = (ListType) type;
            commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
            commands += "checkcast " + getClass(typeClass.getType()) + "\n";
            if (typeClass.getType() instanceof IntType)
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
            else if (typeClass.getType() instanceof BoolType){
                commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            }
        }

        return commands;
    }
    @Override
    public String visit(AssignStatement assignStatement){
        String commands = "";

        Type type = assignStatement.getAssignExpression().accept(typeChecker);
        Identifier assignedId = assignStatement.getAssignedId();
        int slot = slotOf(assignStatement.getAssignedId().getName());

        if (assignStatement.isAccessList()) {
            commands += assignStatement.getAssignedId().accept(this);
            commands += assignStatement.getAccessListExpression().accept(this);

            switch (assignStatement.getAssignOperator()){
                case AssignOperator.ASSIGN -> {
                    commands += assignStatement.getAssignExpression().accept(this);
                    if (type instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if (type instanceof BoolType){
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    }
                    commands += "checkcast " + getClass(null) + "\n";
                    commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n";
                }
                case AssignOperator.PLUS_ASSIGN -> {
                    commands += assignStatement.getAssignedId().accept(this);
                    commands += assignStatement.getAccessListExpression().accept(this);
                    commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
                    commands += "checkcast " + getClass(new IntType()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += assignStatement.getAssignExpression().accept(this);
                    commands += "iadd\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "checkcast " + getClass(null) + "\n";
                    commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n";
                }
                case AssignOperator.MINUS_ASSIGN -> {
                    commands += assignStatement.getAssignedId().accept(this);
                    commands += assignStatement.getAccessListExpression().accept(this);
                    commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
                    commands += "checkcast " + getClass(new IntType()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += assignStatement.getAssignExpression().accept(this);
                    commands += "ineg\n";
                    commands += "iadd\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "checkcast " + getClass(null) + "\n";
                    commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n";
                }
                case AssignOperator.DIVIDE_ASSIGN -> {
                    commands += assignStatement.getAssignedId().accept(this);
                    commands += assignStatement.getAccessListExpression().accept(this);
                    commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
                    commands += "checkcast " + getClass(new IntType()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += assignStatement.getAssignExpression().accept(this);
                    commands += "idiv\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "checkcast " + getClass(null) + "\n";
                    commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n";
                }
                case AssignOperator.MULT_ASSIGN -> {
                    commands += assignStatement.getAssignedId().accept(this);
                    commands += assignStatement.getAccessListExpression().accept(this);
                    commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
                    commands += "checkcast " + getClass(new IntType()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += assignStatement.getAssignExpression().accept(this);
                    commands += "imul\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "checkcast " + getClass(null) + "\n";
                    commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n";
                }
                case AssignOperator.MOD_ASSIGN -> {
                    commands += assignStatement.getAssignedId().accept(this);
                    commands += assignStatement.getAccessListExpression().accept(this);
                    commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
                    commands += "checkcast " + getClass(new IntType()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += assignStatement.getAssignExpression().accept(this);
                    commands += "irem\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "checkcast " + getClass(null) + "\n";
                    commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n";
                }
                case null, default -> {}
            }
        }
        else {
            commands += assignStatement.getAssignExpression().accept(this);
            switch (assignStatement.getAssignOperator()){
                case AssignOperator.ASSIGN -> {
                    VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
                    newVarItem.setType(type);
                    try {
                        SymbolTable.top.put(newVarItem);
                    }catch (ItemAlreadyExists ignored){
                        VarItem item = null;
                        try {
                            item = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + newVarItem.getName());
                        } catch (ItemNotFound ignored1) {}
                        assert item != null;
                        item.setType(type);
                    }
                    if (type instanceof BoolType) {
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    } else if (type instanceof IntType) {
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    }
                    commands += "astore ";
                    commands += slotOf(assignStatement.getAssignedId().getName()) + "\n";
                }
                case AssignOperator.PLUS_ASSIGN -> {
                    commands += "aload " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "iadd\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                }
                case AssignOperator.MINUS_ASSIGN -> {
                    commands += "ineg\n";
                    commands += "aload " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "iadd\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                }
                case AssignOperator.DIVIDE_ASSIGN -> {
                    commands += "aload " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "swap\n";
                    commands += "idiv\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                }
                case AssignOperator.MULT_ASSIGN -> {
                    commands += "aload " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "imul\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                }
                case AssignOperator.MOD_ASSIGN -> {
                    commands += "aload " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "swap\n";
                    commands += "irem\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(assignStatement.getAssignedId().getName()) + "\n";
                }
                case null, default -> {}
            }
        }

        return commands;
    }
    @Override
    public String visit(IfStatement ifStatement){
        String commands ="";
        for (Expression condition : ifStatement.getConditions()){
            commands += condition.accept(this);
        }
        String thenLabel = getFreshLabel();
        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();

        commands += "ifeq" + " " + elseLabel + "\n";
        commands += thenLabel + ":\n";

        SymbolTable.push(SymbolTable.top.copy());
        for (Statement statement : ifStatement.getThenBody())
            commands += statement.accept(this);
        SymbolTable.pop();
        commands += "goto " + exitLabel + "\n";
        commands += elseLabel + ":\n";
        if (!ifStatement.getElseBody().isEmpty()) {
            SymbolTable.push(SymbolTable.top.copy());
            for (Statement statement : ifStatement.getElseBody())
                commands += statement.accept(this);
            SymbolTable.pop();
        }

        commands += exitLabel + ":\n";
        return commands;
    }
    @Override
    public String visit(PutStatement putStatement){
        String commands = "";

        commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        Expression putExpr = putStatement.getExpression();
        commands += putExpr.accept(this);

        Type type = putStatement.getExpression().accept(typeChecker);
        if (type instanceof IntType)
            commands += "invokevirtual java/io/PrintStream/println(I)V\n";
        else if (type instanceof BoolType)
            commands += "invokevirtual java/io/PrintStream/println(Z)V\n";
        else if (type instanceof StringType)
            commands += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";

        return commands;
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        String commands = "";

        Expression retExpr = returnStatement.getReturnExp();
        if (retExpr == null) {
            commands += "return\n";
            return commands;
        }

        Type retType = retExpr.accept(typeChecker);
        if (retType instanceof NoType) commands += "return\n";
        else {
            commands += retExpr.accept(this);
            if (retType instanceof BoolType) {
                commands += "invokestatic java/lang/Boolean/valueOf(I)Ljava/lang/Boolean;\n";
            } else if (retType instanceof IntType) {
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            }
            commands += "areturn\n";
        }

        return commands;
    }
    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public String visit(BinaryExpression binaryExpression){
        String commands = "";

        commands += binaryExpression.getFirstOperand().accept(this);
        commands += binaryExpression.getSecondOperand().accept(this);
        Type firstOperandType = binaryExpression.getFirstOperand().accept(typeChecker);

        String enterLabel;
        String exitLabel;
        if (binaryExpression.getOperator() != BinaryOperator.PLUS && binaryExpression.getOperator() != BinaryOperator.MINUS
                && binaryExpression.getOperator() != BinaryOperator.MULT && binaryExpression.getOperator() != BinaryOperator.DIVIDE )
        {
            enterLabel = getFreshLabel();
            exitLabel = getFreshLabel();

            switch (binaryExpression.getOperator()) {
                case BinaryOperator.EQUAL -> {
                    if (firstOperandType instanceof IntType || firstOperandType instanceof BoolType) {
                        commands += "if_icmpeq " + enterLabel + "\n";
                    }
                    else {
                        commands += "if_acmpeq " + enterLabel + "\n";
                    }
                }
                case BinaryOperator.NOT_EQUAL -> {
                    if (firstOperandType instanceof IntType || firstOperandType instanceof BoolType) {
                        commands += "if_icmpne " + enterLabel + "\n";
                    }
                    else {
                        commands += "if_acmpne " + enterLabel + "\n";
                    }
                }
                case BinaryOperator.GREATER_THAN -> commands += "if_icmpgt " + enterLabel + "\n";
                case BinaryOperator.LESS_THAN -> commands += "if_icmplt " + enterLabel + "\n";
                case BinaryOperator.GREATER_EQUAL_THAN -> commands += "if_icmpge " + enterLabel + "\n";
                case BinaryOperator.LESS_EQUAL_THAN -> commands += "if_icmple " + enterLabel + "\n";
                default -> {}
            }

            commands += "ldc 0\n";
            commands += "goto " + exitLabel + "\n";
            commands += enterLabel + ":\n";
            commands += "ldc 1\n";
            commands += exitLabel + ":\n";
        }
        else {
            switch (binaryExpression.getOperator()) {
                case BinaryOperator.PLUS -> commands += "iadd\n";
                case BinaryOperator.MINUS -> commands += "isub\n";
                case BinaryOperator.MULT -> commands += "imul\n";
                case BinaryOperator.DIVIDE -> commands += "idiv\n";
                default -> {}
            }
        }
        return commands;
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        String commands = "";

        Type operandType = unaryExpression.getExpression().accept(typeChecker);
        commands += unaryExpression.getExpression().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        switch (operator) {
            case NOT -> {
                commands += "ldc 1\n";
                commands += "ixor\n";
            }
            case MINUS -> commands += "ineg\n";
            case INC -> {
                commands += "ldc 1\n";
                commands += "iadd\n";
                if (unaryExpression.getExpression() instanceof Identifier identifier) {
//                    commands += "dup\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(identifier.getName()) + "\n";
                }
            }
            case DEC -> {
                commands += "ldc -1\n";
                commands += "iadd\n";
                if (unaryExpression.getExpression() instanceof Identifier identifier) {
//                    commands += "dup\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "astore " + slotOf(identifier.getName()) + "\n";
                }
            }
            default -> {}
        }

        return commands;
    }
    @Override
    public String visit(Identifier identifier){
        String commands = "";

        Type type = identifier.accept(typeChecker);
        if (type instanceof IntType) {
            commands += "aload ";
            commands += slotOf(identifier.getName()) + "\n";
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
        }
        else if (type instanceof BoolType) {
            commands += "aload ";
            commands += slotOf(identifier.getName()) + "\n";
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        }
        else if (type instanceof FptrType fptr) {
            commands += "new Fptr\n";
            commands += "dup\n";
            commands += "aload_0\n";
            commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
            commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        }else {
            commands += "aload ";
            commands += slotOf(identifier.getName()) + "\n";
        }

        return commands;
    }
    public void pushLoopLabels(String startL, String exitL) {
        loopDoStartStack.push(curLoopStartL);
        curLoopStartL = startL;
        loopDoExitStack.push(curLoopExitL);
        curLoopExitL = exitL;
    }
    public void popLoopLabels() {
        curLoopStartL = loopDoStartStack.pop();
        curLoopExitL = loopDoExitStack.pop();
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){
        String commands = "";

        String startL = getFreshLabel();
        String exitL = getFreshLabel();
        pushLoopLabels(startL, exitL);
        commands += startL + ":\n";

        SymbolTable.push(SymbolTable.top.copy());
        for (Statement statement : loopDoStatement.getLoopBodyStmts()){
            commands += statement.accept(this);
        }
        SymbolTable.pop();
        commands += "goto " + startL + "\n";
        commands += exitL + ":\n";
        this.popLoopLabels();

        return commands;
    }
    @Override
    public String visit(BreakStatement breakStatement){
        String commands = "";

        commands += "goto " + curLoopExitL + "\n";
        return commands;
    }
    @Override
    public String visit(NextStatement nextStatement){
        String commands = "";

        commands += "goto " + curLoopStartL + "\n";
        return commands;
    }
    @Override
    public String visit(LenStatement lenStatement){
        String commands = "";
        commands += lenStatement.getExpression().accept(this);
        if (lenStatement.getExpression().accept(typeChecker) instanceof ListType){
            commands += "invokevirtual java/util/ArrayList/size()I\n";
        }
        else{
            commands += "invokevirtual java/lang/String/length()I\n";
        }
        return commands;
    }
    @Override
    public String visit(ChopStatement chopStatement){
        String commands = "";

        commands += chopStatement.getChopExpression().accept(this);
        commands += "dup\n";
        commands += "invokevirtual java/lang/String/length()I\n";
        commands += "ldc -1\n";
        commands += "iadd\n";
        commands += "ldc 0\n";
        commands += "swap\n";
        commands += "invokevirtual java/lang/String/substring(II)Ljava/lang/String;\n";

        return commands;
    }
    @Override
    public String visit(FunctionPointer functionPointer){
        String commands = "";

        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";

        return commands;
    }
    @Override
    public String visit(ListValue listValue){
        String commands = "";

        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        commands += "astore " + slotOf("array_") + "\n";

        for (Expression expression : listValue.getElements()) {
            commands += "aload " + slotOf("array_") + "\n";
            commands += expression.accept(this);

            Type type = expression.accept(typeChecker);
            if (type instanceof IntType)
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            else if (type instanceof BoolType)
                commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";

            commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }
        commands += "aload " + slotOf("array_") + "\n";

        return commands;
    }
    @Override
    public String visit(IntValue intValue){
        String commands = "";
        commands += "ldc " + intValue.getIntVal() + "\n";
        return commands;
    }
    @Override
    public String visit(BoolValue boolValue){
        String commands = "";
        commands += "ldc ";
        commands += (boolValue.getBool()) ? 1 : 0;
        commands += "\n";
        return commands;
    }
    @Override
    public String visit(StringValue stringValue){
        String commands = "";
        commands += "ldc " + stringValue.getStr() + "\n";
        return commands;
    }
}