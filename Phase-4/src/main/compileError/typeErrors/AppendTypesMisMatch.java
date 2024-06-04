package main.compileError.typeErrors;

import main.compileError.CompileError;

public class AppendTypesMisMatch extends CompileError {
    public AppendTypesMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of append operands must be string or same as list's type";}
}
