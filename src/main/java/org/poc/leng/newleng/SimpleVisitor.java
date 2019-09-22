// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull SimpleParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_else(@NotNull SimpleParser.Start_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#end_wh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_wh(@NotNull SimpleParser.End_whContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(@NotNull SimpleParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_if(@NotNull SimpleParser.Start_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(@NotNull SimpleParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#block_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_logic(@NotNull SimpleParser.Block_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull SimpleParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_block(@NotNull SimpleParser.End_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_block(@NotNull SimpleParser.Start_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#segments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegments(@NotNull SimpleParser.SegmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull SimpleParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start_wh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_wh(@NotNull SimpleParser.Start_whContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#rango}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango(@NotNull SimpleParser.RangoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_for(@NotNull SimpleParser.Start_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#op_read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_read(@NotNull SimpleParser.Op_readContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#end_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_if(@NotNull SimpleParser.End_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#op_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_print(@NotNull SimpleParser.Op_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(@NotNull SimpleParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull SimpleParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#end_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_for(@NotNull SimpleParser.End_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#type_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_date(@NotNull SimpleParser.Type_dateContext ctx);
}