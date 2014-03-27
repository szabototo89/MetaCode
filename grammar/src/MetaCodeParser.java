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
		NOT=33, NULL=34, RETURN=35, LEFT_PARENTHESIS=36, RIGHT_PARENTHESIS=37, 
		ID=38, COMMENT=39, MULTILINE_COMMENT=40, ATTRIBUTE_ID=41, STRING=42, NUMBER=43, 
		WHITESPACE=44, NEWLINE=45;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "','", "'+'", "'*'", "'-'", "'['", "':'", "'<'", 
		"'!='", "';'", "'<='", "'to'", "'>'", "'by'", "'=='", "'/'", "'>='", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'skip'", "'var'", "'in'", "'='", "'and'", "'or'", "'not'", "'null'", 
		"'return'", "'('", "')'", "ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", 
		"STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_expression = 4, RULE_functionCallExpression = 5, RULE_memberExpression = 6, 
		RULE_memberTagExpression = 7, RULE_primaryExpression = 8, RULE_functionExpression = 9, 
		RULE_foreachStatement = 10, RULE_whileStatement = 11, RULE_blockStatement = 12, 
		RULE_skipStatement = 13, RULE_returnStatement = 14, RULE_assignmentExpression = 15, 
		RULE_ifStatement = 16, RULE_elseIfStatement = 17, RULE_formalParameterList = 18, 
		RULE_formalParameter = 19, RULE_actualParameterList = 20, RULE_typeName = 21, 
		RULE_constant = 22, RULE_identifier = 23, RULE_numberConstant = 24, RULE_stringConstant = 25, 
		RULE_booleanConstant = 26, RULE_arrayConstant = 27, RULE_intervalConstant = 28, 
		RULE_attributes = 29, RULE_attribute = 30;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "variableDeclaration", "expression", 
		"functionCallExpression", "memberExpression", "memberTagExpression", "primaryExpression", 
		"functionExpression", "foreachStatement", "whileStatement", "blockStatement", 
		"skipStatement", "returnStatement", "assignmentExpression", "ifStatement", 
		"elseIfStatement", "formalParameterList", "formalParameter", "actualParameterList", 
		"typeName", "constant", "identifier", "numberConstant", "stringConstant", 
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
			setState(62); statements();
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); statement();
				setState(65); match(11);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << FUNCTION) | (1L << FOREACH) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << BOOLEAN) | (1L << SKIP) | (1L << VAR) | (1L << NOT) | (1L << RETURN) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0) );
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
		public VariableDeclarationContext VariableDeclaration;
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
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); ((StatementContext)_localctx).Expression = expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); ((StatementContext)_localctx).Return = returnStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(73); ((StatementContext)_localctx).Attributes = attributes();
					}
					break;
				}
				setState(76); ((StatementContext)_localctx).VariableDeclaration = variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(77); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(80); ((StatementContext)_localctx).If = ifStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(81); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(84); ((StatementContext)_localctx).Block = blockStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(85); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(88); ((StatementContext)_localctx).Foreach = foreachStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(89); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(92); ((StatementContext)_localctx).While = whileStatement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(93); ((StatementContext)_localctx).Attributes = attributes();
					}
				}

				setState(96); ((StatementContext)_localctx).Skip = skipStatement();
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
			setState(100);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(99); ((VariableDeclarationContext)_localctx).Attributes = attributes();
				}
			}

			setState(102); match(VAR);
			setState(103); ((VariableDeclarationContext)_localctx).VariableName = match(ID);
			setState(106);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(104); match(8);
				setState(105); ((VariableDeclarationContext)_localctx).VariableType = typeName();
				}
			}

			setState(108); match(ASSIGN);
			setState(109); ((VariableDeclarationContext)_localctx).VariableDefaultValue = expression(0);
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
		public PrimaryExpressionContext PrimaryExpression;
		public FunctionCallExpressionContext FunctionCallExpression;
		public MemberExpressionContext MemberExpression;
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
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(112); ((ExpressionContext)_localctx).Operator = match(NOT);
				setState(113); ((ExpressionContext)_localctx).Expression = expression(13);
				}
				break;

			case 2:
				{
				setState(114); ((ExpressionContext)_localctx).PrimaryExpression = primaryExpression();
				}
				break;

			case 3:
				{
				setState(115); ((ExpressionContext)_localctx).FunctionCallExpression = functionCallExpression();
				}
				break;

			case 4:
				{
				setState(116); ((ExpressionContext)_localctx).MemberExpression = memberExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(120); ((ExpressionContext)_localctx).Operator = match(4);
						setState(121); ((ExpressionContext)_localctx).Right = expression(13);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(123); ((ExpressionContext)_localctx).Operator = match(6);
						setState(124); ((ExpressionContext)_localctx).Right = expression(12);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(126); ((ExpressionContext)_localctx).Operator = match(5);
						setState(127); ((ExpressionContext)_localctx).Right = expression(11);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(129); ((ExpressionContext)_localctx).Operator = match(17);
						setState(130); ((ExpressionContext)_localctx).Right = expression(10);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(132); ((ExpressionContext)_localctx).Operator = match(9);
						setState(133); ((ExpressionContext)_localctx).Right = expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(135); ((ExpressionContext)_localctx).Operator = match(14);
						setState(136); ((ExpressionContext)_localctx).Right = expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(138); ((ExpressionContext)_localctx).Operator = match(12);
						setState(139); ((ExpressionContext)_localctx).Right = expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(141); ((ExpressionContext)_localctx).Operator = match(18);
						setState(142); ((ExpressionContext)_localctx).Right = expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(144); ((ExpressionContext)_localctx).Operator = match(16);
						setState(145); ((ExpressionContext)_localctx).Right = expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(147); ((ExpressionContext)_localctx).Operator = match(10);
						setState(148); ((ExpressionContext)_localctx).Right = expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(150); ((ExpressionContext)_localctx).Operator = match(AND);
						setState(151); ((ExpressionContext)_localctx).Right = expression(3);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(153); ((ExpressionContext)_localctx).Operator = match(OR);
						setState(154); ((ExpressionContext)_localctx).Right = expression(2);
						}
						break;
					}
					} 
				}
				setState(159);
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
			setState(160); primaryExpression();
			setState(161); match(LEFT_PARENTHESIS);
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << FUNCTION) | (1L << BOOLEAN) | (1L << NOT) | (1L << LEFT_PARENTHESIS) | (1L << ID) | (1L << ATTRIBUTE_ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(162); expression(0);
				}
			}

			setState(165); match(RIGHT_PARENTHESIS);
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
		public MemberTagExpressionContext memberTagExpression(int i) {
			return getRuleContext(MemberTagExpressionContext.class,i);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<MemberTagExpressionContext> memberTagExpression() {
			return getRuleContexts(MemberTagExpressionContext.class);
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
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(167); primaryExpression();
				}
				break;

			case 2:
				{
				setState(168); functionCallExpression();
				}
				break;
			}
			setState(173); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171); match(2);
					setState(172); memberTagExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); 
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
		enterRule(_localctx, 14, RULE_memberTagExpression);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); functionCallExpression();
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
		enterRule(_localctx, 16, RULE_primaryExpression);
		int _la;
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(181); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(184); ((PrimaryExpressionContext)_localctx).Constant = constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(185); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(188); ((PrimaryExpressionContext)_localctx).Id = match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(189); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(192); ((PrimaryExpressionContext)_localctx).Function = functionExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(193); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(196); ((PrimaryExpressionContext)_localctx).Assignment = assignmentExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(197); ((PrimaryExpressionContext)_localctx).Attributes = attributes();
					}
				}

				setState(200); match(LEFT_PARENTHESIS);
				setState(201); ((PrimaryExpressionContext)_localctx).InnerExpression = expression(0);
				setState(202); match(RIGHT_PARENTHESIS);
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
		enterRule(_localctx, 18, RULE_functionExpression);
		int _la;
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); match(FUNCTION);
				setState(208);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(207); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(210); match(LEFT_PARENTHESIS);
				setState(212);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(211); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(214); match(RIGHT_PARENTHESIS);
				{
				setState(215); match(8);
				setState(216); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
				}
				setState(218); match(DO);
				setState(219); ((FunctionExpressionContext)_localctx).BodyStatements = statements();
				setState(220); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); match(FUNCTION);
				setState(224);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(223); ((FunctionExpressionContext)_localctx).FunctionName = match(ID);
					}
				}

				setState(226); match(LEFT_PARENTHESIS);
				setState(228);
				_la = _input.LA(1);
				if (_la==ID || _la==ATTRIBUTE_ID) {
					{
					setState(227); ((FunctionExpressionContext)_localctx).Parameters = formalParameterList();
					}
				}

				setState(230); match(RIGHT_PARENTHESIS);
				{
				setState(231); match(8);
				setState(232); ((FunctionExpressionContext)_localctx).ReturnType = typeName();
				}
				setState(234); match(ASSIGN);
				setState(235); ((FunctionExpressionContext)_localctx).BodyExpression = expression(0);
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
		enterRule(_localctx, 20, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(FOREACH);
			setState(240); match(LEFT_PARENTHESIS);
			setState(242);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(241); ((ForeachStatementContext)_localctx).Var = match(VAR);
				}
			}

			setState(244); ((ForeachStatementContext)_localctx).Id = match(ID);
			setState(247);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(245); match(8);
				setState(246); ((ForeachStatementContext)_localctx).VariableType = typeName();
				}
			}

			setState(249); match(IN);
			setState(250); ((ForeachStatementContext)_localctx).ArrayExpression = expression(0);
			setState(251); match(RIGHT_PARENTHESIS);
			setState(252); ((ForeachStatementContext)_localctx).Body = statement();
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
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(WHILE);
			setState(255); match(LEFT_PARENTHESIS);
			setState(256); ((WhileStatementContext)_localctx).ConditionExpression = expression(0);
			setState(257); match(RIGHT_PARENTHESIS);
			setState(258); ((WhileStatementContext)_localctx).Body = statement();
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
		enterRule(_localctx, 24, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(DO);
			setState(261); ((BlockStatementContext)_localctx).Body = statements();
			setState(262); match(END);
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
		enterRule(_localctx, 26, RULE_skipStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(SKIP);
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
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(RETURN);
			setState(267); expression(0);
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
		enterRule(_localctx, 30, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); ((AssignmentExpressionContext)_localctx).Variable = match(ID);
			setState(270); match(ASSIGN);
			setState(271); ((AssignmentExpressionContext)_localctx).Value = expression(0);
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(273);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE_ID) {
					{
					setState(272); ((AssignmentExpressionContext)_localctx).ConditionalAttributes = attributes();
					}
				}

				setState(275); match(IF);
				setState(276); match(LEFT_PARENTHESIS);
				setState(277); ((AssignmentExpressionContext)_localctx).ConditionalExpression = expression(0);
				setState(278); match(RIGHT_PARENTHESIS);
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
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(IF);
			setState(283); match(LEFT_PARENTHESIS);
			setState(284); ((IfStatementContext)_localctx).Condition = expression(0);
			setState(285); match(RIGHT_PARENTHESIS);
			setState(286); ((IfStatementContext)_localctx).Statements = statements();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(287); ((IfStatementContext)_localctx).ElseIfStatements = elseIfStatement();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(295);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(293); match(ELSE);
				setState(294); ((IfStatementContext)_localctx).ElseStatements = statements();
				}
			}

			setState(297); match(END);
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
		enterRule(_localctx, 34, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(ELSE);
			setState(300); match(IF);
			setState(301); match(LEFT_PARENTHESIS);
			setState(302); ((ElseIfStatementContext)_localctx).Condition = expression(0);
			setState(303); match(RIGHT_PARENTHESIS);
			setState(304); ((ElseIfStatementContext)_localctx).Statements = statements();
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
		enterRule(_localctx, 36, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); formalParameter();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(307); match(3);
				setState(308); formalParameter();
				}
				}
				setState(313);
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
		enterRule(_localctx, 38, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(314); ((FormalParameterContext)_localctx).Attributes = attributes();
				}
			}

			setState(317); ((FormalParameterContext)_localctx).Name = match(ID);
			setState(318); match(8);
			setState(319); ((FormalParameterContext)_localctx).Type = typeName();
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
		enterRule(_localctx, 40, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); expression(0);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(322); match(3);
				setState(323); expression(0);
				}
				}
				setState(328);
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
		enterRule(_localctx, 42, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE_ID) {
				{
				setState(329); attributes();
				}
			}

			setState(332); match(ID);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(333); match(2);
				setState(334); match(ID);
				}
				}
				setState(339);
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
		enterRule(_localctx, 44, RULE_constant);
		try {
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340); ((ConstantContext)_localctx).Number = numberConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341); ((ConstantContext)_localctx).String = stringConstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342); ((ConstantContext)_localctx).Boolean = booleanConstant();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343); ((ConstantContext)_localctx).Array = arrayConstant();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344); ((ConstantContext)_localctx).Interval = intervalConstant();
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
		enterRule(_localctx, 46, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); ((IdentifierContext)_localctx).Id = match(ID);
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
		enterRule(_localctx, 48, RULE_numberConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(NUMBER);
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
		enterRule(_localctx, 50, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(STRING);
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
		enterRule(_localctx, 52, RULE_booleanConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(BOOLEAN);
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
		enterRule(_localctx, 54, RULE_arrayConstant);
		int _la;
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); match(7);
				setState(356); expression(0);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(357); match(3);
					setState(358); expression(0);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); match(7);
				setState(367); match(1);
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
		enterRule(_localctx, 56, RULE_intervalConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); ((IntervalConstantContext)_localctx).Start = match(NUMBER);
			setState(371); match(13);
			setState(372); ((IntervalConstantContext)_localctx).End = match(NUMBER);
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(373); match(15);
				setState(374); ((IntervalConstantContext)_localctx).By = match(NUMBER);
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
		enterRule(_localctx, 58, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(377); attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(380); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 60, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); ((AttributeContext)_localctx).Name = match(ATTRIBUTE_ID);
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(383); match(LEFT_PARENTHESIS);
				setState(384); constant();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(385); match(3);
					setState(386); constant();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392); match(RIGHT_PARENTHESIS);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3/\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\5\4Q"+
		"\n\4\3\4\3\4\5\4U\n\4\3\4\3\4\5\4Y\n\4\3\4\3\4\5\4]\n\4\3\4\3\4\5\4a\n"+
		"\4\3\4\5\4d\n\4\3\5\5\5g\n\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009e\n\6\f\6\16\6\u00a1\13\6\3"+
		"\7\3\7\3\7\5\7\u00a6\n\7\3\7\3\7\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\6\b\u00b0"+
		"\n\b\r\b\16\b\u00b1\3\t\3\t\5\t\u00b6\n\t\3\n\5\n\u00b9\n\n\3\n\3\n\5"+
		"\n\u00bd\n\n\3\n\3\n\5\n\u00c1\n\n\3\n\3\n\5\n\u00c5\n\n\3\n\3\n\5\n\u00c9"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\13\3\13\5\13\u00d3\n\13\3\13\3\13"+
		"\5\13\u00d7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00e3\n\13\3\13\3\13\5\13\u00e7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00f0\n\13\3\f\3\f\3\f\5\f\u00f5\n\f\3\f\3\f\3\f\5\f\u00fa\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0114\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u011b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0123\n"+
		"\22\f\22\16\22\u0126\13\22\3\22\3\22\5\22\u012a\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u0138\n\24\f\24\16\24"+
		"\u013b\13\24\3\25\5\25\u013e\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7"+
		"\26\u0147\n\26\f\26\16\26\u014a\13\26\3\27\5\27\u014d\n\27\3\27\3\27\3"+
		"\27\7\27\u0152\n\27\f\27\16\27\u0155\13\27\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u015c\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0173\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u017a\n\36\3\37\6\37\u017d\n"+
		"\37\r\37\16\37\u017e\3 \3 \3 \3 \3 \7 \u0186\n \f \16 \u0189\13 \3 \3"+
		" \5 \u018d\n \3 \2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>\2\2\u01b5\2@\3\2\2\2\4E\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\n"+
		"w\3\2\2\2\f\u00a2\3\2\2\2\16\u00ab\3\2\2\2\20\u00b5\3\2\2\2\22\u00ce\3"+
		"\2\2\2\24\u00ef\3\2\2\2\26\u00f1\3\2\2\2\30\u0100\3\2\2\2\32\u0106\3\2"+
		"\2\2\34\u010a\3\2\2\2\36\u010c\3\2\2\2 \u010f\3\2\2\2\"\u011c\3\2\2\2"+
		"$\u012d\3\2\2\2&\u0134\3\2\2\2(\u013d\3\2\2\2*\u0143\3\2\2\2,\u014c\3"+
		"\2\2\2.\u015b\3\2\2\2\60\u015d\3\2\2\2\62\u015f\3\2\2\2\64\u0161\3\2\2"+
		"\2\66\u0163\3\2\2\28\u0172\3\2\2\2:\u0174\3\2\2\2<\u017c\3\2\2\2>\u0180"+
		"\3\2\2\2@A\5\4\3\2A\3\3\2\2\2BC\5\6\4\2CD\7\r\2\2DF\3\2\2\2EB\3\2\2\2"+
		"FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2Id\5\n\6\2Jd\5\36\20\2KM\5<\37"+
		"\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2Nd\5\b\5\2OQ\5<\37\2PO\3\2\2\2PQ\3\2\2"+
		"\2QR\3\2\2\2Rd\5\"\22\2SU\5<\37\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Vd\5\32"+
		"\16\2WY\5<\37\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Zd\5\26\f\2[]\5<\37\2\\["+
		"\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^d\5\30\r\2_a\5<\37\2`_\3\2\2\2`a\3\2\2\2"+
		"ab\3\2\2\2bd\5\34\17\2cI\3\2\2\2cJ\3\2\2\2cL\3\2\2\2cP\3\2\2\2cT\3\2\2"+
		"\2cX\3\2\2\2c\\\3\2\2\2c`\3\2\2\2d\7\3\2\2\2eg\5<\37\2fe\3\2\2\2fg\3\2"+
		"\2\2gh\3\2\2\2hi\7\36\2\2il\7(\2\2jk\7\n\2\2km\5,\27\2lj\3\2\2\2lm\3\2"+
		"\2\2mn\3\2\2\2no\7 \2\2op\5\n\6\2p\t\3\2\2\2qr\b\6\1\2rs\7#\2\2sx\5\n"+
		"\6\2tx\5\22\n\2ux\5\f\7\2vx\5\16\b\2wq\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3"+
		"\2\2\2x\u009f\3\2\2\2yz\6\6\2\3z{\7\6\2\2{\u009e\5\n\6\2|}\6\6\3\3}~\7"+
		"\b\2\2~\u009e\5\n\6\2\177\u0080\6\6\4\3\u0080\u0081\7\7\2\2\u0081\u009e"+
		"\5\n\6\2\u0082\u0083\6\6\5\3\u0083\u0084\7\23\2\2\u0084\u009e\5\n\6\2"+
		"\u0085\u0086\6\6\6\3\u0086\u0087\7\13\2\2\u0087\u009e\5\n\6\2\u0088\u0089"+
		"\6\6\7\3\u0089\u008a\7\20\2\2\u008a\u009e\5\n\6\2\u008b\u008c\6\6\b\3"+
		"\u008c\u008d\7\16\2\2\u008d\u009e\5\n\6\2\u008e\u008f\6\6\t\3\u008f\u0090"+
		"\7\24\2\2\u0090\u009e\5\n\6\2\u0091\u0092\6\6\n\3\u0092\u0093\7\22\2\2"+
		"\u0093\u009e\5\n\6\2\u0094\u0095\6\6\13\3\u0095\u0096\7\f\2\2\u0096\u009e"+
		"\5\n\6\2\u0097\u0098\6\6\f\3\u0098\u0099\7!\2\2\u0099\u009e\5\n\6\2\u009a"+
		"\u009b\6\6\r\3\u009b\u009c\7\"\2\2\u009c\u009e\5\n\6\2\u009dy\3\2\2\2"+
		"\u009d|\3\2\2\2\u009d\177\3\2\2\2\u009d\u0082\3\2\2\2\u009d\u0085\3\2"+
		"\2\2\u009d\u0088\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u008e\3\2\2\2\u009d"+
		"\u0091\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\13\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a5\7&\2"+
		"\2\u00a4\u00a6\5\n\6\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8\r\3\2\2\2\u00a9\u00ac\5\22\n\2\u00aa"+
		"\u00ac\5\f\7\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00b0\5\20\t\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\17\3\2\2"+
		"\2\u00b3\u00b6\5\60\31\2\u00b4\u00b6\5\f\7\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\21\3\2\2\2\u00b7\u00b9\5<\37\2\u00b8\u00b7\3\2\2"+
		"\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00cf\5.\30\2\u00bb\u00bd"+
		"\5<\37\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00cf\7(\2\2\u00bf\u00c1\5<\37\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cf\5\24\13\2\u00c3\u00c5\5<\37\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf\5 "+
		"\21\2\u00c7\u00c9\5<\37\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\'"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00b8\3\2\2\2\u00ce\u00bc\3\2\2\2\u00ce"+
		"\u00c0\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c8\3\2\2\2\u00cf\23\3\2\2"+
		"\2\u00d0\u00d2\7\25\2\2\u00d1\u00d3\7(\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7&\2\2\u00d5\u00d7\5&\24\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\'"+
		"\2\2\u00d9\u00da\7\n\2\2\u00da\u00db\5,\27\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\7\32\2\2\u00dd\u00de\5\4\3\2\u00de\u00df\7\33\2\2\u00df\u00f0\3"+
		"\2\2\2\u00e0\u00e2\7\25\2\2\u00e1\u00e3\7(\2\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\7&\2\2\u00e5\u00e7\5&\24"+
		"\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\7\'\2\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\5,\27\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\7 \2\2\u00ed\u00ee\5\n\6\2\u00ee\u00f0\3\2\2\2\u00ef\u00d0\3\2"+
		"\2\2\u00ef\u00e0\3\2\2\2\u00f0\25\3\2\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f4"+
		"\7&\2\2\u00f3\u00f5\7\36\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f9\7(\2\2\u00f7\u00f8\7\n\2\2\u00f8\u00fa\5,\27"+
		"\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\7\37\2\2\u00fc\u00fd\5\n\6\2\u00fd\u00fe\7\'\2\2\u00fe\u00ff\5\6\4\2"+
		"\u00ff\27\3\2\2\2\u0100\u0101\7\27\2\2\u0101\u0102\7&\2\2\u0102\u0103"+
		"\5\n\6\2\u0103\u0104\7\'\2\2\u0104\u0105\5\6\4\2\u0105\31\3\2\2\2\u0106"+
		"\u0107\7\32\2\2\u0107\u0108\5\4\3\2\u0108\u0109\7\33\2\2\u0109\33\3\2"+
		"\2\2\u010a\u010b\7\35\2\2\u010b\35\3\2\2\2\u010c\u010d\7%\2\2\u010d\u010e"+
		"\5\n\6\2\u010e\37\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0111\7 \2\2\u0111"+
		"\u011a\5\n\6\2\u0112\u0114\5<\37\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\30\2\2\u0116\u0117\7&\2\2\u0117"+
		"\u0118\5\n\6\2\u0118\u0119\7\'\2\2\u0119\u011b\3\2\2\2\u011a\u0113\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b!\3\2\2\2\u011c\u011d\7\30\2\2\u011d\u011e"+
		"\7&\2\2\u011e\u011f\5\n\6\2\u011f\u0120\7\'\2\2\u0120\u0124\5\4\3\2\u0121"+
		"\u0123\5$\23\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\7\31\2\2\u0128\u012a\5\4\3\2\u0129\u0127\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\33\2\2\u012c#\3\2\2\2\u012d\u012e"+
		"\7\31\2\2\u012e\u012f\7\30\2\2\u012f\u0130\7&\2\2\u0130\u0131\5\n\6\2"+
		"\u0131\u0132\7\'\2\2\u0132\u0133\5\4\3\2\u0133%\3\2\2\2\u0134\u0139\5"+
		"(\25\2\u0135\u0136\7\5\2\2\u0136\u0138\5(\25\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\'\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013e\5<\37\2\u013d\u013c\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7(\2\2\u0140\u0141\7\n\2\2\u0141"+
		"\u0142\5,\27\2\u0142)\3\2\2\2\u0143\u0148\5\n\6\2\u0144\u0145\7\5\2\2"+
		"\u0145\u0147\5\n\6\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149+\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014d\5<\37\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0153\7(\2\2\u014f\u0150\7\4\2\2\u0150\u0152\7(\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"-\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015c\5\62\32\2\u0157\u015c\5\64\33"+
		"\2\u0158\u015c\5\66\34\2\u0159\u015c\58\35\2\u015a\u015c\5:\36\2\u015b"+
		"\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015a\3\2\2\2\u015c/\3\2\2\2\u015d\u015e\7(\2\2\u015e\61\3"+
		"\2\2\2\u015f\u0160\7-\2\2\u0160\63\3\2\2\2\u0161\u0162\7,\2\2\u0162\65"+
		"\3\2\2\2\u0163\u0164\7\34\2\2\u0164\67\3\2\2\2\u0165\u0166\7\t\2\2\u0166"+
		"\u016b\5\n\6\2\u0167\u0168\7\5\2\2\u0168\u016a\5\n\6\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\3\2\2\u016f\u0173\3\2"+
		"\2\2\u0170\u0171\7\t\2\2\u0171\u0173\7\3\2\2\u0172\u0165\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u01739\3\2\2\2\u0174\u0175\7-\2\2\u0175\u0176\7\17\2\2"+
		"\u0176\u0179\7-\2\2\u0177\u0178\7\21\2\2\u0178\u017a\7-\2\2\u0179\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a;\3\2\2\2\u017b\u017d\5> \2\u017c\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"=\3\2\2\2\u0180\u018c\7+\2\2\u0181\u0182\7&\2\2\u0182\u0187\5.\30\2\u0183"+
		"\u0184\7\5\2\2\u0184\u0186\5.\30\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018b\7\'\2\2\u018b\u018d\3\2\2\2\u018c\u0181\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d?\3\2\2\2\60GLPTX\\`cflw\u009d\u009f\u00a5"+
		"\u00ab\u00b1\u00b5\u00b8\u00bc\u00c0\u00c4\u00c8\u00ce\u00d2\u00d6\u00e2"+
		"\u00e6\u00ef\u00f4\u00f9\u0113\u011a\u0124\u0129\u0139\u013d\u0148\u014c"+
		"\u0153\u015b\u016b\u0172\u0179\u017e\u0187\u018c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}