// Generated from ../Selector.g4 by ANTLR 4.2
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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, WHILE=7, FOREACH=8, FUNCTION=9, 
		IF=10, TRUE_STATEMENT=11, ELSE_STATEMENT=12, BODY=13, EXPRESSION=14, VARIABLE=15, 
		DECLARATION=16, ALL=17, ID=18, WHITESPACE=19, NEWLINE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'>'", "','", "'+'", "'['", "'='", "'while'", "'foreach'", "'function'", 
		"'if'", "'else-if'", "'else'", "'body'", "'expression'", "'variable'", 
		"'declaration'", "'*'", "ID", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WHILE", "FOREACH", "FUNCTION", 
		"IF", "TRUE_STATEMENT", "ELSE_STATEMENT", "BODY", "EXPRESSION", "VARIABLE", 
		"DECLARATION", "ALL", "ID", "LETTER", "WHITESPACE", "NEWLINE"
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
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\5\23\u0089\n\23\3\23\3\23\5\23\u008d"+
		"\n\23\3\23\3\23\7\23\u0091\n\23\f\23\16\23\u0094\13\23\3\24\3\24\3\25"+
		"\6\25\u0099\n\25\r\25\16\25\u009a\3\25\3\25\3\26\5\26\u00a0\n\26\3\26"+
		"\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26\3\2\5\5\2//\62;aa\4"+
		"\2C\\c|\4\2\13\13\"\"\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2"+
		"\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17"+
		"9\3\2\2\2\21?\3\2\2\2\23G\3\2\2\2\25P\3\2\2\2\27S\3\2\2\2\31[\3\2\2\2"+
		"\33`\3\2\2\2\35e\3\2\2\2\37p\3\2\2\2!y\3\2\2\2#\u0085\3\2\2\2%\u0088\3"+
		"\2\2\2\'\u0095\3\2\2\2)\u0098\3\2\2\2+\u009f\3\2\2\2-.\7_\2\2.\4\3\2\2"+
		"\2/\60\7@\2\2\60\6\3\2\2\2\61\62\7.\2\2\62\b\3\2\2\2\63\64\7-\2\2\64\n"+
		"\3\2\2\2\65\66\7]\2\2\66\f\3\2\2\2\678\7?\2\28\16\3\2\2\29:\7y\2\2:;\7"+
		"j\2\2;<\7k\2\2<=\7n\2\2=>\7g\2\2>\20\3\2\2\2?@\7h\2\2@A\7q\2\2AB\7t\2"+
		"\2BC\7g\2\2CD\7c\2\2DE\7e\2\2EF\7j\2\2F\22\3\2\2\2GH\7h\2\2HI\7w\2\2I"+
		"J\7p\2\2JK\7e\2\2KL\7v\2\2LM\7k\2\2MN\7q\2\2NO\7p\2\2O\24\3\2\2\2PQ\7"+
		"k\2\2QR\7h\2\2R\26\3\2\2\2ST\7g\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2WX\7/\2"+
		"\2XY\7k\2\2YZ\7h\2\2Z\30\3\2\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2"+
		"_\32\3\2\2\2`a\7d\2\2ab\7q\2\2bc\7f\2\2cd\7{\2\2d\34\3\2\2\2ef\7g\2\2"+
		"fg\7z\2\2gh\7r\2\2hi\7t\2\2ij\7g\2\2jk\7u\2\2kl\7u\2\2lm\7k\2\2mn\7q\2"+
		"\2no\7p\2\2o\36\3\2\2\2pq\7x\2\2qr\7c\2\2rs\7t\2\2st\7k\2\2tu\7c\2\2u"+
		"v\7d\2\2vw\7n\2\2wx\7g\2\2x \3\2\2\2yz\7f\2\2z{\7g\2\2{|\7e\2\2|}\7n\2"+
		"\2}~\7c\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\u0081\7v\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084\"\3\2\2\2\u0085\u0086"+
		"\7,\2\2\u0086$\3\2\2\2\u0087\u0089\7B\2\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008d\5\'\24\2\u008b\u008d\7a\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u0091\5\'"+
		"\24\2\u008f\u0091\t\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093&\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0095\u0096\t\3\2\2\u0096(\3\2\2\2\u0097\u0099\t"+
		"\4\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\25\2\2\u009d*\3\2\2\2"+
		"\u009e\u00a0\7\17\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\26\2\2"+
		"\u00a4,\3\2\2\2\t\2\u0088\u008c\u0090\u0092\u009a\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}