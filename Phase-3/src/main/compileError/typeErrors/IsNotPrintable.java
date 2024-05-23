package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotPrintable extends CompileError {
    public IsNotPrintable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> function pointers cannot be printed";}
}
