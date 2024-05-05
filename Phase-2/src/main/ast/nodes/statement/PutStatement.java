package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class PutStatement extends Statement{
    private Expression expression;
    public PutStatement(Expression expression){this.expression = expression;}
    public Expression getExpression(){return this.expression;}
    public void setExpression(Expression expression){this.expression = expression;}
    @Override
    public String toString(){return "PutStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
