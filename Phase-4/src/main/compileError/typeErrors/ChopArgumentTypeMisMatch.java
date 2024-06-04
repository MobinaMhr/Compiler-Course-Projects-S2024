package main.compileError.typeErrors;

import main.compileError.CompileError;

public class ChopArgumentTypeMisMatch extends CompileError {
    public ChopArgumentTypeMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> type of `chop` function argument must be string";}
}
