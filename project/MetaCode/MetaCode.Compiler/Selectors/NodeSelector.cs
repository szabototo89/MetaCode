using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Security.Permissions;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.Selectors.Operators;
using MetaCode.Core;

namespace MetaCode.Compiler.Selectors
{
    public abstract class NodeSelector
    {
        private List<NodeSelectorAttribute> _attributes;

        public IEnumerable<NodeSelectorAttribute> Attributes
        {
            get { return _attributes; }
            set { _attributes = (value ?? new List<NodeSelectorAttribute>()).ToList(); }
        }

        protected bool TryGetAttribute(string name, Action<NodeSelectorAttribute> func)
        {
            if (func == null)
                ThrowHelper.ThrowArgumentNullException(() => func);

            var result = _attributes.FirstOrDefault(attribute => attribute.Name == name);

            if (result != null)
                func(result);

            return result != null;
        }

        protected NodeSelector()
        {
            _attributes = new List<NodeSelectorAttribute>();
        }

        protected abstract bool FilterNode(Node node);

        protected virtual Node ModifyNodeSelection(Node node)
        {
            return node;
        }

        public NodeSelector Child { get; set; }

        public NodeSelectorOperator Operator { get; set; }

        public IEnumerable<Node> SelectNode(Node node)
        {
            if (node == null)
                ThrowHelper.ThrowArgumentNullException(() => node);

            if (!FilterNode(node))
                return new Node[0];

            var modifiedNode = ModifyNodeSelection(node);

            if (Child == null)
                return new[] { modifiedNode };

            return Operator.Iterate(modifiedNode, child => Child.SelectNode(child));
        }
    }
}
