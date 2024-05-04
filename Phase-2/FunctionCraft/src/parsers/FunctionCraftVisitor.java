// Generated from C:/Users/ASUS/Desktop/github-clones/Compiler-Course-Projects-S2024/temp-Phase-2/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.value.primitive.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(FunctionCraftParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionArgumentsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgumentsDeclaration(FunctionCraftParser.FunctionArgumentsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#patternMatching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternMatching(FunctionCraftParser.PatternMatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(FunctionCraftParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FunctionCraftParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FunctionCraftParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#putsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutsStatement(FunctionCraftParser.PutsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenStatement(FunctionCraftParser.LenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pushStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushStatement(FunctionCraftParser.PushStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loopDoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDoStatement(FunctionCraftParser.LoopDoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loopBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBody(FunctionCraftParser.LoopBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(FunctionCraftParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#matchPatternStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchPatternStatement(FunctionCraftParser.MatchPatternStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChopStatement(FunctionCraftParser.ChopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chompStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChompStatement(FunctionCraftParser.ChompStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#accessList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessList(FunctionCraftParser.AccessListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#eqaulityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqaulityExpression(FunctionCraftParser.EqaulityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(FunctionCraftParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(FunctionCraftParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(FunctionCraftParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryExpression(FunctionCraftParser.PreUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#accessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessExpression(FunctionCraftParser.AccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#otherExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpression(FunctionCraftParser.OtherExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(FunctionCraftParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#listValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValue(FunctionCraftParser.ListValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(FunctionCraftParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionPointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPointer(FunctionCraftParser.FunctionPointerContext ctx);
}