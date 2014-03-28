using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Commons;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class ForeachLoopStatementNode : LoopStatementNodeBase
    {
        public VariableDeclaration LoopVariable { get; protected set; }

        public ExpressionNode Expression { get; protected set; }

        public ForeachLoopStatementNode(VariableDeclaration loopVariable, ExpressionNode expression, StatementNodeBase body)
            : base(body)
        {
            if (loopVariable == null) throw new ArgumentNullException("loopVariable", "The loopVariable is null!");
            if (expression == null) throw new ArgumentNullException("expression", "The expression is null!");

            LoopVariable = loopVariable;
            Expression = expression;

            AddChildren(expression, body);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new Node[] { Expression }); }
        }
    }
}