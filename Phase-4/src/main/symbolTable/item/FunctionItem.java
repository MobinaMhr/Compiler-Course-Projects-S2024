package main.symbolTable.item;

import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.type.Type;
import main.symbolTable.SymbolTable;

import java.util.ArrayList;

public class FunctionItem extends SymbolTableItem{
    public static final String START_KEY = "Function:";
    private SymbolTable functionSymbolTable;
    private FunctionDeclaration functionDeclaration;
    private ArrayList<Type> argumentTypes = new ArrayList<>();
    private Type returnType;

    public ArrayList<Type> getArgumentTypes() {
        return argumentTypes;
    }

    public void setArgumentTypes(ArrayList<Type> argumentTypes) {
        this.argumentTypes = argumentTypes;
    }

    public Type getReturnType() {
        return returnType;
    }
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
    public FunctionItem(FunctionDeclaration functionDeclaration){
        this.functionDeclaration = functionDeclaration;
        this.name = this.functionDeclaration.getFunctionName().getName();
    }

    public SymbolTable getFunctionSymbolTable() {
        return functionSymbolTable;
    }

    public void setFunctionSymbolTable(SymbolTable functionSymbolTable) {
        this.functionSymbolTable = functionSymbolTable;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }
    @Override
    public String getKey() {return START_KEY + this.name;}

}
