using System.Collections.Generic;
using System.Linq;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public abstract class CallExpressionNodeBase<TNode> : ExpressionNode
        where TNode : Node
    {
        protected CallExpressionNodeBase(string name, IEnumerable<TNode> actualParameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (actualParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => actualParameters);

            FunctionName = new IdentifierExpressionNode(name);
            ActualParameters = actualParameters.ToList();

            AddChildren(FunctionName);
            AddChildren(ActualParameters);
        }

        public IEnumerable<TNode> ActualParameters { get; internal set; }
        public IdentifierExpressionNode FunctionName { get; set; }
    }
}