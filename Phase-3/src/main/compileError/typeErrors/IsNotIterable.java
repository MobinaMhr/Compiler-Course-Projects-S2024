package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotIterable extends CompileError {
    public IsNotIterable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only lists can be iterated over";}
}
