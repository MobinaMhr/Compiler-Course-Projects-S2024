package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class ReturnStatement extends Statement{
    private Expression returnExp;
    private boolean hasRetExp;
    //a function can return nothing
    public ReturnStatement(){this.hasRetExp = false;}
    public Expression getReturnExp(){return returnExp;}
    public void setReturnExp(Expression returnExp){
        this.returnExp = returnExp;
        this.hasRetExp = true;
    }
    public boolean hasRetExpression(){return hasRetExp;}
    @Override
    public String toString(){return "ReturnStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
