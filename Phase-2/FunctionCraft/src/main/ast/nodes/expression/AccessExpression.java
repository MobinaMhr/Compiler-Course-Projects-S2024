package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class AccessExpression extends Expression{
    private Expression accessedExpression;
    //can be either a list, function or lambda expression
    private boolean isFunctionCall;
    //can distinguish between list access and function call with this boolean.you can set it in grammar
    private ArrayList<Expression> arguments = new ArrayList<>();
    private ArrayList<Expression> dimentionalAccess = new ArrayList<>();
    //list or return type of function can be multidimensional list
    public void setIsFunctionCall(boolean isFunctionCall){this.isFunctionCall = isFunctionCall;}

    public boolean isFunctionCall() {
        return isFunctionCall;
    }

    public AccessExpression(Expression accessedExpression, ArrayList<Expression> arguments){
        this.accessedExpression = accessedExpression;
        this.arguments = arguments;
        this.isFunctionCall = false;
    }

    public Expression getAccessedExpression() {
        return accessedExpression;
    }

    public ArrayList<Expression> getDimentionalAccess() {
        return dimentionalAccess;
    }

    public ArrayList<Expression> getArguments() {
        return arguments;
    }

    public void setAccessedExpression(Expression accessedExpression) {
        this.accessedExpression = accessedExpression;
    }

    public void setArguments(ArrayList<Expression> arguments) {
        this.arguments = arguments;
    }

    public void setDimentionalAccess(ArrayList<Expression> dimentionalAccess) {
        this.dimentionalAccess = dimentionalAccess;
    }
    @Override
    public String toString(){return "AccessExpression";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
