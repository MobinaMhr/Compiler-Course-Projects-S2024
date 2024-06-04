// Generated from D:/uni/term6/PLC-TA/Phase 4/Phase 4/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.value.primitive.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(FunctionCraftParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(FunctionCraftParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionArgumentsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgumentsDeclaration(FunctionCraftParser.FunctionArgumentsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionArgumentsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgumentsDeclaration(FunctionCraftParser.FunctionArgumentsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#patternMatching}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatching(FunctionCraftParser.PatternMatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#patternMatching}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatching(FunctionCraftParser.PatternMatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(FunctionCraftParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(FunctionCraftParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FunctionCraftParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FunctionCraftParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FunctionCraftParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FunctionCraftParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#putsStatement}.
	 * @param ctx the parse tree
	 */
	void enterPutsStatement(FunctionCraftParser.PutsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#putsStatement}.
	 * @param ctx the parse tree
	 */
	void exitPutsStatement(FunctionCraftParser.PutsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lenStatement}.
	 * @param ctx the parse tree
	 */
	void enterLenStatement(FunctionCraftParser.LenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lenStatement}.
	 * @param ctx the parse tree
	 */
	void exitLenStatement(FunctionCraftParser.LenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pushStatement}.
	 * @param ctx the parse tree
	 */
	void enterPushStatement(FunctionCraftParser.PushStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pushStatement}.
	 * @param ctx the parse tree
	 */
	void exitPushStatement(FunctionCraftParser.PushStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loopDoStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopDoStatement(FunctionCraftParser.LoopDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loopDoStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopDoStatement(FunctionCraftParser.LoopDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(FunctionCraftParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(FunctionCraftParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(FunctionCraftParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(FunctionCraftParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#matchPatternStatement}.
	 * @param ctx the parse tree
	 */
	void enterMatchPatternStatement(FunctionCraftParser.MatchPatternStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#matchPatternStatement}.
	 * @param ctx the parse tree
	 */
	void exitMatchPatternStatement(FunctionCraftParser.MatchPatternStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chopStatement}.
	 * @param ctx the parse tree
	 */
	void enterChopStatement(FunctionCraftParser.ChopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chopStatement}.
	 * @param ctx the parse tree
	 */
	void exitChopStatement(FunctionCraftParser.ChopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chompStatement}.
	 * @param ctx the parse tree
	 */
	void enterChompStatement(FunctionCraftParser.ChompStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chompStatement}.
	 * @param ctx the parse tree
	 */
	void exitChompStatement(FunctionCraftParser.ChompStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#accessList}.
	 * @param ctx the parse tree
	 */
	void enterAccessList(FunctionCraftParser.AccessListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#accessList}.
	 * @param ctx the parse tree
	 */
	void exitAccessList(FunctionCraftParser.AccessListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#eqaulityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqaulityExpression(FunctionCraftParser.EqaulityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#eqaulityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqaulityExpression(FunctionCraftParser.EqaulityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(FunctionCraftParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(FunctionCraftParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FunctionCraftParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FunctionCraftParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(FunctionCraftParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(FunctionCraftParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreUnaryExpression(FunctionCraftParser.PreUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreUnaryExpression(FunctionCraftParser.PreUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#accessExpression}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpression(FunctionCraftParser.AccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#accessExpression}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpression(FunctionCraftParser.AccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(FunctionCraftParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(FunctionCraftParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(FunctionCraftParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(FunctionCraftParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(FunctionCraftParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(FunctionCraftParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(FunctionCraftParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(FunctionCraftParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointer(FunctionCraftParser.FunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointer(FunctionCraftParser.FunctionPointerContext ctx);
}