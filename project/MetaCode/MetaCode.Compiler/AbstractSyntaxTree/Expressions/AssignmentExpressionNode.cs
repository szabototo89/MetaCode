using System;
using System.Collections.Generic;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class AssignmentExpressionNode : PrimaryExpressionNode
    {
        public MemberExpressionNode LeftValue { get; internal set; }

        public ExpressionNode RightValue { get; internal set; }

        public AssignmentExpressionNode(MemberExpressionNode variable, ExpressionNode rightValue, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            if (variable == null)
                ThrowHelper.ThrowArgumentNullException(() => variable);
            if (rightValue == null)
                ThrowHelper.ThrowArgumentNullException(() => rightValue);

            LeftValue = variable;
            RightValue = rightValue;

            AddChildren(LeftValue, RightValue);
        }
    }
}
