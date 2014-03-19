namespace MetaCode.Compiler.AbstractTree.Operators.Relational
{
    public class EqualityOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "=="; }
        }
    }
}