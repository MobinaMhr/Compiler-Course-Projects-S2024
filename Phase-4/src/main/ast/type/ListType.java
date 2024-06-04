package main.ast.type;

import main.ast.type.Type;

public class ListType extends Type {
    private Type type;
//    private boolean typeSet;

    public ListType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

//    public boolean isTypeSet() {
//        return typeSet;
//    }

//    public void setTypeSet(boolean typeSet) {
//        this.typeSet = typeSet;
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ListType castedObj = (ListType) obj;
        return type.sameType(castedObj.getType());
    }
    @Override
    public int hashCode() {
        return 31 * type.hashCode();
    }
    @Override
    public String toString() {
        return "ListType";
    }
}
