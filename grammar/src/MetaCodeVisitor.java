// Generated from ../MetaCode.g4 by ANTLR 4.2
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
	 * Visit a parse tree produced by {@link MetaCodeParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull MetaCodeParser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull MetaCodeParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull MetaCodeParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull MetaCodeParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#intervalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalConstant(@NotNull MetaCodeParser.IntervalConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull MetaCodeParser.PrimaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#macroCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroCallExpression(@NotNull MetaCodeParser.MacroCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(@NotNull MetaCodeParser.AttributeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(@NotNull MetaCodeParser.ElseIfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull MetaCodeParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(@NotNull MetaCodeParser.FunctionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull MetaCodeParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(@NotNull MetaCodeParser.ActualParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#skipStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStatement(@NotNull MetaCodeParser.SkipStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull MetaCodeParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(@NotNull MetaCodeParser.BooleanConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#memberTagExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberTagExpression(@NotNull MetaCodeParser.MemberTagExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull MetaCodeParser.AssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull MetaCodeParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#numberConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConstant(@NotNull MetaCodeParser.NumberConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull MetaCodeParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull MetaCodeParser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#memberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(@NotNull MetaCodeParser.MemberExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(@NotNull MetaCodeParser.ObjectDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MetaCodeParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull MetaCodeParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#macroStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroStatement(@NotNull MetaCodeParser.MacroStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull MetaCodeParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#arrayConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstant(@NotNull MetaCodeParser.ArrayConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(@NotNull MetaCodeParser.ForeachStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(@NotNull MetaCodeParser.StringConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link MetaCodeParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull MetaCodeParser.IdentifierContext ctx);
}