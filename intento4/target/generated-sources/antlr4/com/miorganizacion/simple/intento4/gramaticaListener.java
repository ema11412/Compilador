// Generated from com\miorganizacion\simple\intento4\gramatica.g4 by ANTLR 4.5.1
package com.miorganizacion.simple.intento4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(gramaticaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(gramaticaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(gramaticaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(gramaticaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#proceso}.
	 * @param ctx the parse tree
	 */
	void enterProceso(gramaticaParser.ProcesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#proceso}.
	 * @param ctx the parse tree
	 */
	void exitProceso(gramaticaParser.ProcesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(gramaticaParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(gramaticaParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#var_asig}.
	 * @param ctx the parse tree
	 */
	void enterVar_asig(gramaticaParser.Var_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#var_asig}.
	 * @param ctx the parse tree
	 */
	void exitVar_asig(gramaticaParser.Var_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#var_decasign}.
	 * @param ctx the parse tree
	 */
	void enterVar_decasign(gramaticaParser.Var_decasignContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#var_decasign}.
	 * @param ctx the parse tree
	 */
	void exitVar_decasign(gramaticaParser.Var_decasignContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(gramaticaParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(gramaticaParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(gramaticaParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(gramaticaParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#forr}.
	 * @param ctx the parse tree
	 */
	void enterForr(gramaticaParser.ForrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#forr}.
	 * @param ctx the parse tree
	 */
	void exitForr(gramaticaParser.ForrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#keep}.
	 * @param ctx the parse tree
	 */
	void enterKeep(gramaticaParser.KeepContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#keep}.
	 * @param ctx the parse tree
	 */
	void exitKeep(gramaticaParser.KeepContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#posi}.
	 * @param ctx the parse tree
	 */
	void enterPosi(gramaticaParser.PosiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#posi}.
	 * @param ctx the parse tree
	 */
	void exitPosi(gramaticaParser.PosiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#callname}.
	 * @param ctx the parse tree
	 */
	void enterCallname(gramaticaParser.CallnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#callname}.
	 * @param ctx the parse tree
	 */
	void exitCallname(gramaticaParser.CallnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#posstart}.
	 * @param ctx the parse tree
	 */
	void enterPosstart(gramaticaParser.PosstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#posstart}.
	 * @param ctx the parse tree
	 */
	void exitPosstart(gramaticaParser.PosstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(gramaticaParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(gramaticaParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#high}.
	 * @param ctx the parse tree
	 */
	void enterHigh(gramaticaParser.HighContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#high}.
	 * @param ctx the parse tree
	 */
	void exitHigh(gramaticaParser.HighContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#highM}.
	 * @param ctx the parse tree
	 */
	void enterHighM(gramaticaParser.HighMContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#highM}.
	 * @param ctx the parse tree
	 */
	void exitHighM(gramaticaParser.HighMContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(gramaticaParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(gramaticaParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#placeM}.
	 * @param ctx the parse tree
	 */
	void enterPlaceM(gramaticaParser.PlaceMContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#placeM}.
	 * @param ctx the parse tree
	 */
	void exitPlaceM(gramaticaParser.PlaceMContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#change}.
	 * @param ctx the parse tree
	 */
	void enterChange(gramaticaParser.ChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#change}.
	 * @param ctx the parse tree
	 */
	void exitChange(gramaticaParser.ChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#idl}.
	 * @param ctx the parse tree
	 */
	void enterIdl(gramaticaParser.IdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#idl}.
	 * @param ctx the parse tree
	 */
	void exitIdl(gramaticaParser.IdlContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#idp}.
	 * @param ctx the parse tree
	 */
	void enterIdp(gramaticaParser.IdpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#idp}.
	 * @param ctx the parse tree
	 */
	void exitIdp(gramaticaParser.IdpContext ctx);
}