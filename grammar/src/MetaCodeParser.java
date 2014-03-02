// Generated from ../MetaCode.g4 by ANTLR 4.2
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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, FUNCTION=8, FOREACH=9, 
		WHILE=10, IF=11, ELSE=12, DO=13, END=14, BOOLEAN=15, SKIP=16, VAR=17, 
		IN=18, ASSIGN=19, LEFT_PARENTHESIS=20, RIGHT_PARENTHESIS=21, ID=22, COMMENT=23, 
		MULTILINE_COMMENT=24, ATTRIBUTE_ID=25, STRING=26, NUMBER=27, WHITESPACE=28, 
		NEWLINE=29;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "','", "'by'", "'['", "':'", "'..'", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'skip'", "'var'", "'in'", "'='", "'('", "')'", "ID", "COMMENT", "MULTILINE_COMMENT", 
		"ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_expression = 4, RULE_functionCallExpression = 5, RULE_functionExpression = 6, 
		RULE_foreachExpression = 7, RULE_whileExpression = 8, RULE_blockExpression = 9, 
		RULE_assignmentExpression = 10, RULE_ifExpression = 11, RULE_elseIfExpression = 12, 
		RULE_formalParameterList = 13, RULE_formalParameter = 14, RULE_actualParameterList = 15, 
		RULE_typeName = 16, RULE_constant = 17, RULE_numberConstant = 18, RULE_stringConstant = 19, 
		RULE_booleanConstant = 20, RULE_arrayConstant = 21, RULE_intervalConstant = 22, 
		RULE_attributes = 23, RULE_attribute = 24;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "expression", 
		"functionCallExpression", "functionExpression", "foreachExpression", "whileExpression", 
		"blockExpression", "assignmentExpression", "ifExpression", "elseIfExpression", 
		"formalParameterList", "formalParameter", "actualParameterList", "typeName", 
		"constant", "numberConstant", "stringConstant", "booleanConstant", "arrayConstant", 
		"intervalConstant", "attributes", "attribute"
	};

	@Override
	public String getGrammarFileName() { return "MetaCode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

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
			setState(50); statements();
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
		public StatementContext Values;
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); ((StatementsContext)_localctx).Values = statement();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << VAR) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER) | (1L << NEWLINE))) != 0) );
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
		public ExpressionContext Expression;
		public VariableDeclarationContext VariableDeclaration;
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
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); ((StatementContext)_localctx).Expression = expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); ((StatementContext)_localctx).VariableDeclaration = variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(NEWLINE);
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
		public AttributesContext Attributes;
		public Token VariableName;
		public TypeNameContext VariableType;
		public ExpressionContext VariableDefaultValue;
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
			setState(63);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(62); ((VariableDeclarationContext)_localctx).Attributes = attributes();
				}
			}

			setState(65); match(VAR);
			setState(66); ((VariableDeclarationContext)_localctx).VariableName = match(ID);
			setState(69);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(67); match(6);
				setState(68); ((VariableDeclarationContext)_localctx).VariableType = typeName();
				}
			}

			setState(71); match(ASSIGN);
			setState(72); ((VariableDeclarationContext)_localctx).VariableDefaultValue = expression();
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
		public AttributesContext Attributes;
		public ConstantContext Constant;
		public Token Skip;
		public FunctionExpressionContext Function;
		public BlockExpressionContext Block;
		public IfExpressionContext If;
		public ForeachExpressionContext Foreach;
		public WhileExpressionContext While;
		public AssignmentExpressionContext Assignment;
		public ExpressionContext InnerExpression;
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
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
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
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(74); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(77); ((ExpressionContext)_localctx).Constant = constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(78); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(81); match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(82); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(85); match(ID);
				setState(86); match(2);
				setState(87); expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(88); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(91); match(ID);
				setState(92); match(LEFT_PARENTHESIS);
				setState(94);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(93); actualParameterList();
					}
				}

				setState(96); match(RIGHT_PARENTHESIS);
				setState(99);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(97); match(2);
					setState(98); expression();
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(101); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(104); ((ExpressionContext)_localctx).Skip = match(SKIP);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(105); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(108); ((ExpressionContext)_localctx).Function = functionExpression();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(109); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(112); ((ExpressionContext)_localctx).Block = blockExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(113); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(116); ((ExpressionContext)_localctx).If = ifExpression();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(117); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(120); ((ExpressionContext)_localctx).Foreach = foreachExpression();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(122);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(121); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(124); ((ExpressionContext)_localctx).While = whileExpression();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(125); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(128); ((ExpressionContext)_localctx).Assignment = assignmentExpression();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(129); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(132); match(LEFT_PARENTHESIS);
				setState(133); ((ExpressionContext)_localctx).InnerExpression = expression();
				setState(134); match(RIGHT_PARENTHESIS);
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

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(ID);
			setState(139); match(LEFT_PARENTHESIS);
			setState(141);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(140); actualParameterList();
				}
			}

			setState(143); match(RIGHT_PARENTHESIS);
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
		public Token FunctionName;
		public FormalParameterListContext Parameters;
		public TypeNameContext ReturnType;
		public StatementsContext BodyStatements;
		public ExpressionContext BodyExpression;
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
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
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
		enterRule(_localctx, 12, RULE_functionExpression);
		int _la;
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(FUNCTION);
				setState(147);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(146); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(149); match(LEFT_PARENTHESIS);
				setState(151);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(150); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(153); match(RIGHT_PARENTHESIS);
				setState(156);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(154); match(6);
					setState(155); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(158); match(DO);
				setState(159); ((FunctionExpressionContext)_localctx).BodyStatements = statements();
				setState(160); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); match(FUNCTION);
				setState(164);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(163); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(166); match(LEFT_PARENTHESIS);
				setState(168);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(167); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(170); match(RIGHT_PARENTHESIS);
				setState(173);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(171); match(6);
					setState(172); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(175); match(ASSIGN);
				setState(176); ((FunctionExpressionContext)_localctx).BodyExpression = expression();
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
		public ExpressionContext Body;
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
		enterRule(_localctx, 14, RULE_foreachExpression);
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(FOREACH);
				setState(180); match(LEFT_PARENTHESIS);
				setState(181); match(ID);
				setState(182); match(IN);
				setState(183); expression();
				setState(184); match(RIGHT_PARENTHESIS);
				setState(185); ((ForeachExpressionContext)_localctx).Body = expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(FOREACH);
				setState(188); match(LEFT_PARENTHESIS);
				setState(189); match(VAR);
				setState(190); match(ID);
				setState(191); match(6);
				setState(192); match(ID);
				setState(193); match(IN);
				setState(194); expression();
				setState(195); match(RIGHT_PARENTHESIS);
				setState(196); ((ForeachExpressionContext)_localctx).Body = expression();
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
		public ExpressionContext ConditionExpression;
		public ExpressionContext Body;
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
		enterRule(_localctx, 16, RULE_whileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(WHILE);
			setState(201); match(LEFT_PARENTHESIS);
			setState(202); ((WhileExpressionContext)_localctx).ConditionExpression = expression();
			setState(203); match(RIGHT_PARENTHESIS);
			setState(204); ((WhileExpressionContext)_localctx).Body = expression();
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
		public StatementsContext Body;
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
		enterRule(_localctx, 18, RULE_blockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(DO);
			setState(207); ((BlockExpressionContext)_localctx).Body = statements();
			setState(208); match(END);
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
		public Token Variable;
		public ExpressionContext Value;
		public AttributesContext ConditionalAttributes;
		public ExpressionContext ConditionalExpression;
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
		enterRule(_localctx, 20, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ((AssignmentExpressionContext)_localctx).Variable = match(ID);
			setState(211); match(ASSIGN);
			setState(212); ((AssignmentExpressionContext)_localctx).Value = expression();
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(214);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(213); ((AssignmentExpressionContext)_localctx).ConditionalAttributes = attributes();
					}
				}

				setState(216); match(IF);
				setState(217); match(LEFT_PARENTHESIS);
				setState(218); ((AssignmentExpressionContext)_localctx).ConditionalExpression = expression();
				setState(219); match(RIGHT_PARENTHESIS);
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
		public ExpressionContext Condition;
		public ElseIfExpressionContext ElseIfExpressions;
		public StatementsContext ElseStatements;
		public TerminalNode IF() { return getToken(MetaCodeParser.IF, 0); }
		public List<ElseIfExpressionContext> elseIfExpression() {
			return getRuleContexts(ElseIfExpressionContext.class);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public TerminalNode ELSE() { return getToken(MetaCodeParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseIfExpressionContext elseIfExpression(int i) {
			return getRuleContext(ElseIfExpressionContext.class,i);
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
		enterRule(_localctx, 22, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(IF);
			setState(224); match(LEFT_PARENTHESIS);
			setState(225); ((IfExpressionContext)_localctx).Condition = expression();
			setState(226); match(RIGHT_PARENTHESIS);
			setState(227); statements();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(228); ((IfExpressionContext)_localctx).ElseIfExpressions = elseIfExpression();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(236);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(234); match(ELSE);
				setState(235); ((IfExpressionContext)_localctx).ElseStatements = statements();
				}
			}

			setState(238); match(END);
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

	public static class ElseIfExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MetaCodeParser.IF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MetaCodeParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseIfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterElseIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitElseIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitElseIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfExpressionContext elseIfExpression() throws RecognitionException {
		ElseIfExpressionContext _localctx = new ElseIfExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseIfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(ELSE);
			setState(241); match(IF);
			setState(242); match(LEFT_PARENTHESIS);
			setState(243); expression();
			setState(244); match(RIGHT_PARENTHESIS);
			setState(245); statements();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); formalParameter();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(248); match(3);
				setState(249); formalParameter();
				}
				}
				setState(254);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(255); attributes();
				}
			}

			setState(258); match(ID);
			setState(259); match(6);
			setState(260); typeName();
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

	public static class ActualParameterListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); expression();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(263); match(3);
				setState(264); expression();
				}
				}
				setState(269);
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
		enterRule(_localctx, 32, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(270); attributes();
				}
			}

			setState(273); match(ID);
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
		public NumberConstantContext Number;
		public StringConstantContext String;
		public BooleanConstantContext Boolean;
		public ArrayConstantContext Array;
		public IntervalConstantContext Interval;
		public NumberConstantContext numberConstant() {
			return getRuleContext(NumberConstantContext.class,0);
		}
		public ArrayConstantContext arrayConstant() {
			return getRuleContext(ArrayConstantContext.class,0);
		}
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public IntervalConstantContext intervalConstant() {
			return getRuleContext(IntervalConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
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
		enterRule(_localctx, 34, RULE_constant);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); ((ConstantContext)_localctx).Number = numberConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); ((ConstantContext)_localctx).String = stringConstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277); ((ConstantContext)_localctx).Boolean = booleanConstant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); ((ConstantContext)_localctx).Array = arrayConstant();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279); ((ConstantContext)_localctx).Interval = intervalConstant();
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

	public static class NumberConstantContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MetaCodeParser.NUMBER, 0); }
		public NumberConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterNumberConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitNumberConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitNumberConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberConstantContext numberConstant() throws RecognitionException {
		NumberConstantContext _localctx = new NumberConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(NUMBER);
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MetaCodeParser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(STRING);
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

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MetaCodeParser.BOOLEAN, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(BOOLEAN);
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

	public static class ArrayConstantContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterArrayConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitArrayConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitArrayConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayConstantContext arrayConstant() throws RecognitionException {
		ArrayConstantContext _localctx = new ArrayConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayConstant);
		int _la;
		try {
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); match(5);
				setState(289); expression();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(290); match(3);
					setState(291); expression();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); match(5);
				setState(300); match(1);
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

	public static class IntervalConstantContext extends ParserRuleContext {
		public Token Start;
		public Token End;
		public Token By;
		public TerminalNode NUMBER(int i) {
			return getToken(MetaCodeParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MetaCodeParser.NUMBER); }
		public IntervalConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterIntervalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitIntervalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitIntervalConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalConstantContext intervalConstant() throws RecognitionException {
		IntervalConstantContext _localctx = new IntervalConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intervalConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); ((IntervalConstantContext)_localctx).Start = match(NUMBER);
			setState(304); match(7);
			setState(305); ((IntervalConstantContext)_localctx).End = match(NUMBER);
			{
			setState(306); match(4);
			setState(307); ((IntervalConstantContext)_localctx).By = match(NUMBER);
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
		enterRule(_localctx, 46, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309); attribute();
				}
				}
				setState(312); 
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
		public Token Name;
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
		enterRule(_localctx, 48, RULE_attribute);
		int _la;
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
				setState(316); match(5);
				setState(317); constant();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(318); match(3);
					setState(319); constant();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325); match(1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u014c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\4\3\4\3\4\5\4?\n\4\3\5\5\5"+
		"B\n\5\3\5\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\6\5\6N\n\6\3\6\3\6\5\6R\n"+
		"\6\3\6\3\6\5\6V\n\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\5\6a\n\6\3\6"+
		"\3\6\3\6\5\6f\n\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6\3\6\5\6q\n\6\3\6\3"+
		"\6\5\6u\n\6\3\6\3\6\5\6y\n\6\3\6\3\6\5\6}\n\6\3\6\3\6\5\6\u0081\n\6\3"+
		"\6\3\6\5\6\u0085\n\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\7\5\7\u0090"+
		"\n\7\3\7\3\7\3\b\3\b\5\b\u0096\n\b\3\b\3\b\5\b\u009a\n\b\3\b\3\b\3\b\5"+
		"\b\u009f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\b\3\b\5\b\u00ab\n"+
		"\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\5\b\u00b4\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00d9"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e8"+
		"\n\r\f\r\16\r\u00eb\13\r\3\r\3\r\5\r\u00ef\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00fd\n\17\f\17\16\17\u0100\13"+
		"\17\3\20\5\20\u0103\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u010c"+
		"\n\21\f\21\16\21\u010f\13\21\3\22\5\22\u0112\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u011b\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\7\27\u0127\n\27\f\27\16\27\u012a\13\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0130\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u0139\n\31\r"+
		"\31\16\31\u013a\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0143\n\32\f\32\16"+
		"\32\u0146\13\32\3\32\3\32\5\32\u014a\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\u016a\2\64\3\2\2\2\4\67\3\2\2"+
		"\2\6>\3\2\2\2\bA\3\2\2\2\n\u008a\3\2\2\2\f\u008c\3\2\2\2\16\u00b3\3\2"+
		"\2\2\20\u00c8\3\2\2\2\22\u00ca\3\2\2\2\24\u00d0\3\2\2\2\26\u00d4\3\2\2"+
		"\2\30\u00e1\3\2\2\2\32\u00f2\3\2\2\2\34\u00f9\3\2\2\2\36\u0102\3\2\2\2"+
		" \u0108\3\2\2\2\"\u0111\3\2\2\2$\u011a\3\2\2\2&\u011c\3\2\2\2(\u011e\3"+
		"\2\2\2*\u0120\3\2\2\2,\u012f\3\2\2\2.\u0131\3\2\2\2\60\u0138\3\2\2\2\62"+
		"\u0149\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\668\5\6\4\2\67\66\3\2\2\289"+
		"\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;?\5\n\6\2<?\5\b\5\2=?\7\37\2"+
		"\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@B\5\60\31\2A@\3\2\2\2AB\3"+
		"\2\2\2BC\3\2\2\2CD\7\23\2\2DG\7\30\2\2EF\7\b\2\2FH\5\"\22\2GE\3\2\2\2"+
		"GH\3\2\2\2HI\3\2\2\2IJ\7\25\2\2JK\5\n\6\2K\t\3\2\2\2LN\5\60\31\2ML\3\2"+
		"\2\2MN\3\2\2\2NO\3\2\2\2O\u008b\5$\23\2PR\5\60\31\2QP\3\2\2\2QR\3\2\2"+
		"\2RS\3\2\2\2S\u008b\7\30\2\2TV\5\60\31\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2"+
		"WX\7\30\2\2XY\7\4\2\2Y\u008b\5\n\6\2Z\\\5\60\31\2[Z\3\2\2\2[\\\3\2\2\2"+
		"\\]\3\2\2\2]^\7\30\2\2^`\7\26\2\2_a\5 \21\2`_\3\2\2\2`a\3\2\2\2ab\3\2"+
		"\2\2be\7\27\2\2cd\7\4\2\2df\5\n\6\2ec\3\2\2\2ef\3\2\2\2f\u008b\3\2\2\2"+
		"gi\5\60\31\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2j\u008b\7\22\2\2km\5\60\31\2"+
		"lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2n\u008b\5\16\b\2oq\5\60\31\2po\3\2\2\2p"+
		"q\3\2\2\2qr\3\2\2\2r\u008b\5\24\13\2su\5\60\31\2ts\3\2\2\2tu\3\2\2\2u"+
		"v\3\2\2\2v\u008b\5\30\r\2wy\5\60\31\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z\u008b"+
		"\5\20\t\2{}\5\60\31\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u008b\5\22\n\2\177"+
		"\u0081\5\60\31\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u008b\5\26\f\2\u0083\u0085\5\60\31\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u0088\5"+
		"\n\6\2\u0088\u0089\7\27\2\2\u0089\u008b\3\2\2\2\u008aM\3\2\2\2\u008aQ"+
		"\3\2\2\2\u008aU\3\2\2\2\u008a[\3\2\2\2\u008ah\3\2\2\2\u008al\3\2\2\2\u008a"+
		"p\3\2\2\2\u008at\3\2\2\2\u008ax\3\2\2\2\u008a|\3\2\2\2\u008a\u0080\3\2"+
		"\2\2\u008a\u0084\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d\7\30\2\2\u008d\u008f"+
		"\7\26\2\2\u008e\u0090\5 \21\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\7\27\2\2\u0092\r\3\2\2\2\u0093\u0095"+
		"\7\n\2\2\u0094\u0096\7\30\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0099\7\26\2\2\u0098\u009a\5\34\17\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\7\27"+
		"\2\2\u009c\u009d\7\b\2\2\u009d\u009f\5\"\22\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00a2\5"+
		"\4\3\2\u00a2\u00a3\7\20\2\2\u00a3\u00b4\3\2\2\2\u00a4\u00a6\7\n\2\2\u00a5"+
		"\u00a7\7\30\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00aa\7\26\2\2\u00a9\u00ab\5\34\17\2\u00aa\u00a9\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\7\27\2\2\u00ad\u00ae"+
		"\7\b\2\2\u00ae\u00b0\5\"\22\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b4\5\n\6\2\u00b3\u0093"+
		"\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6"+
		"\u00b7\7\26\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba"+
		"\5\n\6\2\u00ba\u00bb\7\27\2\2\u00bb\u00bc\5\n\6\2\u00bc\u00c9\3\2\2\2"+
		"\u00bd\u00be\7\13\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\7\23\2\2\u00c0"+
		"\u00c1\7\30\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4\7"+
		"\24\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\5\n\6\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00b5\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c9\21\3\2\2"+
		"\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\5\n\6\2\u00cd"+
		"\u00ce\7\27\2\2\u00ce\u00cf\5\n\6\2\u00cf\23\3\2\2\2\u00d0\u00d1\7\17"+
		"\2\2\u00d1\u00d2\5\4\3\2\u00d2\u00d3\7\20\2\2\u00d3\25\3\2\2\2\u00d4\u00d5"+
		"\7\30\2\2\u00d5\u00d6\7\25\2\2\u00d6\u00df\5\n\6\2\u00d7\u00d9\5\60\31"+
		"\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\7\r\2\2\u00db\u00dc\7\26\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00de\7\27\2\2"+
		"\u00de\u00e0\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\27"+
		"\3\2\2\2\u00e1\u00e2\7\r\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00e4\5\n\6\2"+
		"\u00e4\u00e5\7\27\2\2\u00e5\u00e9\5\4\3\2\u00e6\u00e8\5\32\16\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\16\2\2\u00ed"+
		"\u00ef\5\4\3\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\20\2\2\u00f1\31\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3"+
		"\u00f4\7\r\2\2\u00f4\u00f5\7\26\2\2\u00f5\u00f6\5\n\6\2\u00f6\u00f7\7"+
		"\27\2\2\u00f7\u00f8\5\4\3\2\u00f8\33\3\2\2\2\u00f9\u00fe\5\36\20\2\u00fa"+
		"\u00fb\7\5\2\2\u00fb\u00fd\5\36\20\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\35\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0103\5\60\31\2\u0102\u0101\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\30\2\2\u0105\u0106\7\b\2\2\u0106"+
		"\u0107\5\"\22\2\u0107\37\3\2\2\2\u0108\u010d\5\n\6\2\u0109\u010a\7\5\2"+
		"\2\u010a\u010c\5\n\6\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e!\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0112\5\60\31\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113\u0114\7\30\2\2\u0114#\3\2\2\2\u0115\u011b\5&\24\2\u0116\u011b"+
		"\5(\25\2\u0117\u011b\5*\26\2\u0118\u011b\5,\27\2\u0119\u011b\5.\30\2\u011a"+
		"\u0115\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u0119\3\2\2\2\u011b%\3\2\2\2\u011c\u011d\7\35\2\2\u011d\'\3"+
		"\2\2\2\u011e\u011f\7\34\2\2\u011f)\3\2\2\2\u0120\u0121\7\21\2\2\u0121"+
		"+\3\2\2\2\u0122\u0123\7\7\2\2\u0123\u0128\5\n\6\2\u0124\u0125\7\5\2\2"+
		"\u0125\u0127\5\n\6\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\7\3\2\2\u012c\u0130\3\2\2\2\u012d\u012e\7\7\2\2\u012e\u0130\7\3"+
		"\2\2\u012f\u0122\3\2\2\2\u012f\u012d\3\2\2\2\u0130-\3\2\2\2\u0131\u0132"+
		"\7\35\2\2\u0132\u0133\7\t\2\2\u0133\u0134\7\35\2\2\u0134\u0135\7\6\2\2"+
		"\u0135\u0136\7\35\2\2\u0136/\3\2\2\2\u0137\u0139\5\62\32\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\61\3\2\2\2\u013c\u014a\7\33\2\2\u013d\u013e\7\33\2\2\u013e\u013f\7\7"+
		"\2\2\u013f\u0144\5$\23\2\u0140\u0141\7\5\2\2\u0141\u0143\5$\23\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\3\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u013c\3\2\2\2\u0149\u013d\3\2\2\2\u014a\63\3\2\2"+
		"\2,9>AGMQU[`ehlptx|\u0080\u0084\u008a\u008f\u0095\u0099\u009e\u00a6\u00aa"+
		"\u00af\u00b3\u00c8\u00d8\u00df\u00e9\u00ee\u00fe\u0102\u010d\u0111\u011a"+
		"\u0128\u012f\u013a\u0144\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}