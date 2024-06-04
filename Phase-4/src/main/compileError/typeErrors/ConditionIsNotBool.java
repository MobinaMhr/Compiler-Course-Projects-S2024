package main.compileError.typeErrors;

import main.compileError.CompileError;

public class ConditionIsNotBool extends CompileError {
    public ConditionIsNotBool(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> condition's type must be boolean";}
}
