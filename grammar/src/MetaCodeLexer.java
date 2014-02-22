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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, FUNCTION=7, FOREACH=8, 
		WHILE=9, IF=10, ELSE=11, DO=12, END=13, BOOLEAN=14, SKIP=15, VAR=16, IN=17, 
		ASSIGN=18, ID=19, COMMENT=20, MULTILINE_COMMENT=21, ATTRIBUTE_ID=22, STRING=23, 
		NUMBER=24, WHITESPACE=25, NEWLINE=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "','", "'['", "':'", "'('", "'function'", "'foreach'", "'while'", 
		"'if'", "'else'", "'do'", "'end'", "BOOLEAN", "'skip'", "'var'", "'in'", 
		"'='", "ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", "STRING", 
		"NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "FUNCTION", "FOREACH", 
		"WHILE", "IF", "ELSE", "DO", "END", "BOOLEAN", "SKIP", "VAR", "IN", "ASSIGN", 
		"ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", "LETTER", "STRING", 
		"NUMBER", "INT", "FLOAT", "DIGIT", "WHITESPACE", "NEWLINE"
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
		case 19: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 28: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 29: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\34\u00f4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17{\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u008d"+
		"\n\24\3\24\3\24\7\24\u0091\n\24\f\24\16\24\u0094\13\24\3\25\3\25\3\25"+
		"\3\25\7\25\u009a\n\25\f\25\16\25\u009d\13\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\7\26\u00a7\n\26\f\26\16\26\u00aa\13\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u00b4\n\27\3\27\3\27\7\27\u00b8\n\27\f"+
		"\27\16\27\u00bb\13\27\3\30\3\30\3\31\3\31\7\31\u00c1\n\31\f\31\16\31\u00c4"+
		"\13\31\3\31\3\31\3\32\3\32\5\32\u00ca\n\32\3\33\6\33\u00cd\n\33\r\33\16"+
		"\33\u00ce\3\34\6\34\u00d2\n\34\r\34\16\34\u00d3\3\34\3\34\7\34\u00d8\n"+
		"\34\f\34\16\34\u00db\13\34\3\34\3\34\6\34\u00df\n\34\r\34\16\34\u00e0"+
		"\5\34\u00e3\n\34\3\35\3\35\3\36\6\36\u00e8\n\36\r\36\16\36\u00e9\3\36"+
		"\3\36\3\37\5\37\u00ef\n\37\3\37\3\37\3\37\3\37\5\u009b\u00a8\u00c2 \3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\2+\27"+
		"\3-\30\1/\2\1\61\31\1\63\32\1\65\2\1\67\2\19\2\1;\33\4=\34\5\3\2\7\4\2"+
		"\62;aa\5\2//\62;aa\4\2C\\c|\3\2\62;\4\2\13\13\"\"\u0101\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13"+
		"G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21T\3\2\2\2\23\\\3\2\2\2\25b\3\2\2\2"+
		"\27e\3\2\2\2\31j\3\2\2\2\33m\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\u0081\3"+
		"\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2\2\'\u008c\3\2\2\2)\u0095\3\2\2\2+\u00a2"+
		"\3\2\2\2-\u00b0\3\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c9\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e7\3\2\2\2=\u00ee"+
		"\3\2\2\2?@\7_\2\2@\4\3\2\2\2AB\7+\2\2B\6\3\2\2\2CD\7.\2\2D\b\3\2\2\2E"+
		"F\7]\2\2F\n\3\2\2\2GH\7<\2\2H\f\3\2\2\2IJ\7*\2\2J\16\3\2\2\2KL\7h\2\2"+
		"LM\7w\2\2MN\7p\2\2NO\7e\2\2OP\7v\2\2PQ\7k\2\2QR\7q\2\2RS\7p\2\2S\20\3"+
		"\2\2\2TU\7h\2\2UV\7q\2\2VW\7t\2\2WX\7g\2\2XY\7c\2\2YZ\7e\2\2Z[\7j\2\2"+
		"[\22\3\2\2\2\\]\7y\2\2]^\7j\2\2^_\7k\2\2_`\7n\2\2`a\7g\2\2a\24\3\2\2\2"+
		"bc\7k\2\2cd\7h\2\2d\26\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\30"+
		"\3\2\2\2jk\7f\2\2kl\7q\2\2l\32\3\2\2\2mn\7g\2\2no\7p\2\2op\7f\2\2p\34"+
		"\3\2\2\2qr\7h\2\2rs\7c\2\2st\7n\2\2tu\7u\2\2u{\7g\2\2vw\7v\2\2wx\7t\2"+
		"\2xy\7w\2\2y{\7g\2\2zq\3\2\2\2zv\3\2\2\2{\36\3\2\2\2|}\7u\2\2}~\7m\2\2"+
		"~\177\7k\2\2\177\u0080\7r\2\2\u0080 \3\2\2\2\u0081\u0082\7x\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\"\3\2\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087$\3\2\2\2\u0088\u0089\7?\2\2\u0089&\3\2\2\2\u008a\u008d"+
		"\5/\30\2\u008b\u008d\7a\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0092\3\2\2\2\u008e\u0091\5/\30\2\u008f\u0091\t\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093(\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\61\2\2"+
		"\u0096\u0097\7\61\2\2\u0097\u009b\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5=\37\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\b\25\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\7\61\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\b\26\3\2\u00af,\3\2\2\2\u00b0\u00b3\7B\2\2"+
		"\u00b1\u00b4\5/\30\2\u00b2\u00b4\7a\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b8\5/\30\2\u00b6\u00b8\t\3\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba.\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\t\4\2\2\u00bd\60\3\2\2\2\u00be\u00c2\7$\2\2\u00bf\u00c1\13\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6"+
		"\62\3\2\2\2\u00c7\u00ca\5\65\33\2\u00c8\u00ca\5\67\34\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\64\3\2\2\2\u00cb\u00cd\59\35\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\66\3\2\2\2\u00d0\u00d2\59\35\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d9\7\60\2\2\u00d6\u00d8\59\35\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e3\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\7\60\2\2\u00dd\u00df\59\35\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e38\3\2\2\2"+
		"\u00e4\u00e5\t\5\2\2\u00e5:\3\2\2\2\u00e6\u00e8\t\6\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b\36\4\2\u00ec<\3\2\2\2\u00ed\u00ef\7\17\2"+
		"\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\7\f\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\37\5\2\u00f3>\3\2\2\2\25\2"+
		"z\u008c\u0090\u0092\u009b\u00a8\u00b3\u00b7\u00b9\u00c2\u00c9\u00ce\u00d3"+
		"\u00d9\u00e0\u00e2\u00e9\u00ee";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}