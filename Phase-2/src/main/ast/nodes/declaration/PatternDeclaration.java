package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class PatternDeclaration extends Declaration{
    private Identifier patternName;
    private Identifier targetVariable;
    private ArrayList<Expression> conditions = new ArrayList<>();
    //Stores different condition cases
    private ArrayList<Expression> returnExp = new ArrayList<>();
    //Stores different returnExpressions associated with each condition
    public PatternDeclaration(Identifier name, Identifier targetVariable){
        this.patternName = name;
        this.targetVariable = targetVariable;
    }
    public void setPatternName(Identifier name){this.patternName = name;}
    public Identifier getPatternName(){return this.patternName;}

    public void setTargetVariable(Identifier targetVariable){this.targetVariable = targetVariable;}
    public Identifier getTargetVariable(){return this.targetVariable;}

    public ArrayList<Expression> getConditions(){return this.conditions;}
    public void setConditions(ArrayList<Expression> conditions){this.conditions = conditions;}
    public void addCondition(Expression condition){this.conditions.add(condition);}

    public ArrayList<Expression> getReturnExp(){return this.returnExp;}
    public void setReturnExp(ArrayList<Expression> returnExp){this.returnExp = returnExp;}
    public void addReturnExp(Expression returnExp){this.returnExp.add(returnExp);}
    @Override
    public String toString(){return "PatternDeclaration:" + patternName + " on variable:" + targetVariable.getName();}
    @Override
    public <T> T accept(IVisitor<T>visitor){return visitor.visit(this);}

}
