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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		FUNCTION=10, FOREACH=11, WHILE=12, IF=13, ELSE=14, DO=15, END=16, BOOLEAN=17, 
		SKIP=18, VAR=19, IN=20, ASSIGN=21, ID=22, COMMENT=23, MULTILINE_COMMENT=24, 
		ATTRIBUTE_ID=25, STRING=26, NUMBER=27, WHITESPACE=28, NEWLINE=29;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "'.'", "','", "'by'", "'['", "':'", "'('", 
		"'..'", "'function'", "'foreach'", "'while'", "'if'", "'else'", "'do'", 
		"'end'", "BOOLEAN", "'skip'", "'var'", "'in'", "'='", "ID", "COMMENT", 
		"MULTILINE_COMMENT", "ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", 
		"NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_expression = 4, RULE_primaryExpression = 5, RULE_functionCallExpression = 6, 
		RULE_functionExpression = 7, RULE_foreachExpression = 8, RULE_whileExpression = 9, 
		RULE_blockExpression = 10, RULE_assignmentExpression = 11, RULE_ifExpression = 12, 
		RULE_elseIfExpression = 13, RULE_formalParameterList = 14, RULE_formalParameter = 15, 
		RULE_actualParameterList = 16, RULE_typeName = 17, RULE_constant = 18, 
		RULE_numberConstant = 19, RULE_stringConstant = 20, RULE_booleanConstant = 21, 
		RULE_arrayConstant = 22, RULE_intervalConstant = 23, RULE_attributes = 24, 
		RULE_attribute = 25;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "expression", 
		"primaryExpression", "functionCallExpression", "functionExpression", "foreachExpression", 
		"whileExpression", "blockExpression", "assignmentExpression", "ifExpression", 
		"elseIfExpression", "formalParameterList", "formalParameter", "actualParameterList", 
		"typeName", "constant", "numberConstant", "stringConstant", "booleanConstant", 
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
			setState(52); statements();
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); ((StatementsContext)_localctx).Values = statement();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << VAR) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER) | (1L << NEWLINE))) != 0) );
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); ((StatementContext)_localctx).Expression = expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); ((StatementContext)_localctx).VariableDeclaration = variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(NEWLINE);
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
			setState(65);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(64); ((VariableDeclarationContext)_localctx).Attributes = attributes();
				}
			}

			setState(67); match(VAR);
			setState(68); ((VariableDeclarationContext)_localctx).VariableName = match(ID);
			setState(71);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(69); match(7);
				setState(70); ((VariableDeclarationContext)_localctx).VariableType = typeName();
				}
			}

			setState(73); match(ASSIGN);
			setState(74); ((VariableDeclarationContext)_localctx).VariableDefaultValue = expression();
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(76); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(79); ((ExpressionContext)_localctx).Constant = constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(80); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(83); primaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(84); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(87); ((ExpressionContext)_localctx).Skip = match(SKIP);
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

				setState(91); ((ExpressionContext)_localctx).Function = functionExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(92); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(95); ((ExpressionContext)_localctx).Block = blockExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(96); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(99); ((ExpressionContext)_localctx).If = ifExpression();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(100); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(103); ((ExpressionContext)_localctx).Foreach = foreachExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(104); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(107); ((ExpressionContext)_localctx).While = whileExpression();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(108); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(111); ((ExpressionContext)_localctx).Assignment = assignmentExpression();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(112); ((ExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(115); match(8);
				setState(116); ((ExpressionContext)_localctx).InnerExpression = expression();
				setState(117); match(2);
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
		public TerminalNode ID() { return getToken(MetaCodeParser.ID, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_primaryExpression);
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); match(ID);
				setState(122); match(3);
				setState(123); primaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(ID);
				setState(126); match(8);
				setState(128);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(127); actualParameterList();
					}
				}

				setState(130); match(2);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131); match(ID);
				setState(132); match(8);
				setState(134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(133); actualParameterList();
					}
				}

				setState(136); match(2);
				setState(137); match(3);
				setState(138); primaryExpression();
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
		enterRule(_localctx, 12, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(ID);
			setState(142); match(8);
			setState(144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(143); actualParameterList();
				}
			}

			setState(146); match(2);
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
		enterRule(_localctx, 14, RULE_functionExpression);
		int _la;
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); match(FUNCTION);
				setState(150);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(149); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(152); match(8);
				setState(154);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(153); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(156); match(2);
				setState(159);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(157); match(7);
					setState(158); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(161); match(DO);
				setState(162); ((FunctionExpressionContext)_localctx).BodyStatements = statements();
				setState(163); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(FUNCTION);
				setState(167);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(166); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(169); match(8);
				setState(171);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(170); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(173); match(2);
				setState(176);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(174); match(7);
					setState(175); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(178); match(ASSIGN);
				setState(179); ((FunctionExpressionContext)_localctx).BodyExpression = expression();
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
		enterRule(_localctx, 16, RULE_foreachExpression);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); match(FOREACH);
				setState(183); match(8);
				setState(184); match(ID);
				setState(185); match(IN);
				setState(186); expression();
				setState(187); match(2);
				setState(188); ((ForeachExpressionContext)_localctx).Body = expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(FOREACH);
				setState(191); match(8);
				setState(192); match(VAR);
				setState(193); match(ID);
				setState(194); match(7);
				setState(195); match(ID);
				setState(196); match(IN);
				setState(197); expression();
				setState(198); match(2);
				setState(199); ((ForeachExpressionContext)_localctx).Body = expression();
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
		enterRule(_localctx, 18, RULE_whileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(WHILE);
			setState(204); match(8);
			setState(205); ((WhileExpressionContext)_localctx).ConditionExpression = expression();
			setState(206); match(2);
			setState(207); ((WhileExpressionContext)_localctx).Body = expression();
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
		enterRule(_localctx, 20, RULE_blockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(DO);
			setState(210); ((BlockExpressionContext)_localctx).Body = statements();
			setState(211); match(END);
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
		enterRule(_localctx, 22, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); ((AssignmentExpressionContext)_localctx).Variable = match(ID);
			setState(214); match(ASSIGN);
			setState(215); ((AssignmentExpressionContext)_localctx).Value = expression();
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(217);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(216); ((AssignmentExpressionContext)_localctx).ConditionalAttributes = attributes();
					}
				}

				setState(219); match(IF);
				setState(220); match(8);
				setState(221); ((AssignmentExpressionContext)_localctx).ConditionalExpression = expression();
				setState(222); match(2);
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
		enterRule(_localctx, 24, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(IF);
			setState(227); match(8);
			setState(228); ((IfExpressionContext)_localctx).Condition = expression();
			setState(229); match(2);
			setState(230); statements();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(231); ((IfExpressionContext)_localctx).ElseIfExpressions = elseIfExpression();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(239);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(237); match(ELSE);
				setState(238); ((IfExpressionContext)_localctx).ElseStatements = statements();
				}
			}

			setState(241); match(END);
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
		enterRule(_localctx, 26, RULE_elseIfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ELSE);
			setState(244); match(IF);
			setState(245); match(8);
			setState(246); expression();
			setState(247); match(2);
			setState(248); statements();
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
		enterRule(_localctx, 28, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); formalParameter();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(251); match(4);
				setState(252); formalParameter();
				}
				}
				setState(257);
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
		enterRule(_localctx, 30, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(258); attributes();
				}
			}

			setState(261); match(ID);
			setState(262); match(7);
			setState(263); typeName();
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
		enterRule(_localctx, 32, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); expression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(266); match(4);
				setState(267); expression();
				}
				}
				setState(272);
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
		enterRule(_localctx, 34, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(273); attributes();
				}
			}

			setState(276); match(ID);
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
		enterRule(_localctx, 36, RULE_constant);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); ((ConstantContext)_localctx).Number = numberConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); ((ConstantContext)_localctx).String = stringConstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280); ((ConstantContext)_localctx).Boolean = booleanConstant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281); ((ConstantContext)_localctx).Array = arrayConstant();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282); ((ConstantContext)_localctx).Interval = intervalConstant();
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
		enterRule(_localctx, 38, RULE_numberConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(NUMBER);
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
		enterRule(_localctx, 40, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(STRING);
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
		enterRule(_localctx, 42, RULE_booleanConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(BOOLEAN);
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
		enterRule(_localctx, 44, RULE_arrayConstant);
		int _la;
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); match(6);
				setState(292); expression();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(293); match(4);
					setState(294); expression();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(6);
				setState(303); match(1);
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
		enterRule(_localctx, 46, RULE_intervalConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); ((IntervalConstantContext)_localctx).Start = match(NUMBER);
			setState(307); match(9);
			setState(308); ((IntervalConstantContext)_localctx).End = match(NUMBER);
			{
			setState(309); match(5);
			setState(310); ((IntervalConstantContext)_localctx).By = match(NUMBER);
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
		enterRule(_localctx, 48, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312); attribute();
				}
				}
				setState(315); 
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
		enterRule(_localctx, 50, RULE_attribute);
		int _la;
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
				setState(319); match(6);
				setState(320); constant();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(321); match(4);
					setState(322); constant();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328); match(1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u014f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\5\4A\n"+
		"\4\3\5\5\5D\n\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\6\5\6P\n\6\3\6"+
		"\3\6\5\6T\n\6\3\6\3\6\5\6X\n\6\3\6\3\6\5\6\\\n\6\3\6\3\6\5\6`\n\6\3\6"+
		"\3\6\5\6d\n\6\3\6\3\6\5\6h\n\6\3\6\3\6\5\6l\n\6\3\6\3\6\5\6p\n\6\3\6\3"+
		"\6\5\6t\n\6\3\6\3\6\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3"+
		"\b\5\b\u0093\n\b\3\b\3\b\3\t\3\t\5\t\u0099\n\t\3\t\3\t\5\t\u009d\n\t\3"+
		"\t\3\t\3\t\5\t\u00a2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t\3\t"+
		"\5\t\u00ae\n\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00cc\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00dc\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee\13\16\3\16\3\16\5\16\u00f2"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20"+
		"\u0100\n\20\f\20\16\20\u0103\13\20\3\21\5\21\u0106\n\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u010f\n\22\f\22\16\22\u0112\13\22\3\23\5\23"+
		"\u0115\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u011e\n\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u012a\n\30\f\30\16\30"+
		"\u012d\13\30\3\30\3\30\3\30\3\30\5\30\u0133\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\6\32\u013c\n\32\r\32\16\32\u013d\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0146\n\33\f\33\16\33\u0149\13\33\3\33\3\33\5\33\u014d\n\33"+
		"\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\2\2\u016b\2\66\3\2\2\2\49\3\2\2\2\6@\3\2\2\2\bC\3\2\2\2\ny\3\2\2\2\f"+
		"\u008d\3\2\2\2\16\u008f\3\2\2\2\20\u00b6\3\2\2\2\22\u00cb\3\2\2\2\24\u00cd"+
		"\3\2\2\2\26\u00d3\3\2\2\2\30\u00d7\3\2\2\2\32\u00e4\3\2\2\2\34\u00f5\3"+
		"\2\2\2\36\u00fc\3\2\2\2 \u0105\3\2\2\2\"\u010b\3\2\2\2$\u0114\3\2\2\2"+
		"&\u011d\3\2\2\2(\u011f\3\2\2\2*\u0121\3\2\2\2,\u0123\3\2\2\2.\u0132\3"+
		"\2\2\2\60\u0134\3\2\2\2\62\u013b\3\2\2\2\64\u014c\3\2\2\2\66\67\5\4\3"+
		"\2\67\3\3\2\2\28:\5\6\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3"+
		"\2\2\2=A\5\n\6\2>A\5\b\5\2?A\7\37\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\7"+
		"\3\2\2\2BD\5\62\32\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\25\2\2FI\7\30\2"+
		"\2GH\7\t\2\2HJ\5$\23\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\27\2\2LM\5\n"+
		"\6\2M\t\3\2\2\2NP\5\62\32\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Qz\5&\24\2RT"+
		"\5\62\32\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2Uz\5\f\7\2VX\5\62\32\2WV\3\2\2"+
		"\2WX\3\2\2\2XY\3\2\2\2Yz\7\24\2\2Z\\\5\62\32\2[Z\3\2\2\2[\\\3\2\2\2\\"+
		"]\3\2\2\2]z\5\20\t\2^`\5\62\32\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2az\5\26"+
		"\f\2bd\5\62\32\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ez\5\32\16\2fh\5\62\32\2"+
		"gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2iz\5\22\n\2jl\5\62\32\2kj\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mz\5\24\13\2np\5\62\32\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2q"+
		"z\5\30\r\2rt\5\62\32\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\n\2\2vw\5\n\6"+
		"\2wx\7\4\2\2xz\3\2\2\2yO\3\2\2\2yS\3\2\2\2yW\3\2\2\2y[\3\2\2\2y_\3\2\2"+
		"\2yc\3\2\2\2yg\3\2\2\2yk\3\2\2\2yo\3\2\2\2ys\3\2\2\2z\13\3\2\2\2{|\7\30"+
		"\2\2|}\7\5\2\2}\u008e\5\f\7\2~\u008e\7\30\2\2\177\u0080\7\30\2\2\u0080"+
		"\u0082\7\n\2\2\u0081\u0083\5\"\22\2\u0082\u0081\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u008e\7\4\2\2\u0085\u0086\7\30\2\2\u0086"+
		"\u0088\7\n\2\2\u0087\u0089\5\"\22\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\5\2\2\u008c"+
		"\u008e\5\f\7\2\u008d{\3\2\2\2\u008d~\3\2\2\2\u008d\177\3\2\2\2\u008d\u0085"+
		"\3\2\2\2\u008e\r\3\2\2\2\u008f\u0090\7\30\2\2\u0090\u0092\7\n\2\2\u0091"+
		"\u0093\5\"\22\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0095\7\4\2\2\u0095\17\3\2\2\2\u0096\u0098\7\f\2\2\u0097"+
		"\u0099\7\30\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009c\7\n\2\2\u009b\u009d\5\36\20\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\7\4\2\2\u009f\u00a0\7\t"+
		"\2\2\u00a0\u00a2\5$\23\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\7"+
		"\22\2\2\u00a6\u00b7\3\2\2\2\u00a7\u00a9\7\f\2\2\u00a8\u00aa\7\30\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\7\n"+
		"\2\2\u00ac\u00ae\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b2\7\4\2\2\u00b0\u00b1\7\t\2\2\u00b1\u00b3\5$"+
		"\23\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7\27\2\2\u00b5\u00b7\5\n\6\2\u00b6\u0096\3\2\2\2\u00b6\u00a7\3"+
		"\2\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\7\n\2\2\u00ba"+
		"\u00bb\7\30\2\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7"+
		"\4\2\2\u00be\u00bf\5\n\6\2\u00bf\u00cc\3\2\2\2\u00c0\u00c1\7\r\2\2\u00c1"+
		"\u00c2\7\n\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\7"+
		"\t\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\5\n\6\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\u00ca\5\n\6\2\u00ca\u00cc\3\2\2\2\u00cb\u00b8\3\2"+
		"\2\2\u00cb\u00c0\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf"+
		"\7\n\2\2\u00cf\u00d0\5\n\6\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\n\6\2\u00d2"+
		"\25\3\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\22"+
		"\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9\7\27\2\2\u00d9"+
		"\u00e2\5\n\6\2\u00da\u00dc\5\62\32\2\u00db\u00da\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\17\2\2\u00de\u00df\7\n\2\2\u00df"+
		"\u00e0\5\n\6\2\u00e0\u00e1\7\4\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00db\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6"+
		"\7\n\2\2\u00e6\u00e7\5\n\6\2\u00e7\u00e8\7\4\2\2\u00e8\u00ec\5\4\3\2\u00e9"+
		"\u00eb\5\34\17\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\20\2\2\u00f0\u00f2\5\4\3\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4\33\3\2\2\2\u00f5"+
		"\u00f6\7\20\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8\7\n\2\2\u00f8\u00f9\5"+
		"\n\6\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\5\4\3\2\u00fb\35\3\2\2\2\u00fc"+
		"\u0101\5 \21\2\u00fd\u00fe\7\6\2\2\u00fe\u0100\5 \21\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\37\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5\62\32\2\u0105\u0104\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\30\2\2\u0108"+
		"\u0109\7\t\2\2\u0109\u010a\5$\23\2\u010a!\3\2\2\2\u010b\u0110\5\n\6\2"+
		"\u010c\u010d\7\6\2\2\u010d\u010f\5\n\6\2\u010e\u010c\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111#\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0115\5\62\32\2\u0114\u0113\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\30\2\2\u0117%\3\2\2\2\u0118\u011e"+
		"\5(\25\2\u0119\u011e\5*\26\2\u011a\u011e\5,\27\2\u011b\u011e\5.\30\2\u011c"+
		"\u011e\5\60\31\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\'\3\2\2\2\u011f\u0120"+
		"\7\35\2\2\u0120)\3\2\2\2\u0121\u0122\7\34\2\2\u0122+\3\2\2\2\u0123\u0124"+
		"\7\23\2\2\u0124-\3\2\2\2\u0125\u0126\7\b\2\2\u0126\u012b\5\n\6\2\u0127"+
		"\u0128\7\6\2\2\u0128\u012a\5\n\6\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7\3\2\2\u012f\u0133\3\2\2\2\u0130\u0131\7\b"+
		"\2\2\u0131\u0133\7\3\2\2\u0132\u0125\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"/\3\2\2\2\u0134\u0135\7\35\2\2\u0135\u0136\7\13\2\2\u0136\u0137\7\35\2"+
		"\2\u0137\u0138\7\7\2\2\u0138\u0139\7\35\2\2\u0139\61\3\2\2\2\u013a\u013c"+
		"\5\64\33\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\63\3\2\2\2\u013f\u014d\7\33\2\2\u0140\u0141"+
		"\7\33\2\2\u0141\u0142\7\b\2\2\u0142\u0147\5&\24\2\u0143\u0144\7\6\2\2"+
		"\u0144\u0146\5&\24\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7\3\2\2\u014b\u014d\3\2\2\2\u014c\u013f\3\2\2\2\u014c\u0140\3\2"+
		"\2\2\u014d\65\3\2\2\2+;@CIOSW[_cgkosy\u0082\u0088\u008d\u0092\u0098\u009c"+
		"\u00a1\u00a9\u00ad\u00b2\u00b6\u00cb\u00db\u00e2\u00ec\u00f1\u0101\u0105"+
		"\u0110\u0114\u011d\u012b\u0132\u013d\u0147\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}