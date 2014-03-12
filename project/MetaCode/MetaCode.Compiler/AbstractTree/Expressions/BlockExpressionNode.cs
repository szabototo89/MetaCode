using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractTree.Constants;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public class BlockExpressionNode : ExpressionNode
    {
        public BlockExpressionNode(IEnumerable<ExpressionNode> statements, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            Statements = (statements ?? new List<ExpressionNode>()).ToList();
        }

        public override Type Type
        {
            get
            {
                if (Statements.Any())
                    return Statements.Last().Type;

                throw new Exception("'Statements' is empty!");
            }
        }

        public IEnumerable<ExpressionNode> Statements { get; internal set; }
    }
}