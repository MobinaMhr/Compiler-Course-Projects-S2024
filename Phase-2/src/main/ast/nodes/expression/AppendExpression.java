package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppendExpression extends Expression{
    private Expression appendee;
    private ArrayList<Expression> appendeds = new ArrayList<>();
    public AppendExpression(Expression appendee){this.appendee = appendee;}
    public void addAppendedExpression(Expression expression){this.appendeds.add(expression);}
    public Expression getAppendee(){return this.appendee;}
    public ArrayList<Expression> getAppendeds(){return this.appendeds;}

    public void setAppendee(Expression appendee) {
        this.appendee = appendee;
    }

    public void setAppendeds(ArrayList<Expression> appendeds) {
        this.appendeds = appendeds;
    }
    @Override
    public String toString(){return "AppendExpression";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
