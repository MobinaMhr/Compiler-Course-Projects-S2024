package main.ast.nodes.expression.value.primitive;

import main.ast.nodes.expression.value.Value;
import main.visitor.IVisitor;

public class IntValue extends Value {
    private int intVal;
    public IntValue(int intVal){this.intVal = intVal;}

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }
    @Override
    public String toString(){return "IntValue:" + String.valueOf(this.intVal);}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
