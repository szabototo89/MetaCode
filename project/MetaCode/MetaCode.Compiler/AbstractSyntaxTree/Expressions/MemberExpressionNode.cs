using System;
using System.Linq;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class MemberExpressionNode : ExpressionNode
    {
        public IdentifierExpressionNode[] Members { get; protected set; }

        public MemberExpressionNode(IdentifierExpressionNode[] members)
        {
            if (members == null)
                ThrowHelper.ThrowArgumentNullException(() => members);

            Members = members;
            AddChildren(Members.Cast<Node>().ToArray());
        }
    }
}
