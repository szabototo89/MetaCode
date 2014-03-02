using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractTree.Constants;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public interface IExpressionNode : INode
    {
        Type Type { get; }

        IEnumerable<IAttributeNode> Attributes { get; }
    }

    public interface IConstantExpressionNode : IExpressionNode
    {
        IConstantLiteralNode Constant { get; }
    }

    public interface IBlockExpressionNode : IExpressionNode
    {
        IEnumerable<IExpressionNode> Statements { get; }
    }

    public class BlockExpressionNode : ExpressionNode, IBlockExpressionNode
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

        IEnumerable<IExpressionNode> IBlockExpressionNode.Statements
        {
            get { return Statements; }
        }

        public IEnumerable<ExpressionNode> Statements { get; internal set; }
    }
}