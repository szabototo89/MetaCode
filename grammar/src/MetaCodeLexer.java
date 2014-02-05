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
		T__2=1, T__1=2, T__0=3, IF=4, ELSE=5, END=6, BOOLEAN=7, VAR=8, ASSIGN=9, 
		ID=10, ATTRIBUTE_ID=11, STRING=12, NUMBER=13, WHITESPACE=14, NEWLINE=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "':'", "'('", "'if'", "'else'", "'end'", "BOOLEAN", "'var'", "'='", 
		"ID", "ATTRIBUTE_ID", "STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "IF", "ELSE", "END", "BOOLEAN", "VAR", "ASSIGN", 
		"ID", "ATTRIBUTE_ID", "LETTER", "STRING", "NUMBER", "INT", "FLOAT", "DIGIT", 
		"WHITESPACE", "NEWLINE"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\21\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13O\n\13\3\13\3\13\7\13S\n\13"+
		"\f\13\16\13V\13\13\3\f\3\f\5\fZ\n\f\3\f\3\f\7\f^\n\f\f\f\16\fa\13\f\3"+
		"\r\3\r\3\16\3\16\7\16g\n\16\f\16\16\16j\13\16\3\16\3\16\3\17\3\17\5\17"+
		"p\n\17\3\20\6\20s\n\20\r\20\16\20t\3\21\6\21x\n\21\r\21\16\21y\3\21\3"+
		"\21\7\21~\n\21\f\21\16\21\u0081\13\21\3\21\3\21\6\21\u0085\n\21\r\21\16"+
		"\21\u0086\5\21\u0089\n\21\3\22\3\22\3\23\6\23\u008e\n\23\r\23\16\23\u008f"+
		"\3\23\3\23\3\24\5\24\u0095\n\24\3\24\3\24\3\24\3\24\3h\25\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\2\1\33"+
		"\16\1\35\17\1\37\2\1!\2\1#\2\1%\20\2\'\21\3\3\2\6\5\2//\62;aa\4\2C\\c"+
		"|\3\2\62;\4\2\13\13\"\"\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\62\3\2\2\2\r\67"+
		"\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23J\3\2\2\2\25N\3\2\2\2\27Y\3\2\2\2\31"+
		"b\3\2\2\2\33d\3\2\2\2\35o\3\2\2\2\37r\3\2\2\2!\u0088\3\2\2\2#\u008a\3"+
		"\2\2\2%\u008d\3\2\2\2\'\u0094\3\2\2\2)*\7+\2\2*\4\3\2\2\2+,\7<\2\2,\6"+
		"\3\2\2\2-.\7*\2\2.\b\3\2\2\2/\60\7k\2\2\60\61\7h\2\2\61\n\3\2\2\2\62\63"+
		"\7g\2\2\63\64\7n\2\2\64\65\7u\2\2\65\66\7g\2\2\66\f\3\2\2\2\678\7g\2\2"+
		"89\7p\2\29:\7f\2\2:\16\3\2\2\2;<\7h\2\2<=\7c\2\2=>\7n\2\2>?\7u\2\2?E\7"+
		"g\2\2@A\7v\2\2AB\7t\2\2BC\7w\2\2CE\7g\2\2D;\3\2\2\2D@\3\2\2\2E\20\3\2"+
		"\2\2FG\7x\2\2GH\7c\2\2HI\7t\2\2I\22\3\2\2\2JK\7?\2\2K\24\3\2\2\2LO\5\31"+
		"\r\2MO\7a\2\2NL\3\2\2\2NM\3\2\2\2OT\3\2\2\2PS\5\31\r\2QS\t\2\2\2RP\3\2"+
		"\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\26\3\2\2\2VT\3\2\2\2WZ\5"+
		"\31\r\2XZ\7a\2\2YW\3\2\2\2YX\3\2\2\2Z_\3\2\2\2[^\5\31\r\2\\^\t\2\2\2]"+
		"[\3\2\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\30\3\2\2\2a_\3\2\2"+
		"\2bc\t\3\2\2c\32\3\2\2\2dh\7$\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2"+
		"\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7$\2\2l\34\3\2\2\2mp\5\37\20\2np"+
		"\5!\21\2om\3\2\2\2on\3\2\2\2p\36\3\2\2\2qs\5#\22\2rq\3\2\2\2st\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2u \3\2\2\2vx\5#\22\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z{\3\2\2\2{\177\7\60\2\2|~\5#\22\2}|\3\2\2\2~\u0081\3\2\2\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0089\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0084\7\60\2\2\u0083\u0085\5#\22\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"w\3\2\2\2\u0088\u0082\3\2\2\2\u0089\"\3\2\2\2\u008a\u008b\t\4\2\2\u008b"+
		"$\3\2\2\2\u008c\u008e\t\5\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\b\23\2\2\u0092&\3\2\2\2\u0093\u0095\7\17\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\f\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\b\24\3\2\u0099(\3\2\2\2\23\2DNRTY]_hoty\177\u0086\u0088"+
		"\u008f\u0094";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}