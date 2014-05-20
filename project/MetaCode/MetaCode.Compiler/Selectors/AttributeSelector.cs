using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;

namespace MetaCode.Compiler.Selectors
{
    public class AttributeSelector : NodeSelector
    {
        protected override bool FilterNode(Node node)
        {
            var filter = new Func<bool>(() => node is AttributeNode);

            TryGetAttribute("name", attribute =>
            {
                var result = filter();
                var attributeNode = node as AttributeNode;
                filter = () => result && attributeNode.Name == "@" + attribute.Value;
            });

            return filter();
        }
    }
}
