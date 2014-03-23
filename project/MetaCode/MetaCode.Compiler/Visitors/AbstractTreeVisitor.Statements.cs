using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.AbstractTree.Factories;
using MetaCode.Compiler.AbstractTree.Statements;
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
                context.Expression,
                context.Skip,
                context.VariableDeclaration
            );
        }

        public override Node VisitIfStatement(MetaCodeParser.IfStatementContext context)
        {
            var condition = context.Condition.Accept(this) as ExpressionNode;

            if (condition == null)
                throw new Exception("The condition is null!");

            return base.VisitIfStatement(context);
        }

        public override Node VisitSkipStatement(MetaCodeParser.SkipStatementContext context)
        {
            return StatementFactory.Skip();
        }

        public override Node VisitStatements(MetaCodeParser.StatementsContext context)
        {
            return StatementFactory.Block(
                () => context.statement()
                             .Select(statement => statement.Accept(this) as StatementNodeBase)
                             .ToArray()
            );
        }

        public override Node VisitBlockStatement(MetaCodeParser.BlockStatementContext context)
        {
            var body = context.Body.Accept(this) as BlockStatementNode;

            if (body == null)
                throw new Exception("The body is not BlockStatementNode!");

            return body;
        }

        public override Node VisitWhileStatement(MetaCodeParser.WhileStatementContext context)
        {
            var condition = context.ConditionExpression.Accept(this) as ExpressionNode;

            var body = context.Body.Accept(this) as StatementNodeBase;

            return StatementFactory.While(condition, body);
        }

        public override Node VisitForeachStatement(MetaCodeParser.ForeachStatementContext context)
        {
            var arrayExpression = context.ArrayExpression.Accept(this) as ExpressionNode;
            var body = context.Body.Accept(this) as StatementNodeBase;

            return base.VisitForeachStatement(context);
        }

        public override Node VisitVariableDeclaration(MetaCodeParser.VariableDeclarationContext context)
        {
            var name = context.VariableName.Text;
            var typeName = context.VariableType.With(variable => variable.Accept(this)) as TypeNameNode;
            var defaultValue = context.VariableDefaultValue.With(expression => expression.Accept(this)) as ExpressionNode;

            return StatementFactory.DeclareVariable(name, typeName, defaultValue);
        }
    }
}
