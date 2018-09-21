// Generated from com\miorganizacion\simple\intento4\gramatica.g4 by ANTLR 4.5.1
package com.miorganizacion.simple.intento4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_identificador = 1, RULE_main = 2, RULE_proceso = 3, 
		RULE_var_dec = 4, RULE_var_asig = 5, RULE_var_decasign = 6, RULE_accion = 7, 
		RULE_when = 8, RULE_forr = 9, RULE_keep = 10, RULE_posi = 11, RULE_callname = 12, 
		RULE_posstart = 13, RULE_put = 14, RULE_high = 15, RULE_highM = 16, RULE_place = 17, 
		RULE_placeM = 18, RULE_change = 19, RULE_idl = 20, RULE_idp = 21;
	public static final String[] ruleNames = {
		"program", "identificador", "main", "proceso", "var_dec", "var_asig", 
		"var_decasign", "accion", "when", "forr", "keep", "posi", "callname", 
		"posstart", "put", "high", "highM", "place", "placeM", "change", "idl", 
		"idp"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<ProcesoContext> proceso() {
			return getRuleContexts(ProcesoContext.class);
		}
		public ProcesoContext proceso(int i) {
			return getRuleContext(ProcesoContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				identificador();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR || _la==SET );
			setState(49);
			main();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROC) {
				{
				{
				setState(50);
				proceso();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Var_asigContext var_asig() {
			return getRuleContext(Var_asigContext.class,0);
		}
		public Var_decasignContext var_decasign() {
			return getRuleContext(Var_decasignContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identificador);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				var_asig();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				var_decasign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(gramaticaParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(gramaticaParser.END, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(BEGIN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGEDIR) | (1L << PLACE) | (1L << PLACEM) | (1L << HIGH) | (1L << PUT) | (1L << POSI) | (1L << KEEP) | (1L << FOR) | (1L << WHEN) | (1L << POSSTART) | (1L << CALL) | (1L << ADD) | (1L << LESS))) != 0)) {
				{
				{
				setState(62);
				accion();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcesoContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(gramaticaParser.PROC, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode EPROC() { return getToken(gramaticaParser.EPROC, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public ProcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcesoContext proceso() throws RecognitionException {
		ProcesoContext _localctx = new ProcesoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PROC);
			setState(71);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGEDIR) | (1L << PLACE) | (1L << PLACEM) | (1L << HIGH) | (1L << PUT) | (1L << POSI) | (1L << KEEP) | (1L << FOR) | (1L << WHEN) | (1L << POSSTART) | (1L << CALL) | (1L << ADD) | (1L << LESS))) != 0)) {
				{
				{
				setState(72);
				accion();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EPROC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gramaticaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVar_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(VAR);
			setState(81);
			match(ID);
			setState(82);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_asigContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(gramaticaParser.SET, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public Var_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVar_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVar_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVar_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_asigContext var_asig() throws RecognitionException {
		Var_asigContext _localctx = new Var_asigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(SET);
			setState(85);
			match(ID);
			setState(86);
			match(ASSIGN);
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(88);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decasignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gramaticaParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public Var_decasignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decasign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVar_decasign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVar_decasign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVar_decasign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decasignContext var_decasign() throws RecognitionException {
		Var_decasignContext _localctx = new Var_decasignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decasign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(VAR);
			setState(91);
			match(ID);
			setState(92);
			match(ASSIGN);
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(94);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccionContext extends ParserRuleContext {
		public IdpContext idp() {
			return getRuleContext(IdpContext.class,0);
		}
		public IdlContext idl() {
			return getRuleContext(IdlContext.class,0);
		}
		public ChangeContext change() {
			return getRuleContext(ChangeContext.class,0);
		}
		public PlaceMContext placeM() {
			return getRuleContext(PlaceMContext.class,0);
		}
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public HighMContext highM() {
			return getRuleContext(HighMContext.class,0);
		}
		public HighContext high() {
			return getRuleContext(HighContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public PosstartContext posstart() {
			return getRuleContext(PosstartContext.class,0);
		}
		public CallnameContext callname() {
			return getRuleContext(CallnameContext.class,0);
		}
		public PosiContext posi() {
			return getRuleContext(PosiContext.class,0);
		}
		public KeepContext keep() {
			return getRuleContext(KeepContext.class,0);
		}
		public ForrContext forr() {
			return getRuleContext(ForrContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accion);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				idp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				idl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				change();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				placeM();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				place();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				highM();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				high();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				put();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				posstart();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(105);
				callname();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(106);
				posi();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(107);
				keep();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(108);
				forr();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(109);
				when();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(gramaticaParser.WHEN, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode THEN() { return getToken(gramaticaParser.THEN, 0); }
		public TerminalNode WHEND() { return getToken(gramaticaParser.WHEND, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHEN);
			setState(113);
			match(ID);
			setState(114);
			match(ASSIGN);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(116);
			match(THEN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGEDIR) | (1L << PLACE) | (1L << PLACEM) | (1L << HIGH) | (1L << PUT) | (1L << POSI) | (1L << KEEP) | (1L << FOR) | (1L << WHEN) | (1L << POSSTART) | (1L << CALL) | (1L << ADD) | (1L << LESS))) != 0)) {
				{
				{
				setState(117);
				accion();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(WHEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramaticaParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode TIMES() { return getToken(gramaticaParser.TIMES, 0); }
		public TerminalNode FEND() { return getToken(gramaticaParser.FEND, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public ForrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterForr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitForr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitForr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForrContext forr() throws RecognitionException {
		ForrContext _localctx = new ForrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FOR);
			setState(126);
			match(ID);
			setState(127);
			match(ASSIGN);
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(129);
			match(TIMES);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGEDIR) | (1L << PLACE) | (1L << PLACEM) | (1L << HIGH) | (1L << PUT) | (1L << POSI) | (1L << KEEP) | (1L << FOR) | (1L << WHEN) | (1L << POSSTART) | (1L << CALL) | (1L << ADD) | (1L << LESS))) != 0)) {
				{
				{
				setState(130);
				accion();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(FEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeepContext extends ParserRuleContext {
		public TerminalNode KEEP() { return getToken(gramaticaParser.KEEP, 0); }
		public TerminalNode SKIPS() { return getToken(gramaticaParser.SKIPS, 0); }
		public TerminalNode KEND() { return getToken(gramaticaParser.KEND, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public KeepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterKeep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitKeep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitKeep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeepContext keep() throws RecognitionException {
		KeepContext _localctx = new KeepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(KEEP);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGEDIR) | (1L << PLACE) | (1L << PLACEM) | (1L << HIGH) | (1L << PUT) | (1L << POSI) | (1L << KEEP) | (1L << FOR) | (1L << WHEN) | (1L << POSSTART) | (1L << CALL) | (1L << ADD) | (1L << LESS))) != 0)) {
				{
				{
				setState(139);
				accion();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(SKIPS);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGEDIR) | (1L << PLACE) | (1L << PLACEM) | (1L << HIGH) | (1L << PUT) | (1L << POSI) | (1L << KEEP) | (1L << FOR) | (1L << WHEN) | (1L << POSSTART) | (1L << CALL) | (1L << ADD) | (1L << LESS))) != 0)) {
				{
				{
				setState(146);
				accion();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(KEND);
			setState(153);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosiContext extends ParserRuleContext {
		public TerminalNode POSI() { return getToken(gramaticaParser.POSI, 0); }
		public TerminalNode PARI() { return getToken(gramaticaParser.PARI, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public TerminalNode PARF() { return getToken(gramaticaParser.PARF, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PosiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPosi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPosi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPosi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosiContext posi() throws RecognitionException {
		PosiContext _localctx = new PosiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_posi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(POSI);
			setState(156);
			match(PARI);
			setState(157);
			match(ID);
			setState(158);
			match(COMA);
			setState(159);
			match(ID);
			setState(160);
			match(PARF);
			setState(161);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallnameContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(gramaticaParser.CALL, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public CallnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCallname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCallname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCallname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallnameContext callname() throws RecognitionException {
		CallnameContext _localctx = new CallnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CALL);
			setState(164);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosstartContext extends ParserRuleContext {
		public TerminalNode POSSTART() { return getToken(gramaticaParser.POSSTART, 0); }
		public TerminalNode PARI() { return getToken(gramaticaParser.PARI, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public TerminalNode PARF() { return getToken(gramaticaParser.PARF, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PosstartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posstart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPosstart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPosstart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPosstart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosstartContext posstart() throws RecognitionException {
		PosstartContext _localctx = new PosstartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_posstart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(POSSTART);
			setState(167);
			match(PARI);
			setState(168);
			match(ID);
			setState(169);
			match(COMA);
			setState(170);
			match(ID);
			setState(171);
			match(PARF);
			setState(172);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(gramaticaParser.PUT, 0); }
		public TerminalNode LIGHT() { return getToken(gramaticaParser.LIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_put);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PUT);
			setState(175);
			match(LIGHT);
			setState(176);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HighContext extends ParserRuleContext {
		public TerminalNode HIGH() { return getToken(gramaticaParser.HIGH, 0); }
		public TerminalNode BLOCKM() { return getToken(gramaticaParser.BLOCKM, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public HighContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterHigh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitHigh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitHigh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighContext high() throws RecognitionException {
		HighContext _localctx = new HighContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_high);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(HIGH);
			setState(179);
			match(BLOCKM);
			setState(180);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HighMContext extends ParserRuleContext {
		public TerminalNode HIGH() { return getToken(gramaticaParser.HIGH, 0); }
		public TerminalNode BLOCKM() { return getToken(gramaticaParser.BLOCKM, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public HighMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterHighM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitHighM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitHighM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighMContext highM() throws RecognitionException {
		HighMContext _localctx = new HighMContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_highM);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(HIGH);
			setState(183);
			match(BLOCKM);
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(185);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceContext extends ParserRuleContext {
		public TerminalNode PLACEM() { return getToken(gramaticaParser.PLACEM, 0); }
		public TerminalNode BLOCKM() { return getToken(gramaticaParser.BLOCKM, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_place);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(PLACEM);
			setState(188);
			match(BLOCKM);
			setState(189);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceMContext extends ParserRuleContext {
		public TerminalNode PLACE() { return getToken(gramaticaParser.PLACE, 0); }
		public TerminalNode BLOCK() { return getToken(gramaticaParser.BLOCK, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public PlaceMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPlaceM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPlaceM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPlaceM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceMContext placeM() throws RecognitionException {
		PlaceMContext _localctx = new PlaceMContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_placeM);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(PLACE);
			setState(192);
			match(BLOCK);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(194);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeContext extends ParserRuleContext {
		public TerminalNode CHANGEDIR() { return getToken(gramaticaParser.CHANGEDIR, 0); }
		public TerminalNode PARI() { return getToken(gramaticaParser.PARI, 0); }
		public TerminalNode PARF() { return getToken(gramaticaParser.PARF, 0); }
		public TerminalNode RIGHT() { return getToken(gramaticaParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(gramaticaParser.LEFT, 0); }
		public TerminalNode BACK() { return getToken(gramaticaParser.BACK, 0); }
		public TerminalNode SAME() { return getToken(gramaticaParser.SAME, 0); }
		public ChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeContext change() throws RecognitionException {
		ChangeContext _localctx = new ChangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(CHANGEDIR);
			setState(197);
			match(PARI);
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << BACK) | (1L << SAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(199);
			match(PARF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdlContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(gramaticaParser.LESS, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public IdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdlContext idl() throws RecognitionException {
		IdlContext _localctx = new IdlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LESS);
			setState(202);
			match(ID);
			setState(203);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(gramaticaParser.ADD, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public IdpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIdp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIdp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIdp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdpContext idp() throws RecognitionException {
		IdpContext _localctx = new IdpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ADD);
			setState(206);
			match(ID);
			setState(207);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\5\3>\n\3\3\4\3"+
		"\4\7\4B\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\f\3"+
		"\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099"+
		"\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3\2)*"+
		"\3\2 #\u00d4\2/\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bH\3\2\2\2\nR\3\2\2\2\f"+
		"V\3\2\2\2\16\\\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24\177\3\2\2\2\26\u008c"+
		"\3\2\2\2\30\u009d\3\2\2\2\32\u00a5\3\2\2\2\34\u00a8\3\2\2\2\36\u00b0\3"+
		"\2\2\2 \u00b4\3\2\2\2\"\u00b8\3\2\2\2$\u00bd\3\2\2\2&\u00c1\3\2\2\2(\u00c6"+
		"\3\2\2\2*\u00cb\3\2\2\2,\u00cf\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\5\6\4\2\64\66\5\b\5"+
		"\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67"+
		"\3\2\2\2:>\5\n\6\2;>\5\f\7\2<>\5\16\b\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2"+
		">\5\3\2\2\2?C\7\4\2\2@B\5\20\t\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DF\3\2\2\2EC\3\2\2\2FG\7\5\2\2G\7\3\2\2\2HI\7\6\2\2IM\7*\2\2JL\5\20"+
		"\t\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\7"+
		"\2\2Q\t\3\2\2\2RS\7\b\2\2ST\7*\2\2TU\7(\2\2U\13\3\2\2\2VW\7\t\2\2WX\7"+
		"*\2\2XY\7$\2\2YZ\t\2\2\2Z[\7(\2\2[\r\3\2\2\2\\]\7\b\2\2]^\7*\2\2^_\7$"+
		"\2\2_`\t\2\2\2`a\7(\2\2a\17\3\2\2\2bq\5,\27\2cq\5*\26\2dq\5(\25\2eq\5"+
		"&\24\2fq\5$\23\2gq\5\"\22\2hq\5 \21\2iq\5\36\20\2jq\5\34\17\2kq\5\32\16"+
		"\2lq\5\30\r\2mq\5\26\f\2nq\5\24\13\2oq\5\22\n\2pb\3\2\2\2pc\3\2\2\2pd"+
		"\3\2\2\2pe\3\2\2\2pf\3\2\2\2pg\3\2\2\2ph\3\2\2\2pi\3\2\2\2pj\3\2\2\2p"+
		"k\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\21\3\2\2\2rs\7\31\2"+
		"\2st\7*\2\2tu\7$\2\2uv\t\2\2\2vz\7\33\2\2wy\5\20\t\2xw\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\32\2\2~\23\3\2\2\2\177"+
		"\u0080\7\26\2\2\u0080\u0081\7*\2\2\u0081\u0082\7$\2\2\u0082\u0083\t\2"+
		"\2\2\u0083\u0087\7\30\2\2\u0084\u0086\5\20\t\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\27\2\2\u008b\25\3\2\2\2\u008c\u0090"+
		"\7\23\2\2\u008d\u008f\5\20\t\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0097\7\24\2\2\u0094\u0096\5\20\t\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\25\2\2\u009b\u009c\7(\2\2\u009c"+
		"\27\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f\7%\2\2\u009f\u00a0\7*\2\2"+
		"\u00a0\u00a1\7\'\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a4"+
		"\7(\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\7*\2\2\u00a7"+
		"\33\3\2\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\7*\2\2"+
		"\u00ab\u00ac\7\'\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\7&\2\2\u00ae\u00af"+
		"\7(\2\2\u00af\35\3\2\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\7\21\2\2\u00b2"+
		"\u00b3\7(\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\7\16\2"+
		"\2\u00b6\u00b7\7(\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba"+
		"\7\16\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00bc\7(\2\2\u00bc#\3\2\2\2\u00bd"+
		"\u00be\7\f\2\2\u00be\u00bf\7\16\2\2\u00bf\u00c0\7(\2\2\u00c0%\3\2\2\2"+
		"\u00c1\u00c2\7\13\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00c5"+
		"\7(\2\2\u00c5\'\3\2\2\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\7%\2\2\u00c8\u00c9"+
		"\t\3\2\2\u00c9\u00ca\7&\2\2\u00ca)\3\2\2\2\u00cb\u00cc\7\37\2\2\u00cc"+
		"\u00cd\7*\2\2\u00cd\u00ce\7(\2\2\u00ce+\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0"+
		"\u00d1\7*\2\2\u00d1\u00d2\7(\2\2\u00d2-\3\2\2\2\f\61\67=CMpz\u0087\u0090"+
		"\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}