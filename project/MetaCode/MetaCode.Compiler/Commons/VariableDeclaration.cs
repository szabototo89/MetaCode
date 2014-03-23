using MetaCode.Core;
using System;
using System.CodeDom;
using System.Reflection;

namespace MetaCode.Compiler.Commons
{
    public class VariableDeclaration : DeclarationBase
    {
        public Type Type { get; protected set; }

        public VariableDeclaration(string name, Type type, Scope scope)
            : base(name, scope)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            Type = type;
        }
    }
}
