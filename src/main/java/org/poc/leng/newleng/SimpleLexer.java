// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, INT=3, FLOAT=4, BOOL=5, NUMBER=6, FLOTANTE=7, BOOLEAN=8, 
		ASSIG=9, IF_CON=10, ELSE=11, ENDIF=12, LPAR=13, RPAR=14, LKEY=15, RKEY=16, 
		AND=17, OR=18, DIST=19, IGUAL=20, MAY=21, MEN=22, WHILE=23, ENDWH=24, 
		FOR=25, ENDFR=26, POINT=27, SUM=28, REST=29, MULT=30, DIV=31, ID=32, COMMENT=33, 
		WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'"
	};
	public static final String[] ruleNames = {
		"START", "END", "TRUE", "FALSE", "NUM", "DOT", "IF", "ELIF", "INT", "FLOAT", 
		"BOOL", "NUMBER", "FLOTANTE", "BOOLEAN", "ASSIG", "IF_CON", "ELSE", "ENDIF", 
		"LPAR", "RPAR", "LKEY", "RKEY", "AND", "OR", "DIST", "IGUAL", "MAY", "MEN", 
		"WHILE", "ENDWH", "FOR", "ENDFR", "POINT", "SUM", "REST", "MULT", "DIV", 
		"ID", "COMMENT", "WS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u0086\n\r\r\r"+
		"\16\r\u0087\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u0090\n\17\3\20\3\20\3"+
		"\20\3\21\3\21\5\21\u0097\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u00ec\n\'\r\'\16"+
		"\'\u00ed\3(\3(\7(\u00f2\n(\f(\16(\u00f5\13(\3(\5(\u00f8\n(\3(\3(\3(\3"+
		"(\3)\6)\u00ff\n)\r)\16)\u0100\3)\3)\3\u00f3\2*\3\3\5\4\7\2\t\2\13\2\r"+
		"\2\17\2\21\2\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21"+
		"-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M"+
		"\"O#Q$\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u0104\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5Z\3\2\2\2\7^\3\2\2\2\t"+
		"`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21i\3\2\2\2\23q\3\2\2\2\25"+
		"x\3\2\2\2\27}\3\2\2\2\31\u0085\3\2\2\2\33\u0089\3\2\2\2\35\u008f\3\2\2"+
		"\2\37\u0091\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009d\3\2\2\2\'\u00a4"+
		"\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61"+
		"\u00b0\3\2\2\2\63\u00b3\3\2\2\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00ba"+
		"\3\2\2\2;\u00bc\3\2\2\2=\u00c5\3\2\2\2?\u00d2\3\2\2\2A\u00d7\3\2\2\2C"+
		"\u00e0\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2"+
		"\2\2M\u00eb\3\2\2\2O\u00ef\3\2\2\2Q\u00fe\3\2\2\2ST\7k\2\2TU\7p\2\2UV"+
		"\7k\2\2VW\7e\2\2WX\7k\2\2XY\7q\2\2Y\4\3\2\2\2Z[\7h\2\2[\\\7k\2\2\\]\7"+
		"p\2\2]\6\3\2\2\2^_\7x\2\2_\b\3\2\2\2`a\7h\2\2a\n\3\2\2\2bc\t\2\2\2c\f"+
		"\3\2\2\2de\7\60\2\2e\16\3\2\2\2fg\7u\2\2gh\7k\2\2h\20\3\2\2\2ij\7u\2\2"+
		"jk\7k\2\2kl\7p\2\2lm\7q\2\2mn\7a\2\2no\7u\2\2op\7k\2\2p\22\3\2\2\2qr\7"+
		"g\2\2rs\7p\2\2st\7v\2\2tu\7g\2\2uv\7t\2\2vw\7q\2\2w\24\3\2\2\2xy\7t\2"+
		"\2yz\7g\2\2z{\7c\2\2{|\7n\2\2|\26\3\2\2\2}~\7n\2\2~\177\7q\2\2\177\u0080"+
		"\7i\2\2\u0080\u0081\7k\2\2\u0081\u0082\7e\2\2\u0082\u0083\7q\2\2\u0083"+
		"\30\3\2\2\2\u0084\u0086\5\13\6\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\32\3\2\2\2\u0089\u008a"+
		"\5\31\r\2\u008a\u008b\5\r\7\2\u008b\u008c\5\31\r\2\u008c\34\3\2\2\2\u008d"+
		"\u0090\5\7\4\2\u008e\u0090\5\t\5\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\36\3\2\2\2\u0091\u0092\7>\2\2\u0092\u0093\7/\2\2\u0093 \3\2"+
		"\2\2\u0094\u0097\5\17\b\2\u0095\u0097\5\21\t\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\"\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7q\2\2\u009c$\3\2\2\2\u009d\u009e\7h\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7u\2\2"+
		"\u00a2\u00a3\7k\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5(\3\2\2\2\u00a6"+
		"\u00a7\7+\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7}\2\2\u00a9,\3\2\2\2\u00aa\u00ab"+
		"\7\177\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7f\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		"\62\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5\7@\2\2\u00b5\64\3\2\2\2\u00b6"+
		"\u00b7\7?\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7@\2\2\u00b98\3\2\2\2\u00ba"+
		"\u00bb\7>\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\u00c3\7c\2\2\u00c3\u00c4\7u\2\2\u00c4<\3\2\2\2\u00c5\u00c6\7h\2"+
		"\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca"+
		"\7o\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7u\2\2"+
		"\u00d1>\3\2\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5\u00d6\7c\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7"+
		"k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7a\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7c\2\2\u00dfB\3\2\2\2\u00e0\u00e1"+
		"\7.\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7"+
		"/\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7\61"+
		"\2\2\u00e9L\3\2\2\2\u00ea\u00ec\t\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeN\3\2\2\2\u00ef"+
		"\u00f3\7#\2\2\u00f0\u00f2\13\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b(\2\2\u00fcP\3\2\2\2\u00fd\u00ff\t\4\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\b)\2\2\u0103R\3\2\2\2\n\2\u0087\u008f\u0096\u00ed\u00f3"+
		"\u00f7\u0100\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}