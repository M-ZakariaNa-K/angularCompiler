// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/HtmlLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, COMMENT=2, CDATA=3, OPEN=4, CLOSE=5, SLASH=6, SLASH_CLOSE=7, 
		OPEN_END=8, EQUALS=9, DQ_STRING=10, SQ_STRING=11, NAME=12, TEXT=13, WS=14, 
		ANY=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOCTYPE", "COMMENT", "CDATA", "OPEN", "CLOSE", "SLASH", "SLASH_CLOSE", 
			"OPEN_END", "EQUALS", "DQ_STRING", "SQ_STRING", "NAME", "TEXT", "WS", 
			"ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'<'", "'>'", "'/'", "'/>'", "'</'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "COMMENT", "CDATA", "OPEN", "CLOSE", "SLASH", "SLASH_CLOSE", 
			"OPEN_END", "EQUALS", "DQ_STRING", "SQ_STRING", "NAME", "TEXT", "WS", 
			"ANY"
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


	public HtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlLexer.g4"; }

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
		"\u0004\u0000\u000f\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000"+
		"\n\u0000\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001"+
		"\n\u0001\f\u00014\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t^\b\t\n\t\f\ta\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\ng\b\n\n\n\f\nj\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b"+
		"\u0001\f\u0004\fv\b\f\u000b\f\f\fw\u0001\r\u0004\r{\b\r\u000b\r\f\r|\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u00022F\u0000\u000f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000"+
		"\u0007\u0001\u0000>>\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0004"+
		"\u0000::AZ__az\u0006\u0000-.0:AZ\\\\__az\u0001\u0000<<\u0003\u0000\t\n"+
		"\r\r  \u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003*\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007M"+
		"\u0001\u0000\u0000\u0000\tO\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000"+
		"\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000"+
		"\u0011Y\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015d"+
		"\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019u\u0001\u0000"+
		"\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d\u0080\u0001\u0000\u0000"+
		"\u0000\u001f \u0005<\u0000\u0000 !\u0005!\u0000\u0000!%\u0001\u0000\u0000"+
		"\u0000\"$\b\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005>\u0000\u0000)\u0002"+
		"\u0001\u0000\u0000\u0000*+\u0005<\u0000\u0000+,\u0005!\u0000\u0000,-\u0005"+
		"-\u0000\u0000-.\u0005-\u0000\u0000.2\u0001\u0000\u0000\u0000/1\t\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000056\u0005-\u0000\u000067\u0005-\u0000\u00007"+
		"8\u0005>\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005<\u0000\u0000"+
		":;\u0005!\u0000\u0000;<\u0005[\u0000\u0000<=\u0005C\u0000\u0000=>\u0005"+
		"D\u0000\u0000>?\u0005A\u0000\u0000?@\u0005T\u0000\u0000@A\u0005A\u0000"+
		"\u0000AB\u0005[\u0000\u0000BF\u0001\u0000\u0000\u0000CE\t\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000IJ\u0005]\u0000\u0000JK\u0005]\u0000\u0000KL\u0005>"+
		"\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005<\u0000\u0000N\b\u0001"+
		"\u0000\u0000\u0000OP\u0005>\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005"+
		"/\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005/\u0000\u0000TU\u0005"+
		">\u0000\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005<\u0000\u0000WX\u0005"+
		"/\u0000\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0005=\u0000\u0000Z\u0012"+
		"\u0001\u0000\u0000\u0000[_\u0005\"\u0000\u0000\\^\b\u0001\u0000\u0000"+
		"]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000bc\u0005\"\u0000\u0000c\u0014\u0001\u0000\u0000\u0000dh\u0005"+
		"\'\u0000\u0000eg\b\u0002\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000"+
		"l\u0016\u0001\u0000\u0000\u0000mq\u0007\u0003\u0000\u0000np\u0007\u0004"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0018\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tv\b\u0005\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u001a\u0001\u0000\u0000\u0000y{\u0007\u0006\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006"+
		"\r\u0000\u0000\u007f\u001c\u0001\u0000\u0000\u0000\u0080\u0081\t\u0000"+
		"\u0000\u0000\u0081\u001e\u0001\u0000\u0000\u0000\t\u0000%2F_hqw|\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}