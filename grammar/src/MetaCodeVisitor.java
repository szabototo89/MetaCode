// Generated from ../MetaCode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MetaCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MetaCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull MetaCodeParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull MetaCodeParser.FunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull MetaCodeParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull MetaCodeParser.AssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(@NotNull MetaCodeParser.IfExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull MetaCodeParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull MetaCodeParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(@NotNull MetaCodeParser.BlockExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull MetaCodeParser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MetaCodeParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull MetaCodeParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#foreachExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachExpression(@NotNull MetaCodeParser.ForeachExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull MetaCodeParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull MetaCodeParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull MetaCodeParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(@NotNull MetaCodeParser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#whileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpression(@NotNull MetaCodeParser.WhileExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull MetaCodeParser.ArrayContext ctx);
}