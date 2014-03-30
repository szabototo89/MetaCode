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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, FUNCTION=19, FOREACH=20, WHILE=21, IF=22, ELSE=23, DO=24, 
		END=25, BOOLEAN=26, IMPLICIT=27, EXPLICIT=28, MACRO=29, SKIP=30, VAR=31, 
		IN=32, ASSIGN=33, AND=34, OR=35, NOT=36, NULL=37, RETURN=38, LEFT_PARENTHESIS=39, 
		RIGHT_PARENTHESIS=40, ID=41, COMMENT=42, MULTILINE_COMMENT=43, TREE_SELECTOR=44, 
		ATTRIBUTE_ID=45, STRING=46, NUMBER=47, WHITESPACE=48, NEWLINE=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'.'", "','", "'+'", "'*'", "'-'", "'['", "':'", "'<'", "'!='", 
		"';'", "'<='", "'to'", "'>'", "'by'", "'=='", "'/'", "'>='", "'function'", 
		"'foreach'", "'while'", "'if'", "'else'", "'do'", "'end'", "BOOLEAN", 
		"'implicit'", "'explicit'", "'macro'", "'skip'", "'var'", "'in'", "'='", 
		"'and'", "'or'", "'not'", "'null'", "'return'", "'('", "')'", "ID", "COMMENT", 
		"MULTILINE_COMMENT", "TREE_SELECTOR", "ATTRIBUTE_ID", "STRING", "NUMBER", 
		"WHITESPACE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "FUNCTION", "FOREACH", "WHILE", "IF", "ELSE", "DO", "END", "BOOLEAN", 
		"IMPLICIT", "EXPLICIT", "MACRO", "SKIP", "VAR", "IN", "ASSIGN", "AND", 
		"OR", "NOT", "NULL", "RETURN", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
		"ID", "COMMENT", "MULTILINE_COMMENT", "TREE_SELECTOR", "ATTRIBUTE_ID", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u017b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u00c7\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u010c\n*\3*\3*\7*\u0110\n*\f*\16"+
		"*\u0113\13*\3+\3+\3+\3+\7+\u0119\n+\f+\16+\u011c\13+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\7,\u0126\n,\f,\16,\u0129\13,\3,\3,\3,\3,\3,\3-\3-\6-\u0132\n-"+
		"\r-\16-\u0133\3-\3-\3.\3.\3.\5.\u013b\n.\3.\3.\7.\u013f\n.\f.\16.\u0142"+
		"\13.\3/\3/\3\60\3\60\7\60\u0148\n\60\f\60\16\60\u014b\13\60\3\60\3\60"+
		"\3\61\3\61\5\61\u0151\n\61\3\62\6\62\u0154\n\62\r\62\16\62\u0155\3\63"+
		"\6\63\u0159\n\63\r\63\16\63\u015a\3\63\3\63\7\63\u015f\n\63\f\63\16\63"+
		"\u0162\13\63\3\63\3\63\6\63\u0166\n\63\r\63\16\63\u0167\5\63\u016a\n\63"+
		"\3\64\3\64\3\65\6\65\u016f\n\65\r\65\16\65\u0170\3\65\3\65\3\66\5\66\u0176"+
		"\n\66\3\66\3\66\3\66\3\66\6\u011a\u0127\u0133\u0149\2\67\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\2_\60a\61c\2e\2g\2i\62k\63\3\2\7\4\2\62;aa\5\2"+
		"//\62;aa\4\2C\\c|\3\2\62;\4\2\13\13\"\"\u0189\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2"+
		"\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2"+
		"\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3"+
		"\2\2\2\33\u0087\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008f\3\2\2"+
		"\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0097\3\2\2\2)\u00a0\3\2\2\2+\u00a8"+
		"\3\2\2\2-\u00ae\3\2\2\2/\u00b1\3\2\2\2\61\u00b6\3\2\2\2\63\u00b9\3\2\2"+
		"\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00d1\3\2\2\2;\u00da\3\2\2\2=\u00e0"+
		"\3\2\2\2?\u00e5\3\2\2\2A\u00e9\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G"+
		"\u00f2\3\2\2\2I\u00f5\3\2\2\2K\u00f9\3\2\2\2M\u00fe\3\2\2\2O\u0105\3\2"+
		"\2\2Q\u0107\3\2\2\2S\u010b\3\2\2\2U\u0114\3\2\2\2W\u0121\3\2\2\2Y\u012f"+
		"\3\2\2\2[\u0137\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a\u0150\3\2\2\2c"+
		"\u0153\3\2\2\2e\u0169\3\2\2\2g\u016b\3\2\2\2i\u016e\3\2\2\2k\u0175\3\2"+
		"\2\2mn\7_\2\2n\4\3\2\2\2op\7\60\2\2p\6\3\2\2\2qr\7.\2\2r\b\3\2\2\2st\7"+
		"-\2\2t\n\3\2\2\2uv\7,\2\2v\f\3\2\2\2wx\7/\2\2x\16\3\2\2\2yz\7]\2\2z\20"+
		"\3\2\2\2{|\7<\2\2|\22\3\2\2\2}~\7>\2\2~\24\3\2\2\2\177\u0080\7#\2\2\u0080"+
		"\u0081\7?\2\2\u0081\26\3\2\2\2\u0082\u0083\7=\2\2\u0083\30\3\2\2\2\u0084"+
		"\u0085\7>\2\2\u0085\u0086\7?\2\2\u0086\32\3\2\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7q\2\2\u0089\34\3\2\2\2\u008a\u008b\7@\2\2\u008b\36\3\2\2\2\u008c"+
		"\u008d\7d\2\2\u008d\u008e\7{\2\2\u008e \3\2\2\2\u008f\u0090\7?\2\2\u0090"+
		"\u0091\7?\2\2\u0091\"\3\2\2\2\u0092\u0093\7\61\2\2\u0093$\3\2\2\2\u0094"+
		"\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096&\3\2\2\2\u0097\u0098\7h\2\2\u0098"+
		"\u0099\7w\2\2\u0099\u009a\7p\2\2\u009a\u009b\7e\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f(\3\2\2"+
		"\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7j\2\2\u00a7"+
		"*\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad,\3\2\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c7\7g\2\2\u00c2\u00c3\7v\2\2"+
		"\u00c3\u00c4\7t\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c7\7g\2\2\u00c6\u00bd"+
		"\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7o\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7k\2\2"+
		"\u00cd\u00ce\7e\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7v\2\2\u00d08\3\2\2"+
		"\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7z\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9:\3\2\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7q\2\2\u00df<\3\2\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7m\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7r\2\2"+
		"\u00e4>\3\2\2\2\u00e5\u00e6\7x\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7t\2"+
		"\2\u00e8@\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00ebB\3\2\2\2"+
		"\u00ec\u00ed\7?\2\2\u00edD\3\2\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2"+
		"\2\u00f0\u00f1\7f\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7"+
		"t\2\2\u00f4H\3\2\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc"+
		"\7n\2\2\u00fc\u00fd\7n\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7v\2\2\u0101\u0102\7w\2\2\u0102\u0103\7t\2\2\u0103"+
		"\u0104\7p\2\2\u0104N\3\2\2\2\u0105\u0106\7*\2\2\u0106P\3\2\2\2\u0107\u0108"+
		"\7+\2\2\u0108R\3\2\2\2\u0109\u010c\5]/\2\u010a\u010c\7a\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u0111\3\2\2\2\u010d\u0110\5]/\2\u010e"+
		"\u0110\t\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112T\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116\7\61\2\2\u0116\u011a\3\2\2\2"+
		"\u0117\u0119\13\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\5k\66\2\u011e\u011f\3\2\2\2\u011f\u0120\b+\2\2\u0120V\3\2\2\2\u0121"+
		"\u0122\7\61\2\2\u0122\u0123\7,\2\2\u0123\u0127\3\2\2\2\u0124\u0126\13"+
		"\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7,"+
		"\2\2\u012b\u012c\7\61\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b,\2\2\u012e"+
		"X\3\2\2\2\u012f\u0131\7}\2\2\u0130\u0132\13\2\2\2\u0131\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\7\177\2\2\u0136Z\3\2\2\2\u0137\u013a\7B\2\2\u0138"+
		"\u013b\5]/\2\u0139\u013b\7a\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2"+
		"\2\u013b\u0140\3\2\2\2\u013c\u013f\5]/\2\u013d\u013f\t\3\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\\\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\t\4\2\2"+
		"\u0144^\3\2\2\2\u0145\u0149\7$\2\2\u0146\u0148\13\2\2\2\u0147\u0146\3"+
		"\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7$\2\2\u014d`\3\2\2\2\u014e"+
		"\u0151\5c\62\2\u014f\u0151\5e\63\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2"+
		"\2\2\u0151b\3\2\2\2\u0152\u0154\5g\64\2\u0153\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156d\3\2\2\2\u0157"+
		"\u0159\5g\64\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0160\7\60\2\2\u015d"+
		"\u015f\5g\64\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u016a\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\7\60\2\2\u0164\u0166\5g\64\2\u0165\u0164\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0158\3\2\2\2\u0169\u0163\3\2\2\2\u016af\3\2\2\2\u016b\u016c\t\5\2\2"+
		"\u016ch\3\2\2\2\u016d\u016f\t\6\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\b\65\2\2\u0173j\3\2\2\2\u0174\u0176\7\17\2\2\u0175\u0174\3\2\2"+
		"\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\f\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\b\66\2\2\u017al\3\2\2\2\26\2\u00c6\u010b\u010f\u0111"+
		"\u011a\u0127\u0133\u013a\u013e\u0140\u0149\u0150\u0155\u015a\u0160\u0167"+
		"\u0169\u0170\u0175\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}