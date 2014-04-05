using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class ForeachLoopStatementNode : LoopStatementNodeBase
    {
        public IdentifierExpressionNode LoopVariable { get; protected set; }

        public ExpressionNode Expression { get; protected set; }

        public TypeNameNode LoopVariableType { get; protected set; }

        public ForeachLoopStatementNode(string variable, TypeNameNode variableType, ExpressionNode expression, StatementNodeBase body, AttributeNode[] attributes)
            : base(body, attributes)
        {
            if (string.IsNullOrWhiteSpace(variable))
                ThrowHelper.ThrowException("The 'variable' is blank!");

            if (expression == null) throw new ArgumentNullException("expression", "The expression is null!");

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            LoopVariable = new IdentifierExpressionNode(variable);
            Expression = expression;
            LoopVariableType = variableType;

            AddChildren(LoopVariable, LoopVariableType, Expression);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new Node[] { Expression }); }
        }
    }
}