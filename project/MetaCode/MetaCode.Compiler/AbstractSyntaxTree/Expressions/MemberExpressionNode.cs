using System;
using System.Linq;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class MemberExpressionNode : ExpressionNode
    {
        public ExpressionNode[] Members { get; protected set; }

        public MemberExpressionNode(ExpressionNode[] members)
        {
            if (members == null)
                ThrowHelper.ThrowArgumentNullException(() => members);

            if (!members.All(member => member is IdentifierExpressionNode ||
                                       member is FunctionCallExpressionNode ||
                                       member is PrimaryExpressionNode))
                throw new ArgumentException("All members must be an identifier, function call or primary expression node!");

            Members = members;
        }

        public override Type Type
        {
            get { return Members.Last().Type; }
        }
    }
}
