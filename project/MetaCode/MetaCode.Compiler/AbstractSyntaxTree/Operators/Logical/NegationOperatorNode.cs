namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical
{
    public class NegationOperatorNode : LogicalUnaryOperatorNode
    {
        public override string Operator
        {
            get { return "not"; }
        }
    }
}