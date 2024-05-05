package main.ast.nodes;

import main.compileError.CompileError;
import main.visitor.IVisitor;

import java.util.ArrayList;

public abstract class Node {
    private int line;

    public void setLine(int line){this.line = line;}
    public int getLine(){return this.line;}
    public abstract String toString();
    public abstract <T> T accept(IVisitor<T> visitor);
}
