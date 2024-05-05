package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class LoopDoStatement extends Statement{
    private ArrayList<Statement> loopBodyStmts = new ArrayList<>();
    private ArrayList<Expression> loopConditions = new ArrayList<>();
    private ReturnStatement loopRetStmt;

    public LoopDoStatement(ArrayList<Statement>loopBodyStmts, ArrayList<Expression>loopConditions,
                           ReturnStatement loopRetStmt){
        this.loopBodyStmts = loopBodyStmts;
        this.loopConditions = loopConditions;
        this.loopRetStmt = loopRetStmt;
    }
    public void setLoopBodyStmts(ArrayList<Statement>loopBodyStmts){this.loopBodyStmts = loopBodyStmts;}
    public void setLoopConditions(ArrayList<Expression>loopConditions){this.loopConditions = loopConditions;}
    public void setLoopRetStmt(ReturnStatement loopRetStmt){this.loopRetStmt = loopRetStmt;}
    public ArrayList<Statement> getLoopBodyStmts(){return this.loopBodyStmts;}
    public ArrayList<Expression> getLoopConditions(){return this.loopConditions;}
    public ReturnStatement getLoopRetStmt(){return this.loopRetStmt;}

    @Override
    public String toString(){return "LoopDoStatement";}
    @Override
    public <T> T accept(IVisitor<T>visitor){return visitor.visit(this);}
}
