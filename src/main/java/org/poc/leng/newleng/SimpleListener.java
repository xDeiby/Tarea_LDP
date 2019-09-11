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
	 * Enter a parse tree produced by {@link SimpleParser#writte_op}.
	 * @param ctx the parse tree
	 */
	void enterWritte_op(@NotNull SimpleParser.Writte_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#writte_op}.
	 * @param ctx the parse tree
	 */
	void exitWritte_op(@NotNull SimpleParser.Writte_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#type_data}.
	 * @param ctx the parse tree
	 */
	void enterType_data(@NotNull SimpleParser.Type_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#type_data}.
	 * @param ctx the parse tree
	 */
	void exitType_data(@NotNull SimpleParser.Type_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sent_logic}.
	 * @param ctx the parse tree
	 */
	void enterSent_logic(@NotNull SimpleParser.Sent_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sent_logic}.
	 * @param ctx the parse tree
	 */
	void exitSent_logic(@NotNull SimpleParser.Sent_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(@NotNull SimpleParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(@NotNull SimpleParser.SentencesContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#decla}.
	 * @param ctx the parse tree
	 */
	void enterDecla(@NotNull SimpleParser.DeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#decla}.
	 * @param ctx the parse tree
	 */
	void exitDecla(@NotNull SimpleParser.DeclaContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#read_op}.
	 * @param ctx the parse tree
	 */
	void enterRead_op(@NotNull SimpleParser.Read_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#read_op}.
	 * @param ctx the parse tree
	 */
	void exitRead_op(@NotNull SimpleParser.Read_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(@NotNull SimpleParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(@NotNull SimpleParser.Assign_varContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(@NotNull SimpleParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(@NotNull SimpleParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull SimpleParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull SimpleParser.OperationContext ctx);
}