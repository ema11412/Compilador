// Generated from com\miorganizacion\simple\interprete1\Simple.g4 by ANTLR 4.5.1
package com.miorganizacion.simple.interprete1;
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BEGIN=3, END=4, PROC=5, EPROC=6, VAR=7, SET=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BEGIN", "END", "PROC", "EPROC", "VAR", "SET", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", "'world'", "'Begin'", "'End'", "'Proc'", "'End-Proc'", 
		"'Var'", "'Set'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BEGIN", "END", "PROC", "EPROC", "VAR", "SET", "WS"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13H\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\6\nC\n\n\r\n\16\nD\3\n\3\n\2\2\13\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\3\5\2\13\f\17\17\"\"H\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\33\3\2\2\2\7!\3\2"+
		"\2\2\t\'\3\2\2\2\13+\3\2\2\2\r\60\3\2\2\2\179\3\2\2\2\21=\3\2\2\2\23B"+
		"\3\2\2\2\25\26\7j\2\2\26\27\7g\2\2\27\30\7n\2\2\30\31\7n\2\2\31\32\7q"+
		"\2\2\32\4\3\2\2\2\33\34\7y\2\2\34\35\7q\2\2\35\36\7t\2\2\36\37\7n\2\2"+
		"\37 \7f\2\2 \6\3\2\2\2!\"\7D\2\2\"#\7g\2\2#$\7i\2\2$%\7k\2\2%&\7p\2\2"+
		"&\b\3\2\2\2\'(\7G\2\2()\7p\2\2)*\7f\2\2*\n\3\2\2\2+,\7R\2\2,-\7t\2\2-"+
		".\7q\2\2./\7e\2\2/\f\3\2\2\2\60\61\7G\2\2\61\62\7p\2\2\62\63\7f\2\2\63"+
		"\64\7/\2\2\64\65\7R\2\2\65\66\7t\2\2\66\67\7q\2\2\678\7e\2\28\16\3\2\2"+
		"\29:\7X\2\2:;\7c\2\2;<\7t\2\2<\20\3\2\2\2=>\7U\2\2>?\7g\2\2?@\7v\2\2@"+
		"\22\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2"+
		"\2FG\b\n\2\2G\24\3\2\2\2\4\2D\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}