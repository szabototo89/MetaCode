// Generated from ../Imperative.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImperativeParser}.
 */
public interface ImperativeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImperativeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ImperativeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ImperativeParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ImperativeParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ImperativeParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(@NotNull ImperativeParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(@NotNull ImperativeParser.LoopStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull ImperativeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull ImperativeParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull ImperativeParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull ImperativeParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(@NotNull ImperativeParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(@NotNull ImperativeParser.SkipContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull ImperativeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull ImperativeParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ImperativeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ImperativeParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ImperativeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ImperativeParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull ImperativeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull ImperativeParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull ImperativeParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull ImperativeParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull ImperativeParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull ImperativeParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull ImperativeParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull ImperativeParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#procedureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDefinition(@NotNull ImperativeParser.ProcedureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#procedureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDefinition(@NotNull ImperativeParser.ProcedureDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ImperativeParser#actualParameters}.
	 * @param ctx the parse tree
	 */
	void enterActualParameters(@NotNull ImperativeParser.ActualParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeParser#actualParameters}.
	 * @param ctx the parse tree
	 */
	void exitActualParameters(@NotNull ImperativeParser.ActualParametersContext ctx);
}