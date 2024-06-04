package main.ast.nodes.statement;


import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.RangeExpression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ForStatement extends Statement{
    private Identifier iteratorId;
    private RangeExpression rangeExpression;
    private ArrayList<Statement> loopBodyStmts;

    public ForStatement(Identifier identifierId, RangeExpression rangeExpression, ArrayList<Statement> loopBodyStmts){
        this.iteratorId = identifierId;
        this.rangeExpression = rangeExpression;
        this.loopBodyStmts = loopBodyStmts;
    }

    public RangeExpression getRangeExpression() {
        return rangeExpression;
    }

    public ArrayList<Statement> getLoopBodyStmts() {
        return loopBodyStmts;
    }

    public Identifier getIteratorId() {
        return iteratorId;
    }

    public void setIteratorId(Identifier iteratorId) {
        this.iteratorId = iteratorId;
    }

    public void setLoopBodyStmts(ArrayList<Statement> loopBodyStmts) {
        this.loopBodyStmts = loopBodyStmts;
    }

    public void setRangeExpressions(RangeExpression rangeExpression) {
        this.rangeExpression = rangeExpression;
    }

    @Override
    public String toString(){return "ForLoop:"+iteratorId.getName();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

}
