using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public interface ISupportAttributes
    {
        List<AttributeNode> Attributes { get; }
    }
}