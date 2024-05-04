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

public interface IVisitor<T> {
    T visit(Program program);
    T visit(Identifier identifier);
    T visit(VarDeclaration varDeclaration);
    T visit(FunctionDeclaration functionDeclaration);
    T visit(PatternDeclaration patternDeclaration);
    T visit(MainDeclaration mainDeclaration);
    T visit(ReturnStatement returnStatement);
    T visit(IfStatement ifStatement);
    T visit(PutStatement putStatement);
    T visit(LenStatement lenStatement);
    T visit(PushStatement pushStatement);
    T visit(LoopDoStatement loopDoStatement);
    T visit(ForStatement forStatement);
    T visit(MatchPatternStatement matchPatternStatement);
    T visit(ChopStatement chopStatement);
    T visit(ChompStatement chompStatement);
    T visit(AssignStatement assignStatement);
    T visit(ExpressionStatement expressionStatement);
    T visit(AppendExpression appendExpression);
    T visit(BinaryExpression binaryExpression);
    T visit(UnaryExpression unaryExpression);
    T visit(AccessExpression accessExpression);
    T visit(LambdaExpression lambdaExpression);
    T visit(ListValue listValue);
    T visit(FunctionPointer functionPointer);
    T visit(BoolValue boolValue);
    T visit(IntValue intValue);
    T visit(StringValue stringValue);
    T visit(FloatValue floatValue);
}
