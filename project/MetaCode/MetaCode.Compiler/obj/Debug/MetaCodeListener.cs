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
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="MetaCodeParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.2-SNAPSHOT")]
[System.CLSCompliant(false)]
public interface IMetaCodeListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] MetaCodeParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] MetaCodeParser.ExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.formalParameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFormalParameter([NotNull] MetaCodeParser.FormalParameterContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.formalParameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFormalParameter([NotNull] MetaCodeParser.FormalParameterContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAttribute([NotNull] MetaCodeParser.AttributeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAttribute([NotNull] MetaCodeParser.AttributeContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlockStatement([NotNull] MetaCodeParser.BlockStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlockStatement([NotNull] MetaCodeParser.BlockStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.intervalConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIntervalConstant([NotNull] MetaCodeParser.IntervalConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.intervalConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIntervalConstant([NotNull] MetaCodeParser.IntervalConstantContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrimaryExpression([NotNull] MetaCodeParser.PrimaryExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrimaryExpression([NotNull] MetaCodeParser.PrimaryExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.elseIfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElseIfStatement([NotNull] MetaCodeParser.ElseIfStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.elseIfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElseIfStatement([NotNull] MetaCodeParser.ElseIfStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclaration([NotNull] MetaCodeParser.VariableDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclaration([NotNull] MetaCodeParser.VariableDeclarationContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.statements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatements([NotNull] MetaCodeParser.StatementsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.statements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatements([NotNull] MetaCodeParser.StatementsContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.actualParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterActualParameterList([NotNull] MetaCodeParser.ActualParameterListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.actualParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitActualParameterList([NotNull] MetaCodeParser.ActualParameterListContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.skipStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSkipStatement([NotNull] MetaCodeParser.SkipStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.skipStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSkipStatement([NotNull] MetaCodeParser.SkipStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.formalParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFormalParameterList([NotNull] MetaCodeParser.FormalParameterListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.formalParameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFormalParameterList([NotNull] MetaCodeParser.FormalParameterListContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.functionExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionExpression([NotNull] MetaCodeParser.FunctionExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.functionExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionExpression([NotNull] MetaCodeParser.FunctionExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstant([NotNull] MetaCodeParser.ConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstant([NotNull] MetaCodeParser.ConstantContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.booleanConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBooleanConstant([NotNull] MetaCodeParser.BooleanConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.booleanConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBooleanConstant([NotNull] MetaCodeParser.BooleanConstantContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.assignmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignmentExpression([NotNull] MetaCodeParser.AssignmentExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.assignmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignmentExpression([NotNull] MetaCodeParser.AssignmentExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.init"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInit([NotNull] MetaCodeParser.InitContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.init"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInit([NotNull] MetaCodeParser.InitContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.numberConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumberConstant([NotNull] MetaCodeParser.NumberConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.numberConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumberConstant([NotNull] MetaCodeParser.NumberConstantContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfStatement([NotNull] MetaCodeParser.IfStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfStatement([NotNull] MetaCodeParser.IfStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.memberExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMemberExpression([NotNull] MetaCodeParser.MemberExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.memberExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMemberExpression([NotNull] MetaCodeParser.MemberExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] MetaCodeParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] MetaCodeParser.StatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.typeName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTypeName([NotNull] MetaCodeParser.TypeNameContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.typeName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTypeName([NotNull] MetaCodeParser.TypeNameContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileStatement([NotNull] MetaCodeParser.WhileStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileStatement([NotNull] MetaCodeParser.WhileStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.functionCallExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionCallExpression([NotNull] MetaCodeParser.FunctionCallExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.functionCallExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionCallExpression([NotNull] MetaCodeParser.FunctionCallExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.attributes"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAttributes([NotNull] MetaCodeParser.AttributesContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.attributes"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAttributes([NotNull] MetaCodeParser.AttributesContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.arrayConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArrayConstant([NotNull] MetaCodeParser.ArrayConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.arrayConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArrayConstant([NotNull] MetaCodeParser.ArrayConstantContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.foreachStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForeachStatement([NotNull] MetaCodeParser.ForeachStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.foreachStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForeachStatement([NotNull] MetaCodeParser.ForeachStatementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.identifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIdentifier([NotNull] MetaCodeParser.IdentifierContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.identifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIdentifier([NotNull] MetaCodeParser.IdentifierContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="MetaCodeParser.stringConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStringConstant([NotNull] MetaCodeParser.StringConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="MetaCodeParser.stringConstant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStringConstant([NotNull] MetaCodeParser.StringConstantContext context);
}
} // namespace MetaCode.Compiler.Grammar
