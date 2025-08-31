// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/CssLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LBRACE=3, RBRACE=4, COLON=5, SEMICOLON=6, COMMA=7, DOT=8, 
		HASH=9, STAR=10, LPAREN=11, RPAREN=12, PLUS=13, GREATER=14, TILDE=15, 
		PIPE=16, IDENTIFIER=17, NUMBER=18, STRING=19, AT_KEYWORD=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "LBRACE", "RBRACE", "COLON", "SEMICOLON", "COMMA", "DOT", 
			"HASH", "STAR", "LPAREN", "RPAREN", "PLUS", "GREATER", "TILDE", "PIPE", 
			"IDENTIFIER", "NUMBER", "STRING", "AT_KEYWORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "':'", "';'", "','", "'.'", "'#'", "'*'", 
			"'('", "')'", "'+'", "'>'", "'~'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LBRACE", "RBRACE", "COLON", "SEMICOLON", "COMMA", 
			"DOT", "HASH", "STAR", "LPAREN", "RPAREN", "PLUS", "GREATER", "TILDE", 
			"PIPE", "IDENTIFIER", "NUMBER", "STRING", "AT_KEYWORD"
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


	public CssLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CssLexer.g4"; }

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
		"\u0004\u0000\u0014\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000"+
		"+\b\u0000\u000b\u0000\f\u0000,\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010]\b\u0010\n\u0010\f\u0010`\t\u0010"+
		"\u0001\u0011\u0004\u0011c\b\u0011\u000b\u0011\f\u0011d\u0001\u0011\u0001"+
		"\u0011\u0004\u0011i\b\u0011\u000b\u0011\f\u0011j\u0003\u0011m\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"t\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"z\b\u0012\n\u0012\f\u0012}\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0084\b\u0012\n\u0012\f\u0012\u0087"+
		"\t\u0012\u0001\u0012\u0003\u0012\u008a\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u00016\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014\u0001\u0000\u0006\u0003\u0000\t\n\r\r  \u0004\u0000--AZ__az\u0005"+
		"\u0000--09AZ__az\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\u0004\u0000"+
		"\n\n\r\r\'\'\\\\\u009b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001"+
		"*\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u0005>\u0001"+
		"\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000"+
		"\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000f"+
		"H\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013L\u0001"+
		"\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017P\u0001\u0000\u0000"+
		"\u0000\u0019R\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001d"+
		"V\u0001\u0000\u0000\u0000\u001fX\u0001\u0000\u0000\u0000!Z\u0001\u0000"+
		"\u0000\u0000#b\u0001\u0000\u0000\u0000%\u0089\u0001\u0000\u0000\u0000"+
		"\'\u008b\u0001\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0006\u0000\u0000\u0000"+
		"/\u0002\u0001\u0000\u0000\u000001\u0005/\u0000\u000012\u0005*\u0000\u0000"+
		"26\u0001\u0000\u0000\u000035\t\u0000\u0000\u000043\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005*\u0000"+
		"\u0000:;\u0005/\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0006\u0001\u0000"+
		"\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005{\u0000\u0000?\u0006\u0001"+
		"\u0000\u0000\u0000@A\u0005}\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005"+
		":\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005;\u0000\u0000E\f\u0001"+
		"\u0000\u0000\u0000FG\u0005,\u0000\u0000G\u000e\u0001\u0000\u0000\u0000"+
		"HI\u0005.\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005#\u0000\u0000"+
		"K\u0012\u0001\u0000\u0000\u0000LM\u0005*\u0000\u0000M\u0014\u0001\u0000"+
		"\u0000\u0000NO\u0005(\u0000\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005"+
		")\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005+\u0000\u0000S\u001a"+
		"\u0001\u0000\u0000\u0000TU\u0005>\u0000\u0000U\u001c\u0001\u0000\u0000"+
		"\u0000VW\u0005~\u0000\u0000W\u001e\u0001\u0000\u0000\u0000XY\u0005|\u0000"+
		"\u0000Y \u0001\u0000\u0000\u0000Z^\u0007\u0001\u0000\u0000[]\u0007\u0002"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\"\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ac\u0007\u0003\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000el\u0001\u0000\u0000\u0000fh\u0005.\u0000\u0000gi\u0007\u0003"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000"+
		"lf\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000ms\u0001\u0000\u0000"+
		"\u0000no\u0005p\u0000\u0000ot\u0005x\u0000\u0000pq\u0005e\u0000\u0000"+
		"qt\u0005m\u0000\u0000rt\u0005%\u0000\u0000sn\u0001\u0000\u0000\u0000s"+
		"p\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000t$\u0001\u0000\u0000\u0000u{\u0005\"\u0000\u0000vz\b\u0004\u0000"+
		"\u0000wx\u0005\\\u0000\u0000xz\t\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u008a\u0005\"\u0000\u0000\u007f\u0085\u0005\'\u0000"+
		"\u0000\u0080\u0084\b\u0005\u0000\u0000\u0081\u0082\u0005\\\u0000\u0000"+
		"\u0082\u0084\t\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0005\'\u0000\u0000\u0089u\u0001\u0000\u0000\u0000\u0089\u007f"+
		"\u0001\u0000\u0000\u0000\u008a&\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"@\u0000\u0000\u008c\u008d\u0003!\u0010\u0000\u008d(\u0001\u0000\u0000"+
		"\u0000\r\u0000,6^djlsy{\u0083\u0085\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}