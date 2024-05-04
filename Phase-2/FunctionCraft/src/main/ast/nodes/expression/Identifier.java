package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class Identifier extends Expression{
    private String name;
    public Identifier(String name){this.name = name;}
    public void setName(String name) {this.name = name;}
    public String getName(){return this.name;}
    @Override
    public String toString(){return "Identifier:" + this.name;}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
