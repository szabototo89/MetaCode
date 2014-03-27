using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public class AssignmentExpressionNode : PrimaryExpressionNode
    {
        public VariableDeclaration Variable { get; internal set; }

        public ExpressionNode Value { get; internal set; }

        public AssignmentExpressionNode(VariableDeclaration variable, ExpressionNode value, IEnumerable<AttributeNode> attributes) : base(attributes)
        {
            if (variable == null) 
                ThrowHelper.ThrowArgumentNullException(() => variable);
            if (value == null) 
                ThrowHelper.ThrowArgumentNullException(() => value);
            
            Variable = variable;
            Value = value;

            AddChildren(Value);
        }

        public override Type Type
        {
            get { return Value.Type; }
        }
    }
}
