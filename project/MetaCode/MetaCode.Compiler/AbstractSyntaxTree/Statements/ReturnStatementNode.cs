using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class ReturnStatementNode : StatementNodeBase
    {
        public ExpressionNode ReturnExpression { get; protected set; }

        public ReturnStatementNode(ExpressionNode returnExpression)
        {
            if (returnExpression == null)
                ThrowHelper.ThrowArgumentNullException(() => returnExpression);

            ReturnExpression = returnExpression;
            AddChildren(ReturnExpression);
        }
    }
}
