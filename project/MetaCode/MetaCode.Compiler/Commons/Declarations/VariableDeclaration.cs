using System;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons.Declarations
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
