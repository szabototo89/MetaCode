using System;
using MetaCode.Compiler.AbstractTree.Statements;

namespace MetaCode.Compiler.AbstractTree
{
    public class Variable : Node
    {
        public BlockStatementNode Scope { get; internal set; }

        public Identitifier Identitifier { get; internal set; }

        public TypeNameNode TypeName { get; internal set; }

        public Variable(Identitifier identitifier, TypeNameNode typeName, BlockStatementNode scope)
        {
            if (identitifier == null)
                throw new ArgumentNullException("identitifier", "The identifier is null!");
            if (typeName == null) 
                throw new ArgumentNullException("typeName", "The typeName is null!");
            if (scope == null) 
                throw new ArgumentNullException("scope", "The scope is null!");
            
            Identitifier = identitifier;
            TypeName = typeName;
            Scope = scope;
        }
    }
}