// Generated from ../Imperative.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperativeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		BOOLEAN=25, STRING=26, NUMBER=27, ID=28, WHITESPACE=29, NEW_LINE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'do'", "'loop'", "'endif'", "')'", "','", "'+'", "'-'", "'*'", "'or'", 
		"'not'", "'('", "'if'", "'<'", "'!='", "'<='", "'>'", "'and'", "':='", 
		"'then'", "'/'", "'=='", "'skip'", "'>='", "'end'", "BOOLEAN", "STRING", 
		"NUMBER", "ID", "WHITESPACE", "NEW_LINE"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BOOLEAN", 
		"STRING", "NUMBER", "ID", "WHITESPACE", "NEW_LINE"
	};


	public ImperativeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Imperative.g4"; }

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
		case 28: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 29: NEW_LINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void NEW_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u00c5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0094\n\32\3\33\3\33\7\33\u0098\n\33"+
		"\f\33\16\33\u009b\13\33\3\33\3\33\3\34\6\34\u00a0\n\34\r\34\16\34\u00a1"+
		"\3\34\3\34\6\34\u00a6\n\34\r\34\16\34\u00a7\7\34\u00aa\n\34\f\34\16\34"+
		"\u00ad\13\34\3\35\5\35\u00b0\n\35\3\35\7\35\u00b3\n\35\f\35\16\35\u00b6"+
		"\13\35\3\36\6\36\u00b9\n\36\r\36\16\36\u00ba\3\36\3\36\3\37\5\37\u00c0"+
		"\n\37\3\37\3\37\3\37\3\37\3\u0099 \3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1"+
		"!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\2= \3\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"\13\13\"\"\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7G\3\2\2\2\tM"+
		"\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25"+
		"Z\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37h\3\2\2\2"+
		"!k\3\2\2\2#m\3\2\2\2%q\3\2\2\2\'t\3\2\2\2)y\3\2\2\2+{\3\2\2\2-~\3\2\2"+
		"\2/\u0083\3\2\2\2\61\u0086\3\2\2\2\63\u0093\3\2\2\2\65\u0095\3\2\2\2\67"+
		"\u009f\3\2\2\29\u00af\3\2\2\2;\u00b8\3\2\2\2=\u00bf\3\2\2\2?@\7f\2\2@"+
		"A\7q\2\2A\4\3\2\2\2BC\7n\2\2CD\7q\2\2DE\7q\2\2EF\7r\2\2F\6\3\2\2\2GH\7"+
		"g\2\2HI\7p\2\2IJ\7f\2\2JK\7k\2\2KL\7h\2\2L\b\3\2\2\2MN\7+\2\2N\n\3\2\2"+
		"\2OP\7.\2\2P\f\3\2\2\2QR\7-\2\2R\16\3\2\2\2ST\7/\2\2T\20\3\2\2\2UV\7,"+
		"\2\2V\22\3\2\2\2WX\7q\2\2XY\7t\2\2Y\24\3\2\2\2Z[\7p\2\2[\\\7q\2\2\\]\7"+
		"v\2\2]\26\3\2\2\2^_\7*\2\2_\30\3\2\2\2`a\7k\2\2ab\7h\2\2b\32\3\2\2\2c"+
		"d\7>\2\2d\34\3\2\2\2ef\7#\2\2fg\7?\2\2g\36\3\2\2\2hi\7>\2\2ij\7?\2\2j"+
		" \3\2\2\2kl\7@\2\2l\"\3\2\2\2mn\7c\2\2no\7p\2\2op\7f\2\2p$\3\2\2\2qr\7"+
		"<\2\2rs\7?\2\2s&\3\2\2\2tu\7v\2\2uv\7j\2\2vw\7g\2\2wx\7p\2\2x(\3\2\2\2"+
		"yz\7\61\2\2z*\3\2\2\2{|\7?\2\2|}\7?\2\2},\3\2\2\2~\177\7u\2\2\177\u0080"+
		"\7m\2\2\u0080\u0081\7k\2\2\u0081\u0082\7r\2\2\u0082.\3\2\2\2\u0083\u0084"+
		"\7@\2\2\u0084\u0085\7?\2\2\u0085\60\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7f\2\2\u0089\62\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c"+
		"\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u0094\7g\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0094\7g\2\2"+
		"\u0093\u008a\3\2\2\2\u0093\u008f\3\2\2\2\u0094\64\3\2\2\2\u0095\u0099"+
		"\7$\2\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7$\2\2\u009d\66\3\2\2\2\u009e\u00a0\t\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00ab\3\2\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac8\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0"+
		"\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\t\4\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5:\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\36\2\2\u00bd<\3\2\2\2\u00be\u00c0\7\17\2"+
		"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\7\f\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\37\3\2\u00c4>\3\2\2\2\r\2\u0093"+
		"\u0099\u00a1\u00a7\u00ab\u00af\u00b2\u00b4\u00ba\u00bf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}