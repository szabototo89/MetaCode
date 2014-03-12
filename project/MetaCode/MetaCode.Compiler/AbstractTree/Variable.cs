using System;
using MetaCode.Compiler.AbstractTree.Statements;

namespace MetaCode.Compiler.AbstractTree
{
    public class Variable : Node
    {
        public BlockStatementNode Scope { get; internal set; }

        public Identitifier Identitifier { get; internal set; }

        public Type Type { get; internal set; }

        public Variable(Identitifier identitifier, Type type, BlockStatementNode scope)
        {
            if (identitifier == null)
                throw new ArgumentNullException("identitifier", "The identifier is null!");
            if (type == null) 
                throw new ArgumentNullException("type", "The type is null!");
            if (scope == null) 
                throw new ArgumentNullException("scope", "The scope is null!");
            
            Identitifier = identitifier;
            Type = type;
            Scope = scope;
        }
    }
}