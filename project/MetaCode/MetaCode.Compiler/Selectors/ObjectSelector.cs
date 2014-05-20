using System;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class ObjectSelector : NodeSelector
    {
        protected override bool FilterNode(Node node)
        {
            var filter = new Func<bool>(() => node is ObjectDeclarationStatementNode);

            TryGetAttribute("name", attribute =>
            {
                var result = filter();
                var objectNode = node as ObjectDeclarationStatementNode;
                filter = () => result && objectNode.ObjectName == attribute.Value;
            });

            return filter();
        }
    }
}