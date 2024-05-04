package main.compileError.nameErrors;

import main.compileError.CompileError;

public class IdenticalArgPatternName extends CompileError {
    private String name;
    public IdenticalArgPatternName(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> target variable " + this.name + " has same name with pattern";}
}
