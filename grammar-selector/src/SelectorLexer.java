// Generated from ../Selector.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SelectorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, WHITESPACE=7, NEWLINE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'>'", "','", "'['", "'='", "ID", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "ID", "LETTER", "WHITESPACE", 
		"NEWLINE"
	};


	public SelectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Selector.g4"; }

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
		case 7: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 8: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\n@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7!\n\7\3\7\3\7\5\7%\n\7\3\7\3\7"+
		"\7\7)\n\7\f\7\16\7,\13\7\3\7\5\7/\n\7\3\b\3\b\3\t\6\t\64\n\t\r\t\16\t"+
		"\65\3\t\3\t\3\n\5\n;\n\n\3\n\3\n\3\n\3\n\2\13\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\2\1\21\t\2\23\n\3\3\2\5\5\2//\62;aa\4\2C\\c|\4\2\13\13"+
		"\"\"E\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2"+
		"\2\2\t\33\3\2\2\2\13\35\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\63\3\2\2\2"+
		"\23:\3\2\2\2\25\26\7_\2\2\26\4\3\2\2\2\27\30\7@\2\2\30\6\3\2\2\2\31\32"+
		"\7.\2\2\32\b\3\2\2\2\33\34\7]\2\2\34\n\3\2\2\2\35\36\7?\2\2\36\f\3\2\2"+
		"\2\37!\7B\2\2 \37\3\2\2\2 !\3\2\2\2!$\3\2\2\2\"%\5\17\b\2#%\7a\2\2$\""+
		"\3\2\2\2$#\3\2\2\2%*\3\2\2\2&)\5\17\b\2\')\t\2\2\2(&\3\2\2\2(\'\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+/\3\2\2\2,*\3\2\2\2-/\7,\2\2. \3\2\2"+
		"\2.-\3\2\2\2/\16\3\2\2\2\60\61\t\3\2\2\61\20\3\2\2\2\62\64\t\4\2\2\63"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		"8\b\t\2\28\22\3\2\2\29;\7\17\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\f\2"+
		"\2=>\3\2\2\2>?\b\n\3\2?\24\3\2\2\2\n\2 $(*.\65:";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}