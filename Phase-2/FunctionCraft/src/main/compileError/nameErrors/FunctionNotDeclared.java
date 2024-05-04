package main.compileError.nameErrors;

import main.compileError.CompileError;

public class FunctionNotDeclared extends CompileError {
    private String name;
    public FunctionNotDeclared(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> function " + this.name + " is not declared";}
}
