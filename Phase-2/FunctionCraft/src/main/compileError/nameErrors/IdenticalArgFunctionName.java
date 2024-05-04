package main.compileError.nameErrors;

import main.compileError.CompileError;

public class IdenticalArgFunctionName extends CompileError {
    private String name;
    public IdenticalArgFunctionName(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> argument " + this.name + " has same name with function";}
}
