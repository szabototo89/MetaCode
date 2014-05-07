using System;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class FunctionCallSelector : NodeSelector
    {
        protected override bool FilterNode(Node node)
        {
            Func<bool> filter = () => (node is FunctionCallExpressionNode);

            TryGetAttribute("name", attribute =>
            {
                var function = node as FunctionCallExpressionNode;
                var result = filter();
                filter = () => result && function.FunctionName.Name == attribute.Value;
            });

            return filter();
        }
    }
}