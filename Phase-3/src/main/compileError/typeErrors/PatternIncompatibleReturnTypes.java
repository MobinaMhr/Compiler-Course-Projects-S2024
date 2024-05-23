package main.compileError.typeErrors;

import main.compileError.CompileError;

public class PatternIncompatibleReturnTypes extends CompileError {
    private final String patternName;
    public PatternIncompatibleReturnTypes(int line, String patternName){
        this.line = line;
        this.patternName = patternName;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of return expressions of the pattern `" + this.patternName + "` must be same";}
}
