package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class LenStatement extends Expression{
    private Expression expression;
    public LenStatement(Expression expression){this.expression = expression;}
    public Expression getExpression(){return this.expression;}
    public void setExpression(Expression expression){this.expression = expression;}
    @Override
    public String toString(){return "LenStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
