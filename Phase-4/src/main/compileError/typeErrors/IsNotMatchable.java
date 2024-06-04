package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotMatchable extends CompileError {
    public IsNotMatchable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only patterns can be matched";}
}
