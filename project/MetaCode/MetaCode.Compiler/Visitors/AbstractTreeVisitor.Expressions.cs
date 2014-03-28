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
            var result = GetNodeFromContext(context.PrimaryExpression,
                context.FunctionCallExpression,
                context.MemberExpression) ??
                         VisitBinaryOperands(context.Left, context.Right, context.Operator);

            return result;
        }

        public override Node VisitFunctionExpression(MetaCodeParser.FunctionExpressionContext context)
        {
            var identifier = context.FunctionName.With(functionName => functionName.Text);
            var returnType = context.ReturnType.Accept(this) as TypeNameNode;

            var parameters = context.Parameters;

            var formalParameters = new Func<FunctionParameterNode[]>(() =>
            {
                if (parameters == null)
                    return new FunctionParameterNode[0];

                var result = parameters.formalParameter().Select(param =>
                {
                    return ExpressionFactory.FunctionFormalParameter(param.Name.Text,
                        param.Type.With(type => type.Accept(this) as TypeNameNode),
                        null);
                });

                return result.ToArray();
            })();

            if (context.BodyExpression != null)
                return ExpressionFactory.Function(identifier,
                                                  returnType.Type,
                                                  formalParameters,
                                                  new Lazy<ExpressionNode>(() => context.BodyExpression.Accept(this) as ExpressionNode));

            return ExpressionFactory.Function(identifier,
                                              returnType.Type,
                                              formalParameters,
                                              new Lazy<BlockStatementNode>(() => context.BodyStatements.Accept(this) as BlockStatementNode));
        }

        public override Node VisitPrimaryExpression(MetaCodeParser.PrimaryExpressionContext context)
        {
            if (context.Constant != null)
            {
                var constant = context.Constant.Accept(this) as ConstantLiteralNode;
                return ExpressionFactory.Constant(constant);
            }

            if (context.Id != null)
                return ExpressionFactory.Identifier(context.Id.Text);

            if (context.Assignment != null)
            {
                var assignment = context.Assignment;
            }

            if (context.InnerExpression != null)
                return context.InnerExpression.Accept(this);

            return base.VisitPrimaryExpression(context);
        }

        public override Node VisitMemberExpression(MetaCodeParser.MemberExpressionContext context)
        {
            var primary = context.primaryExpression().With(expression => expression.Accept(this)) ??
                          context.functionCallExpression().With(expression => expression.Accept(this));

            var tags = new[] { primary }.Concat(context.memberTagExpression()
                                        .Select(tag => tag.functionCallExpression()
                                                          .With(expression => expression.Accept(this))))
                                        .ToArray();

            return ExpressionFactory.Member(tags.Cast<ExpressionNode>());
        }
    }

}
