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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, FUNCTION=19, FOREACH=20, WHILE=21, IF=22, ELSE=23, DO=24, 
		END=25, BOOLEAN=26, SKIP=27, VAR=28, IN=29, ASSIGN=30, AND=31, OR=32, 
		NOT=33, LEFT_PARENTHESIS=34, RIGHT_PARENTHESIS=35, ID=36, COMMENT=37, 
		MULTILINE_COMMENT=38, ATTRIBUTE_ID=39, STRING=40, NUMBER=41, WHITESPACE=42, 
		NEWLINE=43;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "','", "'+'", "'*'", "'-'", "'['", "':'", "'<'", 
		"'!='", "';'", "'<='", "'>'", "'by'", "'=='", "'/'", "'>='", "'..'", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'skip'", "'var'", "'in'", "'='", "'and'", "'or'", "'not'", "'('", "')'", 
		"ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", "STRING", "NUMBER", 
		"WHITESPACE", "NEWLINE"
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
				setState(57); match(11);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << VAR) | (1L << NOT) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0) );
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
				setState(63); ((StatementContext)_localctx).Expression = expression(0);
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
			if (_la==8) {
				{
				setState(95); match(8);
				setState(96); ((VariableDeclarationContext)_localctx).VariableType = typeName();
				}
			}

			setState(99); match(ASSIGN);
			setState(100); ((VariableDeclarationContext)_localctx).VariableDefaultValue = expression(0);
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
		public int _p;
		public ExpressionContext Left;
		public Token Operator;
		public ExpressionContext Expression;
		public ExpressionContext Right;
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
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

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(103); ((ExpressionContext)_localctx).Operator = match(NOT);
				setState(104); ((ExpressionContext)_localctx).Expression = expression(13);
				}
				break;

			case 2:
				{
				setState(105); primaryExpression();
				}
				break;

			case 3:
				{
				setState(106); functionCallExpression();
				}
				break;

			case 4:
				{
				setState(107); memberExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(111); ((ExpressionContext)_localctx).Operator = match(4);
						setState(112); ((ExpressionContext)_localctx).Right = expression(13);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(114); ((ExpressionContext)_localctx).Operator = match(6);
						setState(115); ((ExpressionContext)_localctx).Right = expression(12);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(117); ((ExpressionContext)_localctx).Operator = match(5);
						setState(118); ((ExpressionContext)_localctx).Right = expression(11);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(120); ((ExpressionContext)_localctx).Operator = match(16);
						setState(121); ((ExpressionContext)_localctx).Right = expression(10);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(123); ((ExpressionContext)_localctx).Operator = match(9);
						setState(124); ((ExpressionContext)_localctx).Right = expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(126); ((ExpressionContext)_localctx).Operator = match(13);
						setState(127); ((ExpressionContext)_localctx).Right = expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(129); ((ExpressionContext)_localctx).Operator = match(12);
						setState(130); ((ExpressionContext)_localctx).Right = expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(132); ((ExpressionContext)_localctx).Operator = match(17);
						setState(133); ((ExpressionContext)_localctx).Right = expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(135); ((ExpressionContext)_localctx).Operator = match(15);
						setState(136); ((ExpressionContext)_localctx).Right = expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(138); ((ExpressionContext)_localctx).Operator = match(10);
						setState(139); ((ExpressionContext)_localctx).Right = expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(141); ((ExpressionContext)_localctx).Operator = match(AND);
						setState(142); ((ExpressionContext)_localctx).Right = expression(3);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(144); ((ExpressionContext)_localctx).Operator = match(OR);
						setState(145); ((ExpressionContext)_localctx).Right = expression(2);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 10, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); primaryExpression();
			setState(152); match(LEFT_PARENTHESIS);
			setState(154);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << FUNCTION) | (1L << BOOLEAN) | (1L << NOT) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(153); expression(0);
				}
			}

			setState(156); match(RIGHT_PARENTHESIS);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158); primaryExpression();
			setState(164); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159); match(2);
					setState(162);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(160); match(ID);
						}
						break;

					case 2:
						{
						setState(161); functionCallExpression();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(168); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(171); ((PrimaryExpressionContext)_localctx).Constant = constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(172); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(175); ((PrimaryExpressionContext)_localctx).Id = match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(176); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(179); ((PrimaryExpressionContext)_localctx).Function = functionExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(180); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(183); ((PrimaryExpressionContext)_localctx).Assignment = assignmentExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(184); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(187); match(LEFT_PARENTHESIS);
				setState(188); ((PrimaryExpressionContext)_localctx).InnerExpression = expression(0);
				setState(189); match(RIGHT_PARENTHESIS);
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
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(FUNCTION);
				setState(195);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(194); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(197); match(LEFT_PARENTHESIS);
				setState(199);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(198); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(201); match(RIGHT_PARENTHESIS);
				setState(204);
				_la = _input.LA(1);
				if (_la==8) {
					{
					setState(202); match(8);
					setState(203); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(206); match(DO);
				setState(207); ((FunctionExpressionContext)_localctx).BodyStatements = statements();
				setState(208); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(FUNCTION);
				setState(212);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(211); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(214); match(LEFT_PARENTHESIS);
				setState(216);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(215); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(218); match(RIGHT_PARENTHESIS);
				setState(221);
				_la = _input.LA(1);
				if (_la==8) {
					{
					setState(219); match(8);
					setState(220); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
					}
				}

				setState(223); match(ASSIGN);
				setState(224); ((FunctionExpressionContext)_localctx).BodyExpression = expression(0);
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
		public Token Id;
		public ExpressionContext ArrayExpression;
		public StatementContext Body;
		public Token VarId;
		public TypeNameContext TypeName;
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
		enterRule(_localctx, 18, RULE_foreachStatement);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); match(FOREACH);
				setState(228); match(LEFT_PARENTHESIS);
				setState(229); ((ForeachStatementContext)_localctx).Id = match(ID);
				setState(230); match(IN);
				setState(231); ((ForeachStatementContext)_localctx).ArrayExpression = expression(0);
				setState(232); match(RIGHT_PARENTHESIS);
				setState(233); ((ForeachStatementContext)_localctx).Body = statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); match(FOREACH);
				setState(236); match(LEFT_PARENTHESIS);
				setState(237); match(VAR);
				setState(238); ((ForeachStatementContext)_localctx).VarId = match(ID);
				setState(239); match(8);
				setState(240); ((ForeachStatementContext)_localctx).TypeName = typeName();
				setState(241); match(IN);
				setState(242); ((ForeachStatementContext)_localctx).ArrayExpression = expression(0);
				setState(243); match(RIGHT_PARENTHESIS);
				setState(244); ((ForeachStatementContext)_localctx).Body = statement();
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
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(WHILE);
			setState(249); match(LEFT_PARENTHESIS);
			setState(250); ((WhileStatementContext)_localctx).ConditionExpression = expression(0);
			setState(251); match(RIGHT_PARENTHESIS);
			setState(252); ((WhileStatementContext)_localctx).Body = statement();
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
			setState(254); match(DO);
			setState(255); ((BlockStatementContext)_localctx).Body = statements();
			setState(256); match(END);
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
			setState(258); ((AssignmentExpressionContext)_localctx).Variable = match(ID);
			setState(259); match(ASSIGN);
			setState(260); ((AssignmentExpressionContext)_localctx).Value = expression(0);
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(262);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(261); ((AssignmentExpressionContext)_localctx).ConditionalAttributes = attributes();
					}
				}

				setState(264); match(IF);
				setState(265); match(LEFT_PARENTHESIS);
				setState(266); ((AssignmentExpressionContext)_localctx).ConditionalExpression = expression(0);
				setState(267); match(RIGHT_PARENTHESIS);
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
			setState(271); match(IF);
			setState(272); match(LEFT_PARENTHESIS);
			setState(273); ((IfStatementContext)_localctx).Condition = expression(0);
			setState(274); match(RIGHT_PARENTHESIS);
			setState(275); ((IfStatementContext)_localctx).Statements = statements();
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(276); ((IfStatementContext)_localctx).ElseIfExpressions = elseIfStatement();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(284);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(282); match(ELSE);
				setState(283); ((IfStatementContext)_localctx).ElseStatements = statements();
				}
			}

			setState(286); match(END);
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
			setState(288); match(ELSE);
			setState(289); match(IF);
			setState(290); match(LEFT_PARENTHESIS);
			setState(291); expression(0);
			setState(292); match(RIGHT_PARENTHESIS);
			setState(293); statements();
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
			setState(295); formalParameter();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(296); match(3);
				setState(297); formalParameter();
				}
				}
				setState(302);
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
			setState(304);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(303); attributes();
				}
			}

			setState(306); match(ID);
			setState(307); match(8);
			setState(308); typeName();
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
			setState(310); expression(0);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(311); match(3);
				setState(312); expression(0);
				}
				}
				setState(317);
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
			setState(319);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(318); attributes();
				}
			}

			setState(321); match(ID);
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
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); ((ConstantContext)_localctx).Number = numberConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324); ((ConstantContext)_localctx).String = stringConstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325); ((ConstantContext)_localctx).Boolean = booleanConstant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326); ((ConstantContext)_localctx).Array = arrayConstant();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327); ((ConstantContext)_localctx).Interval = intervalConstant();
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
			setState(330); match(NUMBER);
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
			setState(332); match(STRING);
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
			setState(334); match(BOOLEAN);
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
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336); match(7);
				setState(337); expression(0);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(338); match(3);
					setState(339); expression(0);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); match(7);
				setState(348); expression(0);
				setState(349); match(18);
				setState(350); expression(0);
				setState(351); match(1);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353); match(7);
				setState(354); match(1);
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
			setState(357); ((IntervalConstantContext)_localctx).Start = match(NUMBER);
			setState(358); match(18);
			setState(359); ((IntervalConstantContext)_localctx).End = match(NUMBER);
			{
			setState(360); match(14);
			setState(361); ((IntervalConstantContext)_localctx).By = match(NUMBER);
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
			setState(364); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(363); attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(366); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(368); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(369); match(LEFT_PARENTHESIS);
				setState(370); constant();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(371); match(3);
					setState(372); constant();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378); match(RIGHT_PARENTHESIS);
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
		case 4: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 12 >= _localctx._p;

		case 1: return 11 >= _localctx._p;

		case 2: return 10 >= _localctx._p;

		case 3: return 9 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 2 >= _localctx._p;

		case 11: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3-\u0181\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?"+
		"\3\4\3\4\5\4D\n\4\3\4\3\4\5\4H\n\4\3\4\3\4\5\4L\n\4\3\4\3\4\5\4P\n\4\3"+
		"\4\3\4\5\4T\n\4\3\4\3\4\5\4X\n\4\3\4\5\4[\n\4\3\5\5\5^\n\5\3\5\3\5\3\5"+
		"\3\5\5\5d\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0095"+
		"\n\6\f\6\16\6\u0098\13\6\3\7\3\7\3\7\5\7\u009d\n\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\5\b\u00a5\n\b\6\b\u00a7\n\b\r\b\16\b\u00a8\3\t\5\t\u00ac\n\t\3\t"+
		"\3\t\5\t\u00b0\n\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\5\t\u00b8\n\t\3\t\3\t"+
		"\5\t\u00bc\n\t\3\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\n\3\n\5\n\u00c6\n\n\3\n"+
		"\3\n\5\n\u00ca\n\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00d7\n\n\3\n\3\n\5\n\u00db\n\n\3\n\3\n\3\n\5\n\u00e0\n\n\3\n\3\n\5"+
		"\n\u00e4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f9\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0109\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0110\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0118"+
		"\n\17\f\17\16\17\u011b\13\17\3\17\3\17\5\17\u011f\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u012d\n\21\f\21\16"+
		"\21\u0130\13\21\3\22\5\22\u0133\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u013c\n\23\f\23\16\23\u013f\13\23\3\24\5\24\u0142\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u014b\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0157\n\31\f\31\16\31\u015a\13\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0166\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\6\33\u016f\n\33\r\33\16\33\u0170\3\34\3\34\3\34\3"+
		"\34\3\34\7\34\u0178\n\34\f\34\16\34\u017b\13\34\3\34\3\34\5\34\u017f\n"+
		"\34\3\34\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\2\u01a9\28\3\2\2\2\4=\3\2\2\2\6Z\3\2\2\2\b]\3\2\2\2\nn\3\2\2\2\f"+
		"\u0099\3\2\2\2\16\u00a0\3\2\2\2\20\u00c1\3\2\2\2\22\u00e3\3\2\2\2\24\u00f8"+
		"\3\2\2\2\26\u00fa\3\2\2\2\30\u0100\3\2\2\2\32\u0104\3\2\2\2\34\u0111\3"+
		"\2\2\2\36\u0122\3\2\2\2 \u0129\3\2\2\2\"\u0132\3\2\2\2$\u0138\3\2\2\2"+
		"&\u0141\3\2\2\2(\u014a\3\2\2\2*\u014c\3\2\2\2,\u014e\3\2\2\2.\u0150\3"+
		"\2\2\2\60\u0165\3\2\2\2\62\u0167\3\2\2\2\64\u016e\3\2\2\2\66\u0172\3\2"+
		"\2\289\5\4\3\29\3\3\2\2\2:;\5\6\4\2;<\7\r\2\2<>\3\2\2\2=:\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A[\5\n\6\2BD\5\64\33\2CB\3\2\2\2"+
		"CD\3\2\2\2DE\3\2\2\2E[\5\b\5\2FH\5\64\33\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2"+
		"\2I[\5\34\17\2JL\5\64\33\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2M[\5\30\r\2NP"+
		"\5\64\33\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Q[\5\24\13\2RT\5\64\33\2SR\3\2"+
		"\2\2ST\3\2\2\2TU\3\2\2\2U[\5\26\f\2VX\5\64\33\2WV\3\2\2\2WX\3\2\2\2XY"+
		"\3\2\2\2Y[\7\35\2\2ZA\3\2\2\2ZC\3\2\2\2ZG\3\2\2\2ZK\3\2\2\2ZO\3\2\2\2"+
		"ZS\3\2\2\2ZW\3\2\2\2[\7\3\2\2\2\\^\5\64\33\2]\\\3\2\2\2]^\3\2\2\2^_\3"+
		"\2\2\2_`\7\36\2\2`c\7&\2\2ab\7\n\2\2bd\5&\24\2ca\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2ef\7 \2\2fg\5\n\6\2g\t\3\2\2\2hi\b\6\1\2ij\7#\2\2jo\5\n\6\2ko\5"+
		"\20\t\2lo\5\f\7\2mo\5\16\b\2nh\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o"+
		"\u0096\3\2\2\2pq\6\6\2\3qr\7\6\2\2r\u0095\5\n\6\2st\6\6\3\3tu\7\b\2\2"+
		"u\u0095\5\n\6\2vw\6\6\4\3wx\7\7\2\2x\u0095\5\n\6\2yz\6\6\5\3z{\7\22\2"+
		"\2{\u0095\5\n\6\2|}\6\6\6\3}~\7\13\2\2~\u0095\5\n\6\2\177\u0080\6\6\7"+
		"\3\u0080\u0081\7\17\2\2\u0081\u0095\5\n\6\2\u0082\u0083\6\6\b\3\u0083"+
		"\u0084\7\16\2\2\u0084\u0095\5\n\6\2\u0085\u0086\6\6\t\3\u0086\u0087\7"+
		"\23\2\2\u0087\u0095\5\n\6\2\u0088\u0089\6\6\n\3\u0089\u008a\7\21\2\2\u008a"+
		"\u0095\5\n\6\2\u008b\u008c\6\6\13\3\u008c\u008d\7\f\2\2\u008d\u0095\5"+
		"\n\6\2\u008e\u008f\6\6\f\3\u008f\u0090\7!\2\2\u0090\u0095\5\n\6\2\u0091"+
		"\u0092\6\6\r\3\u0092\u0093\7\"\2\2\u0093\u0095\5\n\6\2\u0094p\3\2\2\2"+
		"\u0094s\3\2\2\2\u0094v\3\2\2\2\u0094y\3\2\2\2\u0094|\3\2\2\2\u0094\177"+
		"\3\2\2\2\u0094\u0082\3\2\2\2\u0094\u0085\3\2\2\2\u0094\u0088\3\2\2\2\u0094"+
		"\u008b\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\13\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\5\20\t\2\u009a\u009c\7$\2\2\u009b\u009d\5\n\6\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7%"+
		"\2\2\u009f\r\3\2\2\2\u00a0\u00a6\5\20\t\2\u00a1\u00a4\7\4\2\2\u00a2\u00a5"+
		"\7&\2\2\u00a3\u00a5\5\f\7\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ac\5\64\33\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c2\5("+
		"\25\2\u00ae\u00b0\5\64\33\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00c2\7&\2\2\u00b2\u00b4\5\64\33\2\u00b3\u00b2\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c2\5\22\n\2\u00b6"+
		"\u00b8\5\64\33\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00c2\5\32\16\2\u00ba\u00bc\5\64\33\2\u00bb\u00ba\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7$\2\2\u00be\u00bf"+
		"\5\n\6\2\u00bf\u00c0\7%\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00ab\3\2\2\2\u00c1"+
		"\u00af\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00bb\3\2"+
		"\2\2\u00c2\21\3\2\2\2\u00c3\u00c5\7\25\2\2\u00c4\u00c6\7&\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\7$\2\2\u00c8"+
		"\u00ca\5 \21\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00ce\7%\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00cf\5&\24\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\32"+
		"\2\2\u00d1\u00d2\5\4\3\2\u00d2\u00d3\7\33\2\2\u00d3\u00e4\3\2\2\2\u00d4"+
		"\u00d6\7\25\2\2\u00d5\u00d7\7&\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7$\2\2\u00d9\u00db\5 \21\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\7%"+
		"\2\2\u00dd\u00de\7\n\2\2\u00de\u00e0\5&\24\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e4\5\n"+
		"\6\2\u00e3\u00c3\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e4\23\3\2\2\2\u00e5\u00e6"+
		"\7\26\2\2\u00e6\u00e7\7$\2\2\u00e7\u00e8\7&\2\2\u00e8\u00e9\7\37\2\2\u00e9"+
		"\u00ea\5\n\6\2\u00ea\u00eb\7%\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00f9\3\2"+
		"\2\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f0\7\36\2\2\u00f0"+
		"\u00f1\7&\2\2\u00f1\u00f2\7\n\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\7\37"+
		"\2\2\u00f4\u00f5\5\n\6\2\u00f5\u00f6\7%\2\2\u00f6\u00f7\5\6\4\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00e5\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f9\25\3\2\2"+
		"\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7$\2\2\u00fc\u00fd\5\n\6\2\u00fd\u00fe"+
		"\7%\2\2\u00fe\u00ff\5\6\4\2\u00ff\27\3\2\2\2\u0100\u0101\7\32\2\2\u0101"+
		"\u0102\5\4\3\2\u0102\u0103\7\33\2\2\u0103\31\3\2\2\2\u0104\u0105\7&\2"+
		"\2\u0105\u0106\7 \2\2\u0106\u010f\5\n\6\2\u0107\u0109\5\64\33\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\30"+
		"\2\2\u010b\u010c\7$\2\2\u010c\u010d\5\n\6\2\u010d\u010e\7%\2\2\u010e\u0110"+
		"\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u0110\3\2\2\2\u0110\33\3\2\2\2\u0111"+
		"\u0112\7\30\2\2\u0112\u0113\7$\2\2\u0113\u0114\5\n\6\2\u0114\u0115\7%"+
		"\2\2\u0115\u0119\5\4\3\2\u0116\u0118\5\36\20\2\u0117\u0116\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\31\2\2\u011d\u011f\5\4\3\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\33"+
		"\2\2\u0121\35\3\2\2\2\u0122\u0123\7\31\2\2\u0123\u0124\7\30\2\2\u0124"+
		"\u0125\7$\2\2\u0125\u0126\5\n\6\2\u0126\u0127\7%\2\2\u0127\u0128\5\4\3"+
		"\2\u0128\37\3\2\2\2\u0129\u012e\5\"\22\2\u012a\u012b\7\5\2\2\u012b\u012d"+
		"\5\"\22\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f!\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\5"+
		"\64\33\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\7&\2\2\u0135\u0136\7\n\2\2\u0136\u0137\5&\24\2\u0137#\3\2\2\2\u0138"+
		"\u013d\5\n\6\2\u0139\u013a\7\5\2\2\u013a\u013c\5\n\6\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"%\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\5\64\33\2\u0141\u0140\3\2\2"+
		"\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7&\2\2\u0144\'"+
		"\3\2\2\2\u0145\u014b\5*\26\2\u0146\u014b\5,\27\2\u0147\u014b\5.\30\2\u0148"+
		"\u014b\5\60\31\2\u0149\u014b\5\62\32\2\u014a\u0145\3\2\2\2\u014a\u0146"+
		"\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		")\3\2\2\2\u014c\u014d\7+\2\2\u014d+\3\2\2\2\u014e\u014f\7*\2\2\u014f-"+
		"\3\2\2\2\u0150\u0151\7\34\2\2\u0151/\3\2\2\2\u0152\u0153\7\t\2\2\u0153"+
		"\u0158\5\n\6\2\u0154\u0155\7\5\2\2\u0155\u0157\5\n\6\2\u0156\u0154\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\3\2\2\u015c\u0166\3\2"+
		"\2\2\u015d\u015e\7\t\2\2\u015e\u015f\5\n\6\2\u015f\u0160\7\24\2\2\u0160"+
		"\u0161\5\n\6\2\u0161\u0162\7\3\2\2\u0162\u0166\3\2\2\2\u0163\u0164\7\t"+
		"\2\2\u0164\u0166\7\3\2\2\u0165\u0152\3\2\2\2\u0165\u015d\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\61\3\2\2\2\u0167\u0168\7+\2\2\u0168\u0169\7\24\2"+
		"\2\u0169\u016a\7+\2\2\u016a\u016b\7\20\2\2\u016b\u016c\7+\2\2\u016c\63"+
		"\3\2\2\2\u016d\u016f\5\66\34\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\65\3\2\2\2\u0172\u017e"+
		"\7)\2\2\u0173\u0174\7$\2\2\u0174\u0179\5(\25\2\u0175\u0176\7\5\2\2\u0176"+
		"\u0178\5(\25\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\7%\2\2\u017d\u017f\3\2\2\2\u017e\u0173\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\67\3\2\2\2.?CGKOSWZ]cn\u0094\u0096\u009c\u00a4\u00a8\u00ab"+
		"\u00af\u00b3\u00b7\u00bb\u00c1\u00c5\u00c9\u00ce\u00d6\u00da\u00df\u00e3"+
		"\u00f8\u0108\u010f\u0119\u011e\u012e\u0132\u013d\u0141\u014a\u0158\u0165"+
		"\u0170\u0179\u017e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}