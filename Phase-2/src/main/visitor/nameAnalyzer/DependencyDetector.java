package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.expression.AccessExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.LambdaExpression;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.CircularDependency;
import main.symbolTable.SymbolTable;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();
    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }

        return null;
    }
    private Void constructDependencyGraph(Statement stmt, String funcName) {
        switch (stmt) {
            case AssignStatement assignStmt when
                    assignStmt.getAssignExpression() instanceof AccessExpression expr && expr.isFunctionCall() -> {
                Identifier id = (Identifier) expr.getAccessedExpression();
                dependencyGraph.addEdge(funcName, id.getName());
            }

            case ExpressionStatement expressionStatement when
                    expressionStatement.getExpression() instanceof AccessExpression expr -> {
                Identifier id = (Identifier) expr.getAccessedExpression();
                dependencyGraph.addEdge(funcName, id.getName());
            }

            case ForStatement forStatement -> {
                for (var expr : forStatement.getRangeExpressions()) {
                    if (expr instanceof AccessExpression accessExpression
                            && accessExpression.isFunctionCall()) {
                        Identifier id = (Identifier) accessExpression.getAccessedExpression();
                        dependencyGraph.addEdge(funcName, id.getName());
                    }
                }

                for (var expr : forStatement.getLoopBodyExpressions()) {
                    if (expr instanceof AccessExpression accessExpression
                            && accessExpression.isFunctionCall()) {
                        Identifier id = (Identifier) accessExpression.getAccessedExpression();
                        dependencyGraph.addEdge(funcName, id.getName());
                    }
                }

                for (var stmt_ : forStatement.getLoopBody()) {
                    constructDependencyGraph(stmt_, funcName);
                }

                var stmt_ = forStatement.getReturnStatement();
                if (stmt_ != null) {
                    constructDependencyGraph(stmt, funcName);
                }
            }

            case IfStatement ifStatement -> {
                for (var condition : ifStatement.getConditions()) {
                    if (condition instanceof AccessExpression accessExpression
                            && accessExpression.isFunctionCall()) {
                        Identifier id = (Identifier) accessExpression.getAccessedExpression();
                        dependencyGraph.addEdge(funcName, id.getName());
                    }
                }

                for (var stmt_ : ifStatement.getThenBody()) {
                    constructDependencyGraph(stmt_, funcName);
                }

                for (var stmt_ : ifStatement.getElseBody()) {
                    constructDependencyGraph(stmt_, funcName);
                }
            }

            case LoopDoStatement loopDoStatement -> {
                for (var condition : loopDoStatement.getLoopConditions()) {
                    if (condition instanceof AccessExpression accessExpression
                            && accessExpression.isFunctionCall()) {
                        Identifier id = (Identifier) accessExpression.getAccessedExpression();
                        dependencyGraph.addEdge(funcName, id.getName());
                    }
                }

                for (var stmt_ : loopDoStatement.getLoopBodyStmts()) {
                    constructDependencyGraph(stmt_, funcName);
                }
                var stmt_ = loopDoStatement.getLoopRetStmt();
                if (stmt_ != null) {
                    constructDependencyGraph(stmt_, funcName);
                }
            }

            case PushStatement pushStatement when
                    pushStatement.getToBeAdded() instanceof AccessExpression expr -> {
                Identifier id = (Identifier) expr.getAccessedExpression();
                dependencyGraph.addEdge(funcName, id.getName());
            }

            case PutStatement putStatement when
                    putStatement.getExpression() instanceof AccessExpression expr -> {
                Identifier id = (Identifier) expr.getAccessedExpression();
                dependencyGraph.addEdge(funcName, id.getName());
            }

            case ReturnStatement returnStatement when
                    returnStatement.getReturnExp() instanceof AccessExpression expr -> {
                Identifier id = (Identifier) expr.getAccessedExpression();
                dependencyGraph.addEdge(funcName, id.getName());
            }

            case null, default ->
            {
                System.out.println(stmt);
                System.out.println("IDK man.");
            }
        }
        return null;
    }
    @Override
    public Void visit(FunctionDeclaration functionDeclaration){
        for (var stmt : functionDeclaration.getBody()) {
            constructDependencyGraph(stmt, functionDeclaration.getFunctionName().getName());
        }
        return null;
    }
    public Void findDependency(){
        ArrayList<List<String>> cycles =  dependencyGraph.findCycles();
        for (List<String> cycle : cycles) {
            dependencyError.add(new CircularDependency(cycle));
        }
        return null;
    }
}
