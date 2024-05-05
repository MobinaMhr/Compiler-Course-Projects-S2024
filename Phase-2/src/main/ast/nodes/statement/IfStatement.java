package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IfStatement extends Statement{
    private ArrayList<Expression> conditions = new ArrayList<>();
    //contains all conditions of if and elseIfs and break conditions inside ifBody
    private ArrayList<Statement> thenBody = new ArrayList<>();
    private ArrayList<Statement> elseBody = new ArrayList<>();

    public void addCondition(ArrayList<Expression> condition){this.conditions.addAll(condition);}
    public void setThenBody(ArrayList<Statement>thenBody){this.thenBody = thenBody;}
    public void setElseBody(ArrayList<Statement>elseBody){this.elseBody = elseBody;}
    public ArrayList<Expression> getConditions(){return this.conditions;}
    public ArrayList<Statement> getThenBody(){return this.thenBody;}
    public ArrayList<Statement> getElseBody(){return this.elseBody;}
    @Override
    public String toString(){return "IfStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
