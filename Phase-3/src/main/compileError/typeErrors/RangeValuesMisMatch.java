package main.compileError.typeErrors;

import main.compileError.CompileError;

public class RangeValuesMisMatch extends CompileError {
    public RangeValuesMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of begin and end of ranges can only be integer";}
}
