package main.compileError.nameErrors;

import main.compileError.CompileError;

public class DuplicateArg extends CompileError {
    private String name;
    public DuplicateArg(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> argument " + this.name + " is duplicated";}
}
