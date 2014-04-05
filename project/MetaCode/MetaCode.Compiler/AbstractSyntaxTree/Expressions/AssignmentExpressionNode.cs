using System;
using System.Collections.Generic;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class AssignmentExpressionNode : PrimaryExpressionNode
    {
        public MemberExpressionNode LeftValue { get; internal set; }

        public ExpressionNode Value { get; internal set; }

        public AssignmentExpressionNode(MemberExpressionNode variable, ExpressionNode value, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            if (variable == null)
                ThrowHelper.ThrowArgumentNullException(() => variable);
            if (value == null)
                ThrowHelper.ThrowArgumentNullException(() => value);

            LeftValue = variable;
            Value = value;

            AddChildren(LeftValue, Value);
        }
    }
}
