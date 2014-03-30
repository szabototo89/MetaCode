// Generated from ../Selector.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SelectorParser}.
 */
public interface SelectorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SelectorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SelectorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SelectorParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectorParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull SelectorParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull SelectorParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectorParser#selectors}.
	 * @param ctx the parse tree
	 */
	void enterSelectors(@NotNull SelectorParser.SelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#selectors}.
	 * @param ctx the parse tree
	 */
	void exitSelectors(@NotNull SelectorParser.SelectorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectorParser#baseStatement}.
	 * @param ctx the parse tree
	 */
	void enterBaseStatement(@NotNull SelectorParser.BaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#baseStatement}.
	 * @param ctx the parse tree
	 */
	void exitBaseStatement(@NotNull SelectorParser.BaseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectorParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull SelectorParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull SelectorParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectorParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull SelectorParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull SelectorParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectorParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull SelectorParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectorParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull SelectorParser.OperatorContext ctx);
}