using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class BranchingSelector : NodeSelector
    {
        protected override Node ModifyNodeSelection(Node node)
        {
            var branching = node as IfStatementNode;
            var result = node;

            TryGetAttribute("condition", attribute =>
            {
                result = branching.ConditionExpression;
            });

            TryGetAttribute("true-statement", attribute =>
            {
                result = branching.TrueStatementNode;
            });

            TryGetAttribute("false-statement", attribute =>
            {
                result = branching.FalseStatementNode;
            });

            return result;
        }

        protected override bool FilterNode(Node node)
        {
            return (node is IfStatementNode);
        }
    }
}