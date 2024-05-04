package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.BinaryOperator;
import main.visitor.IVisitor;

public class BinaryExpression extends Expression{
    private Expression firstOperand;
    private Expression secondOperand;
    private BinaryOperator binaryOperator;
    public BinaryExpression(Expression firstOperand, Expression secondOperand,
                            BinaryOperator binaryOperator){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.binaryOperator = binaryOperator;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }

    public Expression getFirstOperand() {
        return firstOperand;
    }

    public Expression getSecondOperand() {
        return secondOperand;
    }

    public void setBinaryOperator(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    public void setFirstOperand(Expression firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(Expression secondOperand) {
        this.secondOperand = secondOperand;
    }
    @Override
    public String toString(){return "BinaryOperation:" + this.binaryOperator.name();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
