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
		FOR=25, ENDFR=26, ID=27, COMMENT=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"START", "END", "TRUE", "FALSE", "NUM", "DOT", "IF", "ELIF", "INT", "FLOAT", 
		"BOOL", "NUMBER", "FLOTANTE", "BOOLEAN", "ASSIG", "IF_CON", "ELSE", "ENDIF", 
		"LPAR", "RPAR", "LKEY", "RKEY", "AND", "OR", "DIST", "IGUAL", "MAY", "MEN", 
		"WHILE", "ENDWH", "FOR", "ENDFR", "ID", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00f0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\6\r|\n\r\r\r\16\r}\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\5\17\u0086\n\17\3\20\3\20\3\20\3\21\3\21\5\21\u008d\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\6\"\u00d8\n\"\r\"\16\""+
		"\u00d9\3#\3#\7#\u00de\n#\f#\16#\u00e1\13#\3#\5#\u00e4\n#\3#\3#\3#\3#\3"+
		"$\6$\u00eb\n$\r$\16$\u00ec\3$\3$\3\u00df\2%\3\3\5\4\7\2\t\2\13\2\r\2\17"+
		"\2\21\2\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22"+
		"/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37\3\2\5\3\2"+
		"\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00f0\2\3\3\2\2\2\2\5\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5P\3\2\2\2\7T\3\2\2\2\t"+
		"V\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23g\3\2\2\2"+
		"\25n\3\2\2\2\27s\3\2\2\2\31{\3\2\2\2\33\177\3\2\2\2\35\u0085\3\2\2\2\37"+
		"\u0087\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0093\3\2\2\2\'\u009a\3"+
		"\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a2\3\2\2\2\61"+
		"\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b0"+
		"\3\2\2\2;\u00b2\3\2\2\2=\u00bb\3\2\2\2?\u00c8\3\2\2\2A\u00cd\3\2\2\2C"+
		"\u00d7\3\2\2\2E\u00db\3\2\2\2G\u00ea\3\2\2\2IJ\7k\2\2JK\7p\2\2KL\7k\2"+
		"\2LM\7e\2\2MN\7k\2\2NO\7q\2\2O\4\3\2\2\2PQ\7h\2\2QR\7k\2\2RS\7p\2\2S\6"+
		"\3\2\2\2TU\7x\2\2U\b\3\2\2\2VW\7h\2\2W\n\3\2\2\2XY\t\2\2\2Y\f\3\2\2\2"+
		"Z[\7\60\2\2[\16\3\2\2\2\\]\7u\2\2]^\7k\2\2^\20\3\2\2\2_`\7u\2\2`a\7k\2"+
		"\2ab\7p\2\2bc\7q\2\2cd\7a\2\2de\7u\2\2ef\7k\2\2f\22\3\2\2\2gh\7g\2\2h"+
		"i\7p\2\2ij\7v\2\2jk\7g\2\2kl\7t\2\2lm\7q\2\2m\24\3\2\2\2no\7t\2\2op\7"+
		"g\2\2pq\7c\2\2qr\7n\2\2r\26\3\2\2\2st\7n\2\2tu\7q\2\2uv\7i\2\2vw\7k\2"+
		"\2wx\7e\2\2xy\7q\2\2y\30\3\2\2\2z|\5\13\6\2{z\3\2\2\2|}\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\32\3\2\2\2\177\u0080\5\31\r\2\u0080\u0081\5\r\7\2\u0081"+
		"\u0082\5\31\r\2\u0082\34\3\2\2\2\u0083\u0086\5\7\4\2\u0084\u0086\5\t\5"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\36\3\2\2\2\u0087\u0088"+
		"\7>\2\2\u0088\u0089\7/\2\2\u0089 \3\2\2\2\u008a\u008d\5\17\b\2\u008b\u008d"+
		"\5\21\t\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\"\3\2\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7q\2\2"+
		"\u0092$\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2"+
		"\2\u0096\u0097\7a\2\2\u0097\u0098\7u\2\2\u0098\u0099\7k\2\2\u0099&\3\2"+
		"\2\2\u009a\u009b\7*\2\2\u009b(\3\2\2\2\u009c\u009d\7+\2\2\u009d*\3\2\2"+
		"\2\u009e\u009f\7}\2\2\u009f,\3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1.\3\2"+
		"\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5\60"+
		"\3\2\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2\u00a8\62\3\2\2\2\u00a9"+
		"\u00aa\7>\2\2\u00aa\u00ab\7@\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad"+
		"\66\3\2\2\2\u00ae\u00af\7@\2\2\u00af8\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		":\3\2\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7c\2\2"+
		"\u00b9\u00ba\7u\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7k\2"+
		"\2\u00bd\u00be\7p\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7u\2\2\u00c7>\3\2\2\2\u00c8"+
		"\u00c9\7r\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7c\2\2"+
		"\u00cc@\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2"+
		"\2\u00d0\u00d1\7a\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4\u00d5\7c\2\2\u00d5B\3\2\2\2\u00d6\u00d8\t\3\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"D\3\2\2\2\u00db\u00df\7#\2\2\u00dc\u00de\13\2\2\2\u00dd\u00dc\3\2\2\2"+
		"\u00de\u00e1\3\2\2\2\u00df\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\17\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\b#\2\2\u00e8F\3\2\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\b$\2\2\u00efH\3\2\2\2\n\2}\u0085\u008c\u00d9"+
		"\u00df\u00e3\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}