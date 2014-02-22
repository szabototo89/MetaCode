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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, IF=7, ELSE=8, DO=9, END=10, 
		BOOLEAN=11, SKIP=12, VAR=13, ASSIGN=14, ID=15, ATTRIBUTE_ID=16, STRING=17, 
		NUMBER=18, WHITESPACE=19, NEWLINE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "','", "'['", "':'", "'('", "'if'", "'else'", "'do'", "'end'", 
		"BOOLEAN", "'skip'", "'var'", "'='", "ID", "ATTRIBUTE_ID", "STRING", "NUMBER", 
		"WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "IF", "ELSE", "DO", "END", 
		"BOOLEAN", "SKIP", "VAR", "ASSIGN", "ID", "ATTRIBUTE_ID", "LETTER", "STRING", 
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
		case 22: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 23: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\fX\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\5\20g\n\20\3\20\3\20\7\20k\n\20\f\20\16\20n\13\20\3\21\3"+
		"\21\3\21\5\21s\n\21\3\21\3\21\7\21w\n\21\f\21\16\21z\13\21\3\22\3\22\3"+
		"\23\3\23\7\23\u0080\n\23\f\23\16\23\u0083\13\23\3\23\3\23\3\24\3\24\5"+
		"\24\u0089\n\24\3\25\6\25\u008c\n\25\r\25\16\25\u008d\3\26\6\26\u0091\n"+
		"\26\r\26\16\26\u0092\3\26\3\26\7\26\u0097\n\26\f\26\16\26\u009a\13\26"+
		"\3\26\3\26\6\26\u009e\n\26\r\26\16\26\u009f\5\26\u00a2\n\26\3\27\3\27"+
		"\3\30\6\30\u00a7\n\30\r\30\16\30\u00a8\3\30\3\30\3\31\5\31\u00ae\n\31"+
		"\3\31\3\31\3\31\3\31\3\u0081\32\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\2\1%\23\1\'\24\1)\2\1+\2\1-\2\1/\25\2\61\26\3\3\2\6\5\2//\62;aa\4"+
		"\2C\\c|\3\2\62;\4\2\13\13\"\"\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r"+
		"=\3\2\2\2\17?\3\2\2\2\21B\3\2\2\2\23G\3\2\2\2\25J\3\2\2\2\27W\3\2\2\2"+
		"\31Y\3\2\2\2\33^\3\2\2\2\35b\3\2\2\2\37f\3\2\2\2!o\3\2\2\2#{\3\2\2\2%"+
		"}\3\2\2\2\'\u0088\3\2\2\2)\u008b\3\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2"+
		"/\u00a6\3\2\2\2\61\u00ad\3\2\2\2\63\64\7_\2\2\64\4\3\2\2\2\65\66\7+\2"+
		"\2\66\6\3\2\2\2\678\7.\2\28\b\3\2\2\29:\7]\2\2:\n\3\2\2\2;<\7<\2\2<\f"+
		"\3\2\2\2=>\7*\2\2>\16\3\2\2\2?@\7k\2\2@A\7h\2\2A\20\3\2\2\2BC\7g\2\2C"+
		"D\7n\2\2DE\7u\2\2EF\7g\2\2F\22\3\2\2\2GH\7f\2\2HI\7q\2\2I\24\3\2\2\2J"+
		"K\7g\2\2KL\7p\2\2LM\7f\2\2M\26\3\2\2\2NO\7h\2\2OP\7c\2\2PQ\7n\2\2QR\7"+
		"u\2\2RX\7g\2\2ST\7v\2\2TU\7t\2\2UV\7w\2\2VX\7g\2\2WN\3\2\2\2WS\3\2\2\2"+
		"X\30\3\2\2\2YZ\7u\2\2Z[\7m\2\2[\\\7k\2\2\\]\7r\2\2]\32\3\2\2\2^_\7x\2"+
		"\2_`\7c\2\2`a\7t\2\2a\34\3\2\2\2bc\7?\2\2c\36\3\2\2\2dg\5#\22\2eg\7a\2"+
		"\2fd\3\2\2\2fe\3\2\2\2gl\3\2\2\2hk\5#\22\2ik\t\2\2\2jh\3\2\2\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m \3\2\2\2nl\3\2\2\2or\7B\2\2ps\5#\22"+
		"\2qs\7a\2\2rp\3\2\2\2rq\3\2\2\2sx\3\2\2\2tw\5#\22\2uw\t\2\2\2vt\3\2\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\"\3\2\2\2zx\3\2\2\2{|\t\3"+
		"\2\2|$\3\2\2\2}\u0081\7$\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7$\2\2\u0085&\3\2\2\2\u0086\u0089\5)\25\2\u0087"+
		"\u0089\5+\26\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089(\3\2\2\2"+
		"\u008a\u008c\5-\27\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e*\3\2\2\2\u008f\u0091\5-\27\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0098\7\60\2\2\u0095\u0097\5-\27\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u00a2\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\60\2\2\u009c"+
		"\u009e\5-\27\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0090\3\2\2\2\u00a1"+
		"\u009b\3\2\2\2\u00a2,\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4.\3\2\2\2\u00a5"+
		"\u00a7\t\5\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\30\2\2\u00ab"+
		"\60\3\2\2\2\u00ac\u00ae\7\17\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\b\31\3\2\u00b2\62\3\2\2\2\23\2Wfjlrvx\u0081\u0088\u008d\u0092\u0098\u009f"+
		"\u00a1\u00a8\u00ad";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}