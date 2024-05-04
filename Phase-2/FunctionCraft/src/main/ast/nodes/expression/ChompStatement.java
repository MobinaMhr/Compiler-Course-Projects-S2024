package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class ChompStatement extends Expression{
    private Expression chompExpression;
    public ChompStatement(Expression chompExpression){this.chompExpression = chompExpression;}

    public Expression getChompExpression() {
        return chompExpression;
    }

    public void setChompExpression(Expression chompExpression) {
        this.chompExpression = chompExpression;
    }
    @Override
    public String toString(){return "ChompStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
