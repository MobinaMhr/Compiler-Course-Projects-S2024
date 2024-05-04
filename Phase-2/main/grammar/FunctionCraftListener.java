// Generated from C:/Users/ASUS/Desktop/github-clones/Compiler-Course-Projects-S2024/Phase-1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#required_parameter}.
	 * @param ctx the parse tree
	 */
	void enterRequired_parameter(FunctionCraftParser.Required_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#required_parameter}.
	 * @param ctx the parse tree
	 */
	void exitRequired_parameter(FunctionCraftParser.Required_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#optional_parameter}.
	 * @param ctx the parse tree
	 */
	void enterOptional_parameter(FunctionCraftParser.Optional_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#optional_parameter}.
	 * @param ctx the parse tree
	 */
	void exitOptional_parameter(FunctionCraftParser.Optional_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(FunctionCraftParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(FunctionCraftParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern_clause}.
	 * @param ctx the parse tree
	 */
	void enterPattern_clause(FunctionCraftParser.Pattern_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern_clause}.
	 * @param ctx the parse tree
	 */
	void exitPattern_clause(FunctionCraftParser.Pattern_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern_matching}.
	 * @param ctx the parse tree
	 */
	void enterPattern_matching(FunctionCraftParser.Pattern_matchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern_matching}.
	 * @param ctx the parse tree
	 */
	void exitPattern_matching(FunctionCraftParser.Pattern_matchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(FunctionCraftParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(FunctionCraftParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void enterNext_statement(FunctionCraftParser.Next_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void exitNext_statement(FunctionCraftParser.Next_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void enterLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void exitLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_in}.
	 * @param ctx the parse tree
	 */
	void enterFor_in(FunctionCraftParser.For_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_in}.
	 * @param ctx the parse tree
	 */
	void exitFor_in(FunctionCraftParser.For_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(FunctionCraftParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(FunctionCraftParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(FunctionCraftParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(FunctionCraftParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(FunctionCraftParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(FunctionCraftParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(FunctionCraftParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(FunctionCraftParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range_operator}.
	 * @param ctx the parse tree
	 */
	void enterRange_operator(FunctionCraftParser.Range_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range_operator}.
	 * @param ctx the parse tree
	 */
	void exitRange_operator(FunctionCraftParser.Range_operatorContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(FunctionCraftParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(FunctionCraftParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(FunctionCraftParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(FunctionCraftParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(FunctionCraftParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(FunctionCraftParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(FunctionCraftParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(FunctionCraftParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FunctionCraftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FunctionCraftParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void enterCondition_clause(FunctionCraftParser.Condition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void exitCondition_clause(FunctionCraftParser.Condition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(FunctionCraftParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(FunctionCraftParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_op(FunctionCraftParser.Assignment_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_op(FunctionCraftParser.Assignment_opContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FunctionCraftParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FunctionCraftParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_term(FunctionCraftParser.Arithmetic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_term(FunctionCraftParser.Arithmetic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(FunctionCraftParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(FunctionCraftParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(FunctionCraftParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(FunctionCraftParser.Relational_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#compare_expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expr(FunctionCraftParser.Compare_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compare_expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expr(FunctionCraftParser.Compare_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expr(FunctionCraftParser.Equality_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expr(FunctionCraftParser.Equality_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logical_product_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_product_expr(FunctionCraftParser.Logical_product_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logical_product_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_product_expr(FunctionCraftParser.Logical_product_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(FunctionCraftParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(FunctionCraftParser.Logical_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append_expr}.
	 * @param ctx the parse tree
	 */
	void enterAppend_expr(FunctionCraftParser.Append_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append_expr}.
	 * @param ctx the parse tree
	 */
	void exitAppend_expr(FunctionCraftParser.Append_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#other_expression}.
	 * @param ctx the parse tree
	 */
	void enterOther_expression(FunctionCraftParser.Other_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#other_expression}.
	 * @param ctx the parse tree
	 */
	void exitOther_expression(FunctionCraftParser.Other_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
}