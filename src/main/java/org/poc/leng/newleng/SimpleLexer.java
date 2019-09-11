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
		START=1, END=2, SUM=3, REST=4, MULT=5, DIV=6, NUMBER=7, FLOTANTE=8, BOOLEANO=9, 
		INT=10, FLOAT=11, BOOL=12, ASSIG=13, MAY_Q=14, MEN_Q=15, IGUAL=16, AND=17, 
		OR=18, PAR_L=19, PAR_R=20, KEY_L=21, KEY_R=22, IF=23, ELSE=24, ELIF=25, 
		ENDIF=26, FOR=27, ENDFOR=28, DELIM=29, WHILE=30, ENDWH=31, READ=32, WRITTE=33, 
		ID=34, COMMENT=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'"
	};
	public static final String[] ruleNames = {
		"START", "END", "SUM", "REST", "MULT", "DIV", "FALSE", "TRUE", "NUM", 
		"DOT", "NUMBER", "FLOTANTE", "BOOLEANO", "INT", "FLOAT", "BOOL", "ASSIG", 
		"MAY_Q", "MEN_Q", "IGUAL", "AND", "OR", "PAR_L", "PAR_R", "KEY_L", "KEY_R", 
		"IF", "ELSE", "ELIF", "ENDIF", "FOR", "ENDFOR", "DELIM", "WHILE", "ENDWH", 
		"READ", "WRITTE", "ID", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0112\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fw\n\f\r"+
		"\f\16\fx\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0081\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\6\'\u00fa\n\'\r"+
		"\'\16\'\u00fb\3(\3(\7(\u0100\n(\f(\16(\u0103\13(\3(\5(\u0106\n(\3(\3("+
		"\3(\3(\3)\6)\u010d\n)\r)\16)\u010e\3)\3)\3\u0101\2*\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\2\23\2\25\2\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21"+
		")\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I"+
		"\"K#M$O%Q&\3\2\5\5\2..\62\62;;\4\2C\\c|\5\2\13\f\17\17\"\"\u0113\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3"+
		"S\3\2\2\2\5Z\3\2\2\2\7^\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f"+
		"\3\2\2\2\21l\3\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27v\3\2\2\2\31z\3\2\2\2\33"+
		"\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0089\3\2\2\2!\u008e\3\2\2\2#\u0095"+
		"\3\2\2\2%\u0098\3\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2"+
		"-\u00a2\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2\2\65\u00ab"+
		"\3\2\2\2\67\u00ad\3\2\2\29\u00b0\3\2\2\2;\u00b5\3\2\2\2=\u00bd\3\2\2\2"+
		"?\u00c4\3\2\2\2A\u00c9\3\2\2\2C\u00d2\3\2\2\2E\u00d4\3\2\2\2G\u00dd\3"+
		"\2\2\2I\u00ea\3\2\2\2K\u00ef\3\2\2\2M\u00f9\3\2\2\2O\u00fd\3\2\2\2Q\u010c"+
		"\3\2\2\2ST\7k\2\2TU\7p\2\2UV\7k\2\2VW\7e\2\2WX\7k\2\2XY\7q\2\2Y\4\3\2"+
		"\2\2Z[\7h\2\2[\\\7k\2\2\\]\7p\2\2]\6\3\2\2\2^_\7-\2\2_\b\3\2\2\2`a\7/"+
		"\2\2a\n\3\2\2\2bc\7,\2\2c\f\3\2\2\2de\7\61\2\2e\16\3\2\2\2fg\7h\2\2gh"+
		"\7c\2\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k\20\3\2\2\2lm\7v\2\2mn\7t\2\2no\7w"+
		"\2\2op\7g\2\2p\22\3\2\2\2qr\t\2\2\2r\24\3\2\2\2st\7\60\2\2t\26\3\2\2\2"+
		"uw\5\23\n\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\30\3\2\2\2z{\5\27"+
		"\f\2{|\5\25\13\2|}\5\27\f\2}\32\3\2\2\2~\u0081\5\21\t\2\177\u0081\5\17"+
		"\b\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\34\3\2\2\2\u0082\u0083\7g"+
		"\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7q\2\2\u0088\36\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d \3\2\2\2\u008e\u008f"+
		"\7n\2\2\u008f\u0090\7q\2\2\u0090\u0091\7i\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7e\2\2\u0093\u0094\7q\2\2\u0094\"\3\2\2\2\u0095\u0096\7>\2\2\u0096"+
		"\u0097\7/\2\2\u0097$\3\2\2\2\u0098\u0099\7@\2\2\u0099&\3\2\2\2\u009a\u009b"+
		"\7>\2\2\u009b(\3\2\2\2\u009c\u009d\7?\2\2\u009d*\3\2\2\2\u009e\u009f\7"+
		"c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7f\2\2\u00a1,\3\2\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7t\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\60"+
		"\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa"+
		"\64\3\2\2\2\u00ab\u00ac\7}\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00af\7k\2\2\u00af8\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7q\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7a\2\2"+
		"\u00ba\u00bb\7u\2\2\u00bb\u00bc\7k\2\2\u00bc<\3\2\2\2\u00bd\u00be\7h\2"+
		"\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7a\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00c3\7k\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7c\2\2\u00c8@\3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7a\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7c\2\2"+
		"\u00d1B\3\2\2\2\u00d2\u00d3\7=\2\2\u00d3D\3\2\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\u00da\7t\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dcF\3\2\2"+
		"\2\u00dd\u00de\7h\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1"+
		"\7a\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7c\2\2"+
		"\u00e8\u00e9\7u\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2"+
		"\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7"+
		"g\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"L\3\2\2\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcN\3\2\2\2\u00fd\u0101\7"+
		"#\2\2\u00fe\u0100\13\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0106\7\17\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\7\f\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b("+
		"\2\2\u010aP\3\2\2\2\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\b)\2\2\u0111R\3\2\2\2\t\2x\u0080\u00fb\u0101\u0105\u010e\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}