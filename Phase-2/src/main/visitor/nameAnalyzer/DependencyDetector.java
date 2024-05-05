package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.CircularDependency;
import main.symbolTable.SymbolTable;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;

public class DependencyDetector extends Visitor<Void> {
    private String funcName;
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();
    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ForStatement forStatement) {
        for (var expr : forStatement.getRangeExpressions()) {
            expr.accept(this);
        }

        for (var expr : forStatement.getLoopBodyExpressions()) {
            expr.accept(this);
        }

        for (var stmt_ : forStatement.getLoopBody()) {
            stmt_.accept(this);
        }

        var stmt_ = forStatement.getReturnStatement();
        if (stmt_ != null) {
            stmt_.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(IfStatement ifStatement) {
        for (var condition : ifStatement.getConditions()) {
            condition.accept(this);
        }

        for (var stmt_ : ifStatement.getThenBody()) {
            stmt_.accept(this);
        }

        for (var stmt_ : ifStatement.getElseBody()) {
            stmt_.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        for (var condition : loopDoStatement.getLoopConditions()) {
            condition.accept(this);
        }

        for (var stmt_ : loopDoStatement.getLoopBodyStmts()) {
            stmt_.accept(this);
        }
        var stmt_ = loopDoStatement.getLoopRetStmt();
        if (stmt_ != null) {
            stmt_.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(AssignStatement assignStmt) {
        assignStmt.getAssignExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(PushStatement pushStatement) {
        pushStatement.getToBeAdded().accept(this);
        return null;
    }
    @Override
    public Void visit(PutStatement putStatement) {
        putStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ReturnStatement returnStatement) {
        var retExpr = returnStatement.getReturnExp();
        if (retExpr != null) {
            returnStatement.getReturnExp().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(AccessExpression accessExpression) {
        Identifier id = (Identifier) accessExpression.getAccessedExpression();
        dependencyGraph.addEdge(funcName, id.getName());


        for (var arg : accessExpression.getArguments()) {
            arg.accept(this);
        }

        for (var dimAccess : accessExpression.getDimentionalAccess()) {
            dimAccess.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }
    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }
    @Override
    public Void visit(LenStatement lenStatement) {
        lenStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ChopStatement chopStatement) {
        chopStatement.getChopExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ChompStatement chompStatement) {
        chompStatement.getChompExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(AppendExpression appendExpression) {
        for (var appended : appendExpression.getAppendeds()) {
            appended.accept(this);
        }
//        appendExpression.getAppendee();
        return null;
    }
    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
//        patternDeclaration.getTargetVariable();
//        patternDeclaration.getReturnExp();
//        patternDeclaration.getConditions();
        return null;
    }
    @Override
    public Void visit(FunctionDeclaration functionDeclaration){
        funcName = functionDeclaration.getFunctionName().getName();
        for (var stmt : functionDeclaration.getBody()) {
            stmt.accept(this);
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



//public Void visit(Identifier identifier)
//
//public Void visit(VarDeclaration varDeclaration)
//
//public Void visit(LambdaExpression lambdaExpression)

