package main.compileError.typeErrors;

import main.compileError.CompileError;

public class PushArgumentsTypesMisMatch extends CompileError {
    public PushArgumentsTypesMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of `push` function argument must be string or same as list's type";}
}
