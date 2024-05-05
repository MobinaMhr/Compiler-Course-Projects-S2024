package main.compileError.nameErrors;

import main.compileError.CompileError;

import java.util.List;

public class CircularDependency extends CompileError {
    private List<String> nodes;
    private String functions;
    public CircularDependency(List<String> nodes){
        this.nodes = nodes;
        String s = "";
        int nodeIndex = 0;
        int finalIndex = nodes.size()-1;
        for(String x : nodes){
            if(nodeIndex != finalIndex){
                s = s.concat(x + ", ");
            }
            else{
                s = s.concat(x);
            }
            nodeIndex += 1;
        }
        this.functions = s;
    }
    public String getErrorMessage(){return "*-> defenition of functions " + this.functions + " contains circular dependency";}
}
