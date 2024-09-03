// Generated from /Users/amirparsamobed/Documents/University/Term 6/Compiler Design Programming Languages/CA/CA1/GitHub Repository/Compiler-Course-Projects-S2024/Phase-1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
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
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionCraft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCraft(FunctionCraftParser.FunctionCraftContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#required_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequired_parameter(FunctionCraftParser.Required_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#optional_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_parameter(FunctionCraftParser.Optional_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(FunctionCraftParser.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_clause(FunctionCraftParser.Pattern_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern_matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_matching(FunctionCraftParser.Pattern_matchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(FunctionCraftParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_statement(FunctionCraftParser.Next_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in(FunctionCraftParser.For_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(FunctionCraftParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statement(FunctionCraftParser.Else_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(FunctionCraftParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(FunctionCraftParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_operator(FunctionCraftParser.Range_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(FunctionCraftParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(FunctionCraftParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(FunctionCraftParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_literal(FunctionCraftParser.List_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FunctionCraftParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_clause(FunctionCraftParser.Condition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FunctionCraftParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_op(FunctionCraftParser.Assignment_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(FunctionCraftParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#arithmetic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_term(FunctionCraftParser.Arithmetic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(FunctionCraftParser.Arithmetic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(FunctionCraftParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#compare_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_expr(FunctionCraftParser.Compare_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expr(FunctionCraftParser.Equality_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logical_product_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_product_expr(FunctionCraftParser.Logical_product_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expr(FunctionCraftParser.Logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_expr(FunctionCraftParser.Append_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#other_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_expression(FunctionCraftParser.Other_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
}