package main.ast.type;

import main.ast.type.Type;

public class FptrType extends Type {
    private String functionName;
    public FptrType(String functionName) {
        this.functionName = functionName;
    }
    public String getFunctionName() {
        return functionName;
    }
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        FptrType castedObj = (FptrType) obj;
        return functionName.equals(castedObj.getFunctionName());
    }
    @Override
    public int hashCode() {
        return 31 * functionName.hashCode();
    }

    @Override
    public String toString() {
        return "FptrType";
    }
}
