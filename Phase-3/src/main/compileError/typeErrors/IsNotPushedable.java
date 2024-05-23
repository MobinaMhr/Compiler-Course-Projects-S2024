package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotPushedable extends CompileError {
    public IsNotPushedable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only lists and strings can get pushed into";}
}
