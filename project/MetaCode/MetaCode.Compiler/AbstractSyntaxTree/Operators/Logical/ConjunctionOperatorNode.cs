namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical
{
    public class ConjunctionBinaryOperatorNode : LogicalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "and"; }
        }
    }
}
