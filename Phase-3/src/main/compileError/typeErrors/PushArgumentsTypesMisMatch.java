package main.compileError.typeErrors;

import main.compileError.CompileError;

public class PushArgumentsTypesMisMatch extends CompileError {
    public PushArgumentsTypesMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of `push` function arguments must be string or the type of the second argument must be the same as the type of the elements in the list";}
}
