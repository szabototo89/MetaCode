// Generated from ../MetaCode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaCodeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, IF=4, ELSE=5, END=6, BOOLEAN=7, VAR=8, ASSIGN=9, 
		ID=10, ATTRIBUTE_ID=11, STRING=12, NUMBER=13, WHITESPACE=14, NEWLINE=15;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "':'", "'('", "'if'", "'else'", "'end'", "BOOLEAN", 
		"'var'", "'='", "ID", "ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", 
		"NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_expression = 4, RULE_assignExpression = 5, RULE_ifExpression = 6, 
		RULE_constant = 7;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "expression", 
		"assignExpression", "ifExpression", "constant"
	};

	@Override
	public String getGrammarFileName() { return "MetaCode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << IF) | (1L << BOOLEAN) | (1L << VAR) | (1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << NEWLINE))) != 0) );
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
		public TerminalNode NEWLINE() { return getToken(MetaCodeParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); match(NEWLINE);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MetaCodeParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public TerminalNode VAR() { return getToken(MetaCodeParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(MetaCodeParser.ID, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(28); match(ID);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(VAR);
			setState(35); match(ID);
			setState(38);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(36); match(2);
				setState(37); match(ID);
				}
			}

			setState(40); match(ASSIGN);
			setState(41); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); constant();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); ifExpression();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); assignExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); match(3);
				setState(47); expression();
				setState(48); match(1);
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MetaCodeParser.IF, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MetaCodeParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(MetaCodeParser.ID, i);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(52); match(ID);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(58); match(ID);
			setState(59); match(ASSIGN);
			setState(60); expression();
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(61); match(IF);
				setState(62); match(3);
				setState(63); expression();
				setState(64); match(1);
				}
				break;
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode ELSE(int i) {
			return getToken(MetaCodeParser.ELSE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(MetaCodeParser.IF); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public List<TerminalNode> ELSE() { return getTokens(MetaCodeParser.ELSE); }
		public TerminalNode IF(int i) {
			return getToken(MetaCodeParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(IF);
			setState(69); match(3);
			setState(70); expression();
			setState(71); match(1);
			setState(72); statements();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(73); match(ELSE);
					setState(74); match(IF);
					setState(75); match(3);
					setState(76); expression();
					setState(77); match(1);
					setState(78); statements();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(87);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(85); match(ELSE);
				setState(86); statements();
				}
			}

			setState(89); match(END);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MetaCodeParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(MetaCodeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MetaCodeParser.STRING, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\21`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\6\3\26"+
		"\n\3\r\3\16\3\27\3\4\3\4\3\4\5\4\35\n\4\3\5\7\5 \n\5\f\5\16\5#\13\5\3"+
		"\5\3\5\3\5\3\5\5\5)\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65"+
		"\n\6\3\7\7\78\n\7\f\7\16\7;\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bS\n\b\f\b\16\b"+
		"V\13\b\3\b\3\b\5\bZ\n\b\3\b\3\b\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\3"+
		"\4\2\t\t\16\17c\2\22\3\2\2\2\4\25\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n\64"+
		"\3\2\2\2\f9\3\2\2\2\16F\3\2\2\2\20]\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2"+
		"\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2"+
		"\30\5\3\2\2\2\31\35\5\n\6\2\32\35\5\b\5\2\33\35\7\21\2\2\34\31\3\2\2\2"+
		"\34\32\3\2\2\2\34\33\3\2\2\2\35\7\3\2\2\2\36 \7\f\2\2\37\36\3\2\2\2 #"+
		"\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\n\2\2%(\7\f\2"+
		"\2&\'\7\4\2\2\')\7\f\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\13\2\2+,\5"+
		"\n\6\2,\t\3\2\2\2-\65\5\20\t\2.\65\5\16\b\2/\65\5\f\7\2\60\61\7\5\2\2"+
		"\61\62\5\n\6\2\62\63\7\3\2\2\63\65\3\2\2\2\64-\3\2\2\2\64.\3\2\2\2\64"+
		"/\3\2\2\2\64\60\3\2\2\2\65\13\3\2\2\2\668\7\f\2\2\67\66\3\2\2\28;\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\f\2\2=>\7\13\2\2>D"+
		"\5\n\6\2?@\7\6\2\2@A\7\5\2\2AB\5\n\6\2BC\7\3\2\2CE\3\2\2\2D?\3\2\2\2D"+
		"E\3\2\2\2E\r\3\2\2\2FG\7\6\2\2GH\7\5\2\2HI\5\n\6\2IJ\7\3\2\2JT\5\4\3\2"+
		"KL\7\7\2\2LM\7\6\2\2MN\7\5\2\2NO\5\n\6\2OP\7\3\2\2PQ\5\4\3\2QS\3\2\2\2"+
		"RK\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2\2\2VT\3\2\2\2WX\7\7\2\2"+
		"XZ\5\4\3\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\b\2\2\\\17\3\2\2\2]^\t\2"+
		"\2\2^\21\3\2\2\2\13\27\34!(\649DTY";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}