// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull SimpleParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull SimpleParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(@NotNull SimpleParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(@NotNull SimpleParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start_else}.
	 * @param ctx the parse tree
	 */
	void enterStart_else(@NotNull SimpleParser.Start_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start_else}.
	 * @param ctx the parse tree
	 */
	void exitStart_else(@NotNull SimpleParser.Start_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#end_wh}.
	 * @param ctx the parse tree
	 */
	void enterEnd_wh(@NotNull SimpleParser.End_whContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#end_wh}.
	 * @param ctx the parse tree
	 */
	void exitEnd_wh(@NotNull SimpleParser.End_whContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(@NotNull SimpleParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(@NotNull SimpleParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start_if}.
	 * @param ctx the parse tree
	 */
	void enterStart_if(@NotNull SimpleParser.Start_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start_if}.
	 * @param ctx the parse tree
	 */
	void exitStart_if(@NotNull SimpleParser.Start_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(@NotNull SimpleParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(@NotNull SimpleParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block_logic}.
	 * @param ctx the parse tree
	 */
	void enterBlock_logic(@NotNull SimpleParser.Block_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block_logic}.
	 * @param ctx the parse tree
	 */
	void exitBlock_logic(@NotNull SimpleParser.Block_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull SimpleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull SimpleParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 */
	void enterEnd_block(@NotNull SimpleParser.End_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 */
	void exitEnd_block(@NotNull SimpleParser.End_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 */
	void enterStart_block(@NotNull SimpleParser.Start_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 */
	void exitStart_block(@NotNull SimpleParser.Start_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#segments}.
	 * @param ctx the parse tree
	 */
	void enterSegments(@NotNull SimpleParser.SegmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#segments}.
	 * @param ctx the parse tree
	 */
	void exitSegments(@NotNull SimpleParser.SegmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull SimpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull SimpleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start_wh}.
	 * @param ctx the parse tree
	 */
	void enterStart_wh(@NotNull SimpleParser.Start_whContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start_wh}.
	 * @param ctx the parse tree
	 */
	void exitStart_wh(@NotNull SimpleParser.Start_whContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#end_if}.
	 * @param ctx the parse tree
	 */
	void enterEnd_if(@NotNull SimpleParser.End_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#end_if}.
	 * @param ctx the parse tree
	 */
	void exitEnd_if(@NotNull SimpleParser.End_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#type_date}.
	 * @param ctx the parse tree
	 */
	void enterType_date(@NotNull SimpleParser.Type_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#type_date}.
	 * @param ctx the parse tree
	 */
	void exitType_date(@NotNull SimpleParser.Type_dateContext ctx);
}