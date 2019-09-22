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
		ASSIG=9, IF_CON=10, ELSE=11, LPAR=12, RPAR=13, LKEY=14, RKEY=15, AND=16, 
		OR=17, DIST=18, IGUAL=19, MAY=20, MEN=21, WHILE=22, FOR=23, POINT=24, 
		SUM=25, REST=26, MULT=27, DIV=28, PRINT=29, READ=30, ID=31, COMMENT=32, 
		WS=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"START", "END", "TRUE", "FALSE", "NUM", "DOT", "IF", "ELIF", "INT", "FLOAT", 
		"BOOL", "NUMBER", "FLOTANTE", "BOOLEAN", "ASSIG", "IF_CON", "ELSE", "LPAR", 
		"RPAR", "LKEY", "RKEY", "AND", "OR", "DIST", "IGUAL", "MAY", "MEN", "WHILE", 
		"FOR", "POINT", "SUM", "REST", "MULT", "DIV", "PRINT", "READ", "ID", "COMMENT", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u0084\n\r\r\r\16\r\u0085"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u008e\n\17\3\20\3\20\3\20\3\21\3\21"+
		"\5\21\u0095\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\6&\u00db\n&\r&\16&\u00dc\3\'\3\'\7\'\u00e1"+
		"\n\'\f\'\16\'\u00e4\13\'\3\'\5\'\u00e7\n\'\3\'\3\'\3\'\3\'\3(\6(\u00ee"+
		"\n(\r(\16(\u00ef\3(\3(\3\u00e2\2)\3\3\5\4\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24"+
		"\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#\3\2\5\3\2"+
		"\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb"+
		"\3\2\2\2\17d\3\2\2\2\21g\3\2\2\2\23o\3\2\2\2\25v\3\2\2\2\27{\3\2\2\2\31"+
		"\u0083\3\2\2\2\33\u0087\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0094"+
		"\3\2\2\2#\u0096\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a7\3\2\2\2\61\u00aa\3\2\2\2\63\u00ad"+
		"\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b3\3\2\2\2;\u00bc\3\2\2"+
		"\2=\u00c1\3\2\2\2?\u00c3\3\2\2\2A\u00c5\3\2\2\2C\u00c7\3\2\2\2E\u00c9"+
		"\3\2\2\2G\u00cb\3\2\2\2I\u00d4\3\2\2\2K\u00da\3\2\2\2M\u00de\3\2\2\2O"+
		"\u00ed\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7k\2\2TU\7e\2\2UV\7k\2\2VW\7q\2\2W"+
		"\4\3\2\2\2XY\7h\2\2YZ\7k\2\2Z[\7p\2\2[\6\3\2\2\2\\]\7x\2\2]\b\3\2\2\2"+
		"^_\7h\2\2_\n\3\2\2\2`a\t\2\2\2a\f\3\2\2\2bc\7\60\2\2c\16\3\2\2\2de\7u"+
		"\2\2ef\7k\2\2f\20\3\2\2\2gh\7u\2\2hi\7k\2\2ij\7p\2\2jk\7q\2\2kl\7a\2\2"+
		"lm\7u\2\2mn\7k\2\2n\22\3\2\2\2op\7g\2\2pq\7p\2\2qr\7v\2\2rs\7g\2\2st\7"+
		"t\2\2tu\7q\2\2u\24\3\2\2\2vw\7t\2\2wx\7g\2\2xy\7c\2\2yz\7n\2\2z\26\3\2"+
		"\2\2{|\7n\2\2|}\7q\2\2}~\7i\2\2~\177\7k\2\2\177\u0080\7e\2\2\u0080\u0081"+
		"\7q\2\2\u0081\30\3\2\2\2\u0082\u0084\5\13\6\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\32\3\2\2"+
		"\2\u0087\u0088\5\31\r\2\u0088\u0089\5\r\7\2\u0089\u008a\5\31\r\2\u008a"+
		"\34\3\2\2\2\u008b\u008e\5\7\4\2\u008c\u008e\5\t\5\2\u008d\u008b\3\2\2"+
		"\2\u008d\u008c\3\2\2\2\u008e\36\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091"+
		"\7/\2\2\u0091 \3\2\2\2\u0092\u0095\5\17\b\2\u0093\u0095\5\21\t\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\"\3\2\2\2\u0096\u0097\7u\2\2"+
		"\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7q\2\2\u009a$\3\2\2"+
		"\2\u009b\u009c\7*\2\2\u009c&\3\2\2\2\u009d\u009e\7+\2\2\u009e(\3\2\2\2"+
		"\u009f\u00a0\7}\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2,\3\2\2"+
		"\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6.\3\2"+
		"\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\60\3\2\2\2\u00aa\u00ab"+
		"\7>\2\2\u00ab\u00ac\7@\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\64"+
		"\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2"+
		"8\3\2\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7u\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7c\2"+
		"\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7c\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7"+
		".\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7/"+
		"\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7\61"+
		"\2\2\u00caF\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce"+
		"\7e\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7d\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7t\2\2\u00d3H\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7t\2\2\u00d8J\3\2\2\2\u00d9"+
		"\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00ddL\3\2\2\2\u00de\u00e2\7#\2\2\u00df\u00e1"+
		"\13\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7"+
		"\7\17\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e9\7\f\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\'\2\2\u00ebN\3"+
		"\2\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b("+
		"\2\2\u00f2P\3\2\2\2\n\2\u0085\u008d\u0094\u00dc\u00e2\u00e6\u00ef\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}