// Generated from ../MetaCode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaCodeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, NUMBER=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "NEWLINE", "NUMBER"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "NEWLINE", "NUMBER", "INT", "FLOAT", "DIGIT"
	};


	public MetaCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MetaCode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 1: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\5<\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4 \n\4\3\5\6\5#\n\5\r\5"+
		"\16\5$\3\6\6\6(\n\6\r\6\16\6)\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\6\3"+
		"\6\6\6\65\n\6\r\6\16\6\66\5\69\n\6\3\7\3\7\2\b\3\3\2\5\4\3\7\5\1\t\2\1"+
		"\13\2\1\r\2\1\3\2\4\4\2\13\13\"\"\3\2\62;@\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\3\20\3\2\2\2\5\27\3\2\2\2\7\37\3\2\2\2\t\"\3\2\2\2\138\3\2\2"+
		"\2\r:\3\2\2\2\17\21\t\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2"+
		"\22\23\3\2\2\2\23\24\3\2\2\2\24\25\b\2\2\2\25\4\3\2\2\2\26\30\7\17\2\2"+
		"\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\f\2\2\32\33\3\2\2\2"+
		"\33\34\b\3\3\2\34\6\3\2\2\2\35 \5\t\5\2\36 \5\13\6\2\37\35\3\2\2\2\37"+
		"\36\3\2\2\2 \b\3\2\2\2!#\5\r\7\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2"+
		"\2\2%\n\3\2\2\2&(\5\r\7\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+"+
		"\3\2\2\2+/\7\60\2\2,.\5\r\7\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\609\3\2\2\2\61/\3\2\2\2\62\64\7\60\2\2\63\65\5\r\7\2\64\63\3\2\2"+
		"\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\'\3\2\2\28\62"+
		"\3\2\2\29\f\3\2\2\2:;\t\3\2\2;\16\3\2\2\2\13\2\22\27\37$)/\668";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}