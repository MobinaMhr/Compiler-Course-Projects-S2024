package main.compileError.typeErrors;

import main.compileError.CompileError;

public class AccessIndexIsNotInt extends CompileError {
    public AccessIndexIsNotInt(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> access index must be integer";}
}
