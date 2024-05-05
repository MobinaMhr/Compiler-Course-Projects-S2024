package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class PushStatement extends Statement{
    private Expression initial;
    private Expression toBeAdded;
    public PushStatement(Expression initial, Expression toBeAdded){
        this.initial = initial;
        this.toBeAdded = toBeAdded;
    }
    public Expression getInitial(){return this.initial;}
    public Expression getToBeAdded(){return this.toBeAdded;}
    public void setInitial(Expression initial){this.initial = initial;}
    public void setToBeAdded(Expression toBeAdded){this.toBeAdded = toBeAdded;}
    @Override
    public String toString(){return "PushStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

}
