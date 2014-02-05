// Generated from ../MetaCode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaCodeParser}.
 */
public interface MetaCodeListener extends ParseTreeListener {
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
}