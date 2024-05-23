package main.compileError.typeErrors;

import main.compileError.CompileError;

public class ListElementsTypesMisMatch extends CompileError {
    public ListElementsTypesMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> all elements of the list must have same type";}
}
