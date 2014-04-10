using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class MacroFormalParameterNode : Node
    {
        public string Name { get; protected set; }

        public string Selector { get; protected set; }

        public MacroFormalParameterNode(string name, string selector)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            if (string.IsNullOrWhiteSpace(selector))
                ThrowHelper.ThrowException("The selector is blank!");

            Name = name;
            Selector = selector;
        }
    }
}