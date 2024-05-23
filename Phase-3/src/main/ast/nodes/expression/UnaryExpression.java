package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.UnaryOperator;
import main.visitor.IVisitor;

public class UnaryExpression extends Expression{
    private Expression expression;
    private UnaryOperator unaryOperator;
    public UnaryExpression(Expression expression, UnaryOperator unaryOperator){
        this.expression = expression;
        this.unaryOperator = unaryOperator;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public UnaryOperator getOperator() {
        return unaryOperator;
    }

    public void setOp(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }
    @Override
    public String toString(){return "UnaryExpression_" + unaryOperator.name();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
