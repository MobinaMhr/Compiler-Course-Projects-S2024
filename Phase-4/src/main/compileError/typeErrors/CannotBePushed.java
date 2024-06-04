package main.compileError.typeErrors;

import main.compileError.CompileError;

public class CannotBePushed extends CompileError {
    public CannotBePushed(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only lists and strings can get pushed into";}
}
