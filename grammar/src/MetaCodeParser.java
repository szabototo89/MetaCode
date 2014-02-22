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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, FUNCTION=7, FOREACH=8, 
		WHILE=9, IF=10, ELSE=11, DO=12, END=13, BOOLEAN=14, SKIP=15, VAR=16, IN=17, 
		ASSIGN=18, ID=19, COMMENT=20, MULTILINE_COMMENT=21, ATTRIBUTE_ID=22, STRING=23, 
		NUMBER=24, WHITESPACE=25, NEWLINE=26;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "','", "'['", "':'", "'('", "'function'", "'foreach'", 
		"'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", "'skip'", "'var'", 
		"'in'", "'='", "ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", "STRING", 
		"NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_expression = 4, RULE_functionExpression = 5, RULE_foreachExpression = 6, 
		RULE_whileExpression = 7, RULE_blockExpression = 8, RULE_assignmentExpression = 9, 
		RULE_ifExpression = 10, RULE_parameterList = 11, RULE_parameter = 12, 
		RULE_typeName = 13, RULE_constant = 14, RULE_array = 15, RULE_attributes = 16, 
		RULE_attribute = 17;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "expression", 
		"functionExpression", "foreachExpression", "whileExpression", "blockExpression", 
		"assignmentExpression", "ifExpression", "parameterList", "parameter", 
		"typeName", "constant", "array", "attributes", "attribute"
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
			setState(36); statements();
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); statement();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 6) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << VAR) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER) | (1L << NEWLINE))) != 0) );
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
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); match(NEWLINE);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MetaCodeParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public TerminalNode VAR() { return getToken(MetaCodeParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(49);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(48); attributes();
				}
			}

			setState(51); match(VAR);
			setState(52); match(ID);
			setState(55);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(53); match(5);
				setState(54); typeName();
				}
			}

			setState(57); match(ASSIGN);
			setState(58); expression();
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode SKIP() { return getToken(MetaCodeParser.SKIP, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ForeachExpressionContext foreachExpression() {
			return getRuleContext(ForeachExpressionContext.class,0);
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
		int _la;
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(60); attributes();
					}
				}

				setState(63); constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(64); attributes();
					}
				}

				setState(67); match(SKIP);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(68); attributes();
					}
				}

				setState(71); functionExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(72); attributes();
					}
				}

				setState(75); blockExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(76); attributes();
					}
				}

				setState(79); ifExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(80); attributes();
					}
				}

				setState(83); foreachExpression();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(84); attributes();
					}
				}

				setState(87); whileExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(88); attributes();
					}
				}

				setState(91); assignmentExpression();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(92); attributes();
					}
				}

				setState(95); match(6);
				setState(96); expression();
				setState(97); match(2);
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

	public static class FunctionExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DO() { return getToken(MetaCodeParser.DO, 0); }
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(MetaCodeParser.FUNCTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionExpression);
		int _la;
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); match(FUNCTION);
				setState(103);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(102); match(ID);
					}
				}

				setState(105); match(6);
				setState(107);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(106); parameterList();
					}
				}

				setState(109); match(2);
				setState(112);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(110); match(5);
					setState(111); typeName();
					}
				}

				setState(114); match(DO);
				setState(115); statements();
				setState(116); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(FUNCTION);
				setState(120);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(119); match(ID);
					}
				}

				setState(122); match(6);
				setState(124);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(123); parameterList();
					}
				}

				setState(126); match(2);
				setState(129);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(127); match(5);
					setState(128); typeName();
					}
				}

				setState(131); match(ASSIGN);
				setState(132); expression();
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

	public static class ForeachExpressionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(MetaCodeParser.IN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VAR() { return getToken(MetaCodeParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode FOREACH() { return getToken(MetaCodeParser.FOREACH, 0); }
		public TerminalNode ID(int i) {
			return getToken(MetaCodeParser.ID, i);
		}
		public ForeachExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterForeachExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitForeachExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitForeachExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachExpressionContext foreachExpression() throws RecognitionException {
		ForeachExpressionContext _localctx = new ForeachExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_foreachExpression);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(FOREACH);
				setState(136); match(6);
				setState(137); match(ID);
				setState(138); match(IN);
				setState(139); expression();
				setState(140); match(2);
				setState(141); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); match(FOREACH);
				setState(144); match(6);
				setState(145); match(VAR);
				setState(146); match(ID);
				setState(147); match(5);
				setState(148); match(ID);
				setState(149); match(IN);
				setState(150); expression();
				setState(151); match(2);
				setState(152); expression();
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

	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MetaCodeParser.WHILE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitWhileExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitWhileExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(WHILE);
			setState(157); match(6);
			setState(158); expression();
			setState(159); match(2);
			setState(160); expression();
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DO() { return getToken(MetaCodeParser.DO, 0); }
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(DO);
			setState(163); statements();
			setState(164); match(END);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode IF() { return getToken(MetaCodeParser.IF, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MetaCodeParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(ID);
			setState(167); match(ASSIGN);
			setState(168); expression();
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(170);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(169); attributes();
					}
				}

				setState(172); match(IF);
				setState(173); match(6);
				setState(174); expression();
				setState(175); match(2);
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
		enterRule(_localctx, 20, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(IF);
			setState(180); match(6);
			setState(181); expression();
			setState(182); match(2);
			setState(183); statements();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(184); match(ELSE);
					setState(185); match(IF);
					setState(186); match(6);
					setState(187); expression();
					setState(188); match(2);
					setState(189); statements();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(198);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(196); match(ELSE);
				setState(197); statements();
				}
			}

			setState(200); match(END);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); parameter();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(203); match(3);
				setState(204); parameter();
				}
				}
				setState(209);
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

	public static class ParameterContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(210); attributes();
				}
			}

			setState(213); match(ID);
			setState(214); match(5);
			setState(215); typeName();
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

	public static class TypeNameContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(217); attributes();
				}
			}

			setState(220); match(ID);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_constant);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(224); match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225); array();
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

	public static class ArrayContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(4);
				setState(229); expression();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(230); match(3);
					setState(231); expression();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(4);
				setState(240); match(1);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243); attribute();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTRIBUTE_ID );
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

	public static class AttributeContext extends ParserRuleContext {
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode ATTRIBUTE_ID() { return getToken(MetaCodeParser.ATTRIBUTE_ID, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute);
		int _la;
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(ATTRIBUTE_ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); match(ATTRIBUTE_ID);
				setState(250); match(4);
				setState(251); constant();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(252); match(3);
					setState(253); constant();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259); match(1);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\34\u010a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\5\4\61\n\4\3\5\5"+
		"\5\64\n\5\3\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\6\5\6@\n\6\3\6\3\6\5"+
		"\6D\n\6\3\6\3\6\5\6H\n\6\3\6\3\6\5\6L\n\6\3\6\3\6\5\6P\n\6\3\6\3\6\5\6"+
		"T\n\6\3\6\3\6\5\6X\n\6\3\6\3\6\5\6\\\n\6\3\6\3\6\5\6`\n\6\3\6\3\6\3\6"+
		"\3\6\5\6f\n\6\3\7\3\7\5\7j\n\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7\5\7s\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3\7\3\7\5\7\177\n\7\3\7\3\7\3\7\5\7\u0084"+
		"\n\7\3\7\3\7\5\7\u0088\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00ad\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\f\3\f\5\f\u00c9\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\7\r\u00d0\n\r\f\r\16\r\u00d3\13\r\3\16\5\16\u00d6\n\16\3\16\3"+
		"\16\3\16\3\16\3\17\5\17\u00dd\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"\u00e5\n\20\3\21\3\21\3\21\3\21\7\21\u00eb\n\21\f\21\16\21\u00ee\13\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f4\n\21\3\22\6\22\u00f7\n\22\r\22\16\22\u00f8"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0101\n\23\f\23\16\23\u0104\13\23"+
		"\3\23\3\23\5\23\u0108\n\23\3\23\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\2\u0124\2&\3\2\2\2\4)\3\2\2\2\6\60\3\2\2\2\b\63\3\2\2\2\n"+
		"e\3\2\2\2\f\u0087\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2\22\u00a4\3"+
		"\2\2\2\24\u00a8\3\2\2\2\26\u00b5\3\2\2\2\30\u00cc\3\2\2\2\32\u00d5\3\2"+
		"\2\2\34\u00dc\3\2\2\2\36\u00e4\3\2\2\2 \u00f3\3\2\2\2\"\u00f6\3\2\2\2"+
		"$\u0107\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-\61\5\n\6\2.\61\5\b\5\2/\61\7\34\2\2\60"+
		"-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\64\5\"\22\2\63\62\3"+
		"\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\22\2\2\669\7\25\2\2\678\7\7"+
		"\2\28:\5\34\17\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\24\2\2<=\5\n\6\2"+
		"=\t\3\2\2\2>@\5\"\22\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2Af\5\36\20\2BD\5\""+
		"\22\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2Ef\7\21\2\2FH\5\"\22\2GF\3\2\2\2GH"+
		"\3\2\2\2HI\3\2\2\2If\5\f\7\2JL\5\"\22\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"Mf\5\22\n\2NP\5\"\22\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Qf\5\26\f\2RT\5\""+
		"\22\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2Uf\5\16\b\2VX\5\"\22\2WV\3\2\2\2WX"+
		"\3\2\2\2XY\3\2\2\2Yf\5\20\t\2Z\\\5\"\22\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2"+
		"\2\2]f\5\24\13\2^`\5\"\22\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\b\2\2bc"+
		"\5\n\6\2cd\7\4\2\2df\3\2\2\2e?\3\2\2\2eC\3\2\2\2eG\3\2\2\2eK\3\2\2\2e"+
		"O\3\2\2\2eS\3\2\2\2eW\3\2\2\2e[\3\2\2\2e_\3\2\2\2f\13\3\2\2\2gi\7\t\2"+
		"\2hj\7\25\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\b\2\2ln\5\30\r\2ml\3\2"+
		"\2\2mn\3\2\2\2no\3\2\2\2or\7\4\2\2pq\7\7\2\2qs\5\34\17\2rp\3\2\2\2rs\3"+
		"\2\2\2st\3\2\2\2tu\7\16\2\2uv\5\4\3\2vw\7\17\2\2w\u0088\3\2\2\2xz\7\t"+
		"\2\2y{\7\25\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\b\2\2}\177\5\30\r\2"+
		"~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\7\4\2\2\u0081\u0082"+
		"\7\7\2\2\u0082\u0084\5\34\17\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\7\24\2\2\u0086\u0088\5\n\6\2\u0087g\3"+
		"\2\2\2\u0087x\3\2\2\2\u0088\r\3\2\2\2\u0089\u008a\7\n\2\2\u008a\u008b"+
		"\7\b\2\2\u008b\u008c\7\25\2\2\u008c\u008d\7\23\2\2\u008d\u008e\5\n\6\2"+
		"\u008e\u008f\7\4\2\2\u008f\u0090\5\n\6\2\u0090\u009d\3\2\2\2\u0091\u0092"+
		"\7\n\2\2\u0092\u0093\7\b\2\2\u0093\u0094\7\22\2\2\u0094\u0095\7\25\2\2"+
		"\u0095\u0096\7\7\2\2\u0096\u0097\7\25\2\2\u0097\u0098\7\23\2\2\u0098\u0099"+
		"\5\n\6\2\u0099\u009a\7\4\2\2\u009a\u009b\5\n\6\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0089\3\2\2\2\u009c\u0091\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f\7\13\2"+
		"\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3"+
		"\5\n\6\2\u00a3\21\3\2\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00a6\5\4\3\2\u00a6"+
		"\u00a7\7\17\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7\24"+
		"\2\2\u00aa\u00b3\5\n\6\2\u00ab\u00ad\5\"\22\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\7\b"+
		"\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7\4\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00ac\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u00b6\7\f\2"+
		"\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9\7\4\2\2\u00b9\u00c3"+
		"\5\4\3\2\u00ba\u00bb\7\r\2\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\7\b\2\2\u00bd"+
		"\u00be\5\n\6\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\5\4\3\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00ba\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\r"+
		"\2\2\u00c7\u00c9\5\4\3\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7\17\2\2\u00cb\27\3\2\2\2\u00cc\u00d1\5\32"+
		"\16\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\5\32\16\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\31\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\5\"\22\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\7"+
		"\7\2\2\u00d9\u00da\5\34\17\2\u00da\33\3\2\2\2\u00db\u00dd\5\"\22\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\25"+
		"\2\2\u00df\35\3\2\2\2\u00e0\u00e5\7\32\2\2\u00e1\u00e5\7\31\2\2\u00e2"+
		"\u00e5\7\20\2\2\u00e3\u00e5\5 \21\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\37\3\2\2\2\u00e6"+
		"\u00e7\7\6\2\2\u00e7\u00ec\5\n\6\2\u00e8\u00e9\7\5\2\2\u00e9\u00eb\5\n"+
		"\6\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\3"+
		"\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f4\7\3\2\2\u00f3"+
		"\u00e6\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f7\5$\23\2"+
		"\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9#\3\2\2\2\u00fa\u0108\7\30\2\2\u00fb\u00fc\7\30\2\2\u00fc"+
		"\u00fd\7\6\2\2\u00fd\u0102\5\36\20\2\u00fe\u00ff\7\5\2\2\u00ff\u0101\5"+
		"\36\20\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\3"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u00fa\3\2\2\2\u0107\u00fb\3\2\2\2\u0108"+
		"%\3\2\2\2%+\60\639?CGKOSW[_eimrz~\u0083\u0087\u009c\u00ac\u00b3\u00c3"+
		"\u00c8\u00d1\u00d5\u00dc\u00e4\u00ec\u00f3\u00f8\u0102\u0107";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}