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
		T__2=1, T__1=2, T__0=3, IF=4, ELSE=5, DO=6, END=7, BOOLEAN=8, SKIP=9, 
		VAR=10, ASSIGN=11, ID=12, ATTRIBUTE_ID=13, STRING=14, NUMBER=15, WHITESPACE=16, 
		NEWLINE=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "':'", "'('", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", "'skip'", 
		"'var'", "'='", "ID", "ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", 
		"NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "IF", "ELSE", "DO", "END", "BOOLEAN", "SKIP", 
		"VAR", "ASSIGN", "ID", "ATTRIBUTE_ID", "LETTER", "STRING", "NUMBER", "INT", 
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
		case 19: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 20: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\5\r[\n\r\3\r\3\r\7\r_\n\r\f\r\16\rb\13\r\3\16\3"+
		"\16\5\16f\n\16\3\16\3\16\7\16j\n\16\f\16\16\16m\13\16\3\17\3\17\3\20\3"+
		"\20\7\20s\n\20\f\20\16\20v\13\20\3\20\3\20\3\21\3\21\5\21|\n\21\3\22\6"+
		"\22\177\n\22\r\22\16\22\u0080\3\23\6\23\u0084\n\23\r\23\16\23\u0085\3"+
		"\23\3\23\7\23\u008a\n\23\f\23\16\23\u008d\13\23\3\23\3\23\6\23\u0091\n"+
		"\23\r\23\16\23\u0092\5\23\u0095\n\23\3\24\3\24\3\25\6\25\u009a\n\25\r"+
		"\25\16\25\u009b\3\25\3\25\3\26\5\26\u00a1\n\26\3\26\3\26\3\26\3\26\3t"+
		"\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\2\1\37\20\1!\21\1#\2\1%\2\1\'\2\1)\22\2+\23"+
		"\3\3\2\6\5\2//\62;aa\4\2C\\c|\3\2\62;\4\2\13\13\"\"\u00b1\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\66\3\2\2\2\r;\3\2\2\2\17>\3\2"+
		"\2\2\21K\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27V\3\2\2\2\31Z\3\2\2\2\33e\3"+
		"\2\2\2\35n\3\2\2\2\37p\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0094\3\2\2\2\'\u0096"+
		"\3\2\2\2)\u0099\3\2\2\2+\u00a0\3\2\2\2-.\7+\2\2.\4\3\2\2\2/\60\7<\2\2"+
		"\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7k\2\2\64\65\7h\2\2\65\n"+
		"\3\2\2\2\66\67\7g\2\2\678\7n\2\289\7u\2\29:\7g\2\2:\f\3\2\2\2;<\7f\2\2"+
		"<=\7q\2\2=\16\3\2\2\2>?\7g\2\2?@\7p\2\2@A\7f\2\2A\20\3\2\2\2BC\7h\2\2"+
		"CD\7c\2\2DE\7n\2\2EF\7u\2\2FL\7g\2\2GH\7v\2\2HI\7t\2\2IJ\7w\2\2JL\7g\2"+
		"\2KB\3\2\2\2KG\3\2\2\2L\22\3\2\2\2MN\7u\2\2NO\7m\2\2OP\7k\2\2PQ\7r\2\2"+
		"Q\24\3\2\2\2RS\7x\2\2ST\7c\2\2TU\7t\2\2U\26\3\2\2\2VW\7?\2\2W\30\3\2\2"+
		"\2X[\5\35\17\2Y[\7a\2\2ZX\3\2\2\2ZY\3\2\2\2[`\3\2\2\2\\_\5\35\17\2]_\t"+
		"\2\2\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\32\3\2\2\2"+
		"b`\3\2\2\2cf\5\35\17\2df\7a\2\2ec\3\2\2\2ed\3\2\2\2fk\3\2\2\2gj\5\35\17"+
		"\2hj\t\2\2\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\34\3\2"+
		"\2\2mk\3\2\2\2no\t\3\2\2o\36\3\2\2\2pt\7$\2\2qs\13\2\2\2rq\3\2\2\2sv\3"+
		"\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7$\2\2x \3\2\2\2y|\5"+
		"#\22\2z|\5%\23\2{y\3\2\2\2{z\3\2\2\2|\"\3\2\2\2}\177\5\'\24\2~}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081$\3\2\2\2"+
		"\u0082\u0084\5\'\24\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7\60\2\2"+
		"\u0088\u008a\5\'\24\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0095\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\7\60\2\2\u008f\u0091\5\'\24\2\u0090\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0083\3\2\2\2\u0094\u008e\3\2\2\2\u0095&\3\2\2\2\u0096\u0097\t\4\2\2"+
		"\u0097(\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\25\2\2\u009e*\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\b\26\3\2\u00a5,\3\2\2\2\23\2KZ^`eikt{\u0080\u0085"+
		"\u008b\u0092\u0094\u009b\u00a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}