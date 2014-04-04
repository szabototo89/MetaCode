//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.2-SNAPSHOT
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from E:\Development\Projects\C#\MetaCode\project\MetaCode\MetaCode.Compiler\Grammar\MetaCode.g4 by ANTLR 4.2-SNAPSHOT

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591

namespace MetaCode.Compiler.Grammar {
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="MetaCodeParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.2-SNAPSHOT")]
[System.CLSCompliant(false)]
public interface IMetaCodeVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] MetaCodeParser.ExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.formalParameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFormalParameter([NotNull] MetaCodeParser.FormalParameterContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStatement([NotNull] MetaCodeParser.ReturnStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAttribute([NotNull] MetaCodeParser.AttributeContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlockStatement([NotNull] MetaCodeParser.BlockStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.intervalConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIntervalConstant([NotNull] MetaCodeParser.IntervalConstantContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrimaryExpression([NotNull] MetaCodeParser.PrimaryExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.macroCallExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMacroCallExpression([NotNull] MetaCodeParser.MacroCallExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.attributeDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAttributeDeclaration([NotNull] MetaCodeParser.AttributeDeclarationContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.elseIfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElseIfStatement([NotNull] MetaCodeParser.ElseIfStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableDeclaration([NotNull] MetaCodeParser.VariableDeclarationContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.functionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunctionStatement([NotNull] MetaCodeParser.FunctionStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.statements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatements([NotNull] MetaCodeParser.StatementsContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.actualParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitActualParameterList([NotNull] MetaCodeParser.ActualParameterListContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.skipStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSkipStatement([NotNull] MetaCodeParser.SkipStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitConstant([NotNull] MetaCodeParser.ConstantContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.booleanConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBooleanConstant([NotNull] MetaCodeParser.BooleanConstantContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.memberTagExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMemberTagExpression([NotNull] MetaCodeParser.MemberTagExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.assignmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignmentExpression([NotNull] MetaCodeParser.AssignmentExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.init"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInit([NotNull] MetaCodeParser.InitContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.numberConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumberConstant([NotNull] MetaCodeParser.NumberConstantContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStatement([NotNull] MetaCodeParser.IfStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.typeName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTypeName([NotNull] MetaCodeParser.TypeNameContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.memberExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMemberExpression([NotNull] MetaCodeParser.MemberExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.objectDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObjectDeclaration([NotNull] MetaCodeParser.ObjectDeclarationContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] MetaCodeParser.StatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWhileStatement([NotNull] MetaCodeParser.WhileStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.macroStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMacroStatement([NotNull] MetaCodeParser.MacroStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.functionCallExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunctionCallExpression([NotNull] MetaCodeParser.FunctionCallExpressionContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.attributes"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAttributes([NotNull] MetaCodeParser.AttributesContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.arrayConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayConstant([NotNull] MetaCodeParser.ArrayConstantContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.foreachStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForeachStatement([NotNull] MetaCodeParser.ForeachStatementContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.stringConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStringConstant([NotNull] MetaCodeParser.StringConstantContext context);

	/// <summary>
	/// Visit a parse tree produced by <see cref="MetaCodeParser.identifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIdentifier([NotNull] MetaCodeParser.IdentifierContext context);
}
} // namespace MetaCode.Compiler.Grammar
