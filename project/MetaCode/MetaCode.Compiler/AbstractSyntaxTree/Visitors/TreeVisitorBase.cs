using System;
using System.Collections.Generic;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class TreeVisitorBase<TResult>
    {
        public delegate TResult VisitorDelegate(TreeVisitorBase<TResult> visitor, Node node);

        public delegate TResult VisitorDelegate<in TNode>(TreeVisitorBase<TResult> visitor, TNode node) where TNode : Node;

        protected readonly Dictionary<Type, VisitorDelegate> _visitors;
        protected readonly Dictionary<Type, VisitorDelegate> _implementsVisitors;

        protected VisitorDelegate _defaultVisitor;

        public TreeVisitorBase()
        {
            _visitors = new Dictionary<Type, VisitorDelegate>();
            _implementsVisitors = new Dictionary<Type, VisitorDelegate>();
            InitDefaultVisitor();
        }

        private void InitDefaultVisitor()
        {
            _defaultVisitor = (visitor, node) => {
                foreach (var child in node.Children)
                    visitor.VisitChild(child);

                return default(TResult);
            };
        }

        public TResult VisitChild(Node node)
        {
            if (node == null)
                ThrowHelper.ThrowArgumentNullException(() => node);

            var type = node.GetType();
            VisitorDelegate visitor = null;

            if (_visitors.TryGetValue(type, out visitor))
                return visitor(this, node);

            return _defaultVisitor(this, node);
        }

        public TreeVisitorBase<TResult> DefaultVisitor(VisitorDelegate func)
        {
            if (func == null)
                ThrowHelper.ThrowArgumentNullException(() => func);

            _defaultVisitor = func;
            return this;
        }

        public TreeVisitorBase<TResult> If<TNode>(VisitorDelegate<TNode> func)
            where TNode : Node
        {
            if (func == null)
                ThrowHelper.ThrowArgumentNullException(() => func);

            _visitors.Add(typeof(TNode), (visitor, node) => func(this, node as TNode));

            return this;
        }

        public TreeVisitorBase<TResult> Clear()
        {
            _visitors.Clear();
            InitDefaultVisitor();
            return this;
        }
    }
}
