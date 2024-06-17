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

import java.io.*;
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
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {
            }
        }
        return type;
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
        catch(SecurityException e){
            // ignore
        }
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
        } catch (IOException e){
            // ignore
        }
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
        // TODO headers, body and return with corresponding type
        slots.clear();

        String commands = "";
        String args = "";
        for (var arg : functionDeclaration.getArgs())
            args += arg.accept(this);
        String returnType = "";
        for (var stmt : functionDeclaration.getBody()) {
            if (stmt instanceof ReturnStatement returnStatement)
                returnType += returnStatement.accept(this);
        }
        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += args + returnType + "\n";
        for (var stmt : functionDeclaration.getBody())
            commands += stmt.accept(this);

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody())
            commands += statement.accept(this);
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(AccessExpression accessExpression){
        accessExpression.getDimentionalAccess();
        accessExpression.getAccessedExpression();
        if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String args = "";
            for (var arg : accessExpression.getArguments())
                args += arg.accept(this);
            String returnType = ""; // TODO
            return "invokestatic Main/" + functionName.getName() + args + returnType + "\n";
        }
        else {
            // TODO
        }
        //TODO
        return null;
    }
    @Override
    public String visit(AssignStatement assignStatement){
        //TODO indexing you asked sour
        String commands = "";
//        assignStatement.getAssignOperator();

        Identifier assignedId = assignStatement.getAssignedId(); // anId
        int slot = slotOf(assignStatement.getAssignedId().getName());

        if (assignStatement.isAccessList()) { // anId[3] += "";
            commands += "aload " + slot + "\n";
            commands += assignedId.accept(this);

            Expression accessListExpr = assignStatement.getAccessListExpression(); // [3]
            commands += accessListExpr.accept(this);
        }
        else { // anId += "";
            commands += assignedId.accept(this);
            commands += "istore " + slot + "\n";
        }

        Type assignedIdType = assignedId.accept(typeChecker);
        if (assignedIdType instanceof IntType) commands += "iastore\n";
        else if (assignedIdType instanceof BoolType) commands += "iastore\n";
        else commands += "aastore\n";

        Expression assignExpr = assignStatement.getAssignExpression(); // ""
        commands += assignExpr.accept(this);

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(IfStatement ifStatement){
        //TODO
        String thenL = getFreshLabel();
        String elseL = getFreshLabel();
        String exitL = getFreshLabel();

        String commands = "";
        commands += "ifeq " + elseL + "\n";
        commands += thenL + ":\n";
        for (var stmt : ifStatement.getThenBody()) {
            commands += stmt.accept(this);
        }
        commands += "goto " + exitL + "\n";
        commands += elseL + ": \n";
        // What happens if it is empty? probably bug is here
        for (var stmt : ifStatement.getElseBody()) {
            commands += stmt.accept(this);
        }

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(PutStatement putStatement){
        //TODO
        String commands = "";
        commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        Expression putExpr = putStatement.getExpression();
        commands += putExpr.accept(this);
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        //TODO
        String commands = "";
        Expression retExpr = returnStatement.getReturnExp();
        Type retType = retExpr.accept(typeChecker);
        if (retType instanceof VoidType) commands += "return\n";
        else if (retType instanceof IntType) commands += "ireturn\n";
        else if (retType instanceof BoolType) commands += "ireturn\n";
        else commands += "areturn\n";
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public String visit(BinaryExpression binaryExpression){
        //TODO
        String commands = "";
        Type operandType = binaryExpression.getFirstOperand().accept(typeChecker);
        commands += binaryExpression.getFirstOperand().accept(this);
        commands += binaryExpression.getSecondOperand().accept(this);
        BinaryOperator operator = binaryExpression.getOperator();

        switch (binaryExpression.getOperator()) {
            case EQUAL -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                commands += (operandType instanceof IntType ||
                            operandType instanceof BoolType)
                        ? "if_icmpeq " : "if_acmpeq ";
                commands += L1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + exitL + "\n";
                commands += L1 +  ":\n";
                commands += "ldc 1\n";
                commands += exitL + ":\n";
            }
            case NOT_EQUAL -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                commands += (operandType instanceof IntType ||
                        operandType instanceof BoolType)
                        ? "if_icmpne " : "if_acmpne ";
                commands += L1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + exitL + "\n";
                commands += L1 +  ":\n";
                commands += "ldc 1\n";
                commands += exitL + ":\n";
            }
            case GREATER_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                commands += "if_icmpgt " + L1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + exitL + "\n";
                commands += L1 +  ":\n";
                commands += "ldc 1\n";
                commands += exitL + ":\n";
            }
            case LESS_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                commands += "if_icmplt " + L1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + exitL + "\n";
                commands += L1 +  ":\n";
                commands += "ldc 1\n";
                commands += exitL + ":\n";
            }
            case LESS_EQUAL_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                commands += "if_icmple " + L1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + exitL + "\n";
                commands += L1 +  ":\n";
                commands += "ldc 1\n";
                commands += exitL + ":\n";
            }
            case GREATER_EQUAL_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                commands += "if_icmpge " + L1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + exitL + "\n";
                commands += L1 +  ":\n";
                commands += "ldc 1\n";
                commands += exitL + ":\n";
            }
            case PLUS -> commands += "iadd\n";
            case MINUS -> commands += "isub\n";
            case MULT -> commands += "imul\n";
            case DIVIDE -> commands += "idiv\n";
            default -> {}
        }
        addCommand(commands);
        return null;//what does addCommands do?
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        //TODO
        String commands = "";
        Type operandType = unaryExpression.getExpression().accept(typeChecker);
        commands += unaryExpression.getExpression().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        switch (operator) {
            case NOT -> {
                commands += "ldc 1\n"; // if BIT_NOT, ldc -1
                commands += "ixor\n";
            }
            case MINUS -> commands += "ineg\n";
            case INC -> {
                commands += "ldc 1\n";
                commands += "iadd\n";
            }
            case DEC -> {
                commands += "ldc -1\n";
                commands += "iadd\n";
            }
            default -> {}
        }
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(Identifier identifier){
        //TODO
        String commands = "";
        Type type = identifier.accept(typeChecker);
        String typeSign = (type instanceof IntType) ? "i"
                : (type instanceof FloatType) ? "f" : "a";
        commands += typeSign + "load" + slotOf(identifier.getName()) + "\n";
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){
        //TODO
        String commands = "";
        String startL = getFreshLabel();
        String exitL = getFreshLabel();
        commands += startL + ":\n";

        for (var stmt : loopDoStatement.getLoopBodyStmts()) {
            commands += stmt.accept(this);
            if (stmt instanceof BreakStatement) {
                commands += "ifeq " + exitL + "\n";
            }
            if (stmt instanceof NextStatement) {
                commands += "ifeq " + startL + "\n";
            }
        }
        commands += "goto " + startL + "\n";
        commands += exitL + ":\n";

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(BreakStatement breakStatement){
        //TODO
        String commands = "";
        if (breakStatement.getConditions().isEmpty()) return null;
        for (var expr : breakStatement.getConditions()) {
            commands += expr.accept(this);
        }
//        return null;
        return commands;
    }
    @Override
    public String visit(NextStatement nextStatement){
        //TODO
        String commands = "";
        if (nextStatement.getConditions().isEmpty()) return null;
        for (var expr : nextStatement.getConditions()) {
            commands += expr.accept(this);
        }
//        return null;
        return commands;
    }
    @Override
    public String visit(LenStatement lenStatement){
        //TODO
        String commands = "";
        commands += "getstatic java/lang/System/out Ljava/io/LenStatement;\n";
        Expression lenExpr = lenStatement.getExpression();
        commands += lenExpr.accept(this);
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(ChopStatement chopStatement){
        //TODO
        String commands = "";
        commands += "getstatic java/lang/System/out Ljava/io/ChopStatement;\n";
        Expression chopExpr = chopStatement.getChopExpression();
        commands += chopExpr.accept(this);
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }
    @Override
    public String visit(ListValue listValue){
        //TODO
        String commands = "";
        for (var arrElement : listValue.getElements()) {
            //
        }
        return commands;
    }
    @Override
    public String visit(IntValue intValue){
        String commands = "";
        commands += "ldc " + intValue.getIntVal() + "\n";
        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer\n";
        return commands;
    }
    @Override
    public String visit(BoolValue boolValue){
        String commands = "";
        commands += "ldc " + boolValue.getBool() + "\n";
        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean\n";
        return commands;
    }
    @Override
    public String visit(StringValue stringValue){
        String commands = "";
        commands += "ldc " + stringValue.getStr() + "\n";
        return commands;
    }
}