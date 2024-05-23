package main.ast.nodes.expression.value;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

public class FunctionPointer extends Value{
    private Identifier id;
    public FunctionPointer(Identifier id){this.id = id;}

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }
    @Override
    public String toString(){return "FunctionPointer:" + this.id.getName();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
