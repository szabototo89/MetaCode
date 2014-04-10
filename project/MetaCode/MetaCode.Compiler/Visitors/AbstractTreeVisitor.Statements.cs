using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Net.Mime;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor
    {
        public override Node VisitStatement(MetaCodeParser.StatementContext context)
        {
            return GetNodeFromContext(
                context.Block,
                context.If,
                context.While,
                context.Foreach,
                context.Skip,
                context.VariableDeclaration,
                context.FunctionDeclaration,
                context.ObjectDeclaration,
                context.AttributeDeclaration,
                context.MacroDeclaration,
                context.Return
            ) ?? new ExpressionStatementNode(context.Expression.Accept(this) as ExpressionNode);
        }

        public override Node VisitIfStatement(MetaCodeParser.IfStatementContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var condition = context.Condition.Accept(this) as ExpressionNode;
            var statements = context.Statements.Accept(this) as BlockStatementNode;
            var elseIfStatements = context.elseIfStatement()
                                          .Select(elseIf => elseIf.Accept(this) as IfStatementNode)
                                          .ToArray();
            var elseStatements = context.ElseStatements.With(statement => statement.Accept(this)) as BlockStatementNode;

            return StatementFactory.IfThenElse(condition, statements, elseIfStatements, elseStatements, attributes);
        }

        public override Node VisitElseIfStatement(MetaCodeParser.ElseIfStatementContext context)
        {
            var condition = context.Condition.Accept(this) as ExpressionNode;
            var statements = context.Statements.Accept(this) as BlockStatementNode;
            return StatementFactory.IfThenElse(condition, statements, new AttributeNode[0]);
        }

        public override Node VisitSkipStatement(MetaCodeParser.SkipStatementContext context)
        {
            return StatementFactory.Skip();
        }

        public override Node VisitStatements(MetaCodeParser.StatementsContext context)
        {
            return StatementFactory.Block(context.statement()
                .Select(statement => statement.Accept(this) as StatementNodeBase)
                .ToArray()
            );
        }

        public override Node VisitBlockStatement(MetaCodeParser.BlockStatementContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var body = context.statement()
                              .Select(stmt => stmt.Accept(this) as StatementNodeBase)
                              .ToArray();

            return StatementFactory.Block(body, attributes);
        }

        public override Node VisitWhileStatement(MetaCodeParser.WhileStatementContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var condition = context.ConditionExpression.Accept(this) as ExpressionNode;

            var body = context.Body.Accept(this) as StatementNodeBase;

            return StatementFactory.While(condition, body, attributes);
        }

        public override Node VisitForeachStatement(MetaCodeParser.ForeachStatementContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var identifier = context.Id.Text;
            var arrayExpression = context.ArrayExpression.Accept(this) as ExpressionNode;
            var variableType = context.VariableType.With(variable => variable.Accept(this)) as TypeNameNode;

            return StatementFactory.Foreach(identifier,
                                            variableType,
                                            arrayExpression,
                                            context.Body.Accept(this) as StatementNodeBase,
                                            attributes);
        }

        public override Node VisitVariableDeclaration(MetaCodeParser.VariableDeclarationContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var name = context.VariableName.Text;
            var typeName = context.VariableType.With(variable => variable.Accept(this)) as TypeNameNode;
            var defaultValue = context.VariableDefaultValue.With(expression => expression.Accept(this)) as ExpressionNode;

            return StatementFactory.DeclareVariable(name, typeName, defaultValue, attributes);
        }

        public override Node VisitFunctionStatement(MetaCodeParser.FunctionStatementContext context)
        {
            var attributes = GetAttributes(context.attribute());

            var functionName = context.FunctionName.Text;
            var returnType = context.ReturnType.With(type => type.Accept(this) as TypeNameNode);
            var parameters = context.formalParameter()
                                    .Select(parameter => parameter.Accept(this) as FormalParameterNode)
                                    .ToArray();
            var body = context.BodyStatements.Accept(this) as BlockStatementNode;

            return StatementFactory.Function(functionName, returnType, parameters, body, attributes);
        }

        public override Node VisitObjectDeclaration(MetaCodeParser.ObjectDeclarationContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var objectName = context.ObjectName.Text;
            var parameters = context.formalParameter()
                                    .Select(parameter => parameter.Accept(this) as FormalParameterNode)
                                    .ToArray();

            return StatementFactory.Object(objectName, parameters, attributes);
        }

        public override Node VisitAttributeDeclaration(MetaCodeParser.AttributeDeclarationContext context)
        {
            var attributes = GetAttributes(context.attribute());
            var attributeName = context.AttributeName.Text;
            var parameters = context.formalParameter()
                                    .Select(parameter => parameter.Accept(this) as FormalParameterNode)
                                    .ToArray();

            return StatementFactory.Attribute(attributeName, parameters, attributes);
        }

        public override Node VisitFormalParameter(MetaCodeParser.FormalParameterContext context)
        {
            var parameterName = context.Name.Text;
            var typeName = context.Type.Accept(this) as TypeNameNode;
            var attributes = context.attribute()
                                    .Select(attribute => attribute.Accept(this) as AttributeNode)
                                    .ToArray();

            return StatementFactory.FormalParameter(parameterName, typeName, attributes);
        }

        public override Node VisitReturnStatement(MetaCodeParser.ReturnStatementContext context)
        {
            var expression = context.ReturnExpression.Accept(this) as ExpressionNode;

            return StatementFactory.Return(expression);
        }

        public override Node VisitMacroFormalParameter(MetaCodeParser.MacroFormalParameterContext context)
        {
            var identifier = context.Name.Text;
            var treeSelector = context.Selector.Text;

            return new MacroFormalParameterNode(identifier, treeSelector);
        }

        public override Node VisitMacroStatement(MetaCodeParser.MacroStatementContext context)
        {
            var identifier = context.MacroName.Text;
            var body = context.BodyStatements.Accept(this) as BlockStatementNode;

            var parameters = context.macroFormalParameter()
                                    .Select(param => param.Accept(this) as MacroFormalParameterNode)
                                    .ToArray();

            var type = context.Type.Text == "implicit" ? MacroType.Implicit : MacroType.Explicit;

            return StatementFactory.Macro(identifier, parameters, body, type);
        }

        public override Node VisitInit(MetaCodeParser.InitContext context)
        {
            var result = base.VisitInit(context) as BlockStatementNode;

            return StatementFactory.CompilationUnit(result);
        }
    }
}
