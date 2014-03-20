using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Expressions
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
