// Generated from C:/Users/ASUS/Desktop/github-clones/Compiler-Course-Projects-S2024/Phase-1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package fl;
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
		ARROW=1, DECREMENT=2, CONCAT=3, LEQ=4, LES=5, GEQ=6, GTR=7, MULTI_LINE_COMMENT=8, 
		EQL=9, ASSIGN=10, NEQ=11, NOT=12, AND=13, OR=14, INCREMENT=15, PLUS_ASSIGN=16, 
		PLUS=17, MINUS_ASSIGN=18, MINUS=19, MULT_ASSIGN=20, MULT=21, DIV_ASSIGN=22, 
		DIV=23, MOD_ASSIGN=24, MOD=25, BREAK_IF=26, BREAK=27, CHOP=28, CHOMP=29, 
		DEF=30, ELSEIF=31, ELSE=32, END=33, FALSE=34, FOR=35, IF=36, IN=37, MAIN=38, 
		MATCH=39, METHOD=40, NEXT_IF=41, NEXT=42, PATTERN=43, PUTS=44, PUSH=45, 
		RETURN=46, TRUE=47, LEN=48, LOOP_DO=49, PATTERN_INDENT=50, LBRACE=51, 
		RBRACE=52, LBRACKET=53, RBRACKET=54, LPAR=55, RPAR=56, RANGE_OP=57, DOT=58, 
		COMMA=59, COLON=60, SEMICOLON=61, FLOAT_VAL=62, INT_VAL=63, STR_VAL=64, 
		ID=65, SINGLE_LINE_COMMENT=66, WS=67;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_return_statement = 3, 
		RULE_main = 4, RULE_comment = 5, RULE_required_parameter = 6, RULE_optional_parameter = 7, 
		RULE_function_parameter = 8, RULE_pattern_clause = 9, RULE_pattern_matching = 10, 
		RULE_break_statement = 11, RULE_next_statement = 12, RULE_loop_body = 13, 
		RULE_loop_do = 14, RULE_rangeOp = 15, RULE_for_in = 16, RULE_if_statement = 17, 
		RULE_else_if_statement = 18, RULE_else_statement = 19, RULE_conditional_expression = 20, 
		RULE_if_statement_in_loop = 21, RULE_else_if_statement_in_loop = 22, RULE_else_statement_in_loop = 23, 
		RULE_conditional_expression_in_loop = 24, RULE_puts = 25, RULE_len = 26, 
		RULE_push = 27, RULE_chop = 28, RULE_chomp = 29, RULE_function_ptr = 30, 
		RULE_for_range = 31, RULE_numeric_literal = 32, RULE_string_literal = 33, 
		RULE_bool_literal = 34, RULE_list_literal = 35, RULE_literal = 36, RULE_lambda_function = 37, 
		RULE_condition_clause = 38, RULE_args = 39, RULE_assignment_op = 40, RULE_assignment = 41, 
		RULE_function_call = 42, RULE_function_call_suffix = 43, RULE_factor = 44, 
		RULE_factor_suffix = 45, RULE_term_op = 46, RULE_arithmetic_term = 47, 
		RULE_arithmetic_sum = 48, RULE_arithmetic_expr = 49, RULE_relational_op = 50, 
		RULE_compare_expr = 51, RULE_equality_expr = 52, RULE_logical_expr = 53, 
		RULE_append_expr = 54, RULE_expression = 55, RULE_statement = 56, RULE_statement_in_loop = 57, 
		RULE_built_in_function = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "function", "return_statement", "main", "comment", 
			"required_parameter", "optional_parameter", "function_parameter", "pattern_clause", 
			"pattern_matching", "break_statement", "next_statement", "loop_body", 
			"loop_do", "rangeOp", "for_in", "if_statement", "else_if_statement", 
			"else_statement", "conditional_expression", "if_statement_in_loop", "else_if_statement_in_loop", 
			"else_statement_in_loop", "conditional_expression_in_loop", "puts", "len", 
			"push", "chop", "chomp", "function_ptr", "for_range", "numeric_literal", 
			"string_literal", "bool_literal", "list_literal", "literal", "lambda_function", 
			"condition_clause", "args", "assignment_op", "assignment", "function_call", 
			"function_call_suffix", "factor", "factor_suffix", "term_op", "arithmetic_term", 
			"arithmetic_sum", "arithmetic_expr", "relational_op", "compare_expr", 
			"equality_expr", "logical_expr", "append_expr", "expression", "statement", 
			"statement_in_loop", "built_in_function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'--'", "'<<'", "'<='", "'<'", "'>='", "'>'", null, "'=='", 
			"'='", "'!='", "'!'", "'&&'", "'||'", "'++'", "'+='", "'+'", "'-='", 
			"'-'", "'*='", "'*'", "'/='", "'/'", "'%='", "'%'", "'break if'", "'break'", 
			"'chop'", "'chomp'", "'def'", "'elseif'", "'else'", "'end'", "'false'", 
			"'for'", "'if'", "'in'", "'main'", "'match'", "'method'", "'next if'", 
			"'next'", "'pattern'", "'puts'", "'push'", "'return'", "'true'", "'Len'", 
			"'loop do'", null, "'{'", "'}'", "'['", "']'", "'('", "')'", null, "'.'", 
			"','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "DECREMENT", "CONCAT", "LEQ", "LES", "GEQ", "GTR", "MULTI_LINE_COMMENT", 
			"EQL", "ASSIGN", "NEQ", "NOT", "AND", "OR", "INCREMENT", "PLUS_ASSIGN", 
			"PLUS", "MINUS_ASSIGN", "MINUS", "MULT_ASSIGN", "MULT", "DIV_ASSIGN", 
			"DIV", "MOD_ASSIGN", "MOD", "BREAK_IF", "BREAK", "CHOP", "CHOMP", "DEF", 
			"ELSEIF", "ELSE", "END", "FALSE", "FOR", "IF", "IN", "MAIN", "MATCH", 
			"METHOD", "NEXT_IF", "NEXT", "PATTERN", "PUTS", "PUSH", "RETURN", "TRUE", 
			"LEN", "LOOP_DO", "PATTERN_INDENT", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"LPAR", "RPAR", "RANGE_OP", "DOT", "COMMA", "COLON", "SEMICOLON", "FLOAT_VAL", 
			"INT_VAL", "STR_VAL", "ID", "SINGLE_LINE_COMMENT", "WS"
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
	public static class ProgramContext extends ParserRuleContext {
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
		public List<Pattern_matchingContext> pattern_matching() {
			return getRuleContexts(Pattern_matchingContext.class);
		}
		public Pattern_matchingContext pattern_matching(int i) {
			return getRuleContext(Pattern_matchingContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(118);
						function();
						}
						break;
					case MULTI_LINE_COMMENT:
					case SINGLE_LINE_COMMENT:
						{
						setState(119);
						comment();
						}
						break;
					case PATTERN:
						{
						setState(120);
						pattern_matching();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(126);
			main();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI_LINE_COMMENT || _la==SINGLE_LINE_COMMENT) {
				{
				{
				setState(127);
				comment();
				}
				}
				setState(132);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4565610862600515326L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARROW:
				case NOT:
				case MINUS:
				case CHOP:
				case CHOMP:
				case FALSE:
				case FOR:
				case IF:
				case METHOD:
				case PUTS:
				case PUSH:
				case TRUE:
				case LEN:
				case LOOP_DO:
				case LBRACKET:
				case LPAR:
				case FLOAT_VAL:
				case INT_VAL:
				case STR_VAL:
				case ID:
					{
					setState(133);
					statement();
					}
					break;
				case MULTI_LINE_COMMENT:
				case SINGLE_LINE_COMMENT:
					{
					setState(134);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(140);
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
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public Function_parameterContext function_parameter() {
			return getRuleContext(Function_parameterContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(DEF);
			setState(144);
			((FunctionContext)_localctx).name = match(ID);
			 System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null)); 
			setState(146);
			match(LPAR);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET || _la==ID) {
				{
				setState(147);
				function_parameter();
				}
			}

			setState(150);
			match(RPAR);
			setState(151);
			body();
			setState(152);
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
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(154);
			match(RETURN);
			 System.out.println("RETURN"); 
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
				{
				setState(156);
				expression();
				}
			}

			setState(159);
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
			setState(161);
			match(DEF);
			setState(162);
			match(MAIN);
			 System.out.println("MAIN"); 
			setState(164);
			match(LPAR);
			setState(165);
			match(RPAR);
			setState(166);
			body();
			setState(167);
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
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==MULTI_LINE_COMMENT || _la==SINGLE_LINE_COMMENT) ) {
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(COMMA);
				setState(173);
				required_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public Assignment_opContext assignment_op() {
			return getRuleContext(Assignment_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(ID);
				setState(178);
				assignment_op();
				setState(179);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				setState(182);
				assignment_op();
				setState(183);
				expression();
				setState(184);
				match(COMMA);
				setState(185);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				required_parameter();
				setState(190);
				match(COMMA);
				setState(191);
				match(LBRACKET);
				setState(192);
				optional_parameter();
				setState(193);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				required_parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(LBRACKET);
				setState(197);
				optional_parameter();
				setState(198);
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
		public TerminalNode PATTERN_INDENT() { return getToken(FunctionCraftParser.PATTERN_INDENT, 0); }
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
			setState(202);
			match(PATTERN_INDENT);
			setState(203);
			condition_clause();
			setState(204);
			match(ASSIGN);
			setState(205);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
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
			setState(207);
			match(PATTERN);
			setState(208);
			((Pattern_matchingContext)_localctx).name = match(ID);
			 System.out.println("PatternDec: " + (((Pattern_matchingContext)_localctx).name!=null?((Pattern_matchingContext)_localctx).name.getText():null)); 
			setState(210);
			match(LPAR);
			setState(211);
			args();
			setState(212);
			match(RPAR);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				pattern_clause();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PATTERN_INDENT );
			setState(218);
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
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(BREAK);
				 System.out.println("Control: BREAK"); 
				}
				break;
			case BREAK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(BREAK_IF);
				 System.out.println("Control: BREAK"); 
				setState(224);
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
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(NEXT);
				 System.out.println("Control: NEXT"); 
				}
				break;
			case NEXT_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(NEXT_IF);
				 System.out.println("Control: NEXT"); 
				setState(231);
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
		public List<Statement_in_loopContext> statement_in_loop() {
			return getRuleContexts(Statement_in_loopContext.class);
		}
		public Statement_in_loopContext statement_in_loop(int i) {
			return getRuleContext(Statement_in_loopContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<Break_statementContext> break_statement() {
			return getRuleContexts(Break_statementContext.class);
		}
		public Break_statementContext break_statement(int i) {
			return getRuleContext(Break_statementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<Next_statementContext> next_statement() {
			return getRuleContexts(Next_statementContext.class);
		}
		public Next_statementContext next_statement(int i) {
			return getRuleContext(Next_statementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4565604265329422078L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARROW:
				case NOT:
				case MINUS:
				case CHOP:
				case CHOMP:
				case FALSE:
				case FOR:
				case IF:
				case METHOD:
				case PUTS:
				case PUSH:
				case TRUE:
				case LEN:
				case LOOP_DO:
				case LBRACKET:
				case LPAR:
				case FLOAT_VAL:
				case INT_VAL:
				case STR_VAL:
				case ID:
					{
					setState(234);
					statement_in_loop();
					}
					break;
				case MULTI_LINE_COMMENT:
				case SINGLE_LINE_COMMENT:
					{
					setState(235);
					comment();
					}
					break;
				case BREAK_IF:
				case BREAK:
					{
					setState(236);
					break_statement();
					setState(237);
					match(SEMICOLON);
					}
					break;
				case NEXT_IF:
				case NEXT:
					{
					setState(239);
					next_statement();
					setState(240);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(247);
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
	public static class Loop_doContext extends ParserRuleContext {
		public TerminalNode LOOP_DO() { return getToken(FunctionCraftParser.LOOP_DO, 0); }
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LOOP_DO);
			 System.out.println("Loop: DO"); 
			setState(252);
			loop_body();
			setState(253);
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
	public static class RangeOpContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(FunctionCraftParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FunctionCraftParser.DOT, i);
		}
		public RangeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRangeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRangeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRangeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeOpContext rangeOp() throws RecognitionException {
		RangeOpContext _localctx = new RangeOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rangeOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DOT);
			setState(256);
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
	public static class For_inContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public For_rangeContext for_range() {
			return getRuleContext(For_rangeContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
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
		enterRule(_localctx, 32, RULE_for_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(FOR);
			 System.out.println("Loop: FOR"); 
			setState(260);
			match(ID);
			setState(261);
			match(IN);
			setState(262);
			for_range();
			setState(263);
			loop_body();
			setState(264);
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
		enterRule(_localctx, 34, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			 System.out.println("Decision: IF"); 
			setState(268);
			condition_clause();
			setState(269);
			body();
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
		enterRule(_localctx, 36, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ELSEIF);
			 System.out.println("Decision: ELSE IF"); 
			setState(273);
			condition_clause();
			setState(274);
			body();
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
		enterRule(_localctx, 38, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ELSE);
			 System.out.println("Decision: ELSE"); 
			setState(278);
			body();
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
		enterRule(_localctx, 40, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			if_statement();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(281);
				else_if_statement();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(287);
				else_statement();
				}
			}

			setState(290);
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
	public static class If_statement_in_loopContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public If_statement_in_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_statement_in_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_statement_in_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_statement_in_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statement_in_loopContext if_statement_in_loop() throws RecognitionException {
		If_statement_in_loopContext _localctx = new If_statement_in_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_statement_in_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(IF);
			 System.out.println("Decision: IF"); 
			setState(294);
			condition_clause();
			setState(295);
			loop_body();
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
	public static class Else_if_statement_in_loopContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public Else_if_statement_in_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse_if_statement_in_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse_if_statement_in_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse_if_statement_in_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statement_in_loopContext else_if_statement_in_loop() throws RecognitionException {
		Else_if_statement_in_loopContext _localctx = new Else_if_statement_in_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_if_statement_in_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ELSEIF);
			 System.out.println("Decision: ELSE IF"); 
			setState(299);
			condition_clause();
			setState(300);
			loop_body();
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
	public static class Else_statement_in_loopContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public Else_statement_in_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse_statement_in_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse_statement_in_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse_statement_in_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statement_in_loopContext else_statement_in_loop() throws RecognitionException {
		Else_statement_in_loopContext _localctx = new Else_statement_in_loopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_else_statement_in_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ELSE);
			 System.out.println("Decision: ELSE"); 
			setState(304);
			loop_body();
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
	public static class Conditional_expression_in_loopContext extends ParserRuleContext {
		public If_statement_in_loopContext if_statement_in_loop() {
			return getRuleContext(If_statement_in_loopContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Else_if_statement_in_loopContext> else_if_statement_in_loop() {
			return getRuleContexts(Else_if_statement_in_loopContext.class);
		}
		public Else_if_statement_in_loopContext else_if_statement_in_loop(int i) {
			return getRuleContext(Else_if_statement_in_loopContext.class,i);
		}
		public Else_statement_in_loopContext else_statement_in_loop() {
			return getRuleContext(Else_statement_in_loopContext.class,0);
		}
		public Conditional_expression_in_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterConditional_expression_in_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitConditional_expression_in_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitConditional_expression_in_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expression_in_loopContext conditional_expression_in_loop() throws RecognitionException {
		Conditional_expression_in_loopContext _localctx = new Conditional_expression_in_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditional_expression_in_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			if_statement_in_loop();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(307);
				else_if_statement_in_loop();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(313);
				else_statement_in_loop();
				}
			}

			setState(316);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 50, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(PUTS);
			 System.out.println("Built-In: PUTS"); 
			setState(320);
			match(LPAR);
			setState(321);
			args();
			setState(322);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 52, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(LEN);
			 System.out.println("Built-In: LEN"); 
			setState(326);
			match(LPAR);
			setState(327);
			args();
			setState(328);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
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
		enterRule(_localctx, 54, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(PUSH);
			 System.out.println("Built-In: PUSH"); 
			setState(332);
			match(LPAR);
			setState(333);
			args();
			setState(334);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 56, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(CHOP);
			 System.out.println("Built-In: CHOP"); 
			setState(338);
			match(LPAR);
			setState(339);
			args();
			setState(340);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 58, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CHOMP);
			 System.out.println("Built-In: CHOMP"); 
			setState(344);
			match(LPAR);
			setState(345);
			args();
			setState(346);
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
		enterRule(_localctx, 60, RULE_function_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(METHOD);
			setState(349);
			match(LPAR);
			setState(350);
			match(COLON);
			setState(351);
			((Function_ptrContext)_localctx).name = match(ID);
			setState(352);
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
	public static class For_rangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RANGE_OP() { return getToken(FunctionCraftParser.RANGE_OP, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public For_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rangeContext for_range() throws RecognitionException {
		For_rangeContext _localctx = new For_rangeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_range);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(LPAR);
				setState(355);
				expression();
				setState(356);
				match(RANGE_OP);
				setState(357);
				expression();
				setState(358);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
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
	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
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
		enterRule(_localctx, 64, RULE_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_VAL || _la==INT_VAL) ) {
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
		enterRule(_localctx, 66, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 68, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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
		enterRule(_localctx, 70, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LBRACKET);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
				{
				setState(370);
				args();
				}
			}

			setState(373);
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
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public Function_ptrContext function_ptr() {
			return getRuleContext(Function_ptrContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
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
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				list_literal();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				function_ptr();
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				lambda_function();
				}
				break;
			case FLOAT_VAL:
			case INT_VAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				numeric_literal();
				}
				break;
			case STR_VAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				string_literal();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				bool_literal();
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
		enterRule(_localctx, 74, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Structure: LAMBDA"); 
			setState(384);
			match(ARROW);
			setState(385);
			match(LPAR);
			setState(386);
			function_parameter();
			setState(387);
			match(RPAR);
			setState(388);
			match(LBRACE);
			setState(389);
			body();
			setState(390);
			match(RBRACE);
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
		enterRule(_localctx, 76, RULE_condition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LPAR);
			setState(393);
			expression();
			setState(394);
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
		enterRule(_localctx, 78, RULE_args);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				expression();
				setState(397);
				match(COMMA);
				setState(398);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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
		enterRule(_localctx, 80, RULE_assignment_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 22348800L) != 0)) ) {
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
		public FactorContext name;
		public Assignment_opContext assignment_op() {
			return getRuleContext(Assignment_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			((AssignmentContext)_localctx).name = factor();
			setState(406);
			assignment_op();
			setState(407);
			expression();
			 System.out.println("Assignment: " + (((AssignmentContext)_localctx).name!=null?_input.getText(((AssignmentContext)_localctx).name.start,((AssignmentContext)_localctx).name.stop):null)); 
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
		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_call_suffixContext function_call_suffix() {
			return getRuleContext(Function_call_suffixContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public Function_ptrContext function_ptr() {
			return getRuleContext(Function_ptrContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
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
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_call);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				built_in_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 System.out.println("FunctionCall"); 
				setState(412);
				match(ID);
				setState(413);
				match(LPAR);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(414);
					args();
					}
				}

				setState(417);
				match(RPAR);
				setState(418);
				function_call_suffix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 System.out.println("FunctionCall"); 
				setState(420);
				match(ID);
				setState(421);
				match(LPAR);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(422);
					args();
					}
				}

				setState(425);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				lambda_function();
				 System.out.println("FunctionCall"); 
				{
				setState(428);
				match(LPAR);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(429);
					args();
					}
				}

				setState(432);
				match(RPAR);
				}
				setState(434);
				function_call_suffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				lambda_function();
				 System.out.println("FunctionCall"); 
				{
				setState(438);
				match(LPAR);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(439);
					args();
					}
				}

				setState(442);
				match(RPAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 System.out.println("FunctionCall"); 
				setState(445);
				function_ptr();
				{
				setState(446);
				match(LPAR);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(447);
					args();
					}
				}

				setState(450);
				match(RPAR);
				}
				setState(452);
				function_call_suffix();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 System.out.println("FunctionCall"); 
				setState(455);
				function_ptr();
				{
				setState(456);
				match(LPAR);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(457);
					args();
					}
				}

				setState(460);
				match(RPAR);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 System.out.println("Built-In: MATCH"); 
				setState(463);
				match(ID);
				setState(464);
				match(DOT);
				setState(465);
				match(MATCH);
				setState(466);
				match(LPAR);
				setState(467);
				args();
				setState(468);
				match(RPAR);
				setState(469);
				function_call_suffix();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				 System.out.println("Built-In: MATCH"); 
				setState(472);
				match(ID);
				setState(473);
				match(DOT);
				setState(474);
				match(MATCH);
				setState(475);
				match(LPAR);
				setState(476);
				args();
				setState(477);
				match(RPAR);
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
	public static class Function_call_suffixContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_call_suffixContext function_call_suffix() {
			return getRuleContext(Function_call_suffixContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_call_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_suffixContext function_call_suffix() throws RecognitionException {
		Function_call_suffixContext _localctx = new Function_call_suffixContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_call_suffix);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 System.out.println("FunctionCall"); 
				setState(482);
				match(LPAR);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(483);
					args();
					}
				}

				setState(486);
				match(RPAR);
				setState(487);
				function_call_suffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 System.out.println("FunctionCall"); 
				setState(489);
				match(LPAR);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4566173915633151998L) != 0) || _la==STR_VAL || _la==ID) {
					{
					setState(490);
					args();
					}
				}

				setState(493);
				match(RPAR);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Factor_suffixContext factor_suffix() {
			return getRuleContext(Factor_suffixContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_factor);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(LPAR);
				setState(497);
				expression();
				setState(498);
				match(RPAR);
				setState(499);
				factor_suffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(LPAR);
				setState(502);
				expression();
				setState(503);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(NOT);
				setState(506);
				match(LPAR);
				setState(507);
				factor();
				setState(508);
				match(RPAR);
				setState(509);
				factor_suffix();
				 System.out.println("Operator: !"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(NOT);
				setState(513);
				match(LPAR);
				setState(514);
				factor();
				setState(515);
				match(RPAR);
				 System.out.println("Operator: !"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				match(MINUS);
				setState(519);
				factor();
				setState(520);
				factor_suffix();
				 System.out.println("Operator: -"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(523);
				match(MINUS);
				setState(524);
				factor();
				 System.out.println("Operator: -"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(527);
				function_call();
				setState(528);
				factor_suffix();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(530);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(531);
				match(ID);
				setState(532);
				factor_suffix();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(533);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(534);
				literal();
				setState(535);
				factor_suffix();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(537);
				literal();
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
	public static class Factor_suffixContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public Factor_suffixContext factor_suffix() {
			return getRuleContext(Factor_suffixContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(FunctionCraftParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(FunctionCraftParser.DECREMENT, 0); }
		public Factor_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFactor_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFactor_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFactor_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_suffixContext factor_suffix() throws RecognitionException {
		Factor_suffixContext _localctx = new Factor_suffixContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factor_suffix);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(LBRACKET);
				setState(541);
				expression();
				setState(542);
				match(RBRACKET);
				setState(543);
				factor_suffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(LBRACKET);
				setState(546);
				expression();
				setState(547);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(INCREMENT);
				 System.out.println("Operator: ++"); 
				setState(551);
				factor_suffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				match(INCREMENT);
				 System.out.println("Operator: ++"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(554);
				match(DECREMENT);
				 System.out.println("Operator: --"); 
				setState(556);
				factor_suffix();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(557);
				match(DECREMENT);
				 System.out.println("Operator: --"); 
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
	public static class Term_opContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public Term_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterTerm_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitTerm_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitTerm_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_opContext term_op() throws RecognitionException {
		Term_opContext _localctx = new Term_opContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_term_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 44040192L) != 0)) ) {
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
	public static class Arithmetic_termContext extends ParserRuleContext {
		public Term_opContext op;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Term_opContext> term_op() {
			return getRuleContexts(Term_opContext.class);
		}
		public Term_opContext term_op(int i) {
			return getRuleContext(Term_opContext.class,i);
		}
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
		enterRule(_localctx, 94, RULE_arithmetic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			factor();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44040192L) != 0)) {
				{
				{
				setState(564);
				((Arithmetic_termContext)_localctx).op = term_op();
				setState(565);
				factor();
				 System.out.println("FuncDec: " + (((Arithmetic_termContext)_localctx).op!=null?_input.getText(((Arithmetic_termContext)_localctx).op.start,((Arithmetic_termContext)_localctx).op.stop):null)); 
				}
				}
				setState(572);
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
	public static class Arithmetic_sumContext extends ParserRuleContext {
		public List<Arithmetic_termContext> arithmetic_term() {
			return getRuleContexts(Arithmetic_termContext.class);
		}
		public Arithmetic_termContext arithmetic_term(int i) {
			return getRuleContext(Arithmetic_termContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FunctionCraftParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FunctionCraftParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(FunctionCraftParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FunctionCraftParser.MINUS, i);
		}
		public Arithmetic_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArithmetic_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArithmetic_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArithmetic_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_sumContext arithmetic_sum() throws RecognitionException {
		Arithmetic_sumContext _localctx = new Arithmetic_sumContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arithmetic_sum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			arithmetic_term();
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(582);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						{
						setState(574);
						match(PLUS);
						setState(575);
						arithmetic_term();
						 System.out.println("Operator: +"); 
						}
						}
						break;
					case MINUS:
						{
						{
						setState(578);
						match(MINUS);
						setState(579);
						arithmetic_term();
						 System.out.println("Operator: -"); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_sumContext arithmetic_sum() {
			return getRuleContext(Arithmetic_sumContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_arithmetic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			arithmetic_sum();
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
		enterRule(_localctx, 100, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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
		public Relational_opContext op;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public List<Relational_opContext> relational_op() {
			return getRuleContexts(Relational_opContext.class);
		}
		public Relational_opContext relational_op(int i) {
			return getRuleContext(Relational_opContext.class,i);
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
		enterRule(_localctx, 102, RULE_compare_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			arithmetic_expr();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
				{
				{
				setState(592);
				((Compare_exprContext)_localctx).op = relational_op();
				setState(593);
				arithmetic_expr();
				 System.out.println("FuncDec: " + (((Compare_exprContext)_localctx).op!=null?_input.getText(((Compare_exprContext)_localctx).op.start,((Compare_exprContext)_localctx).op.stop):null)); 
				}
				}
				setState(600);
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
	public static class Equality_exprContext extends ParserRuleContext {
		public List<Compare_exprContext> compare_expr() {
			return getRuleContexts(Compare_exprContext.class);
		}
		public Compare_exprContext compare_expr(int i) {
			return getRuleContext(Compare_exprContext.class,i);
		}
		public List<TerminalNode> EQL() { return getTokens(FunctionCraftParser.EQL); }
		public TerminalNode EQL(int i) {
			return getToken(FunctionCraftParser.EQL, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(FunctionCraftParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(FunctionCraftParser.NEQ, i);
		}
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
		enterRule(_localctx, 104, RULE_equality_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			compare_expr();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQL || _la==NEQ) {
				{
				setState(610);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQL:
					{
					{
					setState(602);
					match(EQL);
					setState(603);
					compare_expr();
					 System.out.println("Operator: =="); 
					}
					}
					break;
				case NEQ:
					{
					{
					setState(606);
					match(NEQ);
					setState(607);
					compare_expr();
					 System.out.println("Operator: !="); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(614);
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
	public static class Logical_exprContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
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
		enterRule(_localctx, 106, RULE_logical_expr);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(615);
				match(LPAR);
				setState(616);
				expression();
				setState(617);
				match(RPAR);
				}
				setState(619);
				match(AND);
				{
				setState(620);
				match(LPAR);
				setState(621);
				expression();
				setState(622);
				match(RPAR);
				}
				 System.out.println("Operator: &&"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(626);
				match(LPAR);
				setState(627);
				expression();
				setState(628);
				match(RPAR);
				}
				setState(630);
				match(OR);
				{
				setState(631);
				match(LPAR);
				setState(632);
				expression();
				setState(633);
				match(RPAR);
				}
				 System.out.println("Operator: ||"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
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
	public static class Append_exprContext extends ParserRuleContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(FunctionCraftParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(FunctionCraftParser.CONCAT, i);
		}
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
		enterRule(_localctx, 108, RULE_append_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			logical_expr();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(641);
				match(CONCAT);
				setState(642);
				logical_expr();
				 System.out.println("Operator: <<"); 
				}
				}
				setState(649);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Append_exprContext append_expr() {
			return getRuleContext(Append_exprContext.class,0);
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
		enterRule(_localctx, 110, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			append_expr();
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
		enterRule(_localctx, 112, RULE_statement);
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				expression();
				setState(653);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				assignment();
				setState(656);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				loop_do();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				for_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(660);
				conditional_expression();
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
	public static class Statement_in_loopContext extends ParserRuleContext {
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
		public Conditional_expression_in_loopContext conditional_expression_in_loop() {
			return getRuleContext(Conditional_expression_in_loopContext.class,0);
		}
		public Statement_in_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement_in_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement_in_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement_in_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_in_loopContext statement_in_loop() throws RecognitionException {
		Statement_in_loopContext _localctx = new Statement_in_loopContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_statement_in_loop);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				expression();
				setState(664);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				assignment();
				setState(667);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				loop_do();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				for_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(671);
				conditional_expression_in_loop();
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
	public static class Built_in_functionContext extends ParserRuleContext {
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public Built_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuilt_in_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuilt_in_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuilt_in_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_functionContext built_in_function() throws RecognitionException {
		Built_in_functionContext _localctx = new Built_in_functionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_built_in_function);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				puts();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				len();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				push();
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(677);
				chop();
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(678);
				chomp();
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

	public static final String _serializedATN =
		"\u0004\u0001C\u02aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000z\b\u0000\n\u0000\f\u0000}\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0081\b\u0000\n\u0000\f\u0000\u0084\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0088\b\u0001\n\u0001\f\u0001\u008b\t\u0001"+
		"\u0001\u0001\u0003\u0001\u008e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0095\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u009e\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00bc\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c9\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u00d7\b\n\u000b\n\f\n\u00d8\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e2\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e9\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f3\b\r\n\r\f\r\u00f6"+
		"\t\r\u0001\r\u0003\r\u00f9\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u011b"+
		"\b\u0014\n\u0014\f\u0014\u011e\t\u0014\u0001\u0014\u0003\u0014\u0121\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0135\b\u0018\n\u0018\f\u0018\u0138\t\u0018\u0001\u0018"+
		"\u0003\u0018\u013b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u016a\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0003#\u0174\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u017e\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u0192\b\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01a0\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u01a8\b*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u01af\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u01b9\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01c1"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01cb"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u01e0\b*\u0001+\u0001+\u0001+\u0003+\u01e5\b+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u01ec\b+\u0001+\u0003+\u01ef\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u021b"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0230\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0239"+
		"\b/\n/\f/\u023c\t/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u0247\b0\n0\f0\u024a\t0\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00013\u00013\u00013\u00053\u0255\b3\n3\f3\u0258\t3\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u0263\b4\n4"+
		"\f4\u0266\t4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00035\u027f\b5\u00016\u00016\u00016\u0001"+
		"6\u00016\u00056\u0286\b6\n6\f6\u0289\t6\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0296\b8\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u02a1\b9\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0003:\u02a8\b:\u0001:\u0000\u0000;\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0006\u0002"+
		"\u0000\b\bBB\u0001\u0000>?\u0002\u0000\"\"//\u0006\u0000\n\n\u0010\u0010"+
		"\u0012\u0012\u0014\u0014\u0016\u0016\u0018\u0018\u0003\u0000\u0015\u0015"+
		"\u0017\u0017\u0019\u0019\u0001\u0000\u0004\u0007\u02c5\u0000{\u0001\u0000"+
		"\u0000\u0000\u0002\u0089\u0001\u0000\u0000\u0000\u0004\u008f\u0001\u0000"+
		"\u0000\u0000\u0006\u009a\u0001\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000"+
		"\u0000\n\u00a9\u0001\u0000\u0000\u0000\f\u00af\u0001\u0000\u0000\u0000"+
		"\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00c8\u0001\u0000\u0000\u0000"+
		"\u0012\u00ca\u0001\u0000\u0000\u0000\u0014\u00cf\u0001\u0000\u0000\u0000"+
		"\u0016\u00e1\u0001\u0000\u0000\u0000\u0018\u00e8\u0001\u0000\u0000\u0000"+
		"\u001a\u00f4\u0001\u0000\u0000\u0000\u001c\u00fa\u0001\u0000\u0000\u0000"+
		"\u001e\u00ff\u0001\u0000\u0000\u0000 \u0102\u0001\u0000\u0000\u0000\""+
		"\u010a\u0001\u0000\u0000\u0000$\u010f\u0001\u0000\u0000\u0000&\u0114\u0001"+
		"\u0000\u0000\u0000(\u0118\u0001\u0000\u0000\u0000*\u0124\u0001\u0000\u0000"+
		"\u0000,\u0129\u0001\u0000\u0000\u0000.\u012e\u0001\u0000\u0000\u00000"+
		"\u0132\u0001\u0000\u0000\u00002\u013e\u0001\u0000\u0000\u00004\u0144\u0001"+
		"\u0000\u0000\u00006\u014a\u0001\u0000\u0000\u00008\u0150\u0001\u0000\u0000"+
		"\u0000:\u0156\u0001\u0000\u0000\u0000<\u015c\u0001\u0000\u0000\u0000>"+
		"\u0169\u0001\u0000\u0000\u0000@\u016b\u0001\u0000\u0000\u0000B\u016d\u0001"+
		"\u0000\u0000\u0000D\u016f\u0001\u0000\u0000\u0000F\u0171\u0001\u0000\u0000"+
		"\u0000H\u017d\u0001\u0000\u0000\u0000J\u017f\u0001\u0000\u0000\u0000L"+
		"\u0188\u0001\u0000\u0000\u0000N\u0191\u0001\u0000\u0000\u0000P\u0193\u0001"+
		"\u0000\u0000\u0000R\u0195\u0001\u0000\u0000\u0000T\u01df\u0001\u0000\u0000"+
		"\u0000V\u01ee\u0001\u0000\u0000\u0000X\u021a\u0001\u0000\u0000\u0000Z"+
		"\u022f\u0001\u0000\u0000\u0000\\\u0231\u0001\u0000\u0000\u0000^\u0233"+
		"\u0001\u0000\u0000\u0000`\u023d\u0001\u0000\u0000\u0000b\u024b\u0001\u0000"+
		"\u0000\u0000d\u024d\u0001\u0000\u0000\u0000f\u024f\u0001\u0000\u0000\u0000"+
		"h\u0259\u0001\u0000\u0000\u0000j\u027e\u0001\u0000\u0000\u0000l\u0280"+
		"\u0001\u0000\u0000\u0000n\u028a\u0001\u0000\u0000\u0000p\u0295\u0001\u0000"+
		"\u0000\u0000r\u02a0\u0001\u0000\u0000\u0000t\u02a7\u0001\u0000\u0000\u0000"+
		"vz\u0003\u0004\u0002\u0000wz\u0003\n\u0005\u0000xz\u0003\u0014\n\u0000"+
		"yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0082"+
		"\u0003\b\u0004\u0000\u007f\u0081\u0003\n\u0005\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0001\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0003"+
		"p8\u0000\u0086\u0088\u0003\n\u0005\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0003\u0006\u0003\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0003\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u001e\u0000\u0000\u0090\u0091\u0005A\u0000\u0000"+
		"\u0091\u0092\u0006\u0002\uffff\uffff\u0000\u0092\u0094\u00057\u0000\u0000"+
		"\u0093\u0095\u0003\u0010\b\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u00058\u0000\u0000\u0097\u0098\u0003\u0002\u0001\u0000\u0098\u0099"+
		"\u0005!\u0000\u0000\u0099\u0005\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		".\u0000\u0000\u009b\u009d\u0006\u0003\uffff\uffff\u0000\u009c\u009e\u0003"+
		"n7\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000"+
		"\u00a0\u0007\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u001e\u0000\u0000"+
		"\u00a2\u00a3\u0005&\u0000\u0000\u00a3\u00a4\u0006\u0004\uffff\uffff\u0000"+
		"\u00a4\u00a5\u00057\u0000\u0000\u00a5\u00a6\u00058\u0000\u0000\u00a6\u00a7"+
		"\u0003\u0002\u0001\u0000\u00a7\u00a8\u0005!\u0000\u0000\u00a8\t\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0007\u0000\u0000\u0000\u00aa\u000b\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005A\u0000\u0000\u00ac\u00ad\u0005;\u0000"+
		"\u0000\u00ad\u00b0\u0003\f\u0006\u0000\u00ae\u00b0\u0005A\u0000\u0000"+
		"\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\r\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005A\u0000\u0000\u00b2"+
		"\u00b3\u0003P(\u0000\u00b3\u00b4\u0003n7\u0000\u00b4\u00bc\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005A\u0000\u0000\u00b6\u00b7\u0003P(\u0000"+
		"\u00b7\u00b8\u0003n7\u0000\u00b8\u00b9\u0005;\u0000\u0000\u00b9\u00ba"+
		"\u0003\u000e\u0007\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b1"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bc\u000f"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\f\u0006\u0000\u00be\u00bf\u0005"+
		";\u0000\u0000\u00bf\u00c0\u00055\u0000\u0000\u00c0\u00c1\u0003\u000e\u0007"+
		"\u0000\u00c1\u00c2\u00056\u0000\u0000\u00c2\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c9\u0003\f\u0006\u0000\u00c4\u00c5\u00055\u0000\u0000\u00c5"+
		"\u00c6\u0003\u000e\u0007\u0000\u00c6\u00c7\u00056\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000\u0000\u00c8\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u0011"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u00052\u0000\u0000\u00cb\u00cc\u0003"+
		"L&\u0000\u00cc\u00cd\u0005\n\u0000\u0000\u00cd\u00ce\u0003n7\u0000\u00ce"+
		"\u0013\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005+\u0000\u0000\u00d0\u00d1"+
		"\u0005A\u0000\u0000\u00d1\u00d2\u0006\n\uffff\uffff\u0000\u00d2\u00d3"+
		"\u00057\u0000\u0000\u00d3\u00d4\u0003N\'\u0000\u00d4\u00d6\u00058\u0000"+
		"\u0000\u00d5\u00d7\u0003\u0012\t\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005=\u0000\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u001b\u0000\u0000\u00dd\u00e2\u0006\u000b\uffff\uffff\u0000"+
		"\u00de\u00df\u0005\u001a\u0000\u0000\u00df\u00e0\u0006\u000b\uffff\uffff"+
		"\u0000\u00e0\u00e2\u0003L&\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1"+
		"\u00de\u0001\u0000\u0000\u0000\u00e2\u0017\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0005*\u0000\u0000\u00e4\u00e9\u0006\f\uffff\uffff\u0000\u00e5"+
		"\u00e6\u0005)\u0000\u0000\u00e6\u00e7\u0006\f\uffff\uffff\u0000\u00e7"+
		"\u00e9\u0003L&\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00f3\u0003"+
		"r9\u0000\u00eb\u00f3\u0003\n\u0005\u0000\u00ec\u00ed\u0003\u0016\u000b"+
		"\u0000\u00ed\u00ee\u0005=\u0000\u0000\u00ee\u00f3\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0003\u0018\f\u0000\u00f0\u00f1\u0005=\u0000\u0000\u00f1"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f2\u00ea\u0001\u0000\u0000\u0000\u00f2"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0003\u0006\u0003\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u00051\u0000\u0000\u00fb\u00fc\u0006\u000e\uffff\uffff\u0000\u00fc"+
		"\u00fd\u0003\u001a\r\u0000\u00fd\u00fe\u0005!\u0000\u0000\u00fe\u001d"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005:\u0000\u0000\u0100\u0101\u0005"+
		":\u0000\u0000\u0101\u001f\u0001\u0000\u0000\u0000\u0102\u0103\u0005#\u0000"+
		"\u0000\u0103\u0104\u0006\u0010\uffff\uffff\u0000\u0104\u0105\u0005A\u0000"+
		"\u0000\u0105\u0106\u0005%\u0000\u0000\u0106\u0107\u0003>\u001f\u0000\u0107"+
		"\u0108\u0003\u001a\r\u0000\u0108\u0109\u0005!\u0000\u0000\u0109!\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005$\u0000\u0000\u010b\u010c\u0006\u0011"+
		"\uffff\uffff\u0000\u010c\u010d\u0003L&\u0000\u010d\u010e\u0003\u0002\u0001"+
		"\u0000\u010e#\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001f\u0000\u0000"+
		"\u0110\u0111\u0006\u0012\uffff\uffff\u0000\u0111\u0112\u0003L&\u0000\u0112"+
		"\u0113\u0003\u0002\u0001\u0000\u0113%\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005 \u0000\u0000\u0115\u0116\u0006\u0013\uffff\uffff\u0000\u0116\u0117"+
		"\u0003\u0002\u0001\u0000\u0117\'\u0001\u0000\u0000\u0000\u0118\u011c\u0003"+
		"\"\u0011\u0000\u0119\u011b\u0003$\u0012\u0000\u011a\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0121\u0003&\u0013"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0005!\u0000\u0000"+
		"\u0123)\u0001\u0000\u0000\u0000\u0124\u0125\u0005$\u0000\u0000\u0125\u0126"+
		"\u0006\u0015\uffff\uffff\u0000\u0126\u0127\u0003L&\u0000\u0127\u0128\u0003"+
		"\u001a\r\u0000\u0128+\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001f"+
		"\u0000\u0000\u012a\u012b\u0006\u0016\uffff\uffff\u0000\u012b\u012c\u0003"+
		"L&\u0000\u012c\u012d\u0003\u001a\r\u0000\u012d-\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005 \u0000\u0000\u012f\u0130\u0006\u0017\uffff\uffff\u0000"+
		"\u0130\u0131\u0003\u001a\r\u0000\u0131/\u0001\u0000\u0000\u0000\u0132"+
		"\u0136\u0003*\u0015\u0000\u0133\u0135\u0003,\u0016\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u013a\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013b\u0003"+
		".\u0017\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005!\u0000"+
		"\u0000\u013d1\u0001\u0000\u0000\u0000\u013e\u013f\u0005,\u0000\u0000\u013f"+
		"\u0140\u0006\u0019\uffff\uffff\u0000\u0140\u0141\u00057\u0000\u0000\u0141"+
		"\u0142\u0003N\'\u0000\u0142\u0143\u00058\u0000\u0000\u01433\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u00050\u0000\u0000\u0145\u0146\u0006\u001a\uffff"+
		"\uffff\u0000\u0146\u0147\u00057\u0000\u0000\u0147\u0148\u0003N\'\u0000"+
		"\u0148\u0149\u00058\u0000\u0000\u01495\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005-\u0000\u0000\u014b\u014c\u0006\u001b\uffff\uffff\u0000\u014c\u014d"+
		"\u00057\u0000\u0000\u014d\u014e\u0003N\'\u0000\u014e\u014f\u00058\u0000"+
		"\u0000\u014f7\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001c\u0000\u0000"+
		"\u0151\u0152\u0006\u001c\uffff\uffff\u0000\u0152\u0153\u00057\u0000\u0000"+
		"\u0153\u0154\u0003N\'\u0000\u0154\u0155\u00058\u0000\u0000\u01559\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005\u001d\u0000\u0000\u0157\u0158\u0006"+
		"\u001d\uffff\uffff\u0000\u0158\u0159\u00057\u0000\u0000\u0159\u015a\u0003"+
		"N\'\u0000\u015a\u015b\u00058\u0000\u0000\u015b;\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005(\u0000\u0000\u015d\u015e\u00057\u0000\u0000\u015e\u015f"+
		"\u0005<\u0000\u0000\u015f\u0160\u0005A\u0000\u0000\u0160\u0161\u00058"+
		"\u0000\u0000\u0161=\u0001\u0000\u0000\u0000\u0162\u0163\u00057\u0000\u0000"+
		"\u0163\u0164\u0003n7\u0000\u0164\u0165\u00059\u0000\u0000\u0165\u0166"+
		"\u0003n7\u0000\u0166\u0167\u00058\u0000\u0000\u0167\u016a\u0001\u0000"+
		"\u0000\u0000\u0168\u016a\u0003n7\u0000\u0169\u0162\u0001\u0000\u0000\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u016a?\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0007\u0001\u0000\u0000\u016cA\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0005@\u0000\u0000\u016eC\u0001\u0000\u0000\u0000\u016f\u0170\u0007\u0002"+
		"\u0000\u0000\u0170E\u0001\u0000\u0000\u0000\u0171\u0173\u00055\u0000\u0000"+
		"\u0172\u0174\u0003N\'\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u00056\u0000\u0000\u0176G\u0001\u0000\u0000\u0000\u0177\u017e\u0003"+
		"F#\u0000\u0178\u017e\u0003<\u001e\u0000\u0179\u017e\u0003J%\u0000\u017a"+
		"\u017e\u0003@ \u0000\u017b\u017e\u0003B!\u0000\u017c\u017e\u0003D\"\u0000"+
		"\u017d\u0177\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000\u0000\u0000"+
		"\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000"+
		"\u017eI\u0001\u0000\u0000\u0000\u017f\u0180\u0006%\uffff\uffff\u0000\u0180"+
		"\u0181\u0005\u0001\u0000\u0000\u0181\u0182\u00057\u0000\u0000\u0182\u0183"+
		"\u0003\u0010\b\u0000\u0183\u0184\u00058\u0000\u0000\u0184\u0185\u0005"+
		"3\u0000\u0000\u0185\u0186\u0003\u0002\u0001\u0000\u0186\u0187\u00054\u0000"+
		"\u0000\u0187K\u0001\u0000\u0000\u0000\u0188\u0189\u00057\u0000\u0000\u0189"+
		"\u018a\u0003n7\u0000\u018a\u018b\u00058\u0000\u0000\u018bM\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0003n7\u0000\u018d\u018e\u0005;\u0000\u0000"+
		"\u018e\u018f\u0003N\'\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190"+
		"\u0192\u0003n7\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0191\u0190\u0001"+
		"\u0000\u0000\u0000\u0192O\u0001\u0000\u0000\u0000\u0193\u0194\u0007\u0003"+
		"\u0000\u0000\u0194Q\u0001\u0000\u0000\u0000\u0195\u0196\u0003X,\u0000"+
		"\u0196\u0197\u0003P(\u0000\u0197\u0198\u0003n7\u0000\u0198\u0199\u0006"+
		")\uffff\uffff\u0000\u0199S\u0001\u0000\u0000\u0000\u019a\u01e0\u0003t"+
		":\u0000\u019b\u019c\u0006*\uffff\uffff\u0000\u019c\u019d\u0005A\u0000"+
		"\u0000\u019d\u019f\u00057\u0000\u0000\u019e\u01a0\u0003N\'\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u00058\u0000\u0000\u01a2\u01e0"+
		"\u0003V+\u0000\u01a3\u01a4\u0006*\uffff\uffff\u0000\u01a4\u01a5\u0005"+
		"A\u0000\u0000\u01a5\u01a7\u00057\u0000\u0000\u01a6\u01a8\u0003N\'\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01e0\u00058\u0000\u0000\u01aa"+
		"\u01ab\u0003J%\u0000\u01ab\u01ac\u0006*\uffff\uffff\u0000\u01ac\u01ae"+
		"\u00057\u0000\u0000\u01ad\u01af\u0003N\'\u0000\u01ae\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u00058\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0003V+\u0000\u01b3\u01e0\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0003J%\u0000\u01b5\u01b6\u0006*\uffff\uffff\u0000\u01b6\u01b8"+
		"\u00057\u0000\u0000\u01b7\u01b9\u0003N\'\u0000\u01b8\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u00058\u0000\u0000\u01bb\u01e0\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0006*\uffff\uffff\u0000\u01bd\u01be\u0003<\u001e\u0000"+
		"\u01be\u01c0\u00057\u0000\u0000\u01bf\u01c1\u0003N\'\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u00058\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0003V+\u0000\u01c5\u01e0\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0006*\uffff\uffff\u0000\u01c7\u01c8\u0003<\u001e\u0000"+
		"\u01c8\u01ca\u00057\u0000\u0000\u01c9\u01cb\u0003N\'\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u00058\u0000\u0000\u01cd\u01e0\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0006*\uffff\uffff\u0000\u01cf\u01d0\u0005"+
		"A\u0000\u0000\u01d0\u01d1\u0005:\u0000\u0000\u01d1\u01d2\u0005\'\u0000"+
		"\u0000\u01d2\u01d3\u00057\u0000\u0000\u01d3\u01d4\u0003N\'\u0000\u01d4"+
		"\u01d5\u00058\u0000\u0000\u01d5\u01d6\u0003V+\u0000\u01d6\u01e0\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0006*\uffff\uffff\u0000\u01d8\u01d9\u0005"+
		"A\u0000\u0000\u01d9\u01da\u0005:\u0000\u0000\u01da\u01db\u0005\'\u0000"+
		"\u0000\u01db\u01dc\u00057\u0000\u0000\u01dc\u01dd\u0003N\'\u0000\u01dd"+
		"\u01de\u00058\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u019a"+
		"\u0001\u0000\u0000\u0000\u01df\u019b\u0001\u0000\u0000\u0000\u01df\u01a3"+
		"\u0001\u0000\u0000\u0000\u01df\u01aa\u0001\u0000\u0000\u0000\u01df\u01b4"+
		"\u0001\u0000\u0000\u0000\u01df\u01bc\u0001\u0000\u0000\u0000\u01df\u01c6"+
		"\u0001\u0000\u0000\u0000\u01df\u01ce\u0001\u0000\u0000\u0000\u01df\u01d7"+
		"\u0001\u0000\u0000\u0000\u01e0U\u0001\u0000\u0000\u0000\u01e1\u01e2\u0006"+
		"+\uffff\uffff\u0000\u01e2\u01e4\u00057\u0000\u0000\u01e3\u01e5\u0003N"+
		"\'\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u00058\u0000\u0000"+
		"\u01e7\u01ef\u0003V+\u0000\u01e8\u01e9\u0006+\uffff\uffff\u0000\u01e9"+
		"\u01eb\u00057\u0000\u0000\u01ea\u01ec\u0003N\'\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ef\u00058\u0000\u0000\u01ee\u01e1\u0001\u0000"+
		"\u0000\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01efW\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u00057\u0000\u0000\u01f1\u01f2\u0003n7\u0000\u01f2"+
		"\u01f3\u00058\u0000\u0000\u01f3\u01f4\u0003Z-\u0000\u01f4\u021b\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u00057\u0000\u0000\u01f6\u01f7\u0003n7"+
		"\u0000\u01f7\u01f8\u00058\u0000\u0000\u01f8\u021b\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005\f\u0000\u0000\u01fa\u01fb\u00057\u0000\u0000\u01fb"+
		"\u01fc\u0003X,\u0000\u01fc\u01fd\u00058\u0000\u0000\u01fd\u01fe\u0003"+
		"Z-\u0000\u01fe\u01ff\u0006,\uffff\uffff\u0000\u01ff\u021b\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005\f\u0000\u0000\u0201\u0202\u00057\u0000"+
		"\u0000\u0202\u0203\u0003X,\u0000\u0203\u0204\u00058\u0000\u0000\u0204"+
		"\u0205\u0006,\uffff\uffff\u0000\u0205\u021b\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0005\u0013\u0000\u0000\u0207\u0208\u0003X,\u0000\u0208\u0209\u0003"+
		"Z-\u0000\u0209\u020a\u0006,\uffff\uffff\u0000\u020a\u021b\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0005\u0013\u0000\u0000\u020c\u020d\u0003X,\u0000"+
		"\u020d\u020e\u0006,\uffff\uffff\u0000\u020e\u021b\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0003T*\u0000\u0210\u0211\u0003Z-\u0000\u0211\u021b\u0001"+
		"\u0000\u0000\u0000\u0212\u021b\u0003T*\u0000\u0213\u0214\u0005A\u0000"+
		"\u0000\u0214\u021b\u0003Z-\u0000\u0215\u021b\u0005A\u0000\u0000\u0216"+
		"\u0217\u0003H$\u0000\u0217\u0218\u0003Z-\u0000\u0218\u021b\u0001\u0000"+
		"\u0000\u0000\u0219\u021b\u0003H$\u0000\u021a\u01f0\u0001\u0000\u0000\u0000"+
		"\u021a\u01f5\u0001\u0000\u0000\u0000\u021a\u01f9\u0001\u0000\u0000\u0000"+
		"\u021a\u0200\u0001\u0000\u0000\u0000\u021a\u0206\u0001\u0000\u0000\u0000"+
		"\u021a\u020b\u0001\u0000\u0000\u0000\u021a\u020f\u0001\u0000\u0000\u0000"+
		"\u021a\u0212\u0001\u0000\u0000\u0000\u021a\u0213\u0001\u0000\u0000\u0000"+
		"\u021a\u0215\u0001\u0000\u0000\u0000\u021a\u0216\u0001\u0000\u0000\u0000"+
		"\u021a\u0219\u0001\u0000\u0000\u0000\u021bY\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u00055\u0000\u0000\u021d\u021e\u0003n7\u0000\u021e\u021f\u0005"+
		"6\u0000\u0000\u021f\u0220\u0003Z-\u0000\u0220\u0230\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u00055\u0000\u0000\u0222\u0223\u0003n7\u0000\u0223"+
		"\u0224\u00056\u0000\u0000\u0224\u0230\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0005\u000f\u0000\u0000\u0226\u0227\u0006-\uffff\uffff\u0000\u0227\u0230"+
		"\u0003Z-\u0000\u0228\u0229\u0005\u000f\u0000\u0000\u0229\u0230\u0006-"+
		"\uffff\uffff\u0000\u022a\u022b\u0005\u0002\u0000\u0000\u022b\u022c\u0006"+
		"-\uffff\uffff\u0000\u022c\u0230\u0003Z-\u0000\u022d\u022e\u0005\u0002"+
		"\u0000\u0000\u022e\u0230\u0006-\uffff\uffff\u0000\u022f\u021c\u0001\u0000"+
		"\u0000\u0000\u022f\u0221\u0001\u0000\u0000\u0000\u022f\u0225\u0001\u0000"+
		"\u0000\u0000\u022f\u0228\u0001\u0000\u0000\u0000\u022f\u022a\u0001\u0000"+
		"\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230[\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0007\u0004\u0000\u0000\u0232]\u0001\u0000\u0000\u0000"+
		"\u0233\u023a\u0003X,\u0000\u0234\u0235\u0003\\.\u0000\u0235\u0236\u0003"+
		"X,\u0000\u0236\u0237\u0006/\uffff\uffff\u0000\u0237\u0239\u0001\u0000"+
		"\u0000\u0000\u0238\u0234\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b_\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023d\u0248\u0003^/\u0000\u023e\u023f\u0005\u0011\u0000\u0000\u023f"+
		"\u0240\u0003^/\u0000\u0240\u0241\u00060\uffff\uffff\u0000\u0241\u0247"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0005\u0013\u0000\u0000\u0243\u0244"+
		"\u0003^/\u0000\u0244\u0245\u00060\uffff\uffff\u0000\u0245\u0247\u0001"+
		"\u0000\u0000\u0000\u0246\u023e\u0001\u0000\u0000\u0000\u0246\u0242\u0001"+
		"\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249a\u0001\u0000"+
		"\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0003`0\u0000"+
		"\u024cc\u0001\u0000\u0000\u0000\u024d\u024e\u0007\u0005\u0000\u0000\u024e"+
		"e\u0001\u0000\u0000\u0000\u024f\u0256\u0003b1\u0000\u0250\u0251\u0003"+
		"d2\u0000\u0251\u0252\u0003b1\u0000\u0252\u0253\u00063\uffff\uffff\u0000"+
		"\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0250\u0001\u0000\u0000\u0000"+
		"\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0001\u0000\u0000\u0000\u0257g\u0001\u0000\u0000\u0000\u0258"+
		"\u0256\u0001\u0000\u0000\u0000\u0259\u0264\u0003f3\u0000\u025a\u025b\u0005"+
		"\t\u0000\u0000\u025b\u025c\u0003f3\u0000\u025c\u025d\u00064\uffff\uffff"+
		"\u0000\u025d\u0263\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u000b\u0000"+
		"\u0000\u025f\u0260\u0003f3\u0000\u0260\u0261\u00064\uffff\uffff\u0000"+
		"\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u025a\u0001\u0000\u0000\u0000"+
		"\u0262\u025e\u0001\u0000\u0000\u0000\u0263\u0266\u0001\u0000\u0000\u0000"+
		"\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000"+
		"\u0265i\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0267"+
		"\u0268\u00057\u0000\u0000\u0268\u0269\u0003n7\u0000\u0269\u026a\u0005"+
		"8\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0005\r"+
		"\u0000\u0000\u026c\u026d\u00057\u0000\u0000\u026d\u026e\u0003n7\u0000"+
		"\u026e\u026f\u00058\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270"+
		"\u0271\u00065\uffff\uffff\u0000\u0271\u027f\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u00057\u0000\u0000\u0273\u0274\u0003n7\u0000\u0274\u0275\u0005"+
		"8\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0005\u000e"+
		"\u0000\u0000\u0277\u0278\u00057\u0000\u0000\u0278\u0279\u0003n7\u0000"+
		"\u0279\u027a\u00058\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u00065\uffff\uffff\u0000\u027c\u027f\u0001\u0000\u0000\u0000\u027d"+
		"\u027f\u0003h4\u0000\u027e\u0267\u0001\u0000\u0000\u0000\u027e\u0272\u0001"+
		"\u0000\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027fk\u0001\u0000"+
		"\u0000\u0000\u0280\u0287\u0003j5\u0000\u0281\u0282\u0005\u0003\u0000\u0000"+
		"\u0282\u0283\u0003j5\u0000\u0283\u0284\u00066\uffff\uffff\u0000\u0284"+
		"\u0286\u0001\u0000\u0000\u0000\u0285\u0281\u0001\u0000\u0000\u0000\u0286"+
		"\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288m\u0001\u0000\u0000\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0003l6\u0000\u028bo\u0001\u0000"+
		"\u0000\u0000\u028c\u028d\u0003n7\u0000\u028d\u028e\u0005=\u0000\u0000"+
		"\u028e\u0296\u0001\u0000\u0000\u0000\u028f\u0290\u0003R)\u0000\u0290\u0291"+
		"\u0005=\u0000\u0000\u0291\u0296\u0001\u0000\u0000\u0000\u0292\u0296\u0003"+
		"\u001c\u000e\u0000\u0293\u0296\u0003 \u0010\u0000\u0294\u0296\u0003(\u0014"+
		"\u0000\u0295\u028c\u0001\u0000\u0000\u0000\u0295\u028f\u0001\u0000\u0000"+
		"\u0000\u0295\u0292\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000"+
		"\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296q\u0001\u0000\u0000\u0000"+
		"\u0297\u0298\u0003n7\u0000\u0298\u0299\u0005=\u0000\u0000\u0299\u02a1"+
		"\u0001\u0000\u0000\u0000\u029a\u029b\u0003R)\u0000\u029b\u029c\u0005="+
		"\u0000\u0000\u029c\u02a1\u0001\u0000\u0000\u0000\u029d\u02a1\u0003\u001c"+
		"\u000e\u0000\u029e\u02a1\u0003 \u0010\u0000\u029f\u02a1\u00030\u0018\u0000"+
		"\u02a0\u0297\u0001\u0000\u0000\u0000\u02a0\u029a\u0001\u0000\u0000\u0000"+
		"\u02a0\u029d\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000"+
		"\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1s\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a8\u00032\u0019\u0000\u02a3\u02a8\u00034\u001a\u0000\u02a4\u02a8\u0003"+
		"6\u001b\u0000\u02a5\u02a8\u00038\u001c\u0000\u02a6\u02a8\u0003:\u001d"+
		"\u0000\u02a7\u02a2\u0001\u0000\u0000\u0000\u02a7\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8u\u0001\u0000\u0000\u0000"+
		"0y{\u0082\u0087\u0089\u008d\u0094\u009d\u00af\u00bb\u00c8\u00d8\u00e1"+
		"\u00e8\u00f2\u00f4\u00f8\u011c\u0120\u0136\u013a\u0169\u0173\u017d\u0191"+
		"\u019f\u01a7\u01ae\u01b8\u01c0\u01ca\u01df\u01e4\u01eb\u01ee\u021a\u022f"+
		"\u023a\u0246\u0248\u0256\u0262\u0264\u027e\u0287\u0295\u02a0\u02a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}