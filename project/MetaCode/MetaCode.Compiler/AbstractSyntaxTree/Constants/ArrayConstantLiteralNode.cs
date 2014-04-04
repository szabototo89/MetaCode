using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;

namespace MetaCode.Compiler.AbstractSyntaxTree.Constants
{
    public class ArrayConstantLiteralNode : ConstantLiteralNode<ExpressionNode[]>
    {
        #region Constructors

        public ArrayConstantLiteralNode(ExpressionNode[] values)
            : base(values)
        {
            AddChildren(values);
        }

        #endregion

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(Value); }
        }
    }
}