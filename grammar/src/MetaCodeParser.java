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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, FUNCTION=9, 
		FOREACH=10, WHILE=11, IF=12, ELSE=13, DO=14, END=15, BOOLEAN=16, SKIP=17, 
		VAR=18, IN=19, ASSIGN=20, LEFT_PARENTHESIS=21, RIGHT_PARENTHESIS=22, ID=23, 
		COMMENT=24, MULTILINE_COMMENT=25, ATTRIBUTE_ID=26, STRING=27, NUMBER=28, 
		WHITESPACE=29, NEWLINE=30;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "','", "'by'", "'['", "':'", "';'", "'..'", 
		"'function'", "'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", 
		"BOOLEAN", "'skip'", "'var'", "'in'", "'='", "'('", "')'", "ID", "COMMENT", 
		"MULTILINE_COMMENT", "ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", 
		"NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_expression = 4, RULE_functionCallExpression = 5, RULE_memberExpression = 6, 
		RULE_primaryExpression = 7, RULE_functionExpression = 8, RULE_foreachStatement = 9, 
		RULE_whileStatement = 10, RULE_blockStatement = 11, RULE_assignmentExpression = 12, 
		RULE_ifStatement = 13, RULE_elseIfStatement = 14, RULE_formalParameterList = 15, 
		RULE_formalParameter = 16, RULE_actualParameterList = 17, RULE_typeName = 18, 
		RULE_constant = 19, RULE_numberConstant = 20, RULE_stringConstant = 21, 
		RULE_booleanConstant = 22, RULE_arrayConstant = 23, RULE_intervalConstant = 24, 
		RULE_attributes = 25, RULE_attribute = 26;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "expression", 
		"functionCallExpression", "memberExpression", "primaryExpression", "functionExpression", 
		"foreachStatement", "whileStatement", "blockStatement", "assignmentExpression", 
		"ifStatement", "elseIfStatement", "formalParameterList", "formalParameter", 
		"actualParameterList", "typeName", "constant", "numberConstant", "stringConstant", 
		"booleanConstant", "arrayConstant", "intervalConstant", "attributes", 
		"attribute"
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
			setState(54); statements();
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
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); statement();
				setState(57); match(7);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << VAR) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0) );
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
		public AttributesContext Attributes;
		public VariableDeclarationContext VariableDeclaration;
		public IfStatementContext If;
		public BlockStatementContext Block;
		public ForeachStatementContext Foreach;
		public WhileStatementContext While;
		public Token Skip;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode SKIP() { return getToken(MetaCodeParser.SKIP, 0); }
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
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
		int _la;
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); ((StatementContext)_localctx).Expression = expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(64); ((StatementContext)_localctx).Attributes = attributes();
					}
					break;
				}
				setState(67); ((StatementContext)_localctx).VariableDeclaration = variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(68); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(71); ((StatementContext)_localctx).If = ifStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(72); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(75); ((StatementContext)_localctx).Block = blockStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(76); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(79); ((StatementContext)_localctx).Foreach = foreachStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(80); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(83); ((StatementContext)_localctx).While = whileStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(84); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(87); ((StatementContext)_localctx).Skip = match(SKIP);
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
			setState(91);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(90); ((VariableDeclarationContext)_localctx).Attributes = attributes();
				}
			}

			setState(93); match(VAR);
			setState(94); ((VariableDeclarationContext)_localctx).VariableName = match(ID);
			setState(97);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(95); match(6);
				setState(96); ((VariableDeclarationContext)_localctx).VariableType = typeName();
				}
			}

			setState(99); match(ASSIGN);
			setState(100); ((VariableDeclarationContext)_localctx).VariableDefaultValue = expression();
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); primaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(103); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(106); functionCallExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); memberExpression();
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
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(112);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(110); match(ID);
				}
				break;
			case FUNCTION:
				{
				setState(111); functionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114); match(LEFT_PARENTHESIS);
			setState(116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << FUNCTION) | (1L << BOOLEAN) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(115); expression();
				}
			}

			setState(118); match(RIGHT_PARENTHESIS);
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
		public FunctionCallExpressionContext functionCallExpression(int i) {
			return getRuleContext(FunctionCallExpressionContext.class,i);
		}
		public List<FunctionCallExpressionContext> functionCallExpression() {
			return getRuleContexts(FunctionCallExpressionContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(MetaCodeParser.ID); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_memberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(120); match(ID);
				}
				break;
			case 5:
			case BOOLEAN:
			case STRING:
			case NUMBER:
				{
				setState(121); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124); match(2);
				setState(127);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(125); match(ID);
					}
					break;

				case 2:
					{
					setState(126); functionCallExpression();
					}
					break;
				}
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 );
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
		public FunctionExpressionContext Function;
		public AssignmentExpressionContext Assignment;
		public ExpressionContext InnerExpression;
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_primaryExpression);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(133); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(136); ((PrimaryExpressionContext)_localctx).Constant = constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(137); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(140); ((PrimaryExpressionContext)_localctx).Id = match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(141); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(144); ((PrimaryExpressionContext)_localctx).Function = functionExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(145); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(148); ((PrimaryExpressionContext)_localctx).Assignment = assignmentExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(149); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(152); match(LEFT_PARENTHESIS);
				setState(153); ((PrimaryExpressionContext)_localctx).InnerExpression = expression();
				setState(154); match(RIGHT_PARENTHESIS);
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
		enterRule(_localctx, 16, RULE_functionExpression);
		int _la;
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); match(FUNCTION);
				setState(160);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(159); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(162); match(LEFT_PARENTHESIS);
				setState(164);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(163); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(166); match(RIGHT_PARENTHESIS);
				setState(169);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(167); match(6);
					setState(168); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(171); match(DO);
				setState(172); ((FunctionExpressionContext)_localctx).BodyStatements = statements();
				setState(173); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); match(FUNCTION);
				setState(177);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(176); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(179); match(LEFT_PARENTHESIS);
				setState(181);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(180); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(183); match(RIGHT_PARENTHESIS);
				setState(186);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(184); match(6);
					setState(185); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(188); match(ASSIGN);
				setState(189); ((FunctionExpressionContext)_localctx).BodyExpression = expression();
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

	public static class ForeachStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 18, RULE_foreachStatement);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(FOREACH);
				setState(193); match(LEFT_PARENTHESIS);
				setState(194); match(ID);
				setState(195); match(IN);
				setState(196); expression();
				setState(197); match(RIGHT_PARENTHESIS);
				setState(198); ((ForeachStatementContext)_localctx).Body = expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(FOREACH);
				setState(201); match(LEFT_PARENTHESIS);
				setState(202); match(VAR);
				setState(203); match(ID);
				setState(204); match(6);
				setState(205); match(ID);
				setState(206); match(IN);
				setState(207); expression();
				setState(208); match(RIGHT_PARENTHESIS);
				setState(209); ((ForeachStatementContext)_localctx).Body = expression();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext ConditionExpression;
		public ExpressionContext Body;
		public TerminalNode WHILE() { return getToken(MetaCodeParser.WHILE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(WHILE);
			setState(214); match(LEFT_PARENTHESIS);
			setState(215); ((WhileStatementContext)_localctx).ConditionExpression = expression();
			setState(216); match(RIGHT_PARENTHESIS);
			setState(217); ((WhileStatementContext)_localctx).Body = expression();
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
		enterRule(_localctx, 22, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(DO);
			setState(220); ((BlockStatementContext)_localctx).Body = statements();
			setState(221); match(END);
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
		enterRule(_localctx, 24, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); ((AssignmentExpressionContext)_localctx).Variable = match(ID);
			setState(224); match(ASSIGN);
			setState(225); ((AssignmentExpressionContext)_localctx).Value = expression();
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(227);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(226); ((AssignmentExpressionContext)_localctx).ConditionalAttributes = attributes();
					}
				}

				setState(229); match(IF);
				setState(230); match(LEFT_PARENTHESIS);
				setState(231); ((AssignmentExpressionContext)_localctx).ConditionalExpression = expression();
				setState(232); match(RIGHT_PARENTHESIS);
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
		public ElseIfStatementContext ElseIfExpressions;
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
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(IF);
			setState(237); match(LEFT_PARENTHESIS);
			setState(238); ((IfStatementContext)_localctx).Condition = expression();
			setState(239); match(RIGHT_PARENTHESIS);
			setState(240); statements();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(241); ((IfStatementContext)_localctx).ElseIfExpressions = elseIfStatement();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(249);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(247); match(ELSE);
				setState(248); ((IfStatementContext)_localctx).ElseStatements = statements();
				}
			}

			setState(251); match(END);
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
		enterRule(_localctx, 28, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(ELSE);
			setState(254); match(IF);
			setState(255); match(LEFT_PARENTHESIS);
			setState(256); expression();
			setState(257); match(RIGHT_PARENTHESIS);
			setState(258); statements();
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
		enterRule(_localctx, 30, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); formalParameter();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(261); match(3);
				setState(262); formalParameter();
				}
				}
				setState(267);
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
		enterRule(_localctx, 32, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(268); attributes();
				}
			}

			setState(271); match(ID);
			setState(272); match(6);
			setState(273); typeName();
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
		enterRule(_localctx, 34, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); expression();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(276); match(3);
				setState(277); expression();
				}
				}
				setState(282);
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
		enterRule(_localctx, 36, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(283); attributes();
				}
			}

			setState(286); match(ID);
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
		enterRule(_localctx, 38, RULE_constant);
		try {
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); ((ConstantContext)_localctx).Number = numberConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); ((ConstantContext)_localctx).String = stringConstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290); ((ConstantContext)_localctx).Boolean = booleanConstant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291); ((ConstantContext)_localctx).Array = arrayConstant();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292); ((ConstantContext)_localctx).Interval = intervalConstant();
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
		enterRule(_localctx, 40, RULE_numberConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(NUMBER);
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
		enterRule(_localctx, 42, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(STRING);
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
		enterRule(_localctx, 44, RULE_booleanConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(BOOLEAN);
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
		enterRule(_localctx, 46, RULE_arrayConstant);
		int _la;
		try {
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); match(5);
				setState(302); expression();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(303); match(3);
					setState(304); expression();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); match(5);
				setState(313); match(1);
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
		enterRule(_localctx, 48, RULE_intervalConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); ((IntervalConstantContext)_localctx).Start = match(NUMBER);
			setState(317); match(8);
			setState(318); ((IntervalConstantContext)_localctx).End = match(NUMBER);
			{
			setState(319); match(4);
			setState(320); ((IntervalConstantContext)_localctx).By = match(NUMBER);
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
		enterRule(_localctx, 50, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(322); attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 52, RULE_attribute);
		int _la;
		try {
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
				setState(329); match(5);
				setState(330); constant();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(331); match(3);
					setState(332); constant();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338); match(1);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 \u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?"+
		"\3\4\3\4\5\4D\n\4\3\4\3\4\5\4H\n\4\3\4\3\4\5\4L\n\4\3\4\3\4\5\4P\n\4\3"+
		"\4\3\4\5\4T\n\4\3\4\3\4\5\4X\n\4\3\4\5\4[\n\4\3\5\5\5^\n\5\3\5\3\5\3\5"+
		"\3\5\5\5d\n\5\3\5\3\5\3\5\3\6\3\6\5\6k\n\6\3\6\3\6\5\6o\n\6\3\7\3\7\5"+
		"\7s\n\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\5\b\u0082"+
		"\n\b\6\b\u0084\n\b\r\b\16\b\u0085\3\t\5\t\u0089\n\t\3\t\3\t\5\t\u008d"+
		"\n\t\3\t\3\t\5\t\u0091\n\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\5\t\u0099\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\5\n\u00a3\n\n\3\n\3\n\5\n\u00a7"+
		"\n\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3"+
		"\n\3\n\5\n\u00b8\n\n\3\n\3\n\3\n\5\n\u00bd\n\n\3\n\3\n\5\n\u00c1\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00e6\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00ed\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f5\n\17\f\17\16"+
		"\17\u00f8\13\17\3\17\3\17\5\17\u00fc\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u010a\n\21\f\21\16\21\u010d\13\21"+
		"\3\22\5\22\u0110\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0119\n"+
		"\23\f\23\16\23\u011c\13\23\3\24\5\24\u011f\n\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0128\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u0134\n\31\f\31\16\31\u0137\13\31\3\31\3\31\3\31\3\31"+
		"\5\31\u013d\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u0146\n\33\r"+
		"\33\16\33\u0147\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0150\n\34\f\34\16"+
		"\34\u0153\13\34\3\34\3\34\5\34\u0157\n\34\3\34\2\35\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\u0176\28\3\2\2\2\4=\3\2"+
		"\2\2\6Z\3\2\2\2\b]\3\2\2\2\nn\3\2\2\2\fr\3\2\2\2\16|\3\2\2\2\20\u009e"+
		"\3\2\2\2\22\u00c0\3\2\2\2\24\u00d5\3\2\2\2\26\u00d7\3\2\2\2\30\u00dd\3"+
		"\2\2\2\32\u00e1\3\2\2\2\34\u00ee\3\2\2\2\36\u00ff\3\2\2\2 \u0106\3\2\2"+
		"\2\"\u010f\3\2\2\2$\u0115\3\2\2\2&\u011e\3\2\2\2(\u0127\3\2\2\2*\u0129"+
		"\3\2\2\2,\u012b\3\2\2\2.\u012d\3\2\2\2\60\u013c\3\2\2\2\62\u013e\3\2\2"+
		"\2\64\u0145\3\2\2\2\66\u0156\3\2\2\289\5\4\3\29\3\3\2\2\2:;\5\6\4\2;<"+
		"\7\t\2\2<>\3\2\2\2=:\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2"+
		"A[\5\n\6\2BD\5\64\33\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2E[\5\b\5\2FH\5\64"+
		"\33\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2I[\5\34\17\2JL\5\64\33\2KJ\3\2\2\2"+
		"KL\3\2\2\2LM\3\2\2\2M[\5\30\r\2NP\5\64\33\2ON\3\2\2\2OP\3\2\2\2PQ\3\2"+
		"\2\2Q[\5\24\13\2RT\5\64\33\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2U[\5\26\f\2"+
		"VX\5\64\33\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y[\7\23\2\2ZA\3\2\2\2ZC\3\2"+
		"\2\2ZG\3\2\2\2ZK\3\2\2\2ZO\3\2\2\2ZS\3\2\2\2ZW\3\2\2\2[\7\3\2\2\2\\^\5"+
		"\64\33\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\24\2\2`c\7\31\2\2ab\7\b\2"+
		"\2bd\5&\24\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\26\2\2fg\5\n\6\2g\t\3\2"+
		"\2\2ho\5\20\t\2ik\5\64\33\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lo\5\f\7\2mo"+
		"\5\16\b\2nh\3\2\2\2nj\3\2\2\2nm\3\2\2\2o\13\3\2\2\2ps\7\31\2\2qs\5\22"+
		"\n\2rp\3\2\2\2rq\3\2\2\2st\3\2\2\2tv\7\27\2\2uw\5\n\6\2vu\3\2\2\2vw\3"+
		"\2\2\2wx\3\2\2\2xy\7\30\2\2y\r\3\2\2\2z}\7\31\2\2{}\5(\25\2|z\3\2\2\2"+
		"|{\3\2\2\2}\u0083\3\2\2\2~\u0081\7\4\2\2\177\u0082\7\31\2\2\u0080\u0082"+
		"\5\f\7\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"~\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\17\3\2\2\2\u0087\u0089\5\64\33\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u009f\5(\25\2\u008b\u008d\5\64\33\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009f"+
		"\7\31\2\2\u008f\u0091\5\64\33\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2"+
		"\2\u0091\u0092\3\2\2\2\u0092\u009f\5\22\n\2\u0093\u0095\5\64\33\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009f\5\32"+
		"\16\2\u0097\u0099\5\64\33\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\27\2\2\u009b\u009c\5\n\6\2\u009c\u009d\7"+
		"\30\2\2\u009d\u009f\3\2\2\2\u009e\u0088\3\2\2\2\u009e\u008c\3\2\2\2\u009e"+
		"\u0090\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0098\3\2\2\2\u009f\21\3\2\2"+
		"\2\u00a0\u00a2\7\13\2\2\u00a1\u00a3\7\31\2\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\27\2\2\u00a5\u00a7\5"+
		" \21\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ab\7\30\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ac\5&\24\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\20\2\2\u00ae"+
		"\u00af\5\4\3\2\u00af\u00b0\7\21\2\2\u00b0\u00c1\3\2\2\2\u00b1\u00b3\7"+
		"\13\2\2\u00b2\u00b4\7\31\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\7\27\2\2\u00b6\u00b8\5 \21\2\u00b7\u00b6\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\7\30\2\2\u00ba"+
		"\u00bb\7\b\2\2\u00bb\u00bd\5&\24\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c1\5\n\6\2\u00c0"+
		"\u00a0\3\2\2\2\u00c0\u00b1\3\2\2\2\u00c1\23\3\2\2\2\u00c2\u00c3\7\f\2"+
		"\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\7\31\2\2\u00c5\u00c6\7\25\2\2\u00c6"+
		"\u00c7\5\n\6\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9\5\n\6\2\u00c9\u00d6\3"+
		"\2\2\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\7\24\2\2\u00cd"+
		"\u00ce\7\31\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\7\31\2\2\u00d0\u00d1\7"+
		"\25\2\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\5\n\6\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00c2\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d6\25\3\2\2"+
		"\2\u00d7\u00d8\7\r\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\5\n\6\2\u00da"+
		"\u00db\7\30\2\2\u00db\u00dc\5\n\6\2\u00dc\27\3\2\2\2\u00dd\u00de\7\20"+
		"\2\2\u00de\u00df\5\4\3\2\u00df\u00e0\7\21\2\2\u00e0\31\3\2\2\2\u00e1\u00e2"+
		"\7\31\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00ec\5\n\6\2\u00e4\u00e6\5\64\33"+
		"\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\7\16\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\5\n\6\2\u00ea\u00eb\7\30\2"+
		"\2\u00eb\u00ed\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\33"+
		"\3\2\2\2\u00ee\u00ef\7\16\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\5\n\6\2"+
		"\u00f1\u00f2\7\30\2\2\u00f2\u00f6\5\4\3\2\u00f3\u00f5\5\36\20\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\17\2\2\u00fa"+
		"\u00fc\5\4\3\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\7\21\2\2\u00fe\35\3\2\2\2\u00ff\u0100\7\17\2\2\u0100"+
		"\u0101\7\16\2\2\u0101\u0102\7\27\2\2\u0102\u0103\5\n\6\2\u0103\u0104\7"+
		"\30\2\2\u0104\u0105\5\4\3\2\u0105\37\3\2\2\2\u0106\u010b\5\"\22\2\u0107"+
		"\u0108\7\5\2\2\u0108\u010a\5\"\22\2\u0109\u0107\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c!\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010e\u0110\5\64\33\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\7\31\2\2\u0112\u0113\7\b\2\2\u0113\u0114"+
		"\5&\24\2\u0114#\3\2\2\2\u0115\u011a\5\n\6\2\u0116\u0117\7\5\2\2\u0117"+
		"\u0119\5\n\6\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b%\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f"+
		"\5\64\33\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u0120\u0121\7\31\2\2\u0121\'\3\2\2\2\u0122\u0128\5*\26\2\u0123\u0128"+
		"\5,\27\2\u0124\u0128\5.\30\2\u0125\u0128\5\60\31\2\u0126\u0128\5\62\32"+
		"\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128)\3\2\2\2\u0129\u012a\7\36\2\2\u012a"+
		"+\3\2\2\2\u012b\u012c\7\35\2\2\u012c-\3\2\2\2\u012d\u012e\7\22\2\2\u012e"+
		"/\3\2\2\2\u012f\u0130\7\7\2\2\u0130\u0135\5\n\6\2\u0131\u0132\7\5\2\2"+
		"\u0132\u0134\5\n\6\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\7\3\2\2\u0139\u013d\3\2\2\2\u013a\u013b\7\7\2\2\u013b\u013d\7\3"+
		"\2\2\u013c\u012f\3\2\2\2\u013c\u013a\3\2\2\2\u013d\61\3\2\2\2\u013e\u013f"+
		"\7\36\2\2\u013f\u0140\7\n\2\2\u0140\u0141\7\36\2\2\u0141\u0142\7\6\2\2"+
		"\u0142\u0143\7\36\2\2\u0143\63\3\2\2\2\u0144\u0146\5\66\34\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\65\3\2\2\2\u0149\u0157\7\34\2\2\u014a\u014b\7\34\2\2\u014b\u014c\7\7"+
		"\2\2\u014c\u0151\5(\25\2\u014d\u014e\7\5\2\2\u014e\u0150\5(\25\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\3\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0149\3\2\2\2\u0156\u014a\3\2\2\2\u0157\67\3\2\2"+
		"\2/?CGKOSWZ]cjnrv|\u0081\u0085\u0088\u008c\u0090\u0094\u0098\u009e\u00a2"+
		"\u00a6\u00ab\u00b3\u00b7\u00bc\u00c0\u00d5\u00e5\u00ec\u00f6\u00fb\u010b"+
		"\u010f\u011a\u011e\u0127\u0135\u013c\u0147\u0151\u0156";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}