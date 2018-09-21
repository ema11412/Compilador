// Generated from com\miorganizacion\simple\intento4\gramatica.g4 by ANTLR 4.5.1
package com.miorganizacion.simple.intento4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(gramaticaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(gramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceso(gramaticaParser.ProcesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(gramaticaParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#var_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_asig(gramaticaParser.Var_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#var_decasign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decasign(gramaticaParser.Var_decasignContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(gramaticaParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(gramaticaParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#forr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForr(gramaticaParser.ForrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#keep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep(gramaticaParser.KeepContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#posi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosi(gramaticaParser.PosiContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#callname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallname(gramaticaParser.CallnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#posstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosstart(gramaticaParser.PosstartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut(gramaticaParser.PutContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#high}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigh(gramaticaParser.HighContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#highM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighM(gramaticaParser.HighMContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#place}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(gramaticaParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#placeM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceM(gramaticaParser.PlaceMContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#change}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange(gramaticaParser.ChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#idl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdl(gramaticaParser.IdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#idp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdp(gramaticaParser.IdpContext ctx);
}