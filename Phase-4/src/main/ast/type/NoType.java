package main.ast.type;

public class NoType extends Type {
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        return true;
    }
    @Override
    public int hashCode() {
        return 5;
    }
    @Override
    public String toString() {
        return "NoType";
    }
}
