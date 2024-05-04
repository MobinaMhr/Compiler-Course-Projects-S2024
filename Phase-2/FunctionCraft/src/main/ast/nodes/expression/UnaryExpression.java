package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.UnaryOperator;
import main.visitor.IVisitor;

public class UnaryExpression extends Expression{
    private Expression expression;
    private UnaryOperator op;
    public UnaryExpression(Expression expression, UnaryOperator op){
        this.expression = expression;
        this.op = op;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public UnaryOperator getOp() {
        return op;
    }

    public void setOp(UnaryOperator op) {
        this.op = op;
    }
    @Override
    public String toString(){return "UnaryExpression_" + op.name();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
