package main.compileError.typeErrors;

import main.ast.nodes.expression.operators.BinaryOperator;
import main.compileError.CompileError;

public class NonSameOperands extends CompileError {
    private final BinaryOperator operator;
    public NonSameOperands(int line, BinaryOperator operator){
        this.line = line;
        this.operator = operator;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> operands of operator " + operator + " must be the same";}

}
