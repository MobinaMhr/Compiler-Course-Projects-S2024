package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class MatchPatternStatement extends Expression{
    private Identifier patternId;
    Expression matchArgument;
    public MatchPatternStatement(Identifier patternId, Expression matchArgument){
        this.matchArgument = matchArgument;
        this.patternId = patternId;
    }
    public void setPatternId(Identifier patternId){
        this.patternId = patternId;
    }

    public void setMatchArgument(Expression matchArgument) {
        this.matchArgument = matchArgument;
    }

    public Identifier getPatternId() {
        return patternId;
    }

    public Expression getMatchArgument() {
        return matchArgument;
    }
    @Override
    public String toString(){return "MatchPattern:"+patternId.getName();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
