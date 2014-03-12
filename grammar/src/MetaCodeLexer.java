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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, FUNCTION=9, 
		FOREACH=10, WHILE=11, IF=12, ELSE=13, DO=14, END=15, BOOLEAN=16, SKIP=17, 
		VAR=18, IN=19, ASSIGN=20, LEFT_PARENTHESIS=21, RIGHT_PARENTHESIS=22, ID=23, 
		COMMENT=24, MULTILINE_COMMENT=25, ATTRIBUTE_ID=26, STRING=27, NUMBER=28, 
		WHITESPACE=29, NEWLINE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'.'", "','", "'by'", "'['", "':'", "';'", "'..'", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'skip'", "'var'", "'in'", "'='", "'('", "')'", "ID", "COMMENT", "MULTILINE_COMMENT", 
		"ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "FUNCTION", 
		"FOREACH", "WHILE", "IF", "ELSE", "DO", "END", "BOOLEAN", "SKIP", "VAR", 
		"IN", "ASSIGN", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "ID", "COMMENT", 
		"MULTILINE_COMMENT", "ATTRIBUTE_ID", "LETTER", "STRING", "NUMBER", "INT", 
		"FLOAT", "DIGIT", "WHITESPACE", "NEWLINE"
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
		case 23: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 24: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 32: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 33: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0089\n\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\5\30\u009f\n\30\3\30\3\30\7\30\u00a3\n\30\f\30\16\30\u00a6\13\30\3\31"+
		"\3\31\3\31\3\31\7\31\u00ac\n\31\f\31\16\31\u00af\13\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u00b9\n\32\f\32\16\32\u00bc\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00c6\n\33\3\33\3\33\7\33\u00ca"+
		"\n\33\f\33\16\33\u00cd\13\33\3\34\3\34\3\35\3\35\7\35\u00d3\n\35\f\35"+
		"\16\35\u00d6\13\35\3\35\3\35\3\36\3\36\5\36\u00dc\n\36\3\37\6\37\u00df"+
		"\n\37\r\37\16\37\u00e0\3 \6 \u00e4\n \r \16 \u00e5\3 \3 \7 \u00ea\n \f"+
		" \16 \u00ed\13 \3 \3 \6 \u00f1\n \r \16 \u00f2\5 \u00f5\n \3!\3!\3\"\6"+
		"\"\u00fa\n\"\r\"\16\"\u00fb\3\"\3\"\3#\5#\u0101\n#\3#\3#\3#\3#\5\u00ad"+
		"\u00ba\u00d4$\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\2\63\33\3\65\34\1\67\2\19\35\1;\36\1"+
		"=\2\1?\2\1A\2\1C\37\4E \5\3\2\7\4\2\62;aa\5\2//\62;aa\4\2C\\c|\3\2\62"+
		";\4\2\13\13\"\"\u0113\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2"+
		"\tM\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2"+
		"\25b\3\2\2\2\27j\3\2\2\2\31p\3\2\2\2\33s\3\2\2\2\35x\3\2\2\2\37{\3\2\2"+
		"\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008f\3\2\2\2\'\u0093\3\2\2\2)\u0096"+
		"\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009e\3\2\2\2\61\u00a7\3\2\2\2"+
		"\63\u00b4\3\2\2\2\65\u00c2\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00db"+
		"\3\2\2\2=\u00de\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f9\3\2\2\2E"+
		"\u0100\3\2\2\2GH\7_\2\2H\4\3\2\2\2IJ\7\60\2\2J\6\3\2\2\2KL\7.\2\2L\b\3"+
		"\2\2\2MN\7d\2\2NO\7{\2\2O\n\3\2\2\2PQ\7]\2\2Q\f\3\2\2\2RS\7<\2\2S\16\3"+
		"\2\2\2TU\7=\2\2U\20\3\2\2\2VW\7\60\2\2WX\7\60\2\2X\22\3\2\2\2YZ\7h\2\2"+
		"Z[\7w\2\2[\\\7p\2\2\\]\7e\2\2]^\7v\2\2^_\7k\2\2_`\7q\2\2`a\7p\2\2a\24"+
		"\3\2\2\2bc\7h\2\2cd\7q\2\2de\7t\2\2ef\7g\2\2fg\7c\2\2gh\7e\2\2hi\7j\2"+
		"\2i\26\3\2\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no\7g\2\2o\30\3\2\2"+
		"\2pq\7k\2\2qr\7h\2\2r\32\3\2\2\2st\7g\2\2tu\7n\2\2uv\7u\2\2vw\7g\2\2w"+
		"\34\3\2\2\2xy\7f\2\2yz\7q\2\2z\36\3\2\2\2{|\7g\2\2|}\7p\2\2}~\7f\2\2~"+
		" \3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082"+
		"\u0083\7u\2\2\u0083\u0089\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7t\2\2"+
		"\u0086\u0087\7w\2\2\u0087\u0089\7g\2\2\u0088\177\3\2\2\2\u0088\u0084\3"+
		"\2\2\2\u0089\"\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c\7m\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7r\2\2\u008e$\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7t\2\2\u0092&\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095"+
		"\7p\2\2\u0095(\3\2\2\2\u0096\u0097\7?\2\2\u0097*\3\2\2\2\u0098\u0099\7"+
		"*\2\2\u0099,\3\2\2\2\u009a\u009b\7+\2\2\u009b.\3\2\2\2\u009c\u009f\5\67"+
		"\34\2\u009d\u009f\7a\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a4\3\2\2\2\u00a0\u00a3\5\67\34\2\u00a1\u00a3\t\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\60\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\61\2"+
		"\2\u00a8\u00a9\7\61\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\13\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5E#\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\b\31\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5"+
		"\u00b6\7,\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7,\2\2\u00be\u00bf\7\61"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\32\3\2\u00c1\64\3\2\2\2\u00c2\u00c5"+
		"\7B\2\2\u00c3\u00c6\5\67\34\2\u00c4\u00c6\7a\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00ca\5\67\34\2\u00c8\u00ca\t"+
		"\3\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\66\3\2\2\2\u00cd\u00cb\3\2\2"+
		"\2\u00ce\u00cf\t\4\2\2\u00cf8\3\2\2\2\u00d0\u00d4\7$\2\2\u00d1\u00d3\13"+
		"\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7$"+
		"\2\2\u00d8:\3\2\2\2\u00d9\u00dc\5=\37\2\u00da\u00dc\5? \2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc<\3\2\2\2\u00dd\u00df\5A!\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		">\3\2\2\2\u00e2\u00e4\5A!\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\7\60"+
		"\2\2\u00e8\u00ea\5A!\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f5\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\7\60\2\2\u00ef\u00f1\5A!\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00e3\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f5@\3\2\2\2\u00f6\u00f7\t\5\2\2"+
		"\u00f7B\3\2\2\2\u00f8\u00fa\t\6\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\b\"\4\2\u00feD\3\2\2\2\u00ff\u0101\7\17\2\2\u0100\u00ff\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b#\5\2\u0105F\3\2\2\2\25\2\u0088\u009e\u00a2\u00a4"+
		"\u00ad\u00ba\u00c5\u00c9\u00cb\u00d4\u00db\u00e0\u00e5\u00eb\u00f2\u00f4"+
		"\u00fb\u0100";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}