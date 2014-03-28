using System;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class Variable : Node
    {
        public BlockStatementNode Scope { get; internal set; }

        public Identifier Identifier { get; internal set; }

        public TypeNameNode TypeName { get; internal set; }

        public Variable(Identifier identifier, TypeNameNode typeName, BlockStatementNode scope)
        {
            if (identifier == null)
                throw new ArgumentNullException("identifier", "The identifier is null!");
            if (typeName == null) 
                throw new ArgumentNullException("typeName", "The typeName is null!");
            if (scope == null) 
                throw new ArgumentNullException("scope", "The scope is null!");
            
            Identifier = identifier;
            TypeName = typeName;
            Scope = scope;
        }
    }
}