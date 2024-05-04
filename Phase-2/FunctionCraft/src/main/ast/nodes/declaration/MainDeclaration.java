package main.ast.nodes.declaration;

import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class MainDeclaration extends Declaration{
    private ArrayList<Statement> body = new ArrayList<>();
    public ArrayList<Statement> getBody() {return this.body;}
    public void setBody(ArrayList<Statement>body){this.body = body;}
    public void addBody(Statement stmt){this.body.add(stmt);}
    @Override
    public String toString(){return "MainDeclaration";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
