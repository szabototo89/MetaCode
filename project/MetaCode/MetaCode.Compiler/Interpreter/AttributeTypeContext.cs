using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class AttributeTypeContext : TypeContextBase
    {
        public AttributeDeclaration Declaration { get; protected set; }

        public AttributeTypeContext(string name, AttributeDeclaration declaration) : base(name)
        {
            if (declaration == null)
                ThrowHelper.ThrowArgumentNullException(() => declaration);

            Declaration = declaration;
        }
    }
}