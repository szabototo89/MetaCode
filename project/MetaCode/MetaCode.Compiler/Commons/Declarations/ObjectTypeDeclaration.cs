using System.Collections.Generic;

namespace MetaCode.Compiler.Commons.Declarations
{
    public class ObjectTypeDeclaration : TypeDeclaration
    {
        public IEnumerable<FormalParameter> FormalParameters { get; protected set; }

        public ObjectTypeDeclaration(string name, IEnumerable<FormalParameter> formalParameters, Scope scope) 
            : base(name, scope)
        {
            FormalParameters = formalParameters;
        }
    }
}