package main.ast.nodes.expression.value.primitive;

import main.ast.nodes.expression.value.Value;
import main.visitor.IVisitor;

public class FloatValue extends Value {
    private float flt;
    public FloatValue(float flt){
        this.flt = flt;
    }

    public float getFlt() {
        return flt;
    }

    public void setFlt(float flt) {
        this.flt = flt;
    }
    @Override
    public String toString(){return "FLoatValue:" + String.valueOf(this.flt);}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
