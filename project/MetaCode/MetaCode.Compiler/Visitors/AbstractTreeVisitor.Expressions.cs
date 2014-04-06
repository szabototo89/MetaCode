using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{

    // TODO: Write visitor of expressions
    public partial class AbstractTreeVisitor
    {
        private Node VisitBinaryOperands(MetaCodeParser.ExpressionContext left, MetaCodeParser.ExpressionContext right,
            IToken @operator)
        {
            if (new object[] { left, right, @operator }.Any(obj => obj == null))
                return null;

            var leftExpression = left.Accept(this) as ExpressionNode;
            var rightExpression = right.Accept(this) as ExpressionNode;
            var operatorText = @operator.Text;

            return ExpressionFactory.BinaryOperand(leftExpression, rightExpression, operatorText);
        }

        public override Node VisitExpression(MetaCodeParser.ExpressionContext context)
        {
            var result = GetNodeFromContext(
                context.PrimaryExpression,
                context.FunctionCallExpression,
                context.MacroCallExpression,
                context.MemberExpression) ??
                VisitBinaryOperands(context.Left, context.Right, context.Operator);

            return result;
        }

        /*public override Node VisitFunctionExpression(MetaCodeParser.FunctionExpressionContext context)
        {
            var identifier = context.FunctionName.With(functionName => functionName.Text);
            var returnType = context.ReturnType.Accept(this) as TypeNameNode;

            var parameters = context.Parameters;

            var formalParameters = new Func<FormalParameterNode[]>(() => {
                if (parameters == null)
                    return new FormalParameterNode[0];

                var result = parameters.formalParameter().Select(param => {
                    return ExpressionFactory.FormalParameter(param.Identifier.Text,
                        param.VariableType.With(type => type.Accept(this) as TypeNameNode),
                        null);
                });

                return result.ToArray();
            })();

            if (context.BodyExpression != null)
                return ExpressionFactory.Function(identifier,
                                                  returnType.VariableType,
                                                  formalParameters,
                                                  new Lazy<ExpressionNode>(() => context.BodyExpression.Accept(this) as ExpressionNode));

            return ExpressionFactory.Function(identifier,
                                              returnType.VariableType,
                                              formalParameters,
                                              new Lazy<BlockStatementNode>(() => context.BodyStatements.Accept(this) as BlockStatementNode));
        }*/

        public override Node VisitPrimaryExpression(MetaCodeParser.PrimaryExpressionContext context)
        {
            var attributes = context.attribute()
                                    .Select(attribute => attribute.Accept(this) as AttributeNode)
                                    .ToArray();

            if (context.Constant != null) {
                var constant = context.Constant.Accept(this) as ConstantLiteralNode;
                return ExpressionFactory.Constant(constant, attributes);
            }

            if (context.Id != null)
                return ExpressionFactory.Identifier(context.Id.Text, attributes);

            if (context.Assignment != null) {
                var assignment = context.Assignment;
                var member = assignment.LeftValue.With(leftValue => leftValue.Accept(this) as MemberExpressionNode) ??
                             ExpressionFactory.Member(new[] { assignment.VariableName.Text });

                var value = assignment.RightValue.Accept(this) as ExpressionNode;

                return ExpressionFactory.Assignment(member, value, attributes);
            }

            if (context.InnerExpression != null)
                return ExpressionFactory.InnerExpression(context.InnerExpression.Accept(this) as ExpressionNode, attributes);

            return base.VisitPrimaryExpression(context);
        }

        public override Node VisitMemberExpression(MetaCodeParser.MemberExpressionContext context)
        {
            var ids = context.ID().Select(id => id.GetText()).ToArray();

            return ExpressionFactory.Member(ids);
        }

        public override Node VisitFunctionCallExpression(MetaCodeParser.FunctionCallExpressionContext context)
        {
            var functionName = context.functionName.Text;
            var expressions = context.expression()
                                     .Select(expression => expression.Accept(this) as ExpressionNode)
                                     .ToArray();


            return ExpressionFactory.FunctionCall(functionName, expressions);
        }

        public override Node VisitMacroCallExpression(MetaCodeParser.MacroCallExpressionContext context)
        {
            var macroName = context.macroName.Text;
            var statements = context.statement()
                                    .Select(statement => statement.Accept(this) as StatementNodeBase)
                                    .ToArray();

            return ExpressionFactory.MacroCall(macroName, statements);
        }
    }

}
