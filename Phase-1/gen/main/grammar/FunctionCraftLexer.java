// Generated from /Users/amirparsamobed/Documents/University/Term 6/Compiler Design Programming Languages/CA/CA1/GitHub Repository/Compiler-Course-Projects-S2024/Phase-1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "END", "RETURN", "TRUE", "FALSE", "METHOD", "INT", "FLOAT", "STR", 
			"BOOLEAN", "LIST", "FUNCTION_PTR", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"DECREMENT", "INCREMENT", "CONCAT", "GEQ", "LEQ", "GTR", "LES", "EQL", 
			"NEQ", "AND", "OR", "NOT", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "IF", "ELSE", "ELSEIF", "PUTS", "PUSH", "LEN", 
			"MAIN", "CHOP", "CHOMP", "LOOP_DO", "FOR", "IN", "BREAK", "BREAK_IF", 
			"NEXT", "NEXT_IF", "PATTERN", "TAB", "VERTICAL_BAR", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "LPAR", "RPAR", "DOT", "COMMA", "COLON", "SEMICOLON", 
			"ARROW", "ID", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS", "NEW_LINE", 
			"INT_VAL", "STR_VAL", "CHAR_VAL", "FLOAT_VAL"
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
		"\u0004\u0000J\u01df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001("+
		"\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001"+
		">\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0005A\u0190\bA\nA"+
		"\fA\u0193\tA\u0001B\u0001B\u0005B\u0197\bB\nB\fB\u019a\tB\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u01a6"+
		"\bC\nC\fC\u01a9\tC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"D\u0004D\u01b3\bD\u000bD\fD\u01b4\u0001D\u0001D\u0001E\u0001E\u0001F\u0001"+
		"F\u0005F\u01bd\bF\nF\fF\u01c0\tF\u0001G\u0001G\u0004G\u01c4\bG\u000bG"+
		"\fG\u01c5\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0004I\u01d1\bI\u000bI\fI\u01d2\u0001I\u0001I\u0001I\u0001I\u0005I\u01d9"+
		"\bI\nI\fI\u01dc\tI\u0003I\u01de\bI\u0001\u01a7\u0000J\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/"+
		"_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089"+
		"E\u008bF\u008dG\u008fH\u0091I\u0093J\u0001\u0000\b\u0001\u0000\t\t\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r"+
		"  \u0001\u000019\u0001\u000009\u0002\u000009Az\u01e7\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m"+
		"\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000"+
		"\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000"+
		"\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{"+
		"\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001"+
		"\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001"+
		"\u0000\u0000\u0000\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001"+
		"\u0000\u0000\u0000\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001"+
		"\u0000\u0000\u0000\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001"+
		"\u0000\u0000\u0000\u0001\u0095\u0001\u0000\u0000\u0000\u0003\u0099\u0001"+
		"\u0000\u0000\u0000\u0005\u009d\u0001\u0000\u0000\u0000\u0007\u00a4\u0001"+
		"\u0000\u0000\u0000\t\u00a9\u0001\u0000\u0000\u0000\u000b\u00af\u0001\u0000"+
		"\u0000\u0000\r\u00b6\u0001\u0000\u0000\u0000\u000f\u00ba\u0001\u0000\u0000"+
		"\u0000\u0011\u00c0\u0001\u0000\u0000\u0000\u0013\u00c7\u0001\u0000\u0000"+
		"\u0000\u0015\u00cc\u0001\u0000\u0000\u0000\u0017\u00d1\u0001\u0000\u0000"+
		"\u0000\u0019\u00d6\u0001\u0000\u0000\u0000\u001b\u00d8\u0001\u0000\u0000"+
		"\u0000\u001d\u00da\u0001\u0000\u0000\u0000\u001f\u00dc\u0001\u0000\u0000"+
		"\u0000!\u00de\u0001\u0000\u0000\u0000#\u00e0\u0001\u0000\u0000\u0000%"+
		"\u00e3\u0001\u0000\u0000\u0000\'\u00e6\u0001\u0000\u0000\u0000)\u00e9"+
		"\u0001\u0000\u0000\u0000+\u00ec\u0001\u0000\u0000\u0000-\u00ef\u0001\u0000"+
		"\u0000\u0000/\u00f1\u0001\u0000\u0000\u00001\u00f3\u0001\u0000\u0000\u0000"+
		"3\u00f6\u0001\u0000\u0000\u00005\u00f9\u0001\u0000\u0000\u00007\u00fc"+
		"\u0001\u0000\u0000\u00009\u00ff\u0001\u0000\u0000\u0000;\u0101\u0001\u0000"+
		"\u0000\u0000=\u0103\u0001\u0000\u0000\u0000?\u0106\u0001\u0000\u0000\u0000"+
		"A\u0109\u0001\u0000\u0000\u0000C\u010c\u0001\u0000\u0000\u0000E\u010f"+
		"\u0001\u0000\u0000\u0000G\u0112\u0001\u0000\u0000\u0000I\u0115\u0001\u0000"+
		"\u0000\u0000K\u011a\u0001\u0000\u0000\u0000M\u0121\u0001\u0000\u0000\u0000"+
		"O\u0126\u0001\u0000\u0000\u0000Q\u012b\u0001\u0000\u0000\u0000S\u012f"+
		"\u0001\u0000\u0000\u0000U\u0134\u0001\u0000\u0000\u0000W\u0139\u0001\u0000"+
		"\u0000\u0000Y\u013f\u0001\u0000\u0000\u0000[\u0147\u0001\u0000\u0000\u0000"+
		"]\u014b\u0001\u0000\u0000\u0000_\u014e\u0001\u0000\u0000\u0000a\u0154"+
		"\u0001\u0000\u0000\u0000c\u015d\u0001\u0000\u0000\u0000e\u0162\u0001\u0000"+
		"\u0000\u0000g\u016a\u0001\u0000\u0000\u0000i\u0172\u0001\u0000\u0000\u0000"+
		"k\u0174\u0001\u0000\u0000\u0000m\u0176\u0001\u0000\u0000\u0000o\u0178"+
		"\u0001\u0000\u0000\u0000q\u017a\u0001\u0000\u0000\u0000s\u017c\u0001\u0000"+
		"\u0000\u0000u\u017e\u0001\u0000\u0000\u0000w\u0180\u0001\u0000\u0000\u0000"+
		"y\u0182\u0001\u0000\u0000\u0000{\u0184\u0001\u0000\u0000\u0000}\u0186"+
		"\u0001\u0000\u0000\u0000\u007f\u0188\u0001\u0000\u0000\u0000\u0081\u018a"+
		"\u0001\u0000\u0000\u0000\u0083\u018d\u0001\u0000\u0000\u0000\u0085\u0194"+
		"\u0001\u0000\u0000\u0000\u0087\u019d\u0001\u0000\u0000\u0000\u0089\u01b2"+
		"\u0001\u0000\u0000\u0000\u008b\u01b8\u0001\u0000\u0000\u0000\u008d\u01ba"+
		"\u0001\u0000\u0000\u0000\u008f\u01c1\u0001\u0000\u0000\u0000\u0091\u01c9"+
		"\u0001\u0000\u0000\u0000\u0093\u01dd\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005d\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005f"+
		"\u0000\u0000\u0098\u0002\u0001\u0000\u0000\u0000\u0099\u009a\u0005e\u0000"+
		"\u0000\u009a\u009b\u0005n\u0000\u0000\u009b\u009c\u0005d\u0000\u0000\u009c"+
		"\u0004\u0001\u0000\u0000\u0000\u009d\u009e\u0005r\u0000\u0000\u009e\u009f"+
		"\u0005e\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a0\u00a1\u0005u"+
		"\u0000\u0000\u00a1\u00a2\u0005r\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000"+
		"\u00a3\u0006\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005t\u0000\u0000\u00a5"+
		"\u00a6\u0005r\u0000\u0000\u00a6\u00a7\u0005u\u0000\u0000\u00a7\u00a8\u0005"+
		"e\u0000\u0000\u00a8\b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005f\u0000"+
		"\u0000\u00aa\u00ab\u0005a\u0000\u0000\u00ab\u00ac\u0005l\u0000\u0000\u00ac"+
		"\u00ad\u0005s\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae\n\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005m\u0000\u0000\u00b0\u00b1\u0005e\u0000"+
		"\u0000\u00b1\u00b2\u0005t\u0000\u0000\u00b2\u00b3\u0005h\u0000\u0000\u00b3"+
		"\u00b4\u0005o\u0000\u0000\u00b4\u00b5\u0005d\u0000\u0000\u00b5\f\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005i\u0000\u0000\u00b7\u00b8\u0005n\u0000"+
		"\u0000\u00b8\u00b9\u0005t\u0000\u0000\u00b9\u000e\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005f\u0000\u0000\u00bb\u00bc\u0005l\u0000\u0000\u00bc\u00bd"+
		"\u0005o\u0000\u0000\u00bd\u00be\u0005a\u0000\u0000\u00be\u00bf\u0005t"+
		"\u0000\u0000\u00bf\u0010\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005s\u0000"+
		"\u0000\u00c1\u00c2\u0005t\u0000\u0000\u00c2\u00c3\u0005r\u0000\u0000\u00c3"+
		"\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005n\u0000\u0000\u00c5\u00c6\u0005"+
		"g\u0000\u0000\u00c6\u0012\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005b\u0000"+
		"\u0000\u00c8\u00c9\u0005o\u0000\u0000\u00c9\u00ca\u0005o\u0000\u0000\u00ca"+
		"\u00cb\u0005l\u0000\u0000\u00cb\u0014\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005l\u0000\u0000\u00cd\u00ce\u0005i\u0000\u0000\u00ce\u00cf\u0005s"+
		"\u0000\u0000\u00cf\u00d0\u0005t\u0000\u0000\u00d0\u0016\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005f\u0000\u0000\u00d2\u00d3\u0005p\u0000\u0000\u00d3"+
		"\u00d4\u0005t\u0000\u0000\u00d4\u00d5\u0005r\u0000\u0000\u00d5\u0018\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005+\u0000\u0000\u00d7\u001a\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005-\u0000\u0000\u00d9\u001c\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005*\u0000\u0000\u00db\u001e\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0005/\u0000\u0000\u00dd \u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005%\u0000\u0000\u00df\"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"-\u0000\u0000\u00e1\u00e2\u0005-\u0000\u0000\u00e2$\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005+\u0000\u0000\u00e4\u00e5\u0005+\u0000\u0000\u00e5"+
		"&\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005<\u0000\u0000\u00e7\u00e8\u0005"+
		"<\u0000\u0000\u00e8(\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005>\u0000"+
		"\u0000\u00ea\u00eb\u0005=\u0000\u0000\u00eb*\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005<\u0000\u0000\u00ed\u00ee\u0005=\u0000\u0000\u00ee,\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005>\u0000\u0000\u00f0.\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005<\u0000\u0000\u00f20\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005=\u0000\u0000\u00f4\u00f5\u0005=\u0000\u0000\u00f52\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005!\u0000\u0000\u00f7\u00f8\u0005=\u0000"+
		"\u0000\u00f84\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005&\u0000\u0000\u00fa"+
		"\u00fb\u0005&\u0000\u0000\u00fb6\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		"|\u0000\u0000\u00fd\u00fe\u0005|\u0000\u0000\u00fe8\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005!\u0000\u0000\u0100:\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005=\u0000\u0000\u0102<\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"+\u0000\u0000\u0104\u0105\u0005=\u0000\u0000\u0105>\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005-\u0000\u0000\u0107\u0108\u0005=\u0000\u0000\u0108"+
		"@\u0001\u0000\u0000\u0000\u0109\u010a\u0005*\u0000\u0000\u010a\u010b\u0005"+
		"=\u0000\u0000\u010bB\u0001\u0000\u0000\u0000\u010c\u010d\u0005/\u0000"+
		"\u0000\u010d\u010e\u0005=\u0000\u0000\u010eD\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005%\u0000\u0000\u0110\u0111\u0005=\u0000\u0000\u0111F\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005i\u0000\u0000\u0113\u0114\u0005f\u0000"+
		"\u0000\u0114H\u0001\u0000\u0000\u0000\u0115\u0116\u0005e\u0000\u0000\u0116"+
		"\u0117\u0005l\u0000\u0000\u0117\u0118\u0005s\u0000\u0000\u0118\u0119\u0005"+
		"e\u0000\u0000\u0119J\u0001\u0000\u0000\u0000\u011a\u011b\u0005e\u0000"+
		"\u0000\u011b\u011c\u0005l\u0000\u0000\u011c\u011d\u0005s\u0000\u0000\u011d"+
		"\u011e\u0005e\u0000\u0000\u011e\u011f\u0005i\u0000\u0000\u011f\u0120\u0005"+
		"f\u0000\u0000\u0120L\u0001\u0000\u0000\u0000\u0121\u0122\u0005p\u0000"+
		"\u0000\u0122\u0123\u0005u\u0000\u0000\u0123\u0124\u0005t\u0000\u0000\u0124"+
		"\u0125\u0005s\u0000\u0000\u0125N\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"p\u0000\u0000\u0127\u0128\u0005u\u0000\u0000\u0128\u0129\u0005s\u0000"+
		"\u0000\u0129\u012a\u0005h\u0000\u0000\u012aP\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005L\u0000\u0000\u012c\u012d\u0005e\u0000\u0000\u012d\u012e\u0005"+
		"n\u0000\u0000\u012eR\u0001\u0000\u0000\u0000\u012f\u0130\u0005m\u0000"+
		"\u0000\u0130\u0131\u0005a\u0000\u0000\u0131\u0132\u0005i\u0000\u0000\u0132"+
		"\u0133\u0005n\u0000\u0000\u0133T\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"c\u0000\u0000\u0135\u0136\u0005h\u0000\u0000\u0136\u0137\u0005o\u0000"+
		"\u0000\u0137\u0138\u0005p\u0000\u0000\u0138V\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0005c\u0000\u0000\u013a\u013b\u0005h\u0000\u0000\u013b\u013c\u0005"+
		"o\u0000\u0000\u013c\u013d\u0005m\u0000\u0000\u013d\u013e\u0005p\u0000"+
		"\u0000\u013eX\u0001\u0000\u0000\u0000\u013f\u0140\u0005l\u0000\u0000\u0140"+
		"\u0141\u0005o\u0000\u0000\u0141\u0142\u0005o\u0000\u0000\u0142\u0143\u0005"+
		"p\u0000\u0000\u0143\u0144\u0005 \u0000\u0000\u0144\u0145\u0005d\u0000"+
		"\u0000\u0145\u0146\u0005o\u0000\u0000\u0146Z\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005f\u0000\u0000\u0148\u0149\u0005o\u0000\u0000\u0149\u014a\u0005"+
		"r\u0000\u0000\u014a\\\u0001\u0000\u0000\u0000\u014b\u014c\u0005i\u0000"+
		"\u0000\u014c\u014d\u0005n\u0000\u0000\u014d^\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005b\u0000\u0000\u014f\u0150\u0005r\u0000\u0000\u0150\u0151\u0005"+
		"e\u0000\u0000\u0151\u0152\u0005a\u0000\u0000\u0152\u0153\u0005k\u0000"+
		"\u0000\u0153`\u0001\u0000\u0000\u0000\u0154\u0155\u0005b\u0000\u0000\u0155"+
		"\u0156\u0005r\u0000\u0000\u0156\u0157\u0005e\u0000\u0000\u0157\u0158\u0005"+
		"a\u0000\u0000\u0158\u0159\u0005k\u0000\u0000\u0159\u015a\u0005 \u0000"+
		"\u0000\u015a\u015b\u0005i\u0000\u0000\u015b\u015c\u0005f\u0000\u0000\u015c"+
		"b\u0001\u0000\u0000\u0000\u015d\u015e\u0005n\u0000\u0000\u015e\u015f\u0005"+
		"e\u0000\u0000\u015f\u0160\u0005x\u0000\u0000\u0160\u0161\u0005t\u0000"+
		"\u0000\u0161d\u0001\u0000\u0000\u0000\u0162\u0163\u0005n\u0000\u0000\u0163"+
		"\u0164\u0005e\u0000\u0000\u0164\u0165\u0005x\u0000\u0000\u0165\u0166\u0005"+
		"t\u0000\u0000\u0166\u0167\u0005 \u0000\u0000\u0167\u0168\u0005i\u0000"+
		"\u0000\u0168\u0169\u0005f\u0000\u0000\u0169f\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005p\u0000\u0000\u016b\u016c\u0005a\u0000\u0000\u016c\u016d\u0005"+
		"t\u0000\u0000\u016d\u016e\u0005t\u0000\u0000\u016e\u016f\u0005e\u0000"+
		"\u0000\u016f\u0170\u0005r\u0000\u0000\u0170\u0171\u0005n\u0000\u0000\u0171"+
		"h\u0001\u0000\u0000\u0000\u0172\u0173\u0007\u0000\u0000\u0000\u0173j\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005|\u0000\u0000\u0175l\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0005{\u0000\u0000\u0177n\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0005}\u0000\u0000\u0179p\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"[\u0000\u0000\u017br\u0001\u0000\u0000\u0000\u017c\u017d\u0005]\u0000"+
		"\u0000\u017dt\u0001\u0000\u0000\u0000\u017e\u017f\u0005(\u0000\u0000\u017f"+
		"v\u0001\u0000\u0000\u0000\u0180\u0181\u0005)\u0000\u0000\u0181x\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005.\u0000\u0000\u0183z\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0005,\u0000\u0000\u0185|\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0005:\u0000\u0000\u0187~\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		";\u0000\u0000\u0189\u0080\u0001\u0000\u0000\u0000\u018a\u018b\u0005-\u0000"+
		"\u0000\u018b\u018c\u0005>\u0000\u0000\u018c\u0082\u0001\u0000\u0000\u0000"+
		"\u018d\u0191\u0007\u0001\u0000\u0000\u018e\u0190\u0007\u0002\u0000\u0000"+
		"\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u0084\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0194\u0198\u0005#\u0000\u0000\u0195\u0197\b\u0003\u0000\u0000\u0196"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u019b\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0006B\u0000\u0000\u019c\u0086\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0005=\u0000\u0000\u019e\u019f\u0005b\u0000\u0000\u019f\u01a0\u0005e"+
		"\u0000\u0000\u01a0\u01a1\u0005g\u0000\u0000\u01a1\u01a2\u0005i\u0000\u0000"+
		"\u01a2\u01a3\u0005n\u0000\u0000\u01a3\u01a7\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a6\t\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005=\u0000\u0000\u01ab\u01ac\u0005"+
		"e\u0000\u0000\u01ac\u01ad\u0005n\u0000\u0000\u01ad\u01ae\u0005d\u0000"+
		"\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0006C\u0000\u0000"+
		"\u01b0\u0088\u0001\u0000\u0000\u0000\u01b1\u01b3\u0007\u0004\u0000\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0006D\u0000\u0000\u01b7"+
		"\u008a\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\n\u0000\u0000\u01b9\u008c"+
		"\u0001\u0000\u0000\u0000\u01ba\u01be\u0007\u0005\u0000\u0000\u01bb\u01bd"+
		"\u0007\u0006\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01c0"+
		"\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf\u008e\u0001\u0000\u0000\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005\"\u0000\u0000\u01c2\u01c4\u0007"+
		"\u0002\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"\"\u0000\u0000\u01c8\u0090\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\'"+
		"\u0000\u0000\u01ca\u01cb\u0007\u0007\u0000\u0000\u01cb\u01cc\u0005\'\u0000"+
		"\u0000\u01cc\u0092\u0001\u0000\u0000\u0000\u01cd\u01ce\u0003\u008dF\u0000"+
		"\u01ce\u01d0\u0005.\u0000\u0000\u01cf\u01d1\u0007\u0006\u0000\u0000\u01d0"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01de\u0001\u0000\u0000\u0000\u01d4\u01d5\u00050\u0000\u0000\u01d5\u01d6"+
		"\u0005.\u0000\u0000\u01d6\u01da\u0001\u0000\u0000\u0000\u01d7\u01d9\u0007"+
		"\u0006\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dd\u01cd\u0001\u0000\u0000\u0000\u01dd\u01d4\u0001"+
		"\u0000\u0000\u0000\u01de\u0094\u0001\u0000\u0000\u0000\n\u0000\u0191\u0198"+
		"\u01a7\u01b4\u01be\u01c5\u01d2\u01da\u01dd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}