package main.ast.nodes.expression;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class LambdaExpression extends Expression{
    ArrayList<VarDeclaration> declarationArgs = new ArrayList<>();
    ArrayList<Statement> body = new ArrayList<>();
//    ArrayList<Expression> args =  new ArrayList<>();
    public LambdaExpression(ArrayList<VarDeclaration> declarationArgs, ArrayList<Statement> body
                            ){
        this.declarationArgs = declarationArgs;
//        this.args = args;
        this.body = body;
    }

//    public void setArgs(ArrayList<Expression> args) {
//        this.args = args;
//    }

    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }

    public void setDeclarationArgs(ArrayList<VarDeclaration> declarationArgs) {
        this.declarationArgs = declarationArgs;
    }

//    public ArrayList<Expression> getArgs() {
//        return args;
//    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public ArrayList<VarDeclaration> getDeclarationArgs() {
        return declarationArgs;
    }
    @Override
    public String toString(){return "LambdaExpression";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
