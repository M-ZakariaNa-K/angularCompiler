package gen;
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
		DOCTYPE=1, COMMENT=2, CDATA=3, OPEN_END=4, OPEN=5, TEXT=6, INTERPOLATION=7, 
		WS=8, SLASH_CLOSE=9, GT=10, EQUALS=11, DQ_STRING=12, SQ_STRING=13, VOID_TAG=14, 
		NAME=15, SLASH=16, TAG_WS=17;
	public static final int
		RULE_htmlDocument = 0, RULE_content = 1, RULE_element = 2, RULE_tagOpen = 3, 
		RULE_tagClose = 4, RULE_attribute = 5, RULE_attrValue = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "content", "element", "tagOpen", "tagClose", "attribute", 
			"attrValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'</'", "'<'", null, null, null, "'/>'", "'>'", 
			"'='", null, null, null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "COMMENT", "CDATA", "OPEN_END", "OPEN", "TEXT", "INTERPOLATION", 
			"WS", "SLASH_CLOSE", "GT", "EQUALS", "DQ_STRING", "SQ_STRING", "VOID_TAG", 
			"NAME", "SLASH", "TAG_WS"
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 238L) != 0)) {
				{
				{
				setState(14);
				content();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
		public TerminalNode INTERPOLATION() { return getToken(HtmlParser.INTERPOLATION, 0); }
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
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				element();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(COMMENT);
				}
				break;
			case DOCTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(DOCTYPE);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				match(CDATA);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				match(TEXT);
				}
				break;
			case INTERPOLATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				match(INTERPOLATION);
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
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ElementContext {
		public TerminalNode OPEN() { return getToken(HtmlParser.OPEN, 0); }
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(HtmlParser.SLASH_CLOSE, 0); }
		public SelfClosingElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidElementNodeContext extends ElementContext {
		public TerminalNode OPEN() { return getToken(HtmlParser.OPEN, 0); }
		public TerminalNode VOID_TAG() { return getToken(HtmlParser.VOID_TAG, 0); }
		public TerminalNode GT() { return getToken(HtmlParser.GT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VoidElementNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterVoidElementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitVoidElementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitVoidElementNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ElementContext {
		public TerminalNode OPEN() { return getToken(HtmlParser.OPEN, 0); }
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public List<TerminalNode> GT() { return getTokens(HtmlParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HtmlParser.GT, i);
		}
		public TerminalNode OPEN_END() { return getToken(HtmlParser.OPEN_END, 0); }
		public TagCloseContext tagClose() {
			return getRuleContext(TagCloseContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public NormalElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(OPEN);
				setState(31);
				tagOpen();
				setState(32);
				match(GT);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 238L) != 0)) {
					{
					{
					setState(33);
					content();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(OPEN_END);
				setState(40);
				tagClose();
				setState(41);
				match(GT);
				}
				break;
			case 2:
				_localctx = new VoidElementNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(OPEN);
				setState(44);
				match(VOID_TAG);
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
				match(GT);
				}
				break;
			case 3:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(OPEN);
				setState(53);
				tagOpen();
				setState(54);
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
	public static class TagOpenContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HtmlParser.NAME, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TagOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterTagOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitTagOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTagOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagOpenContext tagOpen() throws RecognitionException {
		TagOpenContext _localctx = new TagOpenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NAME);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(59);
				attribute();
				}
				}
				setState(64);
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
	public static class TagCloseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HtmlParser.NAME, 0); }
		public TagCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterTagClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitTagClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTagClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagCloseContext tagClose() throws RecognitionException {
		TagCloseContext _localctx = new TagCloseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(NAME);
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
		enterRule(_localctx, 10, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(NAME);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(68);
				match(EQUALS);
				setState(69);
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
		enterRule(_localctx, 12, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		"\u0004\u0001\u0011K\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002"+
		"\n\u0002\f\u00022\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"=\b\u0003\n\u0003\f\u0003@\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005G\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001"+
		"\u0001\u0000\f\rO\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001c\u0001"+
		"\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000"+
		"\u0000\bA\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fH\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u001d\u0003"+
		"\u0004\u0002\u0000\u0017\u001d\u0005\u0002\u0000\u0000\u0018\u001d\u0005"+
		"\u0001\u0000\u0000\u0019\u001d\u0005\u0003\u0000\u0000\u001a\u001d\u0005"+
		"\u0006\u0000\u0000\u001b\u001d\u0005\u0007\u0000\u0000\u001c\u0016\u0001"+
		"\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001"+
		"\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f \u0003\u0006"+
		"\u0003\u0000 $\u0005\n\u0000\u0000!#\u0003\u0002\u0001\u0000\"!\u0001"+
		"\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0004\u0000\u0000()\u0003\b\u0004\u0000)*\u0005\n\u0000"+
		"\u0000*9\u0001\u0000\u0000\u0000+,\u0005\u0005\u0000\u0000,0\u0005\u000e"+
		"\u0000\u0000-/\u0003\n\u0005\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000039\u0005\n\u0000\u000045\u0005"+
		"\u0005\u0000\u000056\u0003\u0006\u0003\u000067\u0005\t\u0000\u000079\u0001"+
		"\u0000\u0000\u00008\u001e\u0001\u0000\u0000\u00008+\u0001\u0000\u0000"+
		"\u000084\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000:>\u0005"+
		"\u000f\u0000\u0000;=\u0003\n\u0005\u0000<;\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?\u0007\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u000f"+
		"\u0000\u0000B\t\u0001\u0000\u0000\u0000CF\u0005\u000f\u0000\u0000DE\u0005"+
		"\u000b\u0000\u0000EG\u0003\f\u0006\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000"+
		"\u0000I\r\u0001\u0000\u0000\u0000\u0007\u0011\u001c$08>F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}