package main.compileError.typeErrors;

import main.compileError.CompileError;

public class ChompArgumentTypeMisMatch extends CompileError {
    public ChompArgumentTypeMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> type of `chomp` function argument must be string";}
}
