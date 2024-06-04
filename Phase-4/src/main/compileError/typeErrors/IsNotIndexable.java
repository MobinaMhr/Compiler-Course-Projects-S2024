package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotIndexable extends CompileError {
    public IsNotIndexable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only lists and strings can be indexed";}
}
