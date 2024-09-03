// Generated from /Users/amirparsamobed/Documents/University/Term 6/Compiler Design Programming Languages/CA/CA1/GitHub Repository/Compiler-Course-Projects-S2024/Phase-1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, END=2, RETURN=3, TRUE=4, FALSE=5, METHOD=6, INT=7, FLOAT=8, STR=9, 
		BOOLEAN=10, LIST=11, FUNCTION_PTR=12, PLUS=13, MINUS=14, MULT=15, DIV=16, 
		MOD=17, DECREMENT=18, INCREMENT=19, CONCAT=20, GEQ=21, LEQ=22, GTR=23, 
		LES=24, EQL=25, NEQ=26, AND=27, OR=28, NOT=29, ASSIGN=30, PLUS_ASSIGN=31, 
		MINUS_ASSIGN=32, MULT_ASSIGN=33, DIV_ASSIGN=34, MOD_ASSIGN=35, IF=36, 
		ELSE=37, ELSEIF=38, PUTS=39, PUSH=40, LEN=41, MAIN=42, CHOP=43, CHOMP=44, 
		LOOP_DO=45, FOR=46, IN=47, BREAK=48, BREAK_IF=49, NEXT=50, NEXT_IF=51, 
		PATTERN=52, TAB=53, VERTICAL_BAR=54, LBRACE=55, RBRACE=56, LBRACKET=57, 
		RBRACKET=58, LPAR=59, RPAR=60, DOT=61, COMMA=62, COLON=63, SEMICOLON=64, 
		ARROW=65, ID=66, SINGLE_LINE_COMMENT=67, MULTI_LINE_COMMENT=68, WS=69, 
		NEW_LINE=70, INT_VAL=71, STR_VAL=72, CHAR_VAL=73, FLOAT_VAL=74;
	public static final int
		RULE_functionCraft = 0, RULE_body = 1, RULE_function = 2, RULE_return_statement = 3, 
		RULE_main = 4, RULE_comment = 5, RULE_required_parameter = 6, RULE_optional_parameter = 7, 
		RULE_function_parameter = 8, RULE_pattern_clause = 9, RULE_pattern_matching = 10, 
		RULE_break_statement = 11, RULE_next_statement = 12, RULE_loop_body = 13, 
		RULE_loop_do = 14, RULE_for_in = 15, RULE_if_statement = 16, RULE_else_if_statement = 17, 
		RULE_else_statement = 18, RULE_conditional_expression = 19, RULE_puts = 20, 
		RULE_len = 21, RULE_push = 22, RULE_chop = 23, RULE_chomp = 24, RULE_function_ptr = 25, 
		RULE_range_operator = 26, RULE_range = 27, RULE_numeric_literal = 28, 
		RULE_string_literal = 29, RULE_bool_literal = 30, RULE_list_literal = 31, 
		RULE_literal = 32, RULE_lambda_function = 33, RULE_condition_clause = 34, 
		RULE_args = 35, RULE_assignment_op = 36, RULE_assignment = 37, RULE_factor = 38, 
		RULE_arithmetic_term = 39, RULE_arithmetic_expr = 40, RULE_relational_op = 41, 
		RULE_compare_expr = 42, RULE_equality_expr = 43, RULE_logical_product_expr = 44, 
		RULE_logical_expr = 45, RULE_append_expr = 46, RULE_other_expression = 47, 
		RULE_expression = 48, RULE_statement = 49, RULE_function_call = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"functionCraft", "body", "function", "return_statement", "main", "comment", 
			"required_parameter", "optional_parameter", "function_parameter", "pattern_clause", 
			"pattern_matching", "break_statement", "next_statement", "loop_body", 
			"loop_do", "for_in", "if_statement", "else_if_statement", "else_statement", 
			"conditional_expression", "puts", "len", "push", "chop", "chomp", "function_ptr", 
			"range_operator", "range", "numeric_literal", "string_literal", "bool_literal", 
			"list_literal", "literal", "lambda_function", "condition_clause", "args", 
			"assignment_op", "assignment", "factor", "arithmetic_term", "arithmetic_expr", 
			"relational_op", "compare_expr", "equality_expr", "logical_product_expr", 
			"logical_expr", "append_expr", "other_expression", "expression", "statement", 
			"function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'end'", "'return'", "'true'", "'false'", "'method'", 
			"'int'", "'float'", "'string'", "'bool'", "'list'", "'fptr'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'--'", "'++'", "'<<'", "'>='", "'<='", "'>'", 
			"'<'", "'=='", "'!='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'if'", "'else'", "'elseif'", "'puts'", "'push'", 
			"'Len'", "'main'", "'chop'", "'chomp'", "'loop do'", "'for'", "'in'", 
			"'break'", "'break if'", "'next'", "'next if'", "'pattern'", null, "'|'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", "';'", 
			"'->'", null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "END", "RETURN", "TRUE", "FALSE", "METHOD", "INT", "FLOAT", 
			"STR", "BOOLEAN", "LIST", "FUNCTION_PTR", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "DECREMENT", "INCREMENT", "CONCAT", "GEQ", "LEQ", "GTR", "LES", 
			"EQL", "NEQ", "AND", "OR", "NOT", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "IF", "ELSE", "ELSEIF", "PUTS", 
			"PUSH", "LEN", "MAIN", "CHOP", "CHOMP", "LOOP_DO", "FOR", "IN", "BREAK", 
			"BREAK_IF", "NEXT", "NEXT_IF", "PATTERN", "TAB", "VERTICAL_BAR", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "DOT", "COMMA", "COLON", 
			"SEMICOLON", "ARROW", "ID", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"WS", "NEW_LINE", "INT_VAL", "STR_VAL", "CHAR_VAL", "FLOAT_VAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCraftContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public FunctionCraftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCraft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionCraft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionCraft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionCraft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCraftContext functionCraft() throws RecognitionException {
		FunctionCraftContext _localctx = new FunctionCraftContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functionCraft);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(104);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(102);
						function();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTI_LINE_COMMENT:
						{
						setState(103);
						comment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(109);
			main();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) {
				{
				{
				setState(110);
				comment();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 725185161842417776L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 719L) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case METHOD:
				case PLUS:
				case MINUS:
				case IF:
				case LOOP_DO:
				case FOR:
				case PATTERN:
				case LBRACKET:
				case LPAR:
				case ARROW:
				case ID:
				case INT_VAL:
				case STR_VAL:
				case FLOAT_VAL:
					{
					setState(116);
					statement();
					}
					break;
				case SINGLE_LINE_COMMENT:
				case MULTI_LINE_COMMENT:
					{
					setState(117);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(123);
				return_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Function_parameterContext function_parameter() {
			return getRuleContext(Function_parameterContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(DEF);
			setState(127);
			((FunctionContext)_localctx).name = match(ID);
			 System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null)); 
			setState(129);
			match(LPAR);
			setState(130);
			function_parameter();
			setState(131);
			match(RPAR);
			setState(132);
			body();
			setState(133);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(RETURN);
			 System.out.println("RETURN"); 
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720575940379304048L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 707L) != 0)) {
				{
				setState(137);
				expression();
				setState(138);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(DEF);
			setState(143);
			match(MAIN);
			 System.out.println("MAIN"); 
			setState(145);
			match(LPAR);
			setState(146);
			match(RPAR);
			setState(147);
			body();
			setState(148);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(FunctionCraftParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTI_LINE_COMMENT() { return getToken(FunctionCraftParser.MULTI_LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Required_parameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public Required_parameterContext required_parameter() {
			return getRuleContext(Required_parameterContext.class,0);
		}
		public Required_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRequired_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRequired_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRequired_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Required_parameterContext required_parameter() throws RecognitionException {
		Required_parameterContext _localctx = new Required_parameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_required_parameter);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ID);
				setState(153);
				match(COMMA);
				setState(154);
				required_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_parameterContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public Optional_parameterContext optional_parameter() {
			return getRuleContext(Optional_parameterContext.class,0);
		}
		public Optional_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOptional_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOptional_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOptional_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_parameterContext optional_parameter() throws RecognitionException {
		Optional_parameterContext _localctx = new Optional_parameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optional_parameter);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				assignment();
				setState(160);
				match(COMMA);
				setState(161);
				optional_parameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parameterContext extends ParserRuleContext {
		public Required_parameterContext required_parameter() {
			return getRuleContext(Required_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public Optional_parameterContext optional_parameter() {
			return getRuleContext(Optional_parameterContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_parameter);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				required_parameter();
				setState(166);
				match(COMMA);
				setState(167);
				match(LBRACKET);
				setState(168);
				optional_parameter();
				setState(169);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				required_parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(LBRACKET);
				setState(173);
				optional_parameter();
				setState(174);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_clauseContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(FunctionCraftParser.TAB, 0); }
		public TerminalNode VERTICAL_BAR() { return getToken(FunctionCraftParser.VERTICAL_BAR, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Pattern_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_clauseContext pattern_clause() throws RecognitionException {
		Pattern_clauseContext _localctx = new Pattern_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pattern_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(TAB);
			setState(179);
			match(VERTICAL_BAR);
			setState(180);
			condition_clause();
			setState(181);
			match(ASSIGN);
			setState(182);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_matchingContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(FunctionCraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FunctionCraftParser.ID, i);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<Pattern_clauseContext> pattern_clause() {
			return getRuleContexts(Pattern_clauseContext.class);
		}
		public Pattern_clauseContext pattern_clause(int i) {
			return getRuleContext(Pattern_clauseContext.class,i);
		}
		public Pattern_matchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern_matching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern_matching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern_matching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_matchingContext pattern_matching() throws RecognitionException {
		Pattern_matchingContext _localctx = new Pattern_matchingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pattern_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(PATTERN);
			setState(185);
			((Pattern_matchingContext)_localctx).name = match(ID);
			 System.out.println("PatternDec: " + (((Pattern_matchingContext)_localctx).name!=null?((Pattern_matchingContext)_localctx).name.getText():null)); 
			setState(187);
			match(LPAR);
			setState(188);
			match(ID);
			setState(189);
			match(RPAR);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				pattern_clause();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(195);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode BREAK_IF() { return getToken(FunctionCraftParser.BREAK_IF, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_break_statement);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(BREAK);
				}
				break;
			case BREAK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(BREAK_IF);
				setState(199);
				condition_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_statementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode NEXT_IF() { return getToken(FunctionCraftParser.NEXT_IF, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_next_statement);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(NEXT);
				}
				break;
			case NEXT_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(NEXT_IF);
				setState(204);
				condition_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_bodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop_body);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case METHOD:
			case PLUS:
			case MINUS:
			case IF:
			case LOOP_DO:
			case FOR:
			case PATTERN:
			case LBRACKET:
			case LPAR:
			case ARROW:
			case ID:
			case INT_VAL:
			case STR_VAL:
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				statement();
				}
				break;
			case SINGLE_LINE_COMMENT:
			case MULTI_LINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				comment();
				}
				break;
			case BREAK:
			case BREAK_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				break_statement();
				 System.out.println("Control: BREAK"); 
				}
				break;
			case NEXT:
			case NEXT_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				next_statement();
				 System.out.println("Control: NEXT"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_doContext extends ParserRuleContext {
		public TerminalNode LOOP_DO() { return getToken(FunctionCraftParser.LOOP_DO, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Loop_bodyContext> loop_body() {
			return getRuleContexts(Loop_bodyContext.class);
		}
		public Loop_bodyContext loop_body(int i) {
			return getRuleContext(Loop_bodyContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Loop_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_doContext loop_do() throws RecognitionException {
		Loop_doContext _localctx = new Loop_doContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop_do);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LOOP_DO);
			 System.out.println("Loop: DO"); 
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 729407286493077616L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 719L) != 0)) {
				{
				{
				setState(219);
				loop_body();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(225);
				return_statement();
				}
			}

			setState(228);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_inContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Loop_bodyContext> loop_body() {
			return getRuleContexts(Loop_bodyContext.class);
		}
		public Loop_bodyContext loop_body(int i) {
			return getRuleContext(Loop_bodyContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public For_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_inContext for_in() throws RecognitionException {
		For_inContext _localctx = new For_inContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FOR);
			 System.out.println("Loop: FOR"); 
			setState(232);
			match(ID);
			setState(233);
			match(IN);
			setState(234);
			range();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 729407286493077616L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 719L) != 0)) {
				{
				{
				setState(235);
				loop_body();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(241);
				return_statement();
				}
			}

			setState(244);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IF);
			setState(247);
			condition_clause();
			setState(248);
			body();
			 System.out.println("Decision: IF"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ELSEIF);
			setState(252);
			condition_clause();
			setState(253);
			body();
			 System.out.println("Decision: ELSE IF"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ELSE);
			setState(257);
			body();
			 System.out.println("Decision: ELSE"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_expressionContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			if_statement();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(261);
				else_if_statement();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(267);
				else_statement();
				}
			}

			setState(270);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(PUTS);
			 System.out.println("Built-In: PUTS"); 
			setState(274);
			match(LPAR);
			setState(275);
			expression();
			setState(276);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LEN);
			 System.out.println("Built-In: LEN"); 
			setState(280);
			match(LPAR);
			setState(281);
			literal();
			setState(282);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode STR_VAL() { return getToken(FunctionCraftParser.STR_VAL, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(PUSH);
			 System.out.println("Built-In: PUSH"); 
			setState(286);
			match(LPAR);
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(287);
				list_literal();
				}
				break;
			case ID:
				{
				setState(288);
				match(ID);
				}
				break;
			case STR_VAL:
				{
				setState(289);
				match(STR_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(292);
			match(COMMA);
			setState(293);
			expression();
			setState(294);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(CHOP);
			 System.out.println("Built-In: CHOP"); 
			setState(298);
			match(LPAR);
			setState(299);
			literal();
			setState(300);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CHOMP);
			 System.out.println("Built-In: CHOMP"); 
			setState(304);
			match(LPAR);
			setState(305);
			literal();
			setState(306);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_ptrContext extends ParserRuleContext {
		public Token name;
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public Function_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_ptrContext function_ptr() throws RecognitionException {
		Function_ptrContext _localctx = new Function_ptrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(METHOD);
			setState(309);
			match(LPAR);
			setState(310);
			match(COLON);
			setState(311);
			((Function_ptrContext)_localctx).name = match(ID);
			setState(312);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_operatorContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(FunctionCraftParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FunctionCraftParser.DOT, i);
		}
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(DOT);
			setState(315);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(FunctionCraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FunctionCraftParser.ID, i);
		}
		public List<TerminalNode> INT_VAL() { return getTokens(FunctionCraftParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(FunctionCraftParser.INT_VAL, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LPAR);
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT_VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(319);
			range_operator();
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT_VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(321);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numeric_literal);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(323);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(326);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(327);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(330);
				match(FLOAT_VAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STR_VAL() { return getToken(FunctionCraftParser.STR_VAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(STR_VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_literalContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(LBRACKET);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720575940379304048L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 707L) != 0)) {
				{
				setState(338);
				args();
				}
			}

			setState(341);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public Function_ptrContext function_ptr() {
			return getRuleContext(Function_ptrContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INT_VAL:
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				numeric_literal();
				}
				break;
			case STR_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				string_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				bool_literal();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				list_literal();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				function_ptr();
				}
				break;
			case ARROW:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				function_call(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_functionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Function_parameterContext function_parameter() {
			return getRuleContext(Function_parameterContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public Lambda_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ARROW);
			setState(352);
			match(LPAR);
			setState(353);
			function_parameter();
			setState(354);
			match(RPAR);
			setState(355);
			match(LBRACE);
			setState(356);
			body();
			setState(357);
			match(RBRACE);
			 System.out.println("Structure: LAMBDA"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_clauseContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LPAR);
			setState(361);
			expression();
			setState(362);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_args);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				expression();
				setState(365);
				match(COMMA);
				setState(366);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FunctionCraftParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FunctionCraftParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public Assignment_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_opContext assignment_op() throws RecognitionException {
		Assignment_opContext _localctx = new Assignment_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token name;
		public Assignment_opContext assignment_op() {
			return getRuleContext(Assignment_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((AssignmentContext)_localctx).name = match(ID);
			setState(374);
			assignment_op();
			setState(375);
			expression();
			 System.out.println("Assignment: " + (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public TerminalNode INCREMENT() { return getToken(FunctionCraftParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(FunctionCraftParser.DECREMENT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_factor, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(379);
				match(LPAR);
				setState(380);
				expression();
				setState(381);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(383);
				match(NOT);
				setState(384);
				factor(5);
				}
				break;
			case 3:
				{
				setState(385);
				match(MINUS);
				setState(386);
				factor(4);
				}
				break;
			case 4:
				{
				setState(387);
				match(ID);
				}
				break;
			case 5:
				{
				setState(388);
				literal();
				}
				break;
			case 6:
				{
				setState(389);
				lambda_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(392);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(393);
						match(LBRACKET);
						setState(394);
						expression();
						setState(395);
						match(RBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(397);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(398);
						_la = _input.LA(1);
						if ( !(_la==DECREMENT || _la==INCREMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_termContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Arithmetic_termContext arithmetic_term() {
			return getRuleContext(Arithmetic_termContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public Arithmetic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArithmetic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArithmetic_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArithmetic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_termContext arithmetic_term() throws RecognitionException {
		Arithmetic_termContext _localctx = new Arithmetic_termContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arithmetic_term);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				factor(0);
				setState(405);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				arithmetic_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				factor(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_termContext arithmetic_term() {
			return getRuleContext(Arithmetic_termContext.class,0);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArithmetic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArithmetic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArithmetic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arithmetic_expr);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				arithmetic_term();
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(413);
				arithmetic_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				arithmetic_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRelational_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compare_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Compare_exprContext compare_expr() {
			return getRuleContext(Compare_exprContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Compare_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCompare_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCompare_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCompare_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_exprContext compare_expr() throws RecognitionException {
		Compare_exprContext _localctx = new Compare_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compare_expr);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				arithmetic_expr();
				{
				setState(421);
				relational_op();
				}
				setState(422);
				compare_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				arithmetic_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_exprContext extends ParserRuleContext {
		public Compare_exprContext compare_expr() {
			return getRuleContext(Compare_exprContext.class,0);
		}
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public Equality_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEquality_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEquality_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEquality_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_exprContext equality_expr() throws RecognitionException {
		Equality_exprContext _localctx = new Equality_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_equality_expr);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				compare_expr();
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==EQL || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				equality_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				compare_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_product_exprContext extends ParserRuleContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public Logical_product_exprContext logical_product_expr() {
			return getRuleContext(Logical_product_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public Logical_product_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_product_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogical_product_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogical_product_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogical_product_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_product_exprContext logical_product_expr() throws RecognitionException {
		Logical_product_exprContext _localctx = new Logical_product_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_logical_product_expr);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				equality_expr();
				{
				setState(435);
				match(AND);
				}
				setState(436);
				logical_product_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				equality_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_exprContext extends ParserRuleContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public Logical_product_exprContext logical_product_expr() {
			return getRuleContext(Logical_product_exprContext.class,0);
		}
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogical_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogical_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_logical_expr);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				equality_expr();
				{
				setState(442);
				match(OR);
				}
				setState(443);
				logical_product_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				logical_product_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Append_exprContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Append_exprContext append_expr() {
			return getRuleContext(Append_exprContext.class,0);
		}
		public TerminalNode CONCAT() { return getToken(FunctionCraftParser.CONCAT, 0); }
		public Append_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_exprContext append_expr() throws RecognitionException {
		Append_exprContext _localctx = new Append_exprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_append_expr);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				logical_expr();
				{
				setState(449);
				match(CONCAT);
				}
				setState(450);
				append_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				logical_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Other_expressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public Other_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOther_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOther_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOther_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_expressionContext other_expression() throws RecognitionException {
		Other_expressionContext _localctx = new Other_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_other_expression);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(LPAR);
				setState(456);
				expression();
				setState(457);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				lambda_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Other_expressionContext other_expression() {
			return getRuleContext(Other_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			other_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Loop_doContext loop_do() {
			return getRuleContext(Loop_doContext.class,0);
		}
		public For_inContext for_in() {
			return getRuleContext(For_inContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Pattern_matchingContext pattern_matching() {
			return getRuleContext(Pattern_matchingContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_statement);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				expression();
				setState(467);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				assignment();
				setState(470);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				loop_do();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				for_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				conditional_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(475);
				pattern_matching();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		return function_call(0);
	}

	private Function_callContext function_call(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_callContext _localctx = new Function_callContext(_ctx, _parentState);
		Function_callContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_function_call, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(479);
				match(ID);
				setState(480);
				match(LPAR);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720575940379304048L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 707L) != 0)) {
					{
					setState(481);
					args();
					}
				}

				setState(484);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(485);
				lambda_function();
				setState(491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(486);
					match(LPAR);
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720575940379304048L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 707L) != 0)) {
						{
						setState(487);
						args();
						}
					}

					setState(490);
					match(RPAR);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(493);
				match(ID);
				setState(494);
				match(DOT);
				setState(495);
				function_call(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_callContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call);
					setState(498);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(499);
					match(LPAR);
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720575940379304048L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 707L) != 0)) {
						{
						setState(500);
						args();
						}
					}

					setState(503);
					match(RPAR);
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 50:
			return function_call_sempred((Function_callContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean function_call_sempred(Function_callContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001J\u01fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0005\u0000i\b\u0000\n\u0000\f\u0000"+
		"l\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000p\b\u0000\n\u0000\f\u0000"+
		"s\t\u0000\u0001\u0001\u0001\u0001\u0005\u0001w\b\u0001\n\u0001\f\u0001"+
		"z\t\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u008d\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009d\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a4"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b1\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u00c0\b\n\u000b\n\f\n\u00c1\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00ce\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00d8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00dd"+
		"\b\u000e\n\u000e\f\u000e\u00e0\t\u000e\u0001\u000e\u0003\u000e\u00e3\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ed\b\u000f\n\u000f\f\u000f"+
		"\u00f0\t\u000f\u0001\u000f\u0003\u000f\u00f3\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0107"+
		"\b\u0013\n\u0013\f\u0013\u010a\t\u0013\u0001\u0013\u0003\u0013\u010d\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0123\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0003\u001c\u0145\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0149"+
		"\b\u001c\u0001\u001c\u0003\u001c\u014c\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0154\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u015e\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0172\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0187\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u0190\b&\n&\f&\u0193\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u019a\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01a1\b(\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01aa\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u01b1\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u01b8\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u01bf\b-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u01c6\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u01cf\b/\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u01dd\b1\u0001"+
		"2\u00012\u00012\u00012\u00032\u01e3\b2\u00012\u00012\u00012\u00012\u0003"+
		"2\u01e9\b2\u00012\u00032\u01ec\b2\u00012\u00012\u00012\u00032\u01f1\b"+
		"2\u00012\u00012\u00012\u00032\u01f6\b2\u00012\u00052\u01f9\b2\n2\f2\u01fc"+
		"\t2\u00012\u0000\u0002Ld3\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bd\u0000\t\u0001\u0000CD\u0002\u0000BBGG\u0001\u0000\r\u000e\u0001\u0000"+
		"\u0004\u0005\u0001\u0000\u001e#\u0001\u0000\u0012\u0013\u0001\u0000\u000f"+
		"\u0011\u0001\u0000\u0015\u0018\u0001\u0000\u0019\u001a\u020a\u0000j\u0001"+
		"\u0000\u0000\u0000\u0002x\u0001\u0000\u0000\u0000\u0004~\u0001\u0000\u0000"+
		"\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u008e\u0001\u0000\u0000\u0000"+
		"\n\u0096\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000\u0000\u000e"+
		"\u00a3\u0001\u0000\u0000\u0000\u0010\u00b0\u0001\u0000\u0000\u0000\u0012"+
		"\u00b2\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000\u0000\u0016"+
		"\u00c8\u0001\u0000\u0000\u0000\u0018\u00cd\u0001\u0000\u0000\u0000\u001a"+
		"\u00d7\u0001\u0000\u0000\u0000\u001c\u00d9\u0001\u0000\u0000\u0000\u001e"+
		"\u00e6\u0001\u0000\u0000\u0000 \u00f6\u0001\u0000\u0000\u0000\"\u00fb"+
		"\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0104\u0001\u0000"+
		"\u0000\u0000(\u0110\u0001\u0000\u0000\u0000*\u0116\u0001\u0000\u0000\u0000"+
		",\u011c\u0001\u0000\u0000\u0000.\u0128\u0001\u0000\u0000\u00000\u012e"+
		"\u0001\u0000\u0000\u00002\u0134\u0001\u0000\u0000\u00004\u013a\u0001\u0000"+
		"\u0000\u00006\u013d\u0001\u0000\u0000\u00008\u014b\u0001\u0000\u0000\u0000"+
		":\u014d\u0001\u0000\u0000\u0000<\u014f\u0001\u0000\u0000\u0000>\u0151"+
		"\u0001\u0000\u0000\u0000@\u015d\u0001\u0000\u0000\u0000B\u015f\u0001\u0000"+
		"\u0000\u0000D\u0168\u0001\u0000\u0000\u0000F\u0171\u0001\u0000\u0000\u0000"+
		"H\u0173\u0001\u0000\u0000\u0000J\u0175\u0001\u0000\u0000\u0000L\u0186"+
		"\u0001\u0000\u0000\u0000N\u0199\u0001\u0000\u0000\u0000P\u01a0\u0001\u0000"+
		"\u0000\u0000R\u01a2\u0001\u0000\u0000\u0000T\u01a9\u0001\u0000\u0000\u0000"+
		"V\u01b0\u0001\u0000\u0000\u0000X\u01b7\u0001\u0000\u0000\u0000Z\u01be"+
		"\u0001\u0000\u0000\u0000\\\u01c5\u0001\u0000\u0000\u0000^\u01ce\u0001"+
		"\u0000\u0000\u0000`\u01d0\u0001\u0000\u0000\u0000b\u01dc\u0001\u0000\u0000"+
		"\u0000d\u01f0\u0001\u0000\u0000\u0000fi\u0003\u0004\u0002\u0000gi\u0003"+
		"\n\u0005\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mq\u0003\b\u0004\u0000"+
		"np\u0003\n\u0005\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0001\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tw\u0003b1\u0000uw\u0003\n\u0005"+
		"\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{}\u0003\u0006\u0003\u0000"+
		"|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0003\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0001\u0000\u0000\u007f\u0080\u0005B\u0000\u0000"+
		"\u0080\u0081\u0006\u0002\uffff\uffff\u0000\u0081\u0082\u0005;\u0000\u0000"+
		"\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005<\u0000\u0000\u0084"+
		"\u0085\u0003\u0002\u0001\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086"+
		"\u0005\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088"+
		"\u008c\u0006\u0003\uffff\uffff\u0000\u0089\u008a\u0003`0\u0000\u008a\u008b"+
		"\u0005@\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0007\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0090\u0005"+
		"*\u0000\u0000\u0090\u0091\u0006\u0004\uffff\uffff\u0000\u0091\u0092\u0005"+
		";\u0000\u0000\u0092\u0093\u0005<\u0000\u0000\u0093\u0094\u0003\u0002\u0001"+
		"\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\t\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u000b\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005B\u0000\u0000\u0099\u009a\u0005>\u0000\u0000\u009a\u009d"+
		"\u0003\f\u0006\u0000\u009b\u009d\u0005B\u0000\u0000\u009c\u0098\u0001"+
		"\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\r\u0001\u0000"+
		"\u0000\u0000\u009e\u00a4\u0003J%\u0000\u009f\u00a0\u0003J%\u0000\u00a0"+
		"\u00a1\u0005>\u0000\u0000\u00a1\u00a2\u0003\u000e\u0007\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f"+
		"\u0001\u0000\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0003\f\u0006\u0000\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u00a8\u0005"+
		"9\u0000\u0000\u00a8\u00a9\u0003\u000e\u0007\u0000\u00a9\u00aa\u0005:\u0000"+
		"\u0000\u00aa\u00b1\u0001\u0000\u0000\u0000\u00ab\u00b1\u0003\f\u0006\u0000"+
		"\u00ac\u00ad\u00059\u0000\u0000\u00ad\u00ae\u0003\u000e\u0007\u0000\u00ae"+
		"\u00af\u0005:\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a5"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u00055\u0000\u0000\u00b3\u00b4\u00056\u0000\u0000\u00b4\u00b5\u0003D"+
		"\"\u0000\u00b5\u00b6\u0005\u001e\u0000\u0000\u00b6\u00b7\u0003`0\u0000"+
		"\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8\u00b9\u00054\u0000\u0000\u00b9"+
		"\u00ba\u0005B\u0000\u0000\u00ba\u00bb\u0006\n\uffff\uffff\u0000\u00bb"+
		"\u00bc\u0005;\u0000\u0000\u00bc\u00bd\u0005B\u0000\u0000\u00bd\u00bf\u0005"+
		"<\u0000\u0000\u00be\u00c0\u0003\u0012\t\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005@\u0000\u0000\u00c4\u0015\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c9\u00050\u0000\u0000\u00c6\u00c7\u00051\u0000\u0000\u00c7"+
		"\u00c9\u0003D\"\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00ce"+
		"\u00052\u0000\u0000\u00cb\u00cc\u00053\u0000\u0000\u00cc\u00ce\u0003D"+
		"\"\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf\u00d8\u0003b1\u0000\u00d0"+
		"\u00d8\u0003\n\u0005\u0000\u00d1\u00d2\u0003\u0016\u000b\u0000\u00d2\u00d3"+
		"\u0006\r\uffff\uffff\u0000\u00d3\u00d8\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0003\u0018\f\u0000\u00d5\u00d6\u0006\r\uffff\uffff\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d8\u001b\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005-\u0000\u0000\u00da\u00de\u0006\u000e\uffff\uffff\u0000\u00db\u00dd"+
		"\u0003\u001a\r\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0003\u0006\u0003\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u0002\u0000\u0000\u00e5\u001d\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005.\u0000\u0000\u00e7\u00e8\u0006\u000f"+
		"\uffff\uffff\u0000\u00e8\u00e9\u0005B\u0000\u0000\u00e9\u00ea\u0005/\u0000"+
		"\u0000\u00ea\u00ee\u00036\u001b\u0000\u00eb\u00ed\u0003\u001a\r\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0003\u0006\u0003\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005$\u0000\u0000\u00f7\u00f8\u0003D\"\u0000\u00f8\u00f9"+
		"\u0003\u0002\u0001\u0000\u00f9\u00fa\u0006\u0010\uffff\uffff\u0000\u00fa"+
		"!\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005&\u0000\u0000\u00fc\u00fd\u0003"+
		"D\"\u0000\u00fd\u00fe\u0003\u0002\u0001\u0000\u00fe\u00ff\u0006\u0011"+
		"\uffff\uffff\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0101\u0005%\u0000"+
		"\u0000\u0101\u0102\u0003\u0002\u0001\u0000\u0102\u0103\u0006\u0012\uffff"+
		"\uffff\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0108\u0003 \u0010\u0000"+
		"\u0105\u0107\u0003\"\u0011\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010b\u010d\u0003$\u0012\u0000\u010c\u010b"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0002\u0000\u0000\u010f\'\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\'\u0000\u0000\u0111\u0112\u0006\u0014"+
		"\uffff\uffff\u0000\u0112\u0113\u0005;\u0000\u0000\u0113\u0114\u0003`0"+
		"\u0000\u0114\u0115\u0005<\u0000\u0000\u0115)\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005)\u0000\u0000\u0117\u0118\u0006\u0015\uffff\uffff\u0000\u0118"+
		"\u0119\u0005;\u0000\u0000\u0119\u011a\u0003@ \u0000\u011a\u011b\u0005"+
		"<\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d\u0005(\u0000"+
		"\u0000\u011d\u011e\u0006\u0016\uffff\uffff\u0000\u011e\u0122\u0005;\u0000"+
		"\u0000\u011f\u0123\u0003>\u001f\u0000\u0120\u0123\u0005B\u0000\u0000\u0121"+
		"\u0123\u0005H\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005>\u0000\u0000\u0125\u0126\u0003"+
		"`0\u0000\u0126\u0127\u0005<\u0000\u0000\u0127-\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005+\u0000\u0000\u0129\u012a\u0006\u0017\uffff\uffff\u0000"+
		"\u012a\u012b\u0005;\u0000\u0000\u012b\u012c\u0003@ \u0000\u012c\u012d"+
		"\u0005<\u0000\u0000\u012d/\u0001\u0000\u0000\u0000\u012e\u012f\u0005,"+
		"\u0000\u0000\u012f\u0130\u0006\u0018\uffff\uffff\u0000\u0130\u0131\u0005"+
		";\u0000\u0000\u0131\u0132\u0003@ \u0000\u0132\u0133\u0005<\u0000\u0000"+
		"\u01331\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0006\u0000\u0000\u0135"+
		"\u0136\u0005;\u0000\u0000\u0136\u0137\u0005?\u0000\u0000\u0137\u0138\u0005"+
		"B\u0000\u0000\u0138\u0139\u0005<\u0000\u0000\u01393\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005=\u0000\u0000\u013b\u013c\u0005=\u0000\u0000\u013c"+
		"5\u0001\u0000\u0000\u0000\u013d\u013e\u0005;\u0000\u0000\u013e\u013f\u0007"+
		"\u0001\u0000\u0000\u013f\u0140\u00034\u001a\u0000\u0140\u0141\u0007\u0001"+
		"\u0000\u0000\u0141\u0142\u0005<\u0000\u0000\u01427\u0001\u0000\u0000\u0000"+
		"\u0143\u0145\u0007\u0002\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u014c\u0005G\u0000\u0000\u0147\u0149\u0007\u0002\u0000\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0005J\u0000\u0000\u014b\u0144"+
		"\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014c9\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005H\u0000\u0000\u014e;\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0007\u0003\u0000\u0000\u0150=\u0001\u0000\u0000\u0000"+
		"\u0151\u0153\u00059\u0000\u0000\u0152\u0154\u0003F#\u0000\u0153\u0152"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0005:\u0000\u0000\u0156?\u0001\u0000"+
		"\u0000\u0000\u0157\u015e\u00038\u001c\u0000\u0158\u015e\u0003:\u001d\u0000"+
		"\u0159\u015e\u0003<\u001e\u0000\u015a\u015e\u0003>\u001f\u0000\u015b\u015e"+
		"\u00032\u0019\u0000\u015c\u015e\u0003d2\u0000\u015d\u0157\u0001\u0000"+
		"\u0000\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000"+
		"\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015eA\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005A\u0000\u0000\u0160\u0161\u0005;\u0000\u0000\u0161"+
		"\u0162\u0003\u0010\b\u0000\u0162\u0163\u0005<\u0000\u0000\u0163\u0164"+
		"\u00057\u0000\u0000\u0164\u0165\u0003\u0002\u0001\u0000\u0165\u0166\u0005"+
		"8\u0000\u0000\u0166\u0167\u0006!\uffff\uffff\u0000\u0167C\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0005;\u0000\u0000\u0169\u016a\u0003`0\u0000"+
		"\u016a\u016b\u0005<\u0000\u0000\u016bE\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0003`0\u0000\u016d\u016e\u0005>\u0000\u0000\u016e\u016f\u0003F#\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u0172\u0003`0\u0000\u0171\u016c"+
		"\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172G\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0007\u0004\u0000\u0000\u0174I\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0005B\u0000\u0000\u0176\u0177\u0003H$\u0000"+
		"\u0177\u0178\u0003`0\u0000\u0178\u0179\u0006%\uffff\uffff\u0000\u0179"+
		"K\u0001\u0000\u0000\u0000\u017a\u017b\u0006&\uffff\uffff\u0000\u017b\u017c"+
		"\u0005;\u0000\u0000\u017c\u017d\u0003`0\u0000\u017d\u017e\u0005<\u0000"+
		"\u0000\u017e\u0187\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u001d\u0000"+
		"\u0000\u0180\u0187\u0003L&\u0005\u0181\u0182\u0005\u000e\u0000\u0000\u0182"+
		"\u0187\u0003L&\u0004\u0183\u0187\u0005B\u0000\u0000\u0184\u0187\u0003"+
		"@ \u0000\u0185\u0187\u0003B!\u0000\u0186\u017a\u0001\u0000\u0000\u0000"+
		"\u0186\u017f\u0001\u0000\u0000\u0000\u0186\u0181\u0001\u0000\u0000\u0000"+
		"\u0186\u0183\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u0191\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\n\u0007\u0000\u0000\u0189\u018a\u00059\u0000\u0000\u018a"+
		"\u018b\u0003`0\u0000\u018b\u018c\u0005:\u0000\u0000\u018c\u0190\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\n\u0006\u0000\u0000\u018e\u0190\u0007\u0005"+
		"\u0000\u0000\u018f\u0188\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192M\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0195\u0003L&\u0000\u0195"+
		"\u0196\u0007\u0006\u0000\u0000\u0196\u0197\u0003N\'\u0000\u0197\u019a"+
		"\u0001\u0000\u0000\u0000\u0198\u019a\u0003L&\u0000\u0199\u0194\u0001\u0000"+
		"\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019aO\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0003N\'\u0000\u019c\u019d\u0007\u0002\u0000\u0000"+
		"\u019d\u019e\u0003P(\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0003N\'\u0000\u01a0\u019b\u0001\u0000\u0000\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1Q\u0001\u0000\u0000\u0000\u01a2\u01a3\u0007\u0007"+
		"\u0000\u0000\u01a3S\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003P(\u0000"+
		"\u01a5\u01a6\u0003R)\u0000\u01a6\u01a7\u0003T*\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01aa\u0003P(\u0000\u01a9\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aaU\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0003T*\u0000\u01ac\u01ad\u0007\b\u0000\u0000\u01ad\u01ae"+
		"\u0003V+\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01b1\u0003T"+
		"*\u0000\u01b0\u01ab\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1W\u0001\u0000\u0000\u0000\u01b2\u01b3\u0003V+\u0000\u01b3"+
		"\u01b4\u0005\u001b\u0000\u0000\u01b4\u01b5\u0003X,\u0000\u01b5\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b8\u0003V+\u0000\u01b7\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8Y\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0003V+\u0000\u01ba\u01bb\u0005\u001c\u0000\u0000\u01bb\u01bc"+
		"\u0003X,\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003X"+
		",\u0000\u01be\u01b9\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf[\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003Z-\u0000\u01c1"+
		"\u01c2\u0005\u0014\u0000\u0000\u01c2\u01c3\u0003\\.\u0000\u01c3\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003Z-\u0000\u01c5\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6]\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005;\u0000\u0000\u01c8\u01c9\u0003`0\u0000\u01c9"+
		"\u01ca\u0005<\u0000\u0000\u01ca\u01cf\u0001\u0000\u0000\u0000\u01cb\u01cf"+
		"\u0005B\u0000\u0000\u01cc\u01cf\u0003@ \u0000\u01cd\u01cf\u0003B!\u0000"+
		"\u01ce\u01c7\u0001\u0000\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cf_\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003^/\u0000\u01d1a\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0003`0\u0000\u01d3\u01d4\u0005@\u0000"+
		"\u0000\u01d4\u01dd\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003J%\u0000\u01d6"+
		"\u01d7\u0005@\u0000\u0000\u01d7\u01dd\u0001\u0000\u0000\u0000\u01d8\u01dd"+
		"\u0003\u001c\u000e\u0000\u01d9\u01dd\u0003\u001e\u000f\u0000\u01da\u01dd"+
		"\u0003&\u0013\u0000\u01db\u01dd\u0003\u0014\n\u0000\u01dc\u01d2\u0001"+
		"\u0000\u0000\u0000\u01dc\u01d5\u0001\u0000\u0000\u0000\u01dc\u01d8\u0001"+
		"\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01ddc\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u00062\uffff\uffff\u0000\u01df\u01e0\u0005B\u0000"+
		"\u0000\u01e0\u01e2\u0005;\u0000\u0000\u01e1\u01e3\u0003F#\u0000\u01e2"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01f1\u0005<\u0000\u0000\u01e5\u01eb"+
		"\u0003B!\u0000\u01e6\u01e8\u0005;\u0000\u0000\u01e7\u01e9\u0003F#\u0000"+
		"\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0005<\u0000\u0000\u01eb"+
		"\u01e6\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec"+
		"\u01f1\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005B\u0000\u0000\u01ee\u01ef"+
		"\u0005=\u0000\u0000\u01ef\u01f1\u0003d2\u0002\u01f0\u01de\u0001\u0000"+
		"\u0000\u0000\u01f0\u01e5\u0001\u0000\u0000\u0000\u01f0\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f1\u01fa\u0001\u0000\u0000\u0000\u01f2\u01f3\n\u0001\u0000"+
		"\u0000\u01f3\u01f5\u0005;\u0000\u0000\u01f4\u01f6\u0003F#\u0000\u01f5"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0005<\u0000\u0000\u01f8\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fbe\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000-hjqvx|\u008c\u009c"+
		"\u00a3\u00b0\u00c1\u00c8\u00cd\u00d7\u00de\u00e2\u00ee\u00f2\u0108\u010c"+
		"\u0122\u0144\u0148\u014b\u0153\u015d\u0171\u0186\u018f\u0191\u0199\u01a0"+
		"\u01a9\u01b0\u01b7\u01be\u01c5\u01ce\u01dc\u01e2\u01e8\u01eb\u01f0\u01f5"+
		"\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}