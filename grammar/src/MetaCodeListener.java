// Generated from ../MetaCode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaCodeParser}.
 */
public interface MetaCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MetaCodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MetaCodeParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull MetaCodeParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull MetaCodeParser.FunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull MetaCodeParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull MetaCodeParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull MetaCodeParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull MetaCodeParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(@NotNull MetaCodeParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(@NotNull MetaCodeParser.IfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull MetaCodeParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull MetaCodeParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull MetaCodeParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull MetaCodeParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(@NotNull MetaCodeParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(@NotNull MetaCodeParser.BlockExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull MetaCodeParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull MetaCodeParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MetaCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MetaCodeParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull MetaCodeParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull MetaCodeParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#foreachExpression}.
	 * @param ctx the parse tree
	 */
	void enterForeachExpression(@NotNull MetaCodeParser.ForeachExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#foreachExpression}.
	 * @param ctx the parse tree
	 */
	void exitForeachExpression(@NotNull MetaCodeParser.ForeachExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MetaCodeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MetaCodeParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull MetaCodeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull MetaCodeParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull MetaCodeParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull MetaCodeParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull MetaCodeParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull MetaCodeParser.AttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(@NotNull MetaCodeParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(@NotNull MetaCodeParser.WhileExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull MetaCodeParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull MetaCodeParser.ArrayContext ctx);
}