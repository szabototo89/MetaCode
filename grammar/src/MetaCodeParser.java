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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, FUNCTION=21, FOREACH=22, WHILE=23, 
		IF=24, ELSE=25, DO=26, END=27, BOOLEAN=28, IMPLICIT=29, EXPLICIT=30, MACRO=31, 
		SKIP=32, VAR=33, IN=34, ASSIGN=35, AND=36, OR=37, NOT=38, NULL=39, RETURN=40, 
		LEFT_PARENTHESIS=41, RIGHT_PARENTHESIS=42, ID=43, COMMENT=44, MULTILINE_COMMENT=45, 
		TREE_SELECTOR=46, ATTRIBUTE_ID=47, STRING=48, NUMBER=49, WHITESPACE=50, 
		NEWLINE=51;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "','", "'+'", "'*'", "'-'", "'attribute'", 
		"'['", "':'", "'<'", "'object'", "'!='", "';'", "'<='", "'to'", "'>'", 
		"'by'", "'/'", "'=='", "'>='", "'function'", "'foreach'", "'while'", "'if'", 
		"'else'", "'do'", "'end'", "BOOLEAN", "'implicit'", "'explicit'", "'macro'", 
		"'skip'", "'var'", "'in'", "'='", "'and'", "'or'", "'not'", "'null'", 
		"'return'", "'('", "')'", "ID", "COMMENT", "MULTILINE_COMMENT", "TREE_SELECTOR", 
		"ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_attributeDeclaration = 4, RULE_objectDeclaration = 5, RULE_expression = 6, 
		RULE_functionCallExpression = 7, RULE_macroCallExpression = 8, RULE_memberExpression = 9, 
		RULE_memberTagExpression = 10, RULE_primaryExpression = 11, RULE_functionStatement = 12, 
		RULE_macroStatement = 13, RULE_foreachStatement = 14, RULE_whileStatement = 15, 
		RULE_blockStatement = 16, RULE_skipStatement = 17, RULE_returnStatement = 18, 
		RULE_assignmentExpression = 19, RULE_ifStatement = 20, RULE_elseIfStatement = 21, 
		RULE_formalParameter = 22, RULE_actualParameterList = 23, RULE_typeName = 24, 
		RULE_constant = 25, RULE_identifier = 26, RULE_numberConstant = 27, RULE_stringConstant = 28, 
		RULE_booleanConstant = 29, RULE_arrayConstant = 30, RULE_intervalConstant = 31, 
		RULE_attributes = 32, RULE_attribute = 33;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "attributeDeclaration", 
		"objectDeclaration", "expression", "functionCallExpression", "macroCallExpression", 
		"memberExpression", "memberTagExpression", "primaryExpression", "functionStatement", 
		"macroStatement", "foreachStatement", "whileStatement", "blockStatement", 
		"skipStatement", "returnStatement", "assignmentExpression", "ifStatement", 
		"elseIfStatement", "formalParameter", "actualParameterList", "typeName", 
		"constant", "identifier", "numberConstant", "stringConstant", "booleanConstant", 
		"arrayConstant", "intervalConstant", "attributes", "attribute"
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
			setState(68); statements();
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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70); statement();
				setState(71); match(13);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << 11) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << IMPLICIT) | (1L << EXPLICIT) | (1L << MACRO) | (1L << SKIP) | (1L << VAR) | (1L << NOT) | (1L << NULL) | (1L << RETURN) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << TREE_SELECTOR) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0) );
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
		public ReturnStatementContext Return;
		public AttributesContext Attributes;
		public FunctionStatementContext FunctionDeclaration;
		public MacroStatementContext MacroDeclaration;
		public VariableDeclarationContext VariableDeclaration;
		public ObjectDeclarationContext ObjectDeclaration;
		public AttributeDeclarationContext AttributeDeclaration;
		public IfStatementContext If;
		public BlockStatementContext Block;
		public ForeachStatementContext Foreach;
		public WhileStatementContext While;
		public SkipStatementContext Skip;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public MacroStatementContext macroStatement() {
			return getRuleContext(MacroStatementContext.class,0);
		}
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public SkipStatementContext skipStatement() {
			return getRuleContext(SkipStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
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
		int _la;
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); ((StatementContext)_localctx).Expression = expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); ((StatementContext)_localctx).Return = returnStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(79); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(82); ((StatementContext)_localctx).FunctionDeclaration = functionStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(83); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(86); ((StatementContext)_localctx).MacroDeclaration = macroStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(87); ((StatementContext)_localctx).Attributes = attributes();
					}
					break;
				}
				setState(90); ((StatementContext)_localctx).VariableDeclaration = variableDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(91); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(94); ((StatementContext)_localctx).ObjectDeclaration = objectDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(95); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(98); ((StatementContext)_localctx).AttributeDeclaration = attributeDeclaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(99); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(102); ((StatementContext)_localctx).If = ifStatement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(103); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(106); ((StatementContext)_localctx).Block = blockStatement();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(107); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(110); ((StatementContext)_localctx).Foreach = foreachStatement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(111); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(114); ((StatementContext)_localctx).While = whileStatement();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(116);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(115); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(118); ((StatementContext)_localctx).Skip = skipStatement();
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
			setState(122);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(121); ((VariableDeclarationContext)_localctx).Attributes = attributes();
				}
			}

			setState(124); match(VAR);
			setState(125); ((VariableDeclarationContext)_localctx).VariableName = match(ID);
			setState(128);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(126); match(9);
				setState(127); ((VariableDeclarationContext)_localctx).VariableType = typeName();
				}
			}

			setState(130); match(ASSIGN);
			setState(131); ((VariableDeclarationContext)_localctx).VariableDefaultValue = expression(0);
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

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public TerminalNode ATTRIBUTE_ID() { return getToken(MetaCodeParser.ATTRIBUTE_ID, 0); }
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(7);
			setState(134); match(ATTRIBUTE_ID);
			setState(146);
			_la = _input.LA(1);
			if (_la==LEFT_PARENTHESIS) {
				{
				setState(135); match(LEFT_PARENTHESIS);
				setState(136); formalParameter();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(137); match(3);
					setState(138); formalParameter();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144); match(RIGHT_PARENTHESIS);
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(11);
			setState(149); match(ID);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150); formalParameter();
				setState(151); match(13);
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==ATTRIBUTE_ID );
			setState(157); match(END);
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
		public ExpressionContext Left;
		public Token Operator;
		public ExpressionContext Expression;
		public PrimaryExpressionContext PrimaryExpression;
		public FunctionCallExpressionContext FunctionCallExpression;
		public MacroCallExpressionContext MacroCallExpression;
		public MemberExpressionContext MemberExpression;
		public ExpressionContext Right;
		public MacroCallExpressionContext macroCallExpression() {
			return getRuleContext(MacroCallExpressionContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MetaCodeParser.AND, 0); }
		public TerminalNode OR() { return getToken(MetaCodeParser.OR, 0); }
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MetaCodeParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(160); ((ExpressionContext)_localctx).Operator = match(NOT);
				setState(161); ((ExpressionContext)_localctx).Expression = expression(13);
				}
				break;

			case 2:
				{
				setState(162); ((ExpressionContext)_localctx).PrimaryExpression = primaryExpression();
				}
				break;

			case 3:
				{
				setState(163); ((ExpressionContext)_localctx).FunctionCallExpression = functionCallExpression();
				}
				break;

			case 4:
				{
				setState(164); ((ExpressionContext)_localctx).MacroCallExpression = macroCallExpression();
				}
				break;

			case 5:
				{
				setState(165); ((ExpressionContext)_localctx).MemberExpression = memberExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(169); ((ExpressionContext)_localctx).Operator = match(4);
						setState(170); ((ExpressionContext)_localctx).Right = expression(13);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(172); ((ExpressionContext)_localctx).Operator = match(6);
						setState(173); ((ExpressionContext)_localctx).Right = expression(12);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(175); ((ExpressionContext)_localctx).Operator = match(5);
						setState(176); ((ExpressionContext)_localctx).Right = expression(11);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(178); ((ExpressionContext)_localctx).Operator = match(18);
						setState(179); ((ExpressionContext)_localctx).Right = expression(10);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181); ((ExpressionContext)_localctx).Operator = match(10);
						setState(182); ((ExpressionContext)_localctx).Right = expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184); ((ExpressionContext)_localctx).Operator = match(16);
						setState(185); ((ExpressionContext)_localctx).Right = expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187); ((ExpressionContext)_localctx).Operator = match(14);
						setState(188); ((ExpressionContext)_localctx).Right = expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190); ((ExpressionContext)_localctx).Operator = match(20);
						setState(191); ((ExpressionContext)_localctx).Right = expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193); ((ExpressionContext)_localctx).Operator = match(19);
						setState(194); ((ExpressionContext)_localctx).Right = expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196); ((ExpressionContext)_localctx).Operator = match(12);
						setState(197); ((ExpressionContext)_localctx).Right = expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(199); ((ExpressionContext)_localctx).Operator = match(AND);
						setState(200); ((ExpressionContext)_localctx).Right = expression(3);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(202); ((ExpressionContext)_localctx).Operator = match(OR);
						setState(203); ((ExpressionContext)_localctx).Right = expression(2);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		enterRule(_localctx, 14, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); primaryExpression();
			setState(210); match(LEFT_PARENTHESIS);
			setState(212);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << BOOLEAN) | (1L << MACRO) | (1L << NOT) | (1L << NULL) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << TREE_SELECTOR) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(211); expression(0);
				}
			}

			setState(214); match(RIGHT_PARENTHESIS);
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

	public static class MacroCallExpressionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode MACRO() { return getToken(MetaCodeParser.MACRO, 0); }
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public MacroCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterMacroCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitMacroCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitMacroCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroCallExpressionContext macroCallExpression() throws RecognitionException {
		MacroCallExpressionContext _localctx = new MacroCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_macroCallExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(MACRO);
			setState(217); match(ID);
			setState(218); match(LEFT_PARENTHESIS);
			setState(219); statement();
			setState(220); match(RIGHT_PARENTHESIS);
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

	public static class MemberExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MetaCodeParser.ID, i);
		}
		public MemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberExpressionContext memberExpression() throws RecognitionException {
		MemberExpressionContext _localctx = new MemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_memberExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(ID);
			setState(225); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(223); match(2);
					setState(224); match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class MemberTagExpressionContext extends ParserRuleContext {
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberTagExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberTagExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterMemberTagExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitMemberTagExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitMemberTagExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberTagExpressionContext memberTagExpression() throws RecognitionException {
		MemberTagExpressionContext _localctx = new MemberTagExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_memberTagExpression);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); functionCallExpression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public AttributesContext Attributes;
		public ConstantContext Constant;
		public Token Id;
		public AssignmentExpressionContext Assignment;
		public ExpressionContext InnerExpression;
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primaryExpression);
		int _la;
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(233); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(236); ((PrimaryExpressionContext)_localctx).Constant = constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(237); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(240); ((PrimaryExpressionContext)_localctx).Id = match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(241); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(244); ((PrimaryExpressionContext)_localctx).Assignment = assignmentExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(245); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(248); match(LEFT_PARENTHESIS);
				setState(249); ((PrimaryExpressionContext)_localctx).InnerExpression = expression(0);
				setState(250); match(RIGHT_PARENTHESIS);
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public Token FunctionName;
		public FormalParameterContext Parameter;
		public TypeNameContext ReturnType;
		public StatementsContext BodyStatements;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DO() { return getToken(MetaCodeParser.DO, 0); }
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(MetaCodeParser.FUNCTION, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(FUNCTION);
			setState(255); ((FunctionStatementContext)_localctx).FunctionName = match(ID);
			setState(256); match(LEFT_PARENTHESIS);
			setState(257); ((FunctionStatementContext)_localctx).Parameter = formalParameter();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(258); match(3);
				setState(259); ((FunctionStatementContext)_localctx).Parameter = formalParameter();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265); match(RIGHT_PARENTHESIS);
			setState(268);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(266); match(9);
				setState(267); ((FunctionStatementContext)_localctx).ReturnType = typeName();
				}
			}

			setState(270); match(DO);
			setState(271); ((FunctionStatementContext)_localctx).BodyStatements = statements();
			setState(272); match(END);
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

	public static class MacroStatementContext extends ParserRuleContext {
		public Token Type;
		public Token MacroName;
		public Token Identifier;
		public Token Selector;
		public StatementsContext BodyStatements;
		public TerminalNode MACRO() { return getToken(MetaCodeParser.MACRO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode TREE_SELECTOR() { return getToken(MetaCodeParser.TREE_SELECTOR, 0); }
		public TerminalNode DO() { return getToken(MetaCodeParser.DO, 0); }
		public TerminalNode IMPLICIT() { return getToken(MetaCodeParser.IMPLICIT, 0); }
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public TerminalNode EXPLICIT() { return getToken(MetaCodeParser.EXPLICIT, 0); }
		public TerminalNode ID(int i) {
			return getToken(MetaCodeParser.ID, i);
		}
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public MacroStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterMacroStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitMacroStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitMacroStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroStatementContext macroStatement() throws RecognitionException {
		MacroStatementContext _localctx = new MacroStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_macroStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			switch (_input.LA(1)) {
			case IMPLICIT:
				{
				setState(274); ((MacroStatementContext)_localctx).Type = match(IMPLICIT);
				}
				break;
			case EXPLICIT:
				{
				setState(275); ((MacroStatementContext)_localctx).Type = match(EXPLICIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278); match(MACRO);
			setState(279); ((MacroStatementContext)_localctx).MacroName = match(ID);
			setState(280); match(LEFT_PARENTHESIS);
			setState(281); ((MacroStatementContext)_localctx).Identifier = match(ID);
			setState(282); match(9);
			setState(283); ((MacroStatementContext)_localctx).Selector = match(TREE_SELECTOR);
			setState(284); match(RIGHT_PARENTHESIS);
			setState(285); match(DO);
			setState(286); ((MacroStatementContext)_localctx).BodyStatements = statements();
			setState(287); match(END);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public Token Var;
		public Token Id;
		public TypeNameContext VariableType;
		public ExpressionContext ArrayExpression;
		public StatementContext Body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MetaCodeParser.IN, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MetaCodeParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FOREACH() { return getToken(MetaCodeParser.FOREACH, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(FOREACH);
			setState(290); match(LEFT_PARENTHESIS);
			setState(292);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(291); ((ForeachStatementContext)_localctx).Var = match(VAR);
				}
			}

			setState(294); ((ForeachStatementContext)_localctx).Id = match(ID);
			setState(297);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(295); match(9);
				setState(296); ((ForeachStatementContext)_localctx).VariableType = typeName();
				}
			}

			setState(299); match(IN);
			setState(300); ((ForeachStatementContext)_localctx).ArrayExpression = expression(0);
			setState(301); match(RIGHT_PARENTHESIS);
			setState(302); ((ForeachStatementContext)_localctx).Body = statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext ConditionExpression;
		public StatementContext Body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MetaCodeParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(WHILE);
			setState(305); match(LEFT_PARENTHESIS);
			setState(306); ((WhileStatementContext)_localctx).ConditionExpression = expression(0);
			setState(307); match(RIGHT_PARENTHESIS);
			setState(308); ((WhileStatementContext)_localctx).Body = statement();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementsContext Body;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DO() { return getToken(MetaCodeParser.DO, 0); }
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(DO);
			setState(311); ((BlockStatementContext)_localctx).Body = statements();
			setState(312); match(END);
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

	public static class SkipStatementContext extends ParserRuleContext {
		public TerminalNode SKIP() { return getToken(MetaCodeParser.SKIP, 0); }
		public SkipStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterSkipStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitSkipStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitSkipStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipStatementContext skipStatement() throws RecognitionException {
		SkipStatementContext _localctx = new SkipStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_skipStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(SKIP);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext ReturnExpression;
		public TerminalNode RETURN() { return getToken(MetaCodeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(RETURN);
			setState(317); ((ReturnStatementContext)_localctx).ReturnExpression = expression(0);
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
		enterRule(_localctx, 38, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); ((AssignmentExpressionContext)_localctx).Variable = match(ID);
			setState(320); match(ASSIGN);
			setState(321); ((AssignmentExpressionContext)_localctx).Value = expression(0);
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(323);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(322); ((AssignmentExpressionContext)_localctx).ConditionalAttributes = attributes();
					}
				}

				setState(325); match(IF);
				setState(326); match(LEFT_PARENTHESIS);
				setState(327); ((AssignmentExpressionContext)_localctx).ConditionalExpression = expression(0);
				setState(328); match(RIGHT_PARENTHESIS);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext Condition;
		public StatementsContext Statements;
		public ElseIfStatementContext ElseIfStatements;
		public StatementsContext ElseStatements;
		public TerminalNode IF() { return getToken(MetaCodeParser.IF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MetaCodeParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public TerminalNode END() { return getToken(MetaCodeParser.END, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(IF);
			setState(333); match(LEFT_PARENTHESIS);
			setState(334); ((IfStatementContext)_localctx).Condition = expression(0);
			setState(335); match(RIGHT_PARENTHESIS);
			setState(336); ((IfStatementContext)_localctx).Statements = statements();
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(337); ((IfStatementContext)_localctx).ElseIfStatements = elseIfStatement();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(345);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(343); match(ELSE);
				setState(344); ((IfStatementContext)_localctx).ElseStatements = statements();
				}
			}

			setState(347); match(END);
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public ExpressionContext Condition;
		public StatementsContext Statements;
		public TerminalNode IF() { return getToken(MetaCodeParser.IF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MetaCodeParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(ELSE);
			setState(350); match(IF);
			setState(351); match(LEFT_PARENTHESIS);
			setState(352); ((ElseIfStatementContext)_localctx).Condition = expression(0);
			setState(353); match(RIGHT_PARENTHESIS);
			setState(354); ((ElseIfStatementContext)_localctx).Statements = statements();
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
		public AttributesContext Attributes;
		public Token Name;
		public TypeNameContext Type;
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
		enterRule(_localctx, 44, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(356); ((FormalParameterContext)_localctx).Attributes = attributes();
				}
			}

			setState(359); ((FormalParameterContext)_localctx).Name = match(ID);
			setState(360); match(9);
			setState(361); ((FormalParameterContext)_localctx).Type = typeName();
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
		enterRule(_localctx, 46, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); expression(0);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(364); match(3);
				setState(365); expression(0);
				}
				}
				setState(370);
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
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MetaCodeParser.ID, i);
		}
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
		enterRule(_localctx, 48, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(371); attributes();
				}
			}

			setState(374); match(ID);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(375); match(2);
				setState(376); match(ID);
				}
				}
				setState(381);
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

	public static class ConstantContext extends ParserRuleContext {
		public NumberConstantContext Number;
		public StringConstantContext String;
		public BooleanConstantContext Boolean;
		public ArrayConstantContext Array;
		public IntervalConstantContext Interval;
		public Token Null;
		public Token TreeSelector;
		public NumberConstantContext numberConstant() {
			return getRuleContext(NumberConstantContext.class,0);
		}
		public TerminalNode TREE_SELECTOR() { return getToken(MetaCodeParser.TREE_SELECTOR, 0); }
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
		public TerminalNode NULL() { return getToken(MetaCodeParser.NULL, 0); }
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
		enterRule(_localctx, 50, RULE_constant);
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382); ((ConstantContext)_localctx).Number = numberConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383); ((ConstantContext)_localctx).String = stringConstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384); ((ConstantContext)_localctx).Boolean = booleanConstant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385); ((ConstantContext)_localctx).Array = arrayConstant();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386); ((ConstantContext)_localctx).Interval = intervalConstant();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387); ((ConstantContext)_localctx).Null = match(NULL);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388); ((ConstantContext)_localctx).TreeSelector = match(TREE_SELECTOR);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Token Id;
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaCodeListener ) ((MetaCodeListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaCodeVisitor ) return ((MetaCodeVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); ((IdentifierContext)_localctx).Id = match(ID);
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
		enterRule(_localctx, 54, RULE_numberConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(NUMBER);
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
		enterRule(_localctx, 56, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); match(STRING);
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
		enterRule(_localctx, 58, RULE_booleanConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(BOOLEAN);
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
		enterRule(_localctx, 60, RULE_arrayConstant);
		int _la;
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); match(8);
				setState(400); expression(0);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(401); match(3);
					setState(402); expression(0);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); match(8);
				setState(411); match(1);
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
		enterRule(_localctx, 62, RULE_intervalConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); ((IntervalConstantContext)_localctx).Start = match(NUMBER);
			setState(415); match(15);
			setState(416); ((IntervalConstantContext)_localctx).End = match(NUMBER);
			setState(419);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(417); match(17);
				setState(418); ((IntervalConstantContext)_localctx).By = match(NUMBER);
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
		enterRule(_localctx, 64, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(421); attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(424); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 66, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(427); match(LEFT_PARENTHESIS);
				setState(428); constant();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(429); match(3);
					setState(430); constant();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436); match(RIGHT_PARENTHESIS);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);

		case 1: return precpred(_ctx, 11);

		case 2: return precpred(_ctx, 10);

		case 3: return precpred(_ctx, 9);

		case 4: return precpred(_ctx, 8);

		case 5: return precpred(_ctx, 7);

		case 6: return precpred(_ctx, 6);

		case 7: return precpred(_ctx, 5);

		case 8: return precpred(_ctx, 4);

		case 9: return precpred(_ctx, 3);

		case 10: return precpred(_ctx, 2);

		case 11: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\6\3L\n\3\r\3\16\3M\3\4\3\4\3\4\5"+
		"\4S\n\4\3\4\3\4\5\4W\n\4\3\4\3\4\5\4[\n\4\3\4\3\4\5\4_\n\4\3\4\3\4\5\4"+
		"c\n\4\3\4\3\4\5\4g\n\4\3\4\3\4\5\4k\n\4\3\4\3\4\5\4o\n\4\3\4\3\4\5\4s"+
		"\n\4\3\4\3\4\5\4w\n\4\3\4\5\4z\n\4\3\5\5\5}\n\5\3\5\3\5\3\5\3\5\5\5\u0083"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091"+
		"\13\6\3\6\3\6\5\6\u0095\n\6\3\7\3\7\3\7\3\7\3\7\6\7\u009c\n\7\r\7\16\7"+
		"\u009d\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cf"+
		"\n\b\f\b\16\b\u00d2\13\b\3\t\3\t\3\t\5\t\u00d7\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\6\13\u00e4\n\13\r\13\16\13\u00e5\3\f\3\f\5"+
		"\f\u00ea\n\f\3\r\5\r\u00ed\n\r\3\r\3\r\5\r\u00f1\n\r\3\r\3\r\5\r\u00f5"+
		"\n\r\3\r\3\r\5\r\u00f9\n\r\3\r\3\r\3\r\3\r\5\r\u00ff\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u0107\n\16\f\16\16\16\u010a\13\16\3\16\3\16\3\16"+
		"\5\16\u010f\n\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u0117\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0127"+
		"\n\20\3\20\3\20\3\20\5\20\u012c\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\5\25\u0146\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u014d\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0155\n\26\f\26\16\26\u0158\13"+
		"\26\3\26\3\26\5\26\u015c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\5\30\u0168\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0171"+
		"\n\31\f\31\16\31\u0174\13\31\3\32\5\32\u0177\n\32\3\32\3\32\3\32\7\32"+
		"\u017c\n\32\f\32\16\32\u017f\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0188\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \7"+
		" \u0196\n \f \16 \u0199\13 \3 \3 \3 \3 \5 \u019f\n \3!\3!\3!\3!\3!\5!"+
		"\u01a6\n!\3\"\6\"\u01a9\n\"\r\"\16\"\u01aa\3#\3#\3#\3#\3#\7#\u01b2\n#"+
		"\f#\16#\u01b5\13#\3#\3#\5#\u01b9\n#\3#\2\3\16$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\u01e6\2F\3\2\2\2\4K\3"+
		"\2\2\2\6y\3\2\2\2\b|\3\2\2\2\n\u0087\3\2\2\2\f\u0096\3\2\2\2\16\u00a8"+
		"\3\2\2\2\20\u00d3\3\2\2\2\22\u00da\3\2\2\2\24\u00e0\3\2\2\2\26\u00e9\3"+
		"\2\2\2\30\u00fe\3\2\2\2\32\u0100\3\2\2\2\34\u0116\3\2\2\2\36\u0123\3\2"+
		"\2\2 \u0132\3\2\2\2\"\u0138\3\2\2\2$\u013c\3\2\2\2&\u013e\3\2\2\2(\u0141"+
		"\3\2\2\2*\u014e\3\2\2\2,\u015f\3\2\2\2.\u0167\3\2\2\2\60\u016d\3\2\2\2"+
		"\62\u0176\3\2\2\2\64\u0187\3\2\2\2\66\u0189\3\2\2\28\u018b\3\2\2\2:\u018d"+
		"\3\2\2\2<\u018f\3\2\2\2>\u019e\3\2\2\2@\u01a0\3\2\2\2B\u01a8\3\2\2\2D"+
		"\u01ac\3\2\2\2FG\5\4\3\2G\3\3\2\2\2HI\5\6\4\2IJ\7\17\2\2JL\3\2\2\2KH\3"+
		"\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2Oz\5\16\b\2Pz\5&\24\2Q"+
		"S\5B\"\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2Tz\5\32\16\2UW\5B\"\2VU\3\2\2\2"+
		"VW\3\2\2\2WX\3\2\2\2Xz\5\34\17\2Y[\5B\"\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2"+
		"\2\\z\5\b\5\2]_\5B\"\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`z\5\f\7\2ac\5B\""+
		"\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dz\5\n\6\2eg\5B\"\2fe\3\2\2\2fg\3\2\2"+
		"\2gh\3\2\2\2hz\5*\26\2ik\5B\"\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lz\5\"\22"+
		"\2mo\5B\"\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pz\5\36\20\2qs\5B\"\2rq\3\2\2"+
		"\2rs\3\2\2\2st\3\2\2\2tz\5 \21\2uw\5B\"\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2"+
		"\2xz\5$\23\2yO\3\2\2\2yP\3\2\2\2yR\3\2\2\2yV\3\2\2\2yZ\3\2\2\2y^\3\2\2"+
		"\2yb\3\2\2\2yf\3\2\2\2yj\3\2\2\2yn\3\2\2\2yr\3\2\2\2yv\3\2\2\2z\7\3\2"+
		"\2\2{}\5B\"\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7#\2\2\177\u0082\7-\2"+
		"\2\u0080\u0081\7\13\2\2\u0081\u0083\5\62\32\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7%\2\2\u0085\u0086\5\16"+
		"\b\2\u0086\t\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u0094\7\61\2\2\u0089\u008a"+
		"\7+\2\2\u008a\u008f\5.\30\2\u008b\u008c\7\5\2\2\u008c\u008e\5.\30\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7,\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u0095\3\2\2\2\u0095\13\3\2\2"+
		"\2\u0096\u0097\7\r\2\2\u0097\u009b\7-\2\2\u0098\u0099\5.\30\2\u0099\u009a"+
		"\7\17\2\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\7\35\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\b\b\1\2\u00a2\u00a3\7(\2\2\u00a3"+
		"\u00a9\5\16\b\17\u00a4\u00a9\5\30\r\2\u00a5\u00a9\5\20\t\2\u00a6\u00a9"+
		"\5\22\n\2\u00a7\u00a9\5\24\13\2\u00a8\u00a1\3\2\2\2\u00a8\u00a4\3\2\2"+
		"\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00d0"+
		"\3\2\2\2\u00aa\u00ab\f\16\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00cf\5\16\b\17"+
		"\u00ad\u00ae\f\r\2\2\u00ae\u00af\7\b\2\2\u00af\u00cf\5\16\b\16\u00b0\u00b1"+
		"\f\f\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00cf\5\16\b\r\u00b3\u00b4\f\13\2\2"+
		"\u00b4\u00b5\7\24\2\2\u00b5\u00cf\5\16\b\f\u00b6\u00b7\f\n\2\2\u00b7\u00b8"+
		"\7\f\2\2\u00b8\u00cf\5\16\b\13\u00b9\u00ba\f\t\2\2\u00ba\u00bb\7\22\2"+
		"\2\u00bb\u00cf\5\16\b\n\u00bc\u00bd\f\b\2\2\u00bd\u00be\7\20\2\2\u00be"+
		"\u00cf\5\16\b\t\u00bf\u00c0\f\7\2\2\u00c0\u00c1\7\26\2\2\u00c1\u00cf\5"+
		"\16\b\b\u00c2\u00c3\f\6\2\2\u00c3\u00c4\7\25\2\2\u00c4\u00cf\5\16\b\7"+
		"\u00c5\u00c6\f\5\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00cf\5\16\b\6\u00c8\u00c9"+
		"\f\4\2\2\u00c9\u00ca\7&\2\2\u00ca\u00cf\5\16\b\5\u00cb\u00cc\f\3\2\2\u00cc"+
		"\u00cd\7\'\2\2\u00cd\u00cf\5\16\b\4\u00ce\u00aa\3\2\2\2\u00ce\u00ad\3"+
		"\2\2\2\u00ce\u00b0\3\2\2\2\u00ce\u00b3\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce"+
		"\u00b9\3\2\2\2\u00ce\u00bc\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c2\3\2"+
		"\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\17\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d6\7+\2\2\u00d5\u00d7"+
		"\5\16\b\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d9\7,\2\2\u00d9\21\3\2\2\2\u00da\u00db\7!\2\2\u00db\u00dc\7"+
		"-\2\2\u00dc\u00dd\7+\2\2\u00dd\u00de\5\6\4\2\u00de\u00df\7,\2\2\u00df"+
		"\23\3\2\2\2\u00e0\u00e3\7-\2\2\u00e1\u00e2\7\4\2\2\u00e2\u00e4\7-\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\25\3\2\2\2\u00e7\u00ea\5\66\34\2\u00e8\u00ea\5\20\t\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00ed\5B\"\2"+
		"\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ff"+
		"\5\64\33\2\u00ef\u00f1\5B\"\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00ff\7-\2\2\u00f3\u00f5\5B\"\2\u00f4\u00f3"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00ff\5(\25\2\u00f7"+
		"\u00f9\5B\"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\7+\2\2\u00fb\u00fc\5\16\b\2\u00fc\u00fd\7,\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00f0\3\2\2\2\u00fe\u00f4\3\2"+
		"\2\2\u00fe\u00f8\3\2\2\2\u00ff\31\3\2\2\2\u0100\u0101\7\27\2\2\u0101\u0102"+
		"\7-\2\2\u0102\u0103\7+\2\2\u0103\u0108\5.\30\2\u0104\u0105\7\5\2\2\u0105"+
		"\u0107\5.\30\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010e\7,\2\2\u010c\u010d\7\13\2\2\u010d\u010f\5\62\32\2\u010e\u010c\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\34\2\2\u0111"+
		"\u0112\5\4\3\2\u0112\u0113\7\35\2\2\u0113\33\3\2\2\2\u0114\u0117\7\37"+
		"\2\2\u0115\u0117\7 \2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7!\2\2\u0119\u011a\7-\2\2\u011a\u011b\7+\2"+
		"\2\u011b\u011c\7-\2\2\u011c\u011d\7\13\2\2\u011d\u011e\7\60\2\2\u011e"+
		"\u011f\7,\2\2\u011f\u0120\7\34\2\2\u0120\u0121\5\4\3\2\u0121\u0122\7\35"+
		"\2\2\u0122\35\3\2\2\2\u0123\u0124\7\30\2\2\u0124\u0126\7+\2\2\u0125\u0127"+
		"\7#\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012b\7-\2\2\u0129\u012a\7\13\2\2\u012a\u012c\5\62\32\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7$\2\2\u012e"+
		"\u012f\5\16\b\2\u012f\u0130\7,\2\2\u0130\u0131\5\6\4\2\u0131\37\3\2\2"+
		"\2\u0132\u0133\7\31\2\2\u0133\u0134\7+\2\2\u0134\u0135\5\16\b\2\u0135"+
		"\u0136\7,\2\2\u0136\u0137\5\6\4\2\u0137!\3\2\2\2\u0138\u0139\7\34\2\2"+
		"\u0139\u013a\5\4\3\2\u013a\u013b\7\35\2\2\u013b#\3\2\2\2\u013c\u013d\7"+
		"\"\2\2\u013d%\3\2\2\2\u013e\u013f\7*\2\2\u013f\u0140\5\16\b\2\u0140\'"+
		"\3\2\2\2\u0141\u0142\7-\2\2\u0142\u0143\7%\2\2\u0143\u014c\5\16\b\2\u0144"+
		"\u0146\5B\"\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\7\32\2\2\u0148\u0149\7+\2\2\u0149\u014a\5\16\b\2\u014a"+
		"\u014b\7,\2\2\u014b\u014d\3\2\2\2\u014c\u0145\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d)\3\2\2\2\u014e\u014f\7\32\2\2\u014f\u0150\7+\2\2\u0150\u0151"+
		"\5\16\b\2\u0151\u0152\7,\2\2\u0152\u0156\5\4\3\2\u0153\u0155\5,\27\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u015b\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\33\2\2\u015a"+
		"\u015c\5\4\3\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015e\7\35\2\2\u015e+\3\2\2\2\u015f\u0160\7\33\2\2\u0160\u0161"+
		"\7\32\2\2\u0161\u0162\7+\2\2\u0162\u0163\5\16\b\2\u0163\u0164\7,\2\2\u0164"+
		"\u0165\5\4\3\2\u0165-\3\2\2\2\u0166\u0168\5B\"\2\u0167\u0166\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7-\2\2\u016a\u016b\7\13"+
		"\2\2\u016b\u016c\5\62\32\2\u016c/\3\2\2\2\u016d\u0172\5\16\b\2\u016e\u016f"+
		"\7\5\2\2\u016f\u0171\5\16\b\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2"+
		"\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\61\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0177\5B\"\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017d\7-\2\2\u0179\u017a\7\4\2\2\u017a\u017c\7-\2"+
		"\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\63\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0188\58\35\2\u0181"+
		"\u0188\5:\36\2\u0182\u0188\5<\37\2\u0183\u0188\5> \2\u0184\u0188\5@!\2"+
		"\u0185\u0188\7)\2\2\u0186\u0188\7\60\2\2\u0187\u0180\3\2\2\2\u0187\u0181"+
		"\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\65\3\2\2\2\u0189\u018a\7-\2\2"+
		"\u018a\67\3\2\2\2\u018b\u018c\7\63\2\2\u018c9\3\2\2\2\u018d\u018e\7\62"+
		"\2\2\u018e;\3\2\2\2\u018f\u0190\7\36\2\2\u0190=\3\2\2\2\u0191\u0192\7"+
		"\n\2\2\u0192\u0197\5\16\b\2\u0193\u0194\7\5\2\2\u0194\u0196\5\16\b\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\3\2\2\u019b"+
		"\u019f\3\2\2\2\u019c\u019d\7\n\2\2\u019d\u019f\7\3\2\2\u019e\u0191\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f?\3\2\2\2\u01a0\u01a1\7\63\2\2\u01a1\u01a2"+
		"\7\21\2\2\u01a2\u01a5\7\63\2\2\u01a3\u01a4\7\23\2\2\u01a4\u01a6\7\63\2"+
		"\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6A\3\2\2\2\u01a7\u01a9"+
		"\5D#\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01abC\3\2\2\2\u01ac\u01b8\7\61\2\2\u01ad\u01ae\7+\2\2"+
		"\u01ae\u01b3\5\64\33\2\u01af\u01b0\7\5\2\2\u01b0\u01b2\5\64\33\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01ad\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9E\3\2\2\2"+
		"\62MRVZ^bfjnrvy|\u0082\u008f\u0094\u009d\u00a8\u00ce\u00d0\u00d6\u00e5"+
		"\u00e9\u00ec\u00f0\u00f4\u00f8\u00fe\u0108\u010e\u0116\u0126\u012b\u0145"+
		"\u014c\u0156\u015b\u0167\u0172\u0176\u017d\u0187\u0197\u019e\u01a5\u01aa"+
		"\u01b3\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}