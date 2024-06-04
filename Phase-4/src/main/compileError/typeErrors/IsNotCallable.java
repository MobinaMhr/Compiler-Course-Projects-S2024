package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotCallable extends CompileError {
    public IsNotCallable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only function pointers and functions can be called";}
}
