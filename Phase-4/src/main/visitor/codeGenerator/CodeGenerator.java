package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
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
        } catch (IOException e){
            // ignore
        }
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
        } catch (IOException e){
            // ignore
        }
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

        String commands = "";
        String args = ""; // TODO and add to the slots
        String returnType = ""; // TODO
        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += args + returnType + "\n";
        for (var arg : functionDeclaration.getArgs()) {
            //
        }
        for (var stmt : functionDeclaration.getBody()) {
            if (stmt instanceof ReturnStatement returnStatement) {

            }
            commands += stmt.accept(this);
        }
        // TODO headers, body and return with corresponding type

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
    public String visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String args = ""; // TODO
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
        //TODO
        return null;
    }
    @Override
    public String visit(IfStatement ifStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(PutStatement putStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        //TODO
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
                commands += "\n"; // TODO Mobed
            }
            case GREATER_EQUAL_THAN -> {
                commands += "\n"; // TODO Mobed
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
        return null;
    }
    @Override
    public String visit(Identifier identifier){
        //TODO
        return null;
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(BreakStatement breakStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(NextStatement nextStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(LenStatement lenStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(ChopStatement chopStatement){
        //TODO
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
        return null;
    }
    @Override
    public String visit(IntValue intValue){
        //TODO, use "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer" to convert to primitive
        return null;
    }
    @Override
    public String visit(BoolValue boolValue){
        //TODO, use "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean" to convert to primitive
        return null;
    }
    @Override
    public String visit(StringValue stringValue){
        //TODO
        return null;
    }
}