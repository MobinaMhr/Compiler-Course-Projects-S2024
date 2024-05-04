package main.visitor;

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

public class Visitor<T> implements IVisitor<T> {
    @Override
    public T visit(Program program){return null;}
    @Override
    public T visit(Identifier identifier){return null;}
    @Override
    public T visit(VarDeclaration varDeclaration){return null;}
    @Override
    public T visit(FunctionDeclaration functionDeclaration){return null;}
    @Override
    public T visit(PatternDeclaration patternDeclaration){return null;}
    @Override
    public T visit(MainDeclaration mainDeclaration){return null;}
    @Override
    public T visit(ReturnStatement returnStatement){return null;}
    @Override
    public T visit(IfStatement ifStatement){return null;}
    @Override
    public T visit(PutStatement putStatement){return null;}
    @Override
    public T visit(LenStatement lenStatement){return null;}
    @Override
    public T visit(PushStatement pushStatement){return null;}
    @Override
    public T visit(LoopDoStatement loopDoStatement){return null;}
    @Override
    public T visit(ForStatement forStatement){return null;}
    @Override
    public T visit(MatchPatternStatement matchPatternStatement){return null;}
    @Override
    public T visit(ChopStatement chopStatement){return null;}
    @Override
    public T visit(ChompStatement chompStatement){return null;}
    @Override
    public T visit(AssignStatement assignStatement){return null;}
    @Override
    public T visit(ExpressionStatement expressionStatement){return null;}
    @Override
    public T visit(AppendExpression appendExpression){return null;}
    @Override
    public T visit(BinaryExpression binaryExpression){return null;}
    @Override
    public T visit(UnaryExpression unaryExpression){return null;}
    @Override
    public T visit(AccessExpression accessExpression){return null;}
    @Override
    public T visit(LambdaExpression lambdaExpression){return null;}
    @Override
    public T visit(ListValue listValue){return null;}
    @Override
    public T visit(FunctionPointer functionPointer){return null;}
    @Override
    public T visit(BoolValue boolValue){return null;}
    @Override
    public T visit(IntValue intValue){return null;}
    @Override
    public T visit(StringValue stringValue){return null;}
    @Override
    public T visit(FloatValue floatValue){return null;}
}
