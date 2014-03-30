// Generated from ../Selector.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SelectorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, WHILE=7, FOREACH=8, FUNCTION=9, 
		IF=10, TRUE_STATEMENT=11, ELSE_STATEMENT=12, BODY=13, EXPRESSION=14, VARIABLE=15, 
		DECLARATION=16, ALL=17, ID=18, WHITESPACE=19, NEWLINE=20;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'>'", "','", "'+'", "'['", "'='", "'while'", "'foreach'", 
		"'function'", "'if'", "'else-if'", "'else'", "'body'", "'expression'", 
		"'variable'", "'declaration'", "'*'", "ID", "WHITESPACE", "NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_selectors = 1, RULE_selector = 2, RULE_attribute = 3, 
		RULE_operator = 4, RULE_statement = 5, RULE_baseStatement = 6;
	public static final String[] ruleNames = {
		"init", "selectors", "selector", "attribute", "operator", "statement", 
		"baseStatement"
	};

	@Override
	public String getGrammarFileName() { return "Selector.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SelectorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); selectors();
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

	public static class SelectorsContext extends ParserRuleContext {
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); selector(0);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(17); match(3);
				setState(18); selector(0);
				}
				}
				setState(23);
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

	public static class SelectorContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		return selector(0);
	}

	private SelectorContext selector(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectorContext _localctx = new SelectorContext(_ctx, _parentState);
		SelectorContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_selector, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_selector);
					setState(27);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(28); operator();
					setState(29); selector(0);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SelectorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SelectorParser.ID, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(5);
			setState(37); match(ID);
			setState(38); match(6);
			setState(39); match(ID);
			setState(40); match(1);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StatementContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public BaseStatementContext baseStatement() {
			return getRuleContext(BaseStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); baseStatement();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(45); attribute();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class BaseStatementContext extends ParserRuleContext {
		public Token Statement;
		public TerminalNode ELSE_STATEMENT() { return getToken(SelectorParser.ELSE_STATEMENT, 0); }
		public TerminalNode WHILE() { return getToken(SelectorParser.WHILE, 0); }
		public TerminalNode BODY() { return getToken(SelectorParser.BODY, 0); }
		public TerminalNode IF() { return getToken(SelectorParser.IF, 0); }
		public TerminalNode ALL() { return getToken(SelectorParser.ALL, 0); }
		public TerminalNode VARIABLE() { return getToken(SelectorParser.VARIABLE, 0); }
		public TerminalNode EXPRESSION() { return getToken(SelectorParser.EXPRESSION, 0); }
		public TerminalNode FUNCTION() { return getToken(SelectorParser.FUNCTION, 0); }
		public TerminalNode TRUE_STATEMENT() { return getToken(SelectorParser.TRUE_STATEMENT, 0); }
		public TerminalNode FOREACH() { return getToken(SelectorParser.FOREACH, 0); }
		public BaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).enterBaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectorListener ) ((SelectorListener)listener).exitBaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectorVisitor ) return ((SelectorVisitor<? extends T>)visitor).visitBaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseStatementContext baseStatement() throws RecognitionException {
		BaseStatementContext _localctx = new BaseStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_baseStatement);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); ((BaseStatementContext)_localctx).Statement = match(WHILE);
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); ((BaseStatementContext)_localctx).Statement = match(FOREACH);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); ((BaseStatementContext)_localctx).Statement = match(FUNCTION);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(54); ((BaseStatementContext)_localctx).Statement = match(IF);
				}
				break;
			case TRUE_STATEMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(55); ((BaseStatementContext)_localctx).Statement = match(TRUE_STATEMENT);
				}
				break;
			case ELSE_STATEMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(56); ((BaseStatementContext)_localctx).Statement = match(ELSE_STATEMENT);
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 7);
				{
				setState(57); ((BaseStatementContext)_localctx).Statement = match(BODY);
				}
				break;
			case EXPRESSION:
				enterOuterAlt(_localctx, 8);
				{
				setState(58); ((BaseStatementContext)_localctx).Statement = match(EXPRESSION);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(59); ((BaseStatementContext)_localctx).Statement = match(VARIABLE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(60); ((BaseStatementContext)_localctx).Statement = match(ALL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return selector_sempred((SelectorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean selector_sempred(SelectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b@\n\b\3\b\2\3\6\t\2\4\6"+
		"\b\n\f\16\2\3\4\2\4\4\6\6F\2\20\3\2\2\2\4\22\3\2\2\2\6\32\3\2\2\2\b&\3"+
		"\2\2\2\n,\3\2\2\2\f.\3\2\2\2\16?\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22"+
		"\27\5\6\4\2\23\24\7\5\2\2\24\26\5\6\4\2\25\23\3\2\2\2\26\31\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\33\b\4\1\2\33"+
		"\34\5\f\7\2\34#\3\2\2\2\35\36\f\3\2\2\36\37\5\n\6\2\37 \5\6\4\2 \"\3\2"+
		"\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%#\3\2\2\2&"+
		"\'\7\7\2\2\'(\7\24\2\2()\7\b\2\2)*\7\24\2\2*+\7\3\2\2+\t\3\2\2\2,-\t\2"+
		"\2\2-\13\3\2\2\2.\62\5\16\b\2/\61\5\b\5\2\60/\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\r\3\2\2\2\64\62\3\2\2\2\65@\7\t\2\2\66@\7"+
		"\n\2\2\67@\7\13\2\28@\7\f\2\29@\7\r\2\2:@\7\16\2\2;@\7\17\2\2<@\7\20\2"+
		"\2=@\7\21\2\2>@\7\23\2\2?\65\3\2\2\2?\66\3\2\2\2?\67\3\2\2\2?8\3\2\2\2"+
		"?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\17\3\2\2"+
		"\2\6\27#\62?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}