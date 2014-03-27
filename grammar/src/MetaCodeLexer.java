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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, FUNCTION=19, FOREACH=20, WHILE=21, IF=22, ELSE=23, DO=24, 
		END=25, BOOLEAN=26, SKIP=27, VAR=28, IN=29, ASSIGN=30, AND=31, OR=32, 
		NOT=33, NULL=34, RETURN=35, LEFT_PARENTHESIS=36, RIGHT_PARENTHESIS=37, 
		ID=38, COMMENT=39, MULTILINE_COMMENT=40, ATTRIBUTE_ID=41, STRING=42, NUMBER=43, 
		WHITESPACE=44, NEWLINE=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'.'", "','", "'+'", "'*'", "'-'", "'['", "':'", "'<'", "'!='", 
		"';'", "'<='", "'to'", "'>'", "'by'", "'=='", "'/'", "'>='", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'skip'", "'var'", "'in'", "'='", "'and'", "'or'", "'not'", "'null'", 
		"'return'", "'('", "')'", "ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", 
		"STRING", "NUMBER", "WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "FUNCTION", "FOREACH", "WHILE", "IF", "ELSE", "DO", "END", "BOOLEAN", 
		"SKIP", "VAR", "IN", "ASSIGN", "AND", "OR", "NOT", "NULL", "RETURN", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "ID", "COMMENT", "MULTILINE_COMMENT", "ATTRIBUTE_ID", 
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 38: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 39: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 48: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2/\u0153\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00bf\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u00ec\n\'\3\'\3\'\7\'\u00f0\n\'\f\'\16\'"+
		"\u00f3\13\'\3(\3(\3(\3(\7(\u00f9\n(\f(\16(\u00fc\13(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\7)\u0106\n)\f)\16)\u0109\13)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u0113"+
		"\n*\3*\3*\7*\u0117\n*\f*\16*\u011a\13*\3+\3+\3,\3,\7,\u0120\n,\f,\16,"+
		"\u0123\13,\3,\3,\3-\3-\5-\u0129\n-\3.\6.\u012c\n.\r.\16.\u012d\3/\6/\u0131"+
		"\n/\r/\16/\u0132\3/\3/\7/\u0137\n/\f/\16/\u013a\13/\3/\3/\6/\u013e\n/"+
		"\r/\16/\u013f\5/\u0142\n/\3\60\3\60\3\61\6\61\u0147\n\61\r\61\16\61\u0148"+
		"\3\61\3\61\3\62\5\62\u014e\n\62\3\62\3\62\3\62\3\62\5\u00fa\u0107\u0121"+
		"\63\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1"+
		"A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\2Q*\3S+\1U\2\1W,\1Y-\1[\2\1]\2\1_\2\1"+
		"a.\4c/\5\3\2\7\4\2\62;aa\5\2//\62;aa\4\2C\\c|\3\2\62;\4\2\13\13\"\"\u0160"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3"+
		"\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3"+
		"\2\2\2\25w\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33\177\3\2\2\2\35\u0082\3\2"+
		"\2\2\37\u0084\3\2\2\2!\u0087\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008f"+
		"\3\2\2\2)\u0098\3\2\2\2+\u00a0\3\2\2\2-\u00a6\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00ae\3\2\2\2\63\u00b1\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c5"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cc\3\2\2\2?\u00ce\3\2\2\2A\u00d2\3\2\2\2C"+
		"\u00d5\3\2\2\2E\u00d9\3\2\2\2G\u00de\3\2\2\2I\u00e5\3\2\2\2K\u00e7\3\2"+
		"\2\2M\u00eb\3\2\2\2O\u00f4\3\2\2\2Q\u0101\3\2\2\2S\u010f\3\2\2\2U\u011b"+
		"\3\2\2\2W\u011d\3\2\2\2Y\u0128\3\2\2\2[\u012b\3\2\2\2]\u0141\3\2\2\2_"+
		"\u0143\3\2\2\2a\u0146\3\2\2\2c\u014d\3\2\2\2ef\7_\2\2f\4\3\2\2\2gh\7\60"+
		"\2\2h\6\3\2\2\2ij\7.\2\2j\b\3\2\2\2kl\7-\2\2l\n\3\2\2\2mn\7,\2\2n\f\3"+
		"\2\2\2op\7/\2\2p\16\3\2\2\2qr\7]\2\2r\20\3\2\2\2st\7<\2\2t\22\3\2\2\2"+
		"uv\7>\2\2v\24\3\2\2\2wx\7#\2\2xy\7?\2\2y\26\3\2\2\2z{\7=\2\2{\30\3\2\2"+
		"\2|}\7>\2\2}~\7?\2\2~\32\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7q\2\2\u0081"+
		"\34\3\2\2\2\u0082\u0083\7@\2\2\u0083\36\3\2\2\2\u0084\u0085\7d\2\2\u0085"+
		"\u0086\7{\2\2\u0086 \3\2\2\2\u0087\u0088\7?\2\2\u0088\u0089\7?\2\2\u0089"+
		"\"\3\2\2\2\u008a\u008b\7\61\2\2\u008b$\3\2\2\2\u008c\u008d\7@\2\2\u008d"+
		"\u008e\7?\2\2\u008e&\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7e\2\2\u0093\u0094\7v\2\2\u0094\u0095\7k\2\2"+
		"\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097(\3\2\2\2\u0098\u0099\7h\2"+
		"\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f*\3\2\2\2\u00a0\u00a1"+
		"\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7h\2\2\u00a8"+
		".\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		"\64\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00bf\7g\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2"+
		"\u00bc\u00bd\7w\2\2\u00bd\u00bf\7g\2\2\u00be\u00b5\3\2\2\2\u00be\u00ba"+
		"\3\2\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7m\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7r\2\2\u00c48\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7t\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd>\3\2\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2\u00d1@\3\2\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7t\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7"+
		"\7q\2\2\u00d7\u00d8\7v\2\2\u00d8D\3\2\2\2\u00d9\u00da\7p\2\2\u00da\u00db"+
		"\7w\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7n\2\2\u00ddF\3\2\2\2\u00de\u00df"+
		"\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7p\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6"+
		"J\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8L\3\2\2\2\u00e9\u00ec\5U+\2\u00ea\u00ec"+
		"\7a\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00f1\3\2\2\2\u00ed"+
		"\u00f0\5U+\2\u00ee\u00f0\t\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2"+
		"\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2N"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7\61\2\2"+
		"\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\5c\62\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b("+
		"\2\2\u0100P\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7,\2\2\u0103\u0107"+
		"\3\2\2\2\u0104\u0106\13\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010b\7,\2\2\u010b\u010c\7\61\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\b)\3\2\u010eR\3\2\2\2\u010f\u0112\7B\2\2\u0110\u0113\5U+\2\u0111"+
		"\u0113\7a\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0118\3\2"+
		"\2\2\u0114\u0117\5U+\2\u0115\u0117\t\3\2\2\u0116\u0114\3\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"T\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\4\2\2\u011cV\3\2\2\2\u011d"+
		"\u0121\7$\2\2\u011e\u0120\13\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125X\3\2\2\2\u0126\u0129\5[.\2\u0127"+
		"\u0129\5]/\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129Z\3\2\2\2\u012a"+
		"\u012c\5_\60\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\\\3\2\2\2\u012f\u0131\5_\60\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0138\7\60\2\2\u0135\u0137\5_\60\2\u0136\u0135\3"+
		"\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0142\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\60\2\2\u013c\u013e\5"+
		"_\60\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0130\3\2\2\2\u0141\u013b\3\2"+
		"\2\2\u0142^\3\2\2\2\u0143\u0144\t\5\2\2\u0144`\3\2\2\2\u0145\u0147\t\6"+
		"\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\61\4\2\u014bb\3\2\2\2"+
		"\u014c\u014e\7\17\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\7\f\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\62\5\2"+
		"\u0152d\3\2\2\2\25\2\u00be\u00eb\u00ef\u00f1\u00fa\u0107\u0112\u0116\u0118"+
		"\u0121\u0128\u012d\u0132\u0138\u013f\u0141\u0148\u014d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}