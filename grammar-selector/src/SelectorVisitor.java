// Generated from ../Selector.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SelectorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SelectorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SelectorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SelectorParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectorParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull SelectorParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectorParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectors(@NotNull SelectorParser.SelectorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectorParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull SelectorParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectorParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull SelectorParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectorParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull SelectorParser.OperatorContext ctx);
}