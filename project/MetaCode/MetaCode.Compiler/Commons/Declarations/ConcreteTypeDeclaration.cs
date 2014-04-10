using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons.Declarations
{
    public class ConcreteTypeDeclaration : TypeDeclaration
    {
        private static readonly Dictionary<string, Type> _standardTypes;

        public Type Type { get; protected set; }

        static ConcreteTypeDeclaration()
        {
            _standardTypes = new Dictionary<string, Type>
            {
                {"number", typeof (Double)},
                {"string", typeof (String)},
                {"boolean", typeof (Boolean)},
                {"array", typeof (Array)}
            };
        }

        public ConcreteTypeDeclaration(string name, Scope scope, Type type)
            : base(name, scope)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            Type = type;
        }

        public static ConcreteTypeDeclaration CreateTypeDeclarationFromTypeName(TypeNameNode typeNameNode, Scope scope)
        {
            if (typeNameNode == null)
                ThrowHelper.ThrowArgumentNullException(() => typeNameNode);

            if (scope == null)
                ThrowHelper.ThrowArgumentNullException(() => scope);

            Type result;
            if (_standardTypes.TryGetValue(typeNameNode.Type, out result))
                return new ConcreteTypeDeclaration(typeNameNode.Type, scope, result);

            return null;
        }
    }
}