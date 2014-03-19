namespace MetaCode.Compiler.AbstractTree.Operators.Logical
{
    public class NegationOperatorNode : LogicalUnaryOperatorNode
    {
        public override string Operator
        {
            get { return "not"; }
        }
    }
}