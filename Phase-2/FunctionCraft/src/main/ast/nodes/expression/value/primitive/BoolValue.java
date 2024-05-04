package main.ast.nodes.expression.value.primitive;

import main.ast.nodes.expression.value.Value;
import main.visitor.IVisitor;

public class BoolValue extends Value {
    private Boolean bool;
    public BoolValue(Boolean bool){this.bool = bool;}

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }
    @Override
    public String toString(){return "BoolValue:" + this.bool;}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
