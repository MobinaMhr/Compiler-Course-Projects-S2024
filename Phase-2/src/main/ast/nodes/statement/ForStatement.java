package main.ast.nodes.statement;


import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ForStatement extends Statement{
    private Identifier iteratorId;
    private ArrayList<Expression> rangeExpressions = new ArrayList<>();
    private ArrayList<Expression> loopBodyExpressions = new ArrayList<>();
    //expressions that satisfy break or continue conditions
    private ArrayList<Statement> loopBody = new ArrayList<>();
    private ReturnStatement returnStatement;
    public ForStatement(Identifier identifierId, ArrayList<Expression> rangeExpressions
                        , ArrayList<Expression> loopBodyExpressions, ArrayList<Statement> loopBody
                        , ReturnStatement returnStatement){
        this.iteratorId = identifierId;
        this.rangeExpressions = rangeExpressions;
        this.loopBodyExpressions = loopBodyExpressions;
        this.loopBody = loopBody;
        this.returnStatement = returnStatement;

    }
    public ArrayList<Expression> getLoopBodyExpressions() {
        return loopBodyExpressions;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public ArrayList<Expression> getRangeExpressions() {
        return rangeExpressions;
    }

    public ArrayList<Statement> getLoopBody() {
        return loopBody;
    }

    public Identifier getIteratorId() {
        return iteratorId;
    }

    public void setIteratorId(Identifier iteratorId) {
        this.iteratorId = iteratorId;
    }

    public void setLoopBody(ArrayList<Statement> loopBody) {
        this.loopBody = loopBody;
    }

    public void setLoopBodyExpressions(ArrayList<Expression> loopBodyExpressions) {
        this.loopBodyExpressions = loopBodyExpressions;
    }

    public void setRangeExpressions(ArrayList<Expression> rangeExpressions) {
        this.rangeExpressions = rangeExpressions;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString(){return "ForLoop:"+iteratorId.getName();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

}
