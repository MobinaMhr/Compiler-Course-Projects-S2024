package main.compileError;

public abstract class CompileError{
    protected int line;
    public abstract String getErrorMessage();

    public int getLine() {
        return line;
    }


}
