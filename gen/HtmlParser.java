// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/HtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, COMMENT=2, CDATA=3, OPEN=4, CLOSE=5, SLASH=6, SLASH_CLOSE=7, 
		OPEN_END=8, EQUALS=9, DQ_STRING=10, SQ_STRING=11, NAME=12, TEXT=13, WS=14, 
		ANY=15;
	public static final int
		RULE_htmlDocument = 0, RULE_content = 1, RULE_element = 2, RULE_attribute = 3, 
		RULE_attrValue = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "content", "element", "attribute", "attrValue"
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

	@Override
	public String getGrammarFileName() { return "HtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HtmlParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8222L) != 0)) {
				{
				{
				setState(10);
				content();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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
	public static class ContentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(HtmlParser.COMMENT, 0); }
		public TerminalNode DOCTYPE() { return getToken(HtmlParser.DOCTYPE, 0); }
		public TerminalNode CDATA() { return getToken(HtmlParser.CDATA, 0); }
		public TerminalNode TEXT() { return getToken(HtmlParser.TEXT, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				element();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(COMMENT);
				}
				break;
			case DOCTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(DOCTYPE);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				match(CDATA);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(TEXT);
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
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(HtmlParser.OPEN, 0); }
		public List<TerminalNode> NAME() { return getTokens(HtmlParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HtmlParser.NAME, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(HtmlParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(HtmlParser.CLOSE, i);
		}
		public TerminalNode OPEN_END() { return getToken(HtmlParser.OPEN_END, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(HtmlParser.SLASH_CLOSE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(OPEN);
				setState(26);
				match(NAME);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(27);
					attribute();
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33);
				match(CLOSE);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8222L) != 0)) {
					{
					{
					setState(34);
					content();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(OPEN_END);
				setState(41);
				match(NAME);
				setState(42);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(OPEN);
				setState(44);
				match(NAME);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(45);
					attribute();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(SLASH_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HtmlParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(HtmlParser.EQUALS, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(NAME);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(55);
				match(EQUALS);
				setState(56);
				attrValue();
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
	public static class AttrValueContext extends ParserRuleContext {
		public TerminalNode DQ_STRING() { return getToken(HtmlParser.DQ_STRING, 0); }
		public TerminalNode SQ_STRING() { return getToken(HtmlParser.SQ_STRING, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==DQ_STRING || _la==SQ_STRING) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u001d\b\u0002\n\u0002\f\u0002 \t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002"+
		"\f\u00022\t\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\n"+
		"\u000bB\u0000\r\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000"+
		"\u0000\u00044\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b"+
		";\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000"+
		"\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011"+
		"\u0001\u0001\u0000\u0000\u0000\u0012\u0018\u0003\u0004\u0002\u0000\u0013"+
		"\u0018\u0005\u0002\u0000\u0000\u0014\u0018\u0005\u0001\u0000\u0000\u0015"+
		"\u0018\u0005\u0003\u0000\u0000\u0016\u0018\u0005\r\u0000\u0000\u0017\u0012"+
		"\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\u0004\u0000\u0000\u001a\u001e\u0005\f\u0000\u0000\u001b\u001d\u0003"+
		"\u0006\u0003\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!%\u0005\u0005\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005"+
		"\b\u0000\u0000)*\u0005\f\u0000\u0000*5\u0005\u0005\u0000\u0000+,\u0005"+
		"\u0004\u0000\u0000,0\u0005\f\u0000\u0000-/\u0003\u0006\u0003\u0000.-\u0001"+
		"\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000035\u0005\u0007\u0000\u00004\u0019\u0001\u0000\u0000\u00004+\u0001"+
		"\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000069\u0005\f\u0000\u0000"+
		"78\u0005\t\u0000\u00008:\u0003\b\u0004\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0007\u0000"+
		"\u0000\u0000<\t\u0001\u0000\u0000\u0000\u0007\r\u0017\u001e%049";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}