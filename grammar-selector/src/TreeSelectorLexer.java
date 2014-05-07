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
public class TreeSelectorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, WHILE=6, FOREACH=7, FUNCTION=8, 
		SEQUENCE=9, IF=10, BODY=11, EXPRESSION=12, VARIABLE=13, DECLARATION=14, 
		ALL=15, ID=16, WHITESPACE=17, NEWLINE=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'>'", "','", "'['", "'='", "'while'", "'foreach'", "'function'", 
		"'sequence'", "'if'", "'body'", "'expression'", "'variable'", "'declaration'", 
		"'*'", "ID", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "WHILE", "FOREACH", "FUNCTION", 
		"SEQUENCE", "IF", "BODY", "EXPRESSION", "VARIABLE", "DECLARATION", "ALL", 
		"ID", "LETTER", "WHITESPACE", "NEWLINE"
	};


	public TreeSelectorLexer(CharStream input) {
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
		case 17: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 18: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\24\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\5\21\177\n\21\3\21\3\21"+
		"\5\21\u0083\n\21\3\21\3\21\7\21\u0087\n\21\f\21\16\21\u008a\13\21\3\22"+
		"\3\22\3\23\6\23\u008f\n\23\r\23\16\23\u0090\3\23\3\23\3\24\5\24\u0096"+
		"\n\24\3\24\3\24\3\24\3\24\2\25\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\2\1%\23\2\'\24\3\3\2\5\5\2//\62;aa\4\2C\\c|\4\2\13\13\"\"\u009f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2"+
		"\2\r\63\3\2\2\2\179\3\2\2\2\21A\3\2\2\2\23J\3\2\2\2\25S\3\2\2\2\27V\3"+
		"\2\2\2\31[\3\2\2\2\33f\3\2\2\2\35o\3\2\2\2\37{\3\2\2\2!~\3\2\2\2#\u008b"+
		"\3\2\2\2%\u008e\3\2\2\2\'\u0095\3\2\2\2)*\7_\2\2*\4\3\2\2\2+,\7@\2\2,"+
		"\6\3\2\2\2-.\7.\2\2.\b\3\2\2\2/\60\7]\2\2\60\n\3\2\2\2\61\62\7?\2\2\62"+
		"\f\3\2\2\2\63\64\7y\2\2\64\65\7j\2\2\65\66\7k\2\2\66\67\7n\2\2\678\7g"+
		"\2\28\16\3\2\2\29:\7h\2\2:;\7q\2\2;<\7t\2\2<=\7g\2\2=>\7c\2\2>?\7e\2\2"+
		"?@\7j\2\2@\20\3\2\2\2AB\7h\2\2BC\7w\2\2CD\7p\2\2DE\7e\2\2EF\7v\2\2FG\7"+
		"k\2\2GH\7q\2\2HI\7p\2\2I\22\3\2\2\2JK\7u\2\2KL\7g\2\2LM\7s\2\2MN\7w\2"+
		"\2NO\7g\2\2OP\7p\2\2PQ\7e\2\2QR\7g\2\2R\24\3\2\2\2ST\7k\2\2TU\7h\2\2U"+
		"\26\3\2\2\2VW\7d\2\2WX\7q\2\2XY\7f\2\2YZ\7{\2\2Z\30\3\2\2\2[\\\7g\2\2"+
		"\\]\7z\2\2]^\7r\2\2^_\7t\2\2_`\7g\2\2`a\7u\2\2ab\7u\2\2bc\7k\2\2cd\7q"+
		"\2\2de\7p\2\2e\32\3\2\2\2fg\7x\2\2gh\7c\2\2hi\7t\2\2ij\7k\2\2jk\7c\2\2"+
		"kl\7d\2\2lm\7n\2\2mn\7g\2\2n\34\3\2\2\2op\7f\2\2pq\7g\2\2qr\7e\2\2rs\7"+
		"n\2\2st\7c\2\2tu\7t\2\2uv\7c\2\2vw\7v\2\2wx\7k\2\2xy\7q\2\2yz\7p\2\2z"+
		"\36\3\2\2\2{|\7,\2\2| \3\2\2\2}\177\7B\2\2~}\3\2\2\2~\177\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080\u0083\5#\22\2\u0081\u0083\7a\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0081\3\2\2\2\u0083\u0088\3\2\2\2\u0084\u0087\5#\22\2\u0085"+
		"\u0087\t\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\"\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\t\3\2\2\u008c$\3\2\2\2\u008d\u008f\t\4\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\23\2\2\u0093&\3\2\2\2\u0094\u0096"+
		"\7\17\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0098\7\f\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\24\3\2\u009a(\3"+
		"\2\2\2\t\2~\u0082\u0086\u0088\u0090\u0095";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}