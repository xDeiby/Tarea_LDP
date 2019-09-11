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
	 * Visit a parse tree produced by {@link SimpleParser#writte_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritte_op(@NotNull SimpleParser.Writte_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#type_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_data(@NotNull SimpleParser.Type_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sent_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_logic(@NotNull SimpleParser.Sent_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(@NotNull SimpleParser.SentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(@NotNull SimpleParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecla(@NotNull SimpleParser.DeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#read_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_op(@NotNull SimpleParser.Read_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(@NotNull SimpleParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull SimpleParser.ConditionContext ctx);
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
}