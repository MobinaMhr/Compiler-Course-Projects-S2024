package main.compileError.typeErrors;

import main.compileError.CompileError;

public class LenArgumentTypeMisMatch extends CompileError {
    public LenArgumentTypeMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> type of `len` function argument must be list or string";}
}
