// Generated from /Users/amirparsamobed/Documents/University/Term 6/Compiler Design Programming Languages/CA/CA4/Github Repository/Compiler-Course-Projects-S2024/Phase-4/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.value.primitive.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FunctionCraftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, END=2, MAIN=3, PUTS=4, PUSH=5, LEN=6, RETURN=7, IF=8, ELSE=9, ELSEIF=10, 
		METHOD=11, PATTERN=12, MATCH=13, LOOP=14, FOR=15, IN=16, DO=17, CHOP=18, 
		CHOMP=19, PLUS=20, MINUS=21, MULT=22, DIVIDE=23, EQUAL=24, NOT_EQUAL=25, 
		LESS_EQUAL_THAN=26, GREATER_EQUAL_THAN=27, GREATER_THAN=28, LESS_THAN=29, 
		AND=30, OR=31, NOT=32, INCREMENT=33, DECREMENT=34, PATTERN_MATCHING_SEPARATOR=35, 
		SEPARATOR=36, APPEND=37, TRUE=38, FALSE=39, BREAK=40, NEXT=41, ARROW=42, 
		PLUS_ASSIGN=43, MINUS_ASSIGN=44, MULT_ASSIGN=45, DIVIDE_ASSIGN=46, MOD_ASSIGN=47, 
		ASSIGN=48, LPAR=49, RPAR=50, LBRACK=51, RBRACK=52, LBRACE=53, RBRACE=54, 
		COMMA=55, DOT=56, DOUBLEDOT=57, COLON=58, SEMICOLLON=59, INT_VALUE=60, 
		FLOAT_VALUE=61, IDENTIFIER=62, STRING_VALUE=63, COMMENT=64, WS=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "END", "MAIN", "PUTS", "PUSH", "LEN", "RETURN", "IF", "ELSE", 
			"ELSEIF", "METHOD", "PATTERN", "MATCH", "LOOP", "FOR", "IN", "DO", "CHOP", 
			"CHOMP", "PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "NOT_EQUAL", "LESS_EQUAL_THAN", 
			"GREATER_EQUAL_THAN", "GREATER_THAN", "LESS_THAN", "AND", "OR", "NOT", 
			"INCREMENT", "DECREMENT", "PATTERN_MATCHING_SEPARATOR", "SEPARATOR", 
			"APPEND", "TRUE", "FALSE", "BREAK", "NEXT", "ARROW", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIVIDE_ASSIGN", "MOD_ASSIGN", "ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "DOUBLEDOT", 
			"COLON", "SEMICOLLON", "INT_VALUE", "FLOAT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'end'", "'main'", "'puts'", "'push'", "'len'", "'return'", 
			"'if'", "'else'", "'elseif'", "'method'", "'pattern'", "'match'", "'loop'", 
			"'for'", "'in'", "'do'", "'chop'", "'chomp'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'&&'", "'||'", "'!'", 
			"'++'", "'--'", "'    |'", "'|'", "'<<'", "'true'", "'false'", "'break'", 
			"'next'", "'->'", "'+='", "'-='", "'*='", "'/='", "'%='", "'='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "'..'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "END", "MAIN", "PUTS", "PUSH", "LEN", "RETURN", "IF", "ELSE", 
			"ELSEIF", "METHOD", "PATTERN", "MATCH", "LOOP", "FOR", "IN", "DO", "CHOP", 
			"CHOMP", "PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "NOT_EQUAL", "LESS_EQUAL_THAN", 
			"GREATER_EQUAL_THAN", "GREATER_THAN", "LESS_THAN", "AND", "OR", "NOT", 
			"INCREMENT", "DECREMENT", "PATTERN_MATCHING_SEPARATOR", "SEPARATOR", 
			"APPEND", "TRUE", "FALSE", "BREAK", "NEXT", "ARROW", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIVIDE_ASSIGN", "MOD_ASSIGN", "ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "DOUBLEDOT", 
			"COLON", "SEMICOLLON", "INT_VALUE", "FLOAT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
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


	public FunctionCraftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000A\u019b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u0001"+
		"4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001;\u0005;\u0159\b;\n;\f;\u015c"+
		"\t;\u0003;\u015e\b;\u0001<\u0005<\u0161\b<\n<\f<\u0164\t<\u0001<\u0001"+
		"<\u0004<\u0168\b<\u000b<\f<\u0169\u0001=\u0001=\u0005=\u016e\b=\n=\f="+
		"\u0171\t=\u0001>\u0001>\u0005>\u0175\b>\n>\f>\u0178\t>\u0001>\u0001>\u0001"+
		"?\u0001?\u0005?\u017e\b?\n?\f?\u0181\t?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0005?\u018b\b?\n?\f?\u018e\t?\u0001?\u0001?\u0001"+
		"?\u0001?\u0003?\u0194\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"\u018c\u0000A\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f"+
		"@\u0081A\u0001\u0000\u0007\u0001\u000019\u0001\u000009\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0001\u0000\"\"\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\r\r  \u01a3\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001"+
		"\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001"+
		"\u0000\u0000\u0000\u0001\u0083\u0001\u0000\u0000\u0000\u0003\u0087\u0001"+
		"\u0000\u0000\u0000\u0005\u008b\u0001\u0000\u0000\u0000\u0007\u0090\u0001"+
		"\u0000\u0000\u0000\t\u0095\u0001\u0000\u0000\u0000\u000b\u009a\u0001\u0000"+
		"\u0000\u0000\r\u009e\u0001\u0000\u0000\u0000\u000f\u00a5\u0001\u0000\u0000"+
		"\u0000\u0011\u00a8\u0001\u0000\u0000\u0000\u0013\u00ad\u0001\u0000\u0000"+
		"\u0000\u0015\u00b4\u0001\u0000\u0000\u0000\u0017\u00bb\u0001\u0000\u0000"+
		"\u0000\u0019\u00c3\u0001\u0000\u0000\u0000\u001b\u00c9\u0001\u0000\u0000"+
		"\u0000\u001d\u00ce\u0001\u0000\u0000\u0000\u001f\u00d2\u0001\u0000\u0000"+
		"\u0000!\u00d5\u0001\u0000\u0000\u0000#\u00d8\u0001\u0000\u0000\u0000%"+
		"\u00dd\u0001\u0000\u0000\u0000\'\u00e3\u0001\u0000\u0000\u0000)\u00e5"+
		"\u0001\u0000\u0000\u0000+\u00e7\u0001\u0000\u0000\u0000-\u00e9\u0001\u0000"+
		"\u0000\u0000/\u00eb\u0001\u0000\u0000\u00001\u00ee\u0001\u0000\u0000\u0000"+
		"3\u00f1\u0001\u0000\u0000\u00005\u00f4\u0001\u0000\u0000\u00007\u00f7"+
		"\u0001\u0000\u0000\u00009\u00f9\u0001\u0000\u0000\u0000;\u00fb\u0001\u0000"+
		"\u0000\u0000=\u00fe\u0001\u0000\u0000\u0000?\u0101\u0001\u0000\u0000\u0000"+
		"A\u0103\u0001\u0000\u0000\u0000C\u0106\u0001\u0000\u0000\u0000E\u0109"+
		"\u0001\u0000\u0000\u0000G\u010f\u0001\u0000\u0000\u0000I\u0111\u0001\u0000"+
		"\u0000\u0000K\u0114\u0001\u0000\u0000\u0000M\u0119\u0001\u0000\u0000\u0000"+
		"O\u011f\u0001\u0000\u0000\u0000Q\u0125\u0001\u0000\u0000\u0000S\u012a"+
		"\u0001\u0000\u0000\u0000U\u012d\u0001\u0000\u0000\u0000W\u0130\u0001\u0000"+
		"\u0000\u0000Y\u0133\u0001\u0000\u0000\u0000[\u0136\u0001\u0000\u0000\u0000"+
		"]\u0139\u0001\u0000\u0000\u0000_\u013c\u0001\u0000\u0000\u0000a\u013e"+
		"\u0001\u0000\u0000\u0000c\u0140\u0001\u0000\u0000\u0000e\u0142\u0001\u0000"+
		"\u0000\u0000g\u0144\u0001\u0000\u0000\u0000i\u0146\u0001\u0000\u0000\u0000"+
		"k\u0148\u0001\u0000\u0000\u0000m\u014a\u0001\u0000\u0000\u0000o\u014c"+
		"\u0001\u0000\u0000\u0000q\u014e\u0001\u0000\u0000\u0000s\u0151\u0001\u0000"+
		"\u0000\u0000u\u0153\u0001\u0000\u0000\u0000w\u015d\u0001\u0000\u0000\u0000"+
		"y\u0162\u0001\u0000\u0000\u0000{\u016b\u0001\u0000\u0000\u0000}\u0172"+
		"\u0001\u0000\u0000\u0000\u007f\u0193\u0001\u0000\u0000\u0000\u0081\u0197"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005d\u0000\u0000\u0084\u0085\u0005"+
		"e\u0000\u0000\u0085\u0086\u0005f\u0000\u0000\u0086\u0002\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005n\u0000\u0000\u0089"+
		"\u008a\u0005d\u0000\u0000\u008a\u0004\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005m\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008e\u0005i"+
		"\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f\u0006\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005p\u0000\u0000\u0091\u0092\u0005u\u0000\u0000\u0092"+
		"\u0093\u0005t\u0000\u0000\u0093\u0094\u0005s\u0000\u0000\u0094\b\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005p\u0000\u0000\u0096\u0097\u0005u\u0000"+
		"\u0000\u0097\u0098\u0005s\u0000\u0000\u0098\u0099\u0005h\u0000\u0000\u0099"+
		"\n\u0001\u0000\u0000\u0000\u009a\u009b\u0005l\u0000\u0000\u009b\u009c"+
		"\u0005e\u0000\u0000\u009c\u009d\u0005n\u0000\u0000\u009d\f\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000"+
		"\u00a0\u00a1\u0005t\u0000\u0000\u00a1\u00a2\u0005u\u0000\u0000\u00a2\u00a3"+
		"\u0005r\u0000\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4\u000e\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6\u00a7\u0005f\u0000\u0000"+
		"\u00a7\u0010\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a9"+
		"\u00aa\u0005l\u0000\u0000\u00aa\u00ab\u0005s\u0000\u0000\u00ab\u00ac\u0005"+
		"e\u0000\u0000\u00ac\u0012\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005e\u0000"+
		"\u0000\u00ae\u00af\u0005l\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000\u00b0"+
		"\u00b1\u0005e\u0000\u0000\u00b1\u00b2\u0005i\u0000\u0000\u00b2\u00b3\u0005"+
		"f\u0000\u0000\u00b3\u0014\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005m\u0000"+
		"\u0000\u00b5\u00b6\u0005e\u0000\u0000\u00b6\u00b7\u0005t\u0000\u0000\u00b7"+
		"\u00b8\u0005h\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9\u00ba\u0005"+
		"d\u0000\u0000\u00ba\u0016\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005p\u0000"+
		"\u0000\u00bc\u00bd\u0005a\u0000\u0000\u00bd\u00be\u0005t\u0000\u0000\u00be"+
		"\u00bf\u0005t\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000\u00c0\u00c1\u0005"+
		"r\u0000\u0000\u00c1\u00c2\u0005n\u0000\u0000\u00c2\u0018\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005m\u0000\u0000\u00c4\u00c5\u0005a\u0000\u0000\u00c5"+
		"\u00c6\u0005t\u0000\u0000\u00c6\u00c7\u0005c\u0000\u0000\u00c7\u00c8\u0005"+
		"h\u0000\u0000\u00c8\u001a\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005l\u0000"+
		"\u0000\u00ca\u00cb\u0005o\u0000\u0000\u00cb\u00cc\u0005o\u0000\u0000\u00cc"+
		"\u00cd\u0005p\u0000\u0000\u00cd\u001c\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005f\u0000\u0000\u00cf\u00d0\u0005o\u0000\u0000\u00d0\u00d1\u0005r"+
		"\u0000\u0000\u00d1\u001e\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005i\u0000"+
		"\u0000\u00d3\u00d4\u0005n\u0000\u0000\u00d4 \u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005d\u0000\u0000\u00d6\u00d7\u0005o\u0000\u0000\u00d7\"\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005c\u0000\u0000\u00d9\u00da\u0005h\u0000"+
		"\u0000\u00da\u00db\u0005o\u0000\u0000\u00db\u00dc\u0005p\u0000\u0000\u00dc"+
		"$\u0001\u0000\u0000\u0000\u00dd\u00de\u0005c\u0000\u0000\u00de\u00df\u0005"+
		"h\u0000\u0000\u00df\u00e0\u0005o\u0000\u0000\u00e0\u00e1\u0005m\u0000"+
		"\u0000\u00e1\u00e2\u0005p\u0000\u0000\u00e2&\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0005+\u0000\u0000\u00e4(\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"-\u0000\u0000\u00e6*\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005*\u0000"+
		"\u0000\u00e8,\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005/\u0000\u0000\u00ea"+
		".\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005=\u0000\u0000\u00ec\u00ed\u0005"+
		"=\u0000\u0000\u00ed0\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005!\u0000"+
		"\u0000\u00ef\u00f0\u0005=\u0000\u0000\u00f02\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005<\u0000\u0000\u00f2\u00f3\u0005=\u0000\u0000\u00f34\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005>\u0000\u0000\u00f5\u00f6\u0005=\u0000"+
		"\u0000\u00f66\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005>\u0000\u0000\u00f8"+
		"8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005<\u0000\u0000\u00fa:\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005&\u0000\u0000\u00fc\u00fd\u0005&\u0000"+
		"\u0000\u00fd<\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005|\u0000\u0000\u00ff"+
		"\u0100\u0005|\u0000\u0000\u0100>\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		"!\u0000\u0000\u0102@\u0001\u0000\u0000\u0000\u0103\u0104\u0005+\u0000"+
		"\u0000\u0104\u0105\u0005+\u0000\u0000\u0105B\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005-\u0000\u0000\u0107\u0108\u0005-\u0000\u0000\u0108D\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005 \u0000\u0000\u010a\u010b\u0005 \u0000"+
		"\u0000\u010b\u010c\u0005 \u0000\u0000\u010c\u010d\u0005 \u0000\u0000\u010d"+
		"\u010e\u0005|\u0000\u0000\u010eF\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"|\u0000\u0000\u0110H\u0001\u0000\u0000\u0000\u0111\u0112\u0005<\u0000"+
		"\u0000\u0112\u0113\u0005<\u0000\u0000\u0113J\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005t\u0000\u0000\u0115\u0116\u0005r\u0000\u0000\u0116\u0117\u0005"+
		"u\u0000\u0000\u0117\u0118\u0005e\u0000\u0000\u0118L\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005f\u0000\u0000\u011a\u011b\u0005a\u0000\u0000\u011b"+
		"\u011c\u0005l\u0000\u0000\u011c\u011d\u0005s\u0000\u0000\u011d\u011e\u0005"+
		"e\u0000\u0000\u011eN\u0001\u0000\u0000\u0000\u011f\u0120\u0005b\u0000"+
		"\u0000\u0120\u0121\u0005r\u0000\u0000\u0121\u0122\u0005e\u0000\u0000\u0122"+
		"\u0123\u0005a\u0000\u0000\u0123\u0124\u0005k\u0000\u0000\u0124P\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0005n\u0000\u0000\u0126\u0127\u0005e\u0000"+
		"\u0000\u0127\u0128\u0005x\u0000\u0000\u0128\u0129\u0005t\u0000\u0000\u0129"+
		"R\u0001\u0000\u0000\u0000\u012a\u012b\u0005-\u0000\u0000\u012b\u012c\u0005"+
		">\u0000\u0000\u012cT\u0001\u0000\u0000\u0000\u012d\u012e\u0005+\u0000"+
		"\u0000\u012e\u012f\u0005=\u0000\u0000\u012fV\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005-\u0000\u0000\u0131\u0132\u0005=\u0000\u0000\u0132X\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005*\u0000\u0000\u0134\u0135\u0005=\u0000"+
		"\u0000\u0135Z\u0001\u0000\u0000\u0000\u0136\u0137\u0005/\u0000\u0000\u0137"+
		"\u0138\u0005=\u0000\u0000\u0138\\\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005%\u0000\u0000\u013a\u013b\u0005=\u0000\u0000\u013b^\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005=\u0000\u0000\u013d`\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005(\u0000\u0000\u013fb\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005)\u0000\u0000\u0141d\u0001\u0000\u0000\u0000\u0142\u0143\u0005["+
		"\u0000\u0000\u0143f\u0001\u0000\u0000\u0000\u0144\u0145\u0005]\u0000\u0000"+
		"\u0145h\u0001\u0000\u0000\u0000\u0146\u0147\u0005{\u0000\u0000\u0147j"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0005}\u0000\u0000\u0149l\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0005,\u0000\u0000\u014bn\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005.\u0000\u0000\u014dp\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005.\u0000\u0000\u014f\u0150\u0005.\u0000\u0000\u0150r\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005:\u0000\u0000\u0152t\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005;\u0000\u0000\u0154v\u0001\u0000\u0000\u0000\u0155\u015e"+
		"\u00050\u0000\u0000\u0156\u015a\u0007\u0000\u0000\u0000\u0157\u0159\u0007"+
		"\u0001\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001"+
		"\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001"+
		"\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001"+
		"\u0000\u0000\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d\u0156\u0001"+
		"\u0000\u0000\u0000\u015ex\u0001\u0000\u0000\u0000\u015f\u0161\u0007\u0001"+
		"\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0167\u0005.\u0000\u0000\u0166\u0168\u0007\u0001\u0000"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016az\u0001\u0000\u0000\u0000\u016b\u016f\u0007\u0002\u0000\u0000"+
		"\u016c\u016e\u0007\u0003\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170|\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0172\u0176\u0005\"\u0000\u0000\u0173\u0175"+
		"\b\u0004\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001"+
		"\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\"\u0000\u0000\u017a~\u0001\u0000"+
		"\u0000\u0000\u017b\u017f\u0005#\u0000\u0000\u017c\u017e\b\u0005\u0000"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0194\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005=\u0000\u0000\u0183\u0184\u0005b\u0000\u0000\u0184"+
		"\u0185\u0005e\u0000\u0000\u0185\u0186\u0005g\u0000\u0000\u0186\u0187\u0005"+
		"i\u0000\u0000\u0187\u0188\u0005n\u0000\u0000\u0188\u018c\u0001\u0000\u0000"+
		"\u0000\u0189\u018b\t\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000"+
		"\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0005=\u0000\u0000\u0190"+
		"\u0191\u0005e\u0000\u0000\u0191\u0192\u0005n\u0000\u0000\u0192\u0194\u0005"+
		"d\u0000\u0000\u0193\u017b\u0001\u0000\u0000\u0000\u0193\u0182\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0006?\u0000"+
		"\u0000\u0196\u0080\u0001\u0000\u0000\u0000\u0197\u0198\u0007\u0006\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0006@\u0000\u0000"+
		"\u019a\u0082\u0001\u0000\u0000\u0000\n\u0000\u015a\u015d\u0162\u0169\u016f"+
		"\u0176\u017f\u018c\u0193\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}