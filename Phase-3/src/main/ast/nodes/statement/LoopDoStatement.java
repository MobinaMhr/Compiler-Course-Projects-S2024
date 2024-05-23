package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class LoopDoStatement extends Statement{
    private ArrayList<Statement> loopBodyStmts = new ArrayList<>();

    public LoopDoStatement(ArrayList<Statement>loopBodyStmts){
        this.loopBodyStmts = loopBodyStmts;
    }
    public void setLoopBodyStmts(ArrayList<Statement>loopBodyStmts){this.loopBodyStmts = loopBodyStmts;}

    public ArrayList<Statement> getLoopBodyStmts(){return this.loopBodyStmts;}

    @Override
    public String toString(){return "LoopDoStatement";}
    @Override
    public <T> T accept(IVisitor<T>visitor){return visitor.visit(this);}
}
