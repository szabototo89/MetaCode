namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational
{
    public class EqualityOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "=="; }
        }
    }
}