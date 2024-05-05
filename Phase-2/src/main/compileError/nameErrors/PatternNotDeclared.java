package main.compileError.nameErrors;

import main.compileError.CompileError;
import main.symbolTable.item.PatternItem;

public class PatternNotDeclared extends CompileError {
    private String name;
    public PatternNotDeclared(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> pattern " + this.name + " is not declared";}
}
