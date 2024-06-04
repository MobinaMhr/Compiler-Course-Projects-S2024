package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotAppendable extends CompileError {
    public IsNotAppendable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only lists and strings can get appended into";}
}
