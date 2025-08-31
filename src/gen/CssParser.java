package gen;
// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/CssParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, BANG=3, LBRACE=4, RBRACE=5, COLON=6, SEMICOLON=7, COMMA=8, 
		DOT=9, HASH=10, STAR=11, LPAREN=12, RPAREN=13, LBRACK=14, RBRACK=15, PLUS=16, 
		GREATER=17, TILDE=18, EQ=19, SLASH=20, AT_KEYWORD=21, IDENTIFIER=22, NUMBER=23, 
		NEG_NUMBER=24, DIMENSION=25, NEG_DIMENSION=26, PERCENTAGE=27, NEG_PERCENTAGE=28, 
		HASH_COLOR=29, STRING=30, URL=31, UNICODE_RANGE=32, CSS_VAR=33, CSS_VAR_DEF=34, 
		FUNCTION=35, EASE_IN_OUT=36, LINEAR=37, EASE=38, EASE_IN=39, EASE_OUT=40, 
		IMPORTANT=41;
	public static final int
		RULE_cssFile = 0, RULE_statement = 1, RULE_atRule = 2, RULE_keyframeSelector = 3, 
		RULE_keyframesRule = 4, RULE_keyframeEntry = 5, RULE_block = 6, RULE_blockContent = 7, 
		RULE_ruleSet = 8, RULE_selectorList = 9, RULE_selector = 10, RULE_simpleSelector = 11, 
		RULE_simpleSelectorPart = 12, RULE_typeSelector = 13, RULE_classSelector = 14, 
		RULE_idSelector = 15, RULE_attrib = 16, RULE_pseudo = 17, RULE_pseudoFunction = 18, 
		RULE_combinator = 19, RULE_declaration = 20, RULE_property = 21, RULE_prio = 22, 
		RULE_expr = 23, RULE_term = 24, RULE_value = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"cssFile", "statement", "atRule", "keyframeSelector", "keyframesRule", 
			"keyframeEntry", "block", "blockContent", "ruleSet", "selectorList", 
			"selector", "simpleSelector", "simpleSelectorPart", "typeSelector", "classSelector", 
			"idSelector", "attrib", "pseudo", "pseudoFunction", "combinator", "declaration", 
			"property", "prio", "expr", "term", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'!'", "'{'", "'}'", "':'", "';'", "','", "'.'", "'#'", 
			"'*'", "'('", "')'", "'['", "']'", "'+'", "'>'", "'~'", "'='", "'/'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'ease-in-out'", "'linear'", "'ease'", "'ease-in'", 
			"'ease-out'", "'important'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BANG", "LBRACE", "RBRACE", "COLON", "SEMICOLON", 
			"COMMA", "DOT", "HASH", "STAR", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"PLUS", "GREATER", "TILDE", "EQ", "SLASH", "AT_KEYWORD", "IDENTIFIER", 
			"NUMBER", "NEG_NUMBER", "DIMENSION", "NEG_DIMENSION", "PERCENTAGE", "NEG_PERCENTAGE", 
			"HASH_COLOR", "STRING", "URL", "UNICODE_RANGE", "CSS_VAR", "CSS_VAR_DEF", 
			"FUNCTION", "EASE_IN_OUT", "LINEAR", "EASE", "EASE_IN", "EASE_OUT", "IMPORTANT"
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
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFileContext extends ParserRuleContext {
		public CssFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFile; }
	 
		public CssFileContext() { }
		public void copyFrom(CssFileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFileStatContext extends CssFileContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CssFileStatContext(CssFileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssFileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssFileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssFileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFileStatContext cssFile() throws RecognitionException {
		CssFileContext _localctx = new CssFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cssFile);
		int _la;
		try {
			_localctx = new CssFileStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6770512L) != 0)) {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		return (CssFileStatContext) _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleStatContext extends StatementContext {
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public AtRuleStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyframesStatContext extends StatementContext {
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public KeyframesStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframesStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframesStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframesStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetStatContext extends StatementContext {
		public RuleSetContext ruleSet() {
			return getRuleContext(RuleSetContext.class,0);
		}
		public RuleSetStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterRuleSetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitRuleSetStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitRuleSetStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AtRuleStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				atRule();
				}
				break;
			case 2:
				_localctx = new RuleSetStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				ruleSet();
				}
				break;
			case 3:
				_localctx = new KeyframesStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				keyframesRule();
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
	public static class AtRuleContext extends ParserRuleContext {
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	 
		public AtRuleContext() { }
		public void copyFrom(AtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleBlockStatContext extends AtRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(CssParser.AT_KEYWORD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public AtRuleBlockStatContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleSemiStatContext extends AtRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(CssParser.AT_KEYWORD, 0); }
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public AtRuleSemiStatContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleSemiStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleSemiStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleSemiStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atRule);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AtRuleBlockStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(AT_KEYWORD);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(66);
					selectorList();
					}
					break;
				}
				setState(69);
				block();
				}
				break;
			case 2:
				_localctx = new AtRuleSemiStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(AT_KEYWORD);
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(71);
					selectorList();
					}
					break;
				}
				setState(74);
				match(SEMICOLON);
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
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
	 
		public KeyframeSelectorContext() { }
		public void copyFrom(KeyframeSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyframeFromToContext extends KeyframeSelectorContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public KeyframeFromToContext(KeyframeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframeFromTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframeFromTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframeFromTo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyframePercentageContext extends KeyframeSelectorContext {
		public TerminalNode PERCENTAGE() { return getToken(CssParser.PERCENTAGE, 0); }
		public KeyframePercentageContext(KeyframeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframePercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframePercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframePercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyframeSelector);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERCENTAGE:
				_localctx = new KeyframePercentageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(PERCENTAGE);
				}
				break;
			case IDENTIFIER:
				_localctx = new KeyframeFromToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(IDENTIFIER);
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
	public static class KeyframesRuleContext extends ParserRuleContext {
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
	 
		public KeyframesRuleContext() { }
		public void copyFrom(KeyframesRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyframesRuleStatContext extends KeyframesRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(CssParser.AT_KEYWORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<KeyframeEntryContext> keyframeEntry() {
			return getRuleContexts(KeyframeEntryContext.class);
		}
		public KeyframeEntryContext keyframeEntry(int i) {
			return getRuleContext(KeyframeEntryContext.class,i);
		}
		public KeyframesRuleStatContext(KeyframesRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframesRuleStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframesRuleStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframesRuleStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyframesRule);
		int _la;
		try {
			_localctx = new KeyframesRuleStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(AT_KEYWORD);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(LBRACE);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				keyframeEntry();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==PERCENTAGE );
			setState(89);
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
	public static class KeyframeEntryContext extends ParserRuleContext {
		public KeyframeEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeEntry; }
	 
		public KeyframeEntryContext() { }
		public void copyFrom(KeyframeEntryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyframeEntryStatContext extends KeyframeEntryContext {
		public KeyframeSelectorContext keyframeSelector() {
			return getRuleContext(KeyframeSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public KeyframeEntryStatContext(KeyframeEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframeEntryStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframeEntryStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframeEntryStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeEntryContext keyframeEntry() throws RecognitionException {
		KeyframeEntryContext _localctx = new KeyframeEntryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyframeEntry);
		int _la;
		try {
			_localctx = new KeyframeEntryStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			keyframeSelector();
			setState(92);
			match(LBRACE);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==CSS_VAR_DEF) {
				{
				{
				setState(93);
				declaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockRuleContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<BlockContentContext> blockContent() {
			return getRuleContexts(BlockContentContext.class);
		}
		public BlockContentContext blockContent(int i) {
			return getRuleContext(BlockContentContext.class,i);
		}
		public BlockRuleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBlockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBlockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBlockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			_localctx = new BlockRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17186639696L) != 0)) {
				{
				{
				setState(102);
				blockContent();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
	public static class BlockContentContext extends ParserRuleContext {
		public BlockContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockContent; }
	 
		public BlockContentContext() { }
		public void copyFrom(BlockContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends BlockContentContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(BlockContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockDeclarationContext extends BlockContentContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockDeclarationContext(BlockContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContentContext blockContent() throws RecognitionException {
		BlockContentContext _localctx = new BlockContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockContent);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				statement();
				}
				break;
			case 2:
				_localctx = new BlockDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				declaration();
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
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
	 
		public RuleSetContext() { }
		public void copyFrom(RuleSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetRuleContext extends RuleSetContext {
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RuleSetRuleContext(RuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterRuleSetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitRuleSetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitRuleSetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleSet);
		try {
			_localctx = new RuleSetRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			selectorList();
			setState(115);
			block();
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
	public static class SelectorListContext extends ParserRuleContext {
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
	 
		public SelectorListContext() { }
		public void copyFrom(SelectorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorListRuleContext extends SelectorListContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public SelectorListRuleContext(SelectorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelectorListRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelectorListRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelectorListRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectorList);
		int _la;
		try {
			_localctx = new SelectorListRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			selector();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				selector();
				}
				}
				setState(124);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorRuleContext extends SelectorContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorRuleContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selector);
		int _la;
		try {
			_localctx = new SelectorRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			simpleSelector();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
				{
				{
				setState(126);
				combinator();
				setState(127);
				simpleSelector();
				}
				}
				setState(133);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorRuleContext extends SimpleSelectorContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public List<SimpleSelectorPartContext> simpleSelectorPart() {
			return getRuleContexts(SimpleSelectorPartContext.class);
		}
		public SimpleSelectorPartContext simpleSelectorPart(int i) {
			return getRuleContext(SimpleSelectorPartContext.class,i);
		}
		public SimpleSelectorRuleContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleSelector);
		int _la;
		try {
			_localctx = new SimpleSelectorRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==IDENTIFIER) {
				{
				setState(134);
				typeSelector();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17984L) != 0)) {
				{
				{
				setState(137);
				simpleSelectorPart();
				}
				}
				setState(142);
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
	public static class SimpleSelectorPartContext extends ParserRuleContext {
		public SimpleSelectorPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorPart; }
	 
		public SimpleSelectorPartContext() { }
		public void copyFrom(SimpleSelectorPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribPartContext extends SimpleSelectorPartContext {
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public AttribPartContext(SimpleSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttribPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttribPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttribPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPartContext extends SimpleSelectorPartContext {
		public IdSelectorContext idSelector() {
			return getRuleContext(IdSelectorContext.class,0);
		}
		public IdPartContext(SimpleSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoPartContext extends SimpleSelectorPartContext {
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public PseudoPartContext(SimpleSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassPartContext extends SimpleSelectorPartContext {
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public ClassPartContext(SimpleSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClassPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClassPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClassPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorPartContext simpleSelectorPart() throws RecognitionException {
		SimpleSelectorPartContext _localctx = new SimpleSelectorPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleSelectorPart);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new ClassPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				classSelector();
				}
				break;
			case HASH:
				_localctx = new IdPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				idSelector();
				}
				break;
			case LBRACK:
				_localctx = new AttribPartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				attrib();
				}
				break;
			case COLON:
				_localctx = new PseudoPartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				pseudo();
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
	public static class TypeSelectorContext extends ParserRuleContext {
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
	 
		public TypeSelectorContext() { }
		public void copyFrom(TypeSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeStarContext extends TypeSelectorContext {
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public TypeStarContext(TypeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentContext extends TypeSelectorContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TypeIdentContext(TypeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeSelector);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TypeIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(IDENTIFIER);
				}
				break;
			case STAR:
				_localctx = new TypeStarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(STAR);
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
	public static class ClassSelectorContext extends ParserRuleContext {
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
	 
		public ClassSelectorContext() { }
		public void copyFrom(ClassSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorRuleContext extends ClassSelectorContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public ClassSelectorRuleContext(ClassSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClassSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClassSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClassSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classSelector);
		try {
			_localctx = new ClassSelectorRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(DOT);
			setState(154);
			match(IDENTIFIER);
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
	public static class IdSelectorContext extends ParserRuleContext {
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
	 
		public IdSelectorContext() { }
		public void copyFrom(IdSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorRuleContext extends IdSelectorContext {
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public IdSelectorRuleContext(IdSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_idSelector);
		try {
			_localctx = new IdSelectorRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(HASH);
			setState(157);
			match(IDENTIFIER);
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
	public static class AttribContext extends ParserRuleContext {
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
	 
		public AttribContext() { }
		public void copyFrom(AttribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribOnlyContext extends AttribContext {
		public TerminalNode LBRACK() { return getToken(CssParser.LBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TerminalNode RBRACK() { return getToken(CssParser.RBRACK, 0); }
		public AttribOnlyContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttribOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttribOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttribOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribIdentContext extends AttribContext {
		public TerminalNode LBRACK() { return getToken(CssParser.LBRACK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CssParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CssParser.IDENTIFIER, i);
		}
		public TerminalNode EQ() { return getToken(CssParser.EQ, 0); }
		public TerminalNode RBRACK() { return getToken(CssParser.RBRACK, 0); }
		public AttribIdentContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttribIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttribIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttribIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribStringContext extends AttribContext {
		public TerminalNode LBRACK() { return getToken(CssParser.LBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(CssParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode RBRACK() { return getToken(CssParser.RBRACK, 0); }
		public AttribStringContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttribString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttribString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttribString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attrib);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AttribOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(LBRACK);
				setState(160);
				match(IDENTIFIER);
				setState(161);
				match(RBRACK);
				}
				break;
			case 2:
				_localctx = new AttribIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(LBRACK);
				setState(163);
				match(IDENTIFIER);
				setState(164);
				match(EQ);
				setState(165);
				match(IDENTIFIER);
				setState(166);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new AttribStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(LBRACK);
				setState(168);
				match(IDENTIFIER);
				setState(169);
				match(EQ);
				setState(170);
				match(STRING);
				setState(171);
				match(RBRACK);
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
	public static class PseudoContext extends ParserRuleContext {
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
	 
		public PseudoContext() { }
		public void copyFrom(PseudoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoFuncOrIdentContext extends PseudoContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public PseudoFunctionContext pseudoFunction() {
			return getRuleContext(PseudoFunctionContext.class,0);
		}
		public PseudoFuncOrIdentContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoFuncOrIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoFuncOrIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoFuncOrIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementContext extends PseudoContext {
		public List<TerminalNode> COLON() { return getTokens(CssParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CssParser.COLON, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public PseudoElementContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudo);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PseudoFuncOrIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(COLON);
				setState(175);
				match(IDENTIFIER);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(176);
					pseudoFunction();
					}
				}

				}
				break;
			case 2:
				_localctx = new PseudoElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(COLON);
				setState(180);
				match(COLON);
				setState(181);
				match(IDENTIFIER);
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
	public static class PseudoFunctionContext extends ParserRuleContext {
		public PseudoFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoFunction; }
	 
		public PseudoFunctionContext() { }
		public void copyFrom(PseudoFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoFunctionRuleContext extends PseudoFunctionContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public PseudoFunctionRuleContext(PseudoFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoFunctionContext pseudoFunction() throws RecognitionException {
		PseudoFunctionContext _localctx = new PseudoFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoFunction);
		int _la;
		try {
			_localctx = new PseudoFunctionRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(LPAREN);
			setState(185);
			value();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				value();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(RPAREN);
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
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorGreaterContext extends CombinatorContext {
		public TerminalNode GREATER() { return getToken(CssParser.GREATER, 0); }
		public CombinatorGreaterContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCombinatorGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCombinatorGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCombinatorGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorPlusContext extends CombinatorContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public CombinatorPlusContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCombinatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCombinatorPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCombinatorPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorTildeContext extends CombinatorContext {
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public CombinatorTildeContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCombinatorTilde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCombinatorTilde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCombinatorTilde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_combinator);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new CombinatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(PLUS);
				}
				break;
			case GREATER:
				_localctx = new CombinatorGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(GREATER);
				}
				break;
			case TILDE:
				_localctx = new CombinatorTildeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(TILDE);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationRuleContext extends DeclarationContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public DeclarationRuleContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			property();
			setState(201);
			match(COLON);
			setState(202);
			expr();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BANG) {
				{
				setState(203);
				prio();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(206);
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
	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyCssVarContext extends PropertyContext {
		public TerminalNode CSS_VAR_DEF() { return getToken(CssParser.CSS_VAR_DEF, 0); }
		public PropertyCssVarContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPropertyCssVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPropertyCssVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPropertyCssVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyIdentContext extends PropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public PropertyIdentContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPropertyIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPropertyIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPropertyIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_property);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new PropertyIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(IDENTIFIER);
				}
				break;
			case CSS_VAR_DEF:
				_localctx = new PropertyCssVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(CSS_VAR_DEF);
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
	public static class PrioContext extends ParserRuleContext {
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
	 
		public PrioContext() { }
		public void copyFrom(PrioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrioRuleContext extends PrioContext {
		public TerminalNode BANG() { return getToken(CssParser.BANG, 0); }
		public TerminalNode IMPORTANT() { return getToken(CssParser.IMPORTANT, 0); }
		public PrioRuleContext(PrioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPrioRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPrioRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPrioRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_prio);
		try {
			_localctx = new PrioRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(BANG);
			setState(214);
			match(IMPORTANT);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRuleContext extends ExprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprRuleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterExprRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitExprRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitExprRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr);
		try {
			int _alt;
			_localctx = new ExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(216);
					term();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EaseInTermContext extends TermContext {
		public TerminalNode EASE_IN() { return getToken(CssParser.EASE_IN, 0); }
		public EaseInTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEaseInTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEaseInTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEaseInTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTermContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public NumberTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EaseOutTermContext extends TermContext {
		public TerminalNode EASE_OUT() { return getToken(CssParser.EASE_OUT, 0); }
		public EaseOutTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEaseOutTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEaseOutTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEaseOutTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlTermContext extends TermContext {
		public TerminalNode URL() { return getToken(CssParser.URL, 0); }
		public UrlTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUrlTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUrlTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUrlTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentageTermContext extends TermContext {
		public TerminalNode PERCENTAGE() { return getToken(CssParser.PERCENTAGE, 0); }
		public PercentageTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPercentageTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPercentageTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPercentageTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorTermContext extends TermContext {
		public TerminalNode HASH_COLOR() { return getToken(CssParser.HASH_COLOR, 0); }
		public ColorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterColorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitColorTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitColorTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTermContext extends TermContext {
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public FunctionTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegNumberTermContext extends TermContext {
		public TerminalNode NEG_NUMBER() { return getToken(CssParser.NEG_NUMBER, 0); }
		public NegNumberTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNegNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNegNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNegNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentTermContext extends TermContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public IdentTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdentTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdentTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdentTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DimensionTermContext extends TermContext {
		public TerminalNode DIMENSION() { return getToken(CssParser.DIMENSION, 0); }
		public DimensionTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDimensionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDimensionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDimensionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTermContext extends TermContext {
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public StringTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStringTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegPercentageTermContext extends TermContext {
		public TerminalNode NEG_PERCENTAGE() { return getToken(CssParser.NEG_PERCENTAGE, 0); }
		public NegPercentageTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNegPercentageTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNegPercentageTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNegPercentageTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnicodeRangeTermContext extends TermContext {
		public TerminalNode UNICODE_RANGE() { return getToken(CssParser.UNICODE_RANGE, 0); }
		public UnicodeRangeTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUnicodeRangeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUnicodeRangeTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnicodeRangeTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVarTermContext extends TermContext {
		public TerminalNode CSS_VAR() { return getToken(CssParser.CSS_VAR, 0); }
		public CssVarTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssVarTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssVarTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssVarTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinearTermContext extends TermContext {
		public TerminalNode LINEAR() { return getToken(CssParser.LINEAR, 0); }
		public LinearTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLinearTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLinearTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLinearTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EaseTermContext extends TermContext {
		public TerminalNode EASE() { return getToken(CssParser.EASE, 0); }
		public EaseTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEaseTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEaseTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEaseTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegDimensionTermContext extends TermContext {
		public TerminalNode NEG_DIMENSION() { return getToken(CssParser.NEG_DIMENSION, 0); }
		public NegDimensionTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNegDimensionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNegDimensionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNegDimensionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EaseInOutTermContext extends TermContext {
		public TerminalNode EASE_IN_OUT() { return getToken(CssParser.EASE_IN_OUT, 0); }
		public EaseInOutTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEaseInOutTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEaseInOutTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEaseInOutTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(NUMBER);
				}
				break;
			case NEG_NUMBER:
				_localctx = new NegNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(NEG_NUMBER);
				}
				break;
			case DIMENSION:
				_localctx = new DimensionTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(DIMENSION);
				}
				break;
			case NEG_DIMENSION:
				_localctx = new NegDimensionTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(NEG_DIMENSION);
				}
				break;
			case PERCENTAGE:
				_localctx = new PercentageTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(PERCENTAGE);
				}
				break;
			case NEG_PERCENTAGE:
				_localctx = new NegPercentageTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(NEG_PERCENTAGE);
				}
				break;
			case HASH_COLOR:
				_localctx = new ColorTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(HASH_COLOR);
				}
				break;
			case STRING:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				match(STRING);
				}
				break;
			case URL:
				_localctx = new UrlTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(229);
				match(URL);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(230);
				match(IDENTIFIER);
				}
				break;
			case CSS_VAR:
				_localctx = new CssVarTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(231);
				match(CSS_VAR);
				}
				break;
			case EASE_IN_OUT:
				_localctx = new EaseInOutTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(232);
				match(EASE_IN_OUT);
				}
				break;
			case LINEAR:
				_localctx = new LinearTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(233);
				match(LINEAR);
				}
				break;
			case EASE:
				_localctx = new EaseTermContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(234);
				match(EASE);
				}
				break;
			case EASE_IN:
				_localctx = new EaseInTermContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(235);
				match(EASE_IN);
				}
				break;
			case EASE_OUT:
				_localctx = new EaseOutTermContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(236);
				match(EASE_OUT);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(237);
				match(FUNCTION);
				setState(238);
				expr();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					expr();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(RPAREN);
				}
				break;
			case UNICODE_RANGE:
				_localctx = new UnicodeRangeTermContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(248);
				match(UNICODE_RANGE);
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
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExprContext extends ValueContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueExprContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value);
		try {
			_localctx = new ValueExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			expr();
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
		"\u0004\u0001)\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002\u0003"+
		"\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004V\b\u0004\u000b\u0004"+
		"\f\u0004W\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007q\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\ty\b\t\n\t\f\t"+
		"|\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0082\b\n\n\n\f\n\u0085"+
		"\t\n\u0001\u000b\u0003\u000b\u0088\b\u000b\u0001\u000b\u0005\u000b\u008b"+
		"\b\u000b\n\u000b\f\u000b\u008e\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0094\b\f\u0001\r\u0001\r\u0003\r\u0098\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00ad\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b2"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b7\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00bd\b\u0012"+
		"\n\u0012\f\u0012\u00c0\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00c7\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00cd\b\u0014\u0001\u0014\u0003\u0014\u00d0"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00d4\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00da\b\u0017\u000b\u0017"+
		"\f\u0017\u00db\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00f2\b\u0018\n\u0018"+
		"\f\u0018\u00f5\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00fa\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0000\u0113\u00007\u0001\u0000\u0000\u0000\u0002"+
		"?\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006O\u0001"+
		"\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000"+
		"\fe\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010r\u0001"+
		"\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000"+
		"\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000"+
		"\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u0099\u0001\u0000\u0000"+
		"\u0000\u001e\u009c\u0001\u0000\u0000\u0000 \u00ac\u0001\u0000\u0000\u0000"+
		"\"\u00b6\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000&\u00c6"+
		"\u0001\u0000\u0000\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00d3\u0001\u0000"+
		"\u0000\u0000,\u00d5\u0001\u0000\u0000\u0000.\u00d9\u0001\u0000\u0000\u0000"+
		"0\u00f9\u0001\u0000\u0000\u00002\u00fb\u0001\u0000\u0000\u000046\u0003"+
		"\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001;\u0001\u0001"+
		"\u0000\u0000\u0000<@\u0003\u0004\u0002\u0000=@\u0003\u0010\b\u0000>@\u0003"+
		"\b\u0004\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AC\u0005\u0015\u0000"+
		"\u0000BD\u0003\u0012\t\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EL\u0003\f\u0006\u0000FH\u0005\u0015\u0000"+
		"\u0000GI\u0003\u0012\t\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JL\u0005\u0007\u0000\u0000KA\u0001\u0000"+
		"\u0000\u0000KF\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000"+
		"MP\u0005\u001b\u0000\u0000NP\u0005\u0016\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000ON\u0001\u0000\u0000\u0000P\u0007\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0015\u0000\u0000RS\u0005\u0016\u0000\u0000SU\u0005\u0004\u0000\u0000"+
		"TV\u0003\n\u0005\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u0005\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0003\u0006"+
		"\u0003\u0000\\`\u0005\u0004\u0000\u0000]_\u0003(\u0014\u0000^]\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0005\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ei\u0005\u0004"+
		"\u0000\u0000fh\u0003\u000e\u0007\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0005\u0000"+
		"\u0000m\r\u0001\u0000\u0000\u0000nq\u0003\u0002\u0001\u0000oq\u0003(\u0014"+
		"\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u000f\u0001"+
		"\u0000\u0000\u0000rs\u0003\u0012\t\u0000st\u0003\f\u0006\u0000t\u0011"+
		"\u0001\u0000\u0000\u0000uz\u0003\u0014\n\u0000vw\u0005\b\u0000\u0000w"+
		"y\u0003\u0014\n\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0013\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0083\u0003\u0016\u000b\u0000"+
		"~\u007f\u0003&\u0013\u0000\u007f\u0080\u0003\u0016\u000b\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0003\u001a\r\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008c\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0003\u0018\f\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0017\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0094\u0003\u001c\u000e"+
		"\u0000\u0090\u0094\u0003\u001e\u000f\u0000\u0091\u0094\u0003 \u0010\u0000"+
		"\u0092\u0094\u0003\"\u0011\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0005\u0016\u0000\u0000\u0096\u0098\u0005\u000b\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u001b\u0001\u0000\u0000\u0000\u0099\u009a\u0005\t\u0000\u0000\u009a\u009b"+
		"\u0005\u0016\u0000\u0000\u009b\u001d\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\n\u0000\u0000\u009d\u009e\u0005\u0016\u0000\u0000\u009e\u001f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0016\u0000\u0000\u00a1\u00ad\u0005\u000f\u0000\u0000\u00a2\u00a3\u0005"+
		"\u000e\u0000\u0000\u00a3\u00a4\u0005\u0016\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0013\u0000\u0000\u00a5\u00a6\u0005\u0016\u0000\u0000\u00a6\u00ad\u0005"+
		"\u000f\u0000\u0000\u00a7\u00a8\u0005\u000e\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0016\u0000\u0000\u00a9\u00aa\u0005\u0013\u0000\u0000\u00aa\u00ab\u0005"+
		"\u001e\u0000\u0000\u00ab\u00ad\u0005\u000f\u0000\u0000\u00ac\u009f\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ad!\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0006"+
		"\u0000\u0000\u00af\u00b1\u0005\u0016\u0000\u0000\u00b0\u00b2\u0003$\u0012"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0006\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b7\u0005\u0016\u0000"+
		"\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b7#\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\f\u0000\u0000"+
		"\u00b9\u00be\u00032\u0019\u0000\u00ba\u00bb\u0005\b\u0000\u0000\u00bb"+
		"\u00bd\u00032\u0019\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\r\u0000\u0000\u00c2%\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c7\u0005\u0010\u0000\u0000\u00c4\u00c7\u0005"+
		"\u0011\u0000\u0000\u00c5\u00c7\u0005\u0012\u0000\u0000\u00c6\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003*"+
		"\u0015\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cc\u0003.\u0017"+
		"\u0000\u00cb\u00cd\u0003,\u0016\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0005\u0007\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0)\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0005\u0016\u0000\u0000\u00d2\u00d4\u0005\"\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4+\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7\u0005"+
		")\u0000\u0000\u00d7-\u0001\u0000\u0000\u0000\u00d8\u00da\u00030\u0018"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc/\u0001\u0000\u0000\u0000\u00dd\u00fa\u0005\u0017\u0000\u0000"+
		"\u00de\u00fa\u0005\u0018\u0000\u0000\u00df\u00fa\u0005\u0019\u0000\u0000"+
		"\u00e0\u00fa\u0005\u001a\u0000\u0000\u00e1\u00fa\u0005\u001b\u0000\u0000"+
		"\u00e2\u00fa\u0005\u001c\u0000\u0000\u00e3\u00fa\u0005\u001d\u0000\u0000"+
		"\u00e4\u00fa\u0005\u001e\u0000\u0000\u00e5\u00fa\u0005\u001f\u0000\u0000"+
		"\u00e6\u00fa\u0005\u0016\u0000\u0000\u00e7\u00fa\u0005!\u0000\u0000\u00e8"+
		"\u00fa\u0005$\u0000\u0000\u00e9\u00fa\u0005%\u0000\u0000\u00ea\u00fa\u0005"+
		"&\u0000\u0000\u00eb\u00fa\u0005\'\u0000\u0000\u00ec\u00fa\u0005(\u0000"+
		"\u0000\u00ed\u00ee\u0005#\u0000\u0000\u00ee\u00f3\u0003.\u0017\u0000\u00ef"+
		"\u00f0\u0005\b\u0000\u0000\u00f0\u00f2\u0003.\u0017\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\r\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005"+
		" \u0000\u0000\u00f9\u00dd\u0001\u0000\u0000\u0000\u00f9\u00de\u0001\u0000"+
		"\u0000\u0000\u00f9\u00df\u0001\u0000\u0000\u0000\u00f9\u00e0\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e1\u0001\u0000\u0000\u0000\u00f9\u00e2\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e3\u0001\u0000\u0000\u0000\u00f9\u00e4\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e5\u0001\u0000\u0000\u0000\u00f9\u00e6\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e7\u0001\u0000\u0000\u0000\u00f9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e9\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f9\u00eb\u0001\u0000\u0000\u0000\u00f9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa1\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003.\u0017\u0000"+
		"\u00fc3\u0001\u0000\u0000\u0000\u001b7?CHKOW`ipz\u0083\u0087\u008c\u0093"+
		"\u0097\u00ac\u00b1\u00b6\u00be\u00c6\u00cc\u00cf\u00d3\u00db\u00f3\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}