package main.compileError.typeErrors;

import main.compileError.CompileError;

public class UnsupportedOperandType extends CompileError {
    private final String operator;
    public UnsupportedOperandType(int line, String operator){
        this.line = line;
        this.operator = operator;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> unsupported operand type for operator " + operator;}
}
