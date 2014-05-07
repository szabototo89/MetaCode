using System;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Core;

namespace MetaCode.Compiler.Selectors
{
    public class DelegateSelector : NodeSelector
    {
        public Predicate<Node> Filter { get; protected set; }

        public DelegateSelector(Predicate<Node> filter)
        {
            if (filter == null)
                ThrowHelper.ThrowArgumentNullException(() => filter);
            Filter = filter;
        }

        protected override bool FilterNode(Node node)
        {
            return Filter(node);
        }
    }
}