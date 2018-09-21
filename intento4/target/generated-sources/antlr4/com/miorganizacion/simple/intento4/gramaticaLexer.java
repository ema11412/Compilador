// Generated from com\miorganizacion\simple\intento4\gramatica.g4 by ANTLR 4.5.1
package com.miorganizacion.simple.intento4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, BEGIN=2, END=3, PROC=4, EPROC=5, VAR=6, SET=7, CHANGEDIR=8, PLACE=9, 
		PLACEM=10, BLOCK=11, BLOCKM=12, HIGH=13, PUT=14, LIGHT=15, POSI=16, KEEP=17, 
		SKIPS=18, KEND=19, FOR=20, FEND=21, TIMES=22, WHEN=23, WHEND=24, THEN=25, 
		POSSTART=26, CALL=27, ADD=28, LESS=29, LEFT=30, RIGHT=31, BACK=32, SAME=33, 
		ASSIGN=34, PARI=35, PARF=36, COMA=37, SEMICOLON=38, NUMBER=39, ID=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "BEGIN", "END", "PROC", "EPROC", "VAR", "SET", "CHANGEDIR", "PLACE", 
		"PLACEM", "BLOCK", "BLOCKM", "HIGH", "PUT", "LIGHT", "POSI", "KEEP", "SKIPS", 
		"KEND", "FOR", "FEND", "TIMES", "WHEN", "WHEND", "THEN", "POSSTART", "CALL", 
		"ADD", "LESS", "LEFT", "RIGHT", "BACK", "SAME", "ASSIGN", "PARI", "PARF", 
		"COMA", "SEMICOLON", "NUMBER", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'Begin'", "'End'", "'Proc'", "'End-Proc'", "'Var'", "'Set'", 
		"'ChangeDir'", "'place'", "'Place'", "'block'", "'Block'", "'High'", "'Put'", 
		"'Light'", "'Pos'", "'Keep'", "'Skip'", "'Kend'", "'For'", "'FEnd'", "'Times'", 
		"'When'", "'Whend'", "'Then'", "'PosStart'", "'Call'", "'Add+'", "'Less+'", 
		"'LEFT'", "'RIGHT'", "'BACK'", "'SAME'", "'='", "'('", "')'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "BEGIN", "END", "PROC", "EPROC", "VAR", "SET", "CHANGEDIR", 
		"PLACE", "PLACEM", "BLOCK", "BLOCKM", "HIGH", "PUT", "LIGHT", "POSI", 
		"KEEP", "SKIPS", "KEND", "FOR", "FEND", "TIMES", "WHEN", "WHEND", "THEN", 
		"POSSTART", "CALL", "ADD", "LESS", "LEFT", "RIGHT", "BACK", "SAME", "ASSIGN", 
		"PARI", "PARF", "COMA", "SEMICOLON", "NUMBER", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\6\2U\n\2\r"+
		"\2\16\2V\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\6(\u0117\n(\r(\16(\u0118\3)\3)\5)\u011d\n)\3)\5)\u0120\n)\3"+
		")\5)\u0123\n)\3)\5)\u0126\n)\3)\5)\u0129\n)\3)\5)\u012c\n)\3)\5)\u012f"+
		"\n)\3)\5)\u0132\n)\3)\5)\u0135\n)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\6\5\2"+
		"\13\f\17\17\"\"\3\2\62;\3\2c|\7\2,,\62;B\\aac|\u0140\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3T\3\2\2\2\5Z\3\2\2\2\7`\3\2\2"+
		"\2\td\3\2\2\2\13i\3\2\2\2\rr\3\2\2\2\17v\3\2\2\2\21z\3\2\2\2\23\u0084"+
		"\3\2\2\2\25\u008a\3\2\2\2\27\u0090\3\2\2\2\31\u0096\3\2\2\2\33\u009c\3"+
		"\2\2\2\35\u00a1\3\2\2\2\37\u00a5\3\2\2\2!\u00ab\3\2\2\2#\u00af\3\2\2\2"+
		"%\u00b4\3\2\2\2\'\u00b9\3\2\2\2)\u00be\3\2\2\2+\u00c2\3\2\2\2-\u00c7\3"+
		"\2\2\2/\u00cd\3\2\2\2\61\u00d2\3\2\2\2\63\u00d8\3\2\2\2\65\u00dd\3\2\2"+
		"\2\67\u00e6\3\2\2\29\u00eb\3\2\2\2;\u00f0\3\2\2\2=\u00f6\3\2\2\2?\u00fb"+
		"\3\2\2\2A\u0101\3\2\2\2C\u0106\3\2\2\2E\u010b\3\2\2\2G\u010d\3\2\2\2I"+
		"\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u0116\3\2\2\2Q\u011a\3\2"+
		"\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\2"+
		"\2\2Y\4\3\2\2\2Z[\7D\2\2[\\\7g\2\2\\]\7i\2\2]^\7k\2\2^_\7p\2\2_\6\3\2"+
		"\2\2`a\7G\2\2ab\7p\2\2bc\7f\2\2c\b\3\2\2\2de\7R\2\2ef\7t\2\2fg\7q\2\2"+
		"gh\7e\2\2h\n\3\2\2\2ij\7G\2\2jk\7p\2\2kl\7f\2\2lm\7/\2\2mn\7R\2\2no\7"+
		"t\2\2op\7q\2\2pq\7e\2\2q\f\3\2\2\2rs\7X\2\2st\7c\2\2tu\7t\2\2u\16\3\2"+
		"\2\2vw\7U\2\2wx\7g\2\2xy\7v\2\2y\20\3\2\2\2z{\7E\2\2{|\7j\2\2|}\7c\2\2"+
		"}~\7p\2\2~\177\7i\2\2\177\u0080\7g\2\2\u0080\u0081\7F\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7t\2\2\u0083\22\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7c\2\2\u0087\u0088\7e\2\2\u0088\u0089\7g\2\2\u0089"+
		"\24\3\2\2\2\u008a\u008b\7R\2\2\u008b\u008c\7n\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7g\2\2\u008f\26\3\2\2\2\u0090\u0091\7d\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7q\2\2\u0093\u0094\7e\2\2\u0094\u0095\7m\2\2"+
		"\u0095\30\3\2\2\2\u0096\u0097\7D\2\2\u0097\u0098\7n\2\2\u0098\u0099\7"+
		"q\2\2\u0099\u009a\7e\2\2\u009a\u009b\7m\2\2\u009b\32\3\2\2\2\u009c\u009d"+
		"\7J\2\2\u009d\u009e\7k\2\2\u009e\u009f\7i\2\2\u009f\u00a0\7j\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\7R\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7i\2\2\u00a8"+
		"\u00a9\7j\2\2\u00a9\u00aa\7v\2\2\u00aa \3\2\2\2\u00ab\u00ac\7R\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7u\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7M\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7r\2\2\u00b3$\3\2\2\2\u00b4"+
		"\u00b5\7U\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7r\2\2"+
		"\u00b8&\3\2\2\2\u00b9\u00ba\7M\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2"+
		"\2\u00bc\u00bd\7f\2\2\u00bd(\3\2\2\2\u00be\u00bf\7H\2\2\u00bf\u00c0\7"+
		"q\2\2\u00c0\u00c1\7t\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7H\2\2\u00c3\u00c4"+
		"\7G\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7f\2\2\u00c6,\3\2\2\2\u00c7\u00c8"+
		"\7V\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7Y\2\2\u00ce\u00cf\7j\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7Y\2\2\u00d3"+
		"\u00d4\7j\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7f\2\2"+
		"\u00d7\62\3\2\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7"+
		"g\2\2\u00db\u00dc\7p\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7R\2\2\u00de\u00df"+
		"\7q\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7U\2\2\u00e1\u00e2\7v\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7v\2\2\u00e5\66\3\2\2\2\u00e6"+
		"\u00e7\7E\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7n\2\2"+
		"\u00ea8\3\2\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7f\2"+
		"\2\u00ee\u00ef\7-\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7N\2\2\u00f1\u00f2\7"+
		"g\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7-\2\2\u00f5<"+
		"\3\2\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9\7H\2\2\u00f9"+
		"\u00fa\7V\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7T\2\2\u00fc\u00fd\7K\2\2\u00fd"+
		"\u00fe\7I\2\2\u00fe\u00ff\7J\2\2\u00ff\u0100\7V\2\2\u0100@\3\2\2\2\u0101"+
		"\u0102\7D\2\2\u0102\u0103\7C\2\2\u0103\u0104\7E\2\2\u0104\u0105\7M\2\2"+
		"\u0105B\3\2\2\2\u0106\u0107\7U\2\2\u0107\u0108\7C\2\2\u0108\u0109\7O\2"+
		"\2\u0109\u010a\7G\2\2\u010aD\3\2\2\2\u010b\u010c\7?\2\2\u010cF\3\2\2\2"+
		"\u010d\u010e\7*\2\2\u010eH\3\2\2\2\u010f\u0110\7+\2\2\u0110J\3\2\2\2\u0111"+
		"\u0112\7.\2\2\u0112L\3\2\2\2\u0113\u0114\7=\2\2\u0114N\3\2\2\2\u0115\u0117"+
		"\t\3\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119P\3\2\2\2\u011a\u011c\t\4\2\2\u011b\u011d\t\5\2\2"+
		"\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120"+
		"\t\5\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u0123\t\5\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0126\t\5\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0129\t\5\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\3\2\2\2\u012a\u012c\t\5\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\t\5\2\2\u012e\u012d\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\t\5\2\2\u0131"+
		"\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\t\5"+
		"\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135R\3\2\2\2\16\2V\u0118"+
		"\u011c\u011f\u0122\u0125\u0128\u012b\u012e\u0131\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}