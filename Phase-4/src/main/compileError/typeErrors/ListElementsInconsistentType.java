package main.compileError.typeErrors;

import main.compileError.CompileError;

public class ListElementsInconsistentType extends CompileError {
    public ListElementsInconsistentType(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> all elements of the list must have same type";}
}
