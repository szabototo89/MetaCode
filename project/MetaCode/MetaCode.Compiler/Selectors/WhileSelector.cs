using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class WhileSelector : NodeSelector
    {
        protected override Node ModifyNodeSelection(Node node)
        {
            var statement = node as WhileLoopStatementNode;
            var result = node;

            TryGetAttribute("body", attribute =>
            {
                result = statement.Body;
            });

            TryGetAttribute("condition", attribute =>
            {
                result = statement.ConditionExpression;
            });

            return result;
        }

        protected override bool FilterNode(Node node)
        {
            return (node is WhileLoopStatementNode);
        }
    }
}