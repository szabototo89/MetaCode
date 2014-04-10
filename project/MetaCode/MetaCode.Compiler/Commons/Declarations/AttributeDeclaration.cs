using System.Collections.Generic;

namespace MetaCode.Compiler.Commons.Declarations
{
    public class AttributeDeclaration : DeclarationBase
    {
        public IEnumerable<FormalParameter> FormalParameters { get; protected set; }

        public AttributeDeclaration(string name, IEnumerable<FormalParameter> formalParameters, Scope scope)
            : base(name, scope)
        {
            FormalParameters = formalParameters;
        }
    }
}
