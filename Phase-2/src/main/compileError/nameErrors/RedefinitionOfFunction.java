package main.compileError.nameErrors;

import main.compileError.CompileError;

public class RedefinitionOfFunction extends CompileError {
    String name;
    public RedefinitionOfFunction(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> Redefinition of function " + this.name;}
}
