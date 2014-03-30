//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.2-SNAPSHOT
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from E:\Development\Projects\C#\MetaCode\project\MetaCode\MetaCode.Compiler\Grammar\TreeSelector.g4 by ANTLR 4.2-SNAPSHOT

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591

namespace MetaCode.Compiler.Grammar {
using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="TreeSelectorParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.2-SNAPSHOT")]
[System.CLSCompliant(false)]
public interface ITreeSelectorListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] TreeSelectorParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] TreeSelectorParser.StatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.selector"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSelector([NotNull] TreeSelectorParser.SelectorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.selector"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSelector([NotNull] TreeSelectorParser.SelectorContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.selectors"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSelectors([NotNull] TreeSelectorParser.SelectorsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.selectors"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSelectors([NotNull] TreeSelectorParser.SelectorsContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.baseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBaseStatement([NotNull] TreeSelectorParser.BaseStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.baseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBaseStatement([NotNull] TreeSelectorParser.BaseStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAttribute([NotNull] TreeSelectorParser.AttributeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAttribute([NotNull] TreeSelectorParser.AttributeContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.init"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInit([NotNull] TreeSelectorParser.InitContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.init"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInit([NotNull] TreeSelectorParser.InitContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TreeSelectorParser.@operator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOperator([NotNull] TreeSelectorParser.OperatorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TreeSelectorParser.@operator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOperator([NotNull] TreeSelectorParser.OperatorContext context);
}
} // namespace MetaCode.Compiler.Grammar
