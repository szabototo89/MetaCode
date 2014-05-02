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
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, BOOLEAN=32, 
		STRING=33, NUMBER=34, ID=35, WHITESPACE=36, NEW_LINE=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'endif'", "','", "'*'", "'-'", "'endfunction'", "'or'", "'not'", "'('", 
		"':'", "'if'", "'<'", "'!='", "'<='", "'and'", "'skip'", "'endloop'", 
		"'do'", "'loop'", "'function'", "')'", "'procedure'", "'+'", "'return'", 
		"'>'", "':='", "'then'", "'begin'", "'/'", "'returns'", "'=='", "'>='", 
		"BOOLEAN", "STRING", "NUMBER", "ID", "WHITESPACE", "NEW_LINE"
	};
	public static final String[] ruleNames = {
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BOOLEAN", "STRING", "NUMBER", 
		"ID", "WHITESPACE", "NEW_LINE"
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
		case 35: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 36: NEW_LINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\'\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00dc\n!\3\""+
		"\3\"\7\"\u00e0\n\"\f\"\16\"\u00e3\13\"\3\"\3\"\3#\6#\u00e8\n#\r#\16#\u00e9"+
		"\3#\3#\6#\u00ee\n#\r#\16#\u00ef\7#\u00f2\n#\f#\16#\u00f5\13#\3$\5$\u00f8"+
		"\n$\3$\7$\u00fb\n$\f$\16$\u00fe\13$\3%\6%\u0101\n%\r%\16%\u0102\3%\3%"+
		"\3&\5&\u0108\n&\3&\3&\3&\3&\3\u00e1\'\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\2K\'\3\3\2\6\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\u0114\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\3M\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\re\3\2\2\2"+
		"\17h\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27s\3\2\2\2\31u\3\2\2"+
		"\2\33x\3\2\2\2\35{\3\2\2\2\37\177\3\2\2\2!\u0084\3\2\2\2#\u008c\3\2\2"+
		"\2%\u008f\3\2\2\2\'\u0094\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a9"+
		"\3\2\2\2/\u00ab\3\2\2\2\61\u00b2\3\2\2\2\63\u00b4\3\2\2\2\65\u00b7\3\2"+
		"\2\2\67\u00bc\3\2\2\29\u00c2\3\2\2\2;\u00c4\3\2\2\2=\u00cc\3\2\2\2?\u00cf"+
		"\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00e7\3\2\2\2G\u00f7\3\2\2\2I"+
		"\u0100\3\2\2\2K\u0107\3\2\2\2MN\7g\2\2NO\7p\2\2OP\7f\2\2PQ\7k\2\2QR\7"+
		"h\2\2R\4\3\2\2\2ST\7.\2\2T\6\3\2\2\2UV\7,\2\2V\b\3\2\2\2WX\7/\2\2X\n\3"+
		"\2\2\2YZ\7g\2\2Z[\7p\2\2[\\\7f\2\2\\]\7h\2\2]^\7w\2\2^_\7p\2\2_`\7e\2"+
		"\2`a\7v\2\2ab\7k\2\2bc\7q\2\2cd\7p\2\2d\f\3\2\2\2ef\7q\2\2fg\7t\2\2g\16"+
		"\3\2\2\2hi\7p\2\2ij\7q\2\2jk\7v\2\2k\20\3\2\2\2lm\7*\2\2m\22\3\2\2\2n"+
		"o\7<\2\2o\24\3\2\2\2pq\7k\2\2qr\7h\2\2r\26\3\2\2\2st\7>\2\2t\30\3\2\2"+
		"\2uv\7#\2\2vw\7?\2\2w\32\3\2\2\2xy\7>\2\2yz\7?\2\2z\34\3\2\2\2{|\7c\2"+
		"\2|}\7p\2\2}~\7f\2\2~\36\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7m\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7r\2\2\u0083 \3\2\2\2\u0084\u0085\7g\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7f\2\2\u0087\u0088\7n\2\2\u0088\u0089\7q\2\2"+
		"\u0089\u008a\7q\2\2\u008a\u008b\7r\2\2\u008b\"\3\2\2\2\u008c\u008d\7f"+
		"\2\2\u008d\u008e\7q\2\2\u008e$\3\2\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7q\2\2\u0092\u0093\7r\2\2\u0093&\3\2\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7w\2\2\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2"+
		"\u009c(\3\2\2\2\u009d\u009e\7+\2\2\u009e*\3\2\2\2\u009f\u00a0\7r\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\u00a5\7f\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7"+
		"t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7w\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7p\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\62"+
		"\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7?\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2"+
		"\u00bb\66\3\2\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7"+
		"i\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c18\3\2\2\2\u00c2\u00c3"+
		"\7\61\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\7?\2\2\u00ce"+
		">\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1\7?\2\2\u00d1@\3\2\2\2\u00d2\u00d3"+
		"\7h\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6"+
		"\u00dc\7g\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7w\2\2"+
		"\u00da\u00dc\7g\2\2\u00db\u00d2\3\2\2\2\u00db\u00d7\3\2\2\2\u00dcB\3\2"+
		"\2\2\u00dd\u00e1\7$\2\2\u00de\u00e0\13\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5D\3\2\2\2\u00e6\u00e8"+
		"\t\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00f3\3\2\2\2\u00eb\u00ed\7\60\2\2\u00ec\u00ee\t"+
		"\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4F\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9"+
		"\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fdH\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101"+
		"\t\5\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b%\2\2\u0105J\3\2\2\2\u0106"+
		"\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b&\3\2\u010c"+
		"L\3\2\2\2\r\2\u00db\u00e1\u00e9\u00ef\u00f3\u00f7\u00fa\u00fc\u0102\u0107";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}