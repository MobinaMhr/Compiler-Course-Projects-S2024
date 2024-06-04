package main.ast.type;



public abstract class Type {
    public boolean sameType(Type other){
        return (this.getClass().equals(other.getClass())) && !((this instanceof NoType) || (other instanceof NoType));
    }
}
