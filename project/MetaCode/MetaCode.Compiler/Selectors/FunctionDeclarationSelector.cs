using System;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class FunctionDeclarationSelector : NodeSelector
    {
        protected override bool FilterNode(Node node)
        {
            Func<bool> filter = () => (node is FunctionDeclarationStatementNode);

            TryGetAttribute("name", attribute =>
            {
                var function = node as FunctionDeclarationStatementNode;
                var result = filter();
                filter = () => result && function.FunctionName == attribute.Value;
            });

            return filter();
        }
    }
}