using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public class AssignmentExpressionNode : PrimaryExpressionNode
    {
        public Identifier Identifier { get; internal set; }
        public ExpressionNode Value { get; internal set; }

        public AssignmentExpressionNode(Identifier identifier, ExpressionNode value, IEnumerable<AttributeNode> attributes) : base(attributes)
        {
            if (identifier == null) 
                ThrowHelper.ThrowArgumentNullException(() => identifier);
            if (value == null) 
                ThrowHelper.ThrowArgumentNullException(() => value);
            
            Identifier = identifier;
            Value = value;

            AddChildren(Identifier, Value);
        }

        public override Type Type
        {
            get { return Value.Type; }
        }
    }
}
