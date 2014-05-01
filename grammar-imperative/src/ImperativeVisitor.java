// Generated from ../Imperative.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImperativeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImperativeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImperativeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ImperativeParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ImperativeParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ImperativeParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ImperativeParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ImperativeParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(@NotNull ImperativeParser.LoopStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull ImperativeParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(@NotNull ImperativeParser.SkipContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#actualParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameters(@NotNull ImperativeParser.ActualParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ImperativeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull ImperativeParser.IfStatementContext ctx);
}