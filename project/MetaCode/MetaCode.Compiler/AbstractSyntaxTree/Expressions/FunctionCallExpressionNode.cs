using System;
using System.Collections.Generic;
using System.Linq.Expressions;
using MetaCode.Compiler.Commons;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class FunctionCallExpressionNode : CallExpressionNodeBase<ExpressionNode>
    {
        public FunctionCallExpressionNode(string name, IEnumerable<ExpressionNode> actualParameters)
            : base(name, actualParameters)
        {
        }
    }
}
