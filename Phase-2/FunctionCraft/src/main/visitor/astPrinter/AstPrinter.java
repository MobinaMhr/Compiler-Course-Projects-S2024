package main.visitor.astPrinter;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.visitor.Visitor;

public class AstPrinter extends Visitor<Void> {
    public void printMessage(int line, String message){
        System.out.println("line:" + String.valueOf(line) + "->" + message);
    }

    @Override
    public Void visit(Program program) {
        printMessage(program.getLine(), program.toString());
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            patternDeclaration.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }
    @Override
    public Void visit(Identifier identifier){
        printMessage(identifier.getLine(), identifier.toString());
        return null;
    }
    @Override
    public Void visit(VarDeclaration varDeclaration){
        printMessage(varDeclaration.getLine(), varDeclaration.toString());
        if(varDeclaration.getDefaultVal() != null){
            varDeclaration.getDefaultVal().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(FunctionDeclaration functionDeclaration){
        printMessage(functionDeclaration.getLine(), functionDeclaration.toString());
        for(VarDeclaration varDeclaration : functionDeclaration.getArgs()){
            varDeclaration.accept(this);
        }
        for(Statement statement : functionDeclaration.getBody()){
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(PatternDeclaration patternDeclaration){
        printMessage(patternDeclaration.getLine(), patternDeclaration.toString());
        for(Expression expression:patternDeclaration.getConditions()){
            expression.accept(this);
        }
        for(Expression expression:patternDeclaration.getReturnExp()){
            expression.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(MainDeclaration mainDeclaration){
        printMessage(mainDeclaration.getLine(), mainDeclaration.toString());
        for(Statement statement : mainDeclaration.getBody()){
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ReturnStatement returnStatement){
        printMessage(returnStatement.getLine(), returnStatement.toString());
        if(returnStatement.hasRetExpression()){
            returnStatement.getReturnExp().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(IfStatement ifStatement){
        printMessage(ifStatement.getLine(), ifStatement.toString());
        for(Expression expression: ifStatement.getConditions()){
            expression.accept(this);
        }
        for(Statement statement: ifStatement.getThenBody()){
            statement.accept(this);
        }
        for(Statement statement: ifStatement.getElseBody()){
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(PutStatement putStatement){
        printMessage(putStatement.getLine(), putStatement.toString());
        putStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(LenStatement lenStatement){
        printMessage(lenStatement.getLine(), lenStatement.toString());
        lenStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(PushStatement pushStatement){
        printMessage(pushStatement.getLine(), pushStatement.toString());
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }
    @Override
    public Void visit(LoopDoStatement loopDoStatement){
        printMessage(loopDoStatement.getLine(), loopDoStatement.toString());
        for(Statement statement: loopDoStatement.getLoopBodyStmts()){
            statement.accept(this);
        }
        for(Expression expression : loopDoStatement.getLoopConditions()){
            expression.accept(this);
        }
        if(loopDoStatement.getLoopRetStmt() != null) {
            loopDoStatement.getLoopRetStmt().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ForStatement forStatement){
        printMessage(forStatement.getLine(), forStatement.toString());
        for(Expression expression: forStatement.getRangeExpressions()){
            expression.accept(this);
        }
        for(Statement statement: forStatement.getLoopBody()){
            statement.accept(this);
        }
        for(Expression expression: forStatement.getLoopBodyExpressions()){
            expression.accept(this);
        }
        if(forStatement.getReturnStatement() != null){
            forStatement.getReturnStatement().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
        printMessage(matchPatternStatement.getLine(), matchPatternStatement.toString());
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }
    @Override
    public Void visit(ChopStatement chopStatement){
        printMessage(chopStatement.getLine(), chopStatement.toString());
        chopStatement.getChopExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ChompStatement chompStatement){
        printMessage(chompStatement.getLine(), chompStatement.toString());
        chompStatement.getChompExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(AssignStatement assignStatement){
        printMessage(assignStatement.getLine(), assignStatement.toString());
        if(assignStatement.isAccessList()){
            assignStatement.getAccessListExpression().accept(this);
        }
        assignStatement.getAssignExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ExpressionStatement expressionStatement){
        printMessage(expressionStatement.getLine(), expressionStatement.toString());
        expressionStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(AppendExpression appendExpression){
        printMessage(appendExpression.getLine(), appendExpression.toString());
        appendExpression.getAppendee().accept(this);
        for(Expression expression : appendExpression.getAppendeds()){
            expression.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(BinaryExpression binaryExpression){
        printMessage(binaryExpression.getLine(), binaryExpression.toString());
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }
    @Override
    public Void visit(UnaryExpression unaryExpression){
        printMessage(unaryExpression.getLine(), unaryExpression.toString());
        unaryExpression.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(AccessExpression accessExpression){
        printMessage(accessExpression.getLine(), accessExpression.toString());
        accessExpression.getAccessedExpression().accept(this);
        for(Expression expression : accessExpression.getArguments()){
            expression.accept(this);
        }
        for(Expression expression: accessExpression.getDimentionalAccess()){
            expression.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(LambdaExpression lambdaExpression){
        printMessage(lambdaExpression.getLine(), lambdaExpression.toString());
        for(VarDeclaration varDeclaration : lambdaExpression.getDeclarationArgs()){
            varDeclaration.accept(this);
        }
        for(Statement statement : lambdaExpression.getBody()){
            statement.accept(this);
        }
//        for(Expression expression: lambdaExpression.getArgs()){
//            expression.accept(this);
//        }
        return null;
    }
    @Override
    public Void visit(ListValue listValue){
        printMessage(listValue.getLine(), listValue.toString());
        for(Expression expression : listValue.getElements()){
            expression.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(FunctionPointer functionPointer){
        printMessage(functionPointer.getLine(), functionPointer.toString());
        return null;
    }
    @Override
    public Void visit(BoolValue boolValue){
        printMessage(boolValue.getLine(), boolValue.toString());
        return null;
    }
    @Override
    public Void visit(IntValue intValue){
        printMessage(intValue.getLine(), intValue.toString());
        return null;
    }
    @Override
    public Void visit(StringValue stringValue){
        printMessage(stringValue.getLine(), stringValue.toString());
        return null;
    }
    @Override
    public Void visit(FloatValue floatValue){
        printMessage(floatValue.getLine(), floatValue.toString());
        return null;
    }
}
