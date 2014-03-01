// Generated from ../MetaCode.g4 by ANTLR 4.2
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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		FUNCTION=10, FOREACH=11, WHILE=12, IF=13, ELSE=14, DO=15, END=16, BOOLEAN=17, 
		SKIP=18, VAR=19, IN=20, ASSIGN=21, ID=22, COMMENT=23, MULTILINE_COMMENT=24, 
		ATTRIBUTE_ID=25, STRING=26, NUMBER=27, WHITESPACE=28, NEWLINE=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "'.'", "','", "'by'", "'['", "':'", "'('", "'..'", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'skip'", "'var'", "'in'", "'='", "ID", "COMMENT", "MULTILINE_COMMENT", 
		"ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"FUNCTION", "FOREACH", "WHILE", "IF", "ELSE", "DO", "END", "BOOLEAN", 
		"SKIP", "VAR", "IN", "ASSIGN", "ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", 
		"LETTER", "STRING", "NUMBER", "INT", "FLOAT", "DIGIT", "WHITESPACE", "NEWLINE"
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
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0102\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0089\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u009b"+
		"\n\27\3\27\3\27\7\27\u009f\n\27\f\27\16\27\u00a2\13\27\3\30\3\30\3\30"+
		"\3\30\7\30\u00a8\n\30\f\30\16\30\u00ab\13\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u00b5\n\31\f\31\16\31\u00b8\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\5\32\u00c2\n\32\3\32\3\32\7\32\u00c6\n\32\f"+
		"\32\16\32\u00c9\13\32\3\33\3\33\3\34\3\34\7\34\u00cf\n\34\f\34\16\34\u00d2"+
		"\13\34\3\34\3\34\3\35\3\35\5\35\u00d8\n\35\3\36\6\36\u00db\n\36\r\36\16"+
		"\36\u00dc\3\37\6\37\u00e0\n\37\r\37\16\37\u00e1\3\37\3\37\7\37\u00e6\n"+
		"\37\f\37\16\37\u00e9\13\37\3\37\3\37\6\37\u00ed\n\37\r\37\16\37\u00ee"+
		"\5\37\u00f1\n\37\3 \3 \3!\6!\u00f6\n!\r!\16!\u00f7\3!\3!\3\"\5\"\u00fd"+
		"\n\"\3\"\3\"\3\"\3\"\5\u00a9\u00b6\u00d0\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\2\67\349\35;\2=\2?\2A\36C\37\3\2\7\4\2\62;"+
		"aa\5\2//\62;aa\4\2C\\c|\3\2\62;\4\2\13\13\"\"\u010f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3"+
		"\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3"+
		"\2\2\2\23V\3\2\2\2\25Y\3\2\2\2\27b\3\2\2\2\31j\3\2\2\2\33p\3\2\2\2\35"+
		"s\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008f"+
		"\3\2\2\2)\u0093\3\2\2\2+\u0096\3\2\2\2-\u009a\3\2\2\2/\u00a3\3\2\2\2\61"+
		"\u00b0\3\2\2\2\63\u00be\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00da\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00f5\3\2\2\2C"+
		"\u00fc\3\2\2\2EF\7_\2\2F\4\3\2\2\2GH\7+\2\2H\6\3\2\2\2IJ\7\60\2\2J\b\3"+
		"\2\2\2KL\7.\2\2L\n\3\2\2\2MN\7d\2\2NO\7{\2\2O\f\3\2\2\2PQ\7]\2\2Q\16\3"+
		"\2\2\2RS\7<\2\2S\20\3\2\2\2TU\7*\2\2U\22\3\2\2\2VW\7\60\2\2WX\7\60\2\2"+
		"X\24\3\2\2\2YZ\7h\2\2Z[\7w\2\2[\\\7p\2\2\\]\7e\2\2]^\7v\2\2^_\7k\2\2_"+
		"`\7q\2\2`a\7p\2\2a\26\3\2\2\2bc\7h\2\2cd\7q\2\2de\7t\2\2ef\7g\2\2fg\7"+
		"c\2\2gh\7e\2\2hi\7j\2\2i\30\3\2\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2"+
		"\2no\7g\2\2o\32\3\2\2\2pq\7k\2\2qr\7h\2\2r\34\3\2\2\2st\7g\2\2tu\7n\2"+
		"\2uv\7u\2\2vw\7g\2\2w\36\3\2\2\2xy\7f\2\2yz\7q\2\2z \3\2\2\2{|\7g\2\2"+
		"|}\7p\2\2}~\7f\2\2~\"\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0089\7g\2\2\u0084\u0085\7v\2\2"+
		"\u0085\u0086\7t\2\2\u0086\u0087\7w\2\2\u0087\u0089\7g\2\2\u0088\177\3"+
		"\2\2\2\u0088\u0084\3\2\2\2\u0089$\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7m\2\2\u008c\u008d\7k\2\2\u008d\u008e\7r\2\2\u008e&\3\2\2\2\u008f\u0090"+
		"\7x\2\2\u0090\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092(\3\2\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7p\2\2\u0095*\3\2\2\2\u0096\u0097\7?\2\2\u0097,\3"+
		"\2\2\2\u0098\u009b\5\65\33\2\u0099\u009b\7a\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u009f\5\65\33\2\u009d\u009f\t"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1.\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8"+
		"\13\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad"+
		"\5C\"\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\30\2\2\u00af\60\3\2\2\2\u00b0"+
		"\u00b1\7\61\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5\13"+
		"\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7,"+
		"\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\31\2\2\u00bd"+
		"\62\3\2\2\2\u00be\u00c1\7B\2\2\u00bf\u00c2\5\65\33\2\u00c0\u00c2\7a\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c6"+
		"\5\65\33\2\u00c4\u00c6\t\3\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\64"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cb\66\3\2\2\2\u00cc"+
		"\u00d0\7$\2\2\u00cd\u00cf\13\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7$\2\2\u00d48\3\2\2\2\u00d5\u00d8\5;\36\2\u00d6"+
		"\u00d8\5=\37\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8:\3\2\2\2"+
		"\u00d9\u00db\5? \2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd<\3\2\2\2\u00de\u00e0\5? \2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e7\7\60\2\2\u00e4\u00e6\5? \2\u00e5\u00e4\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00f1\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7\60\2\2\u00eb\u00ed\5"+
		"? \2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00df\3\2\2\2\u00f0\u00ea\3\2"+
		"\2\2\u00f1>\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3@\3\2\2\2\u00f4\u00f6\t\6"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b!\2\2\u00faB\3\2\2\2\u00fb"+
		"\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\"\2\2\u0101"+
		"D\3\2\2\2\25\2\u0088\u009a\u009e\u00a0\u00a9\u00b6\u00c1\u00c5\u00c7\u00d0"+
		"\u00d7\u00dc\u00e1\u00e7\u00ee\u00f0\u00f7\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}