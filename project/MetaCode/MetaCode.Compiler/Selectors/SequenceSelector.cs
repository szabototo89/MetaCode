using System;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class SequenceSelector : NodeSelector
    {
        protected override bool FilterNode(Node node)
        {
            Func<bool> filter = () => (node is BlockStatementNode);

            TryGetAttribute("length", attribute =>
            {
                var block = node as BlockStatementNode;
                int value = 0;
                if (!int.TryParse(attribute.Value, out value))
                    throw new Exception("Invalid value of length property!");

                filter = () => filter() && block.Children.Count() == value;
            });

            return filter();
        }
    }
}