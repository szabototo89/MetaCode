// Generated from ../MetaCode.g4 by ANTLR 4.2
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
	 * Enter a parse tree produced by {@link MetaCodeParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull MetaCodeParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull MetaCodeParser.FormalParameterContext ctx);

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
	 * Enter a parse tree produced by {@link MetaCodeParser#intervalConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalConstant(@NotNull MetaCodeParser.IntervalConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#intervalConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalConstant(@NotNull MetaCodeParser.IntervalConstantContext ctx);

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
	 * Enter a parse tree produced by {@link MetaCodeParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(@NotNull MetaCodeParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(@NotNull MetaCodeParser.ActualParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull MetaCodeParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull MetaCodeParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#elseIfExpression}.
	 * @param ctx the parse tree
	 */
	void enterElseIfExpression(@NotNull MetaCodeParser.ElseIfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#elseIfExpression}.
	 * @param ctx the parse tree
	 */
	void exitElseIfExpression(@NotNull MetaCodeParser.ElseIfExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link MetaCodeParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(@NotNull MetaCodeParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(@NotNull MetaCodeParser.BooleanConstantContext ctx);

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
	 * Enter a parse tree produced by {@link MetaCodeParser#numberConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumberConstant(@NotNull MetaCodeParser.NumberConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#numberConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumberConstant(@NotNull MetaCodeParser.NumberConstantContext ctx);

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
	 * Enter a parse tree produced by {@link MetaCodeParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull MetaCodeParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull MetaCodeParser.FunctionCallExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link MetaCodeParser#arrayConstant}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstant(@NotNull MetaCodeParser.ArrayConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#arrayConstant}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstant(@NotNull MetaCodeParser.ArrayConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link MetaCodeParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(@NotNull MetaCodeParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaCodeParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(@NotNull MetaCodeParser.StringConstantContext ctx);
}