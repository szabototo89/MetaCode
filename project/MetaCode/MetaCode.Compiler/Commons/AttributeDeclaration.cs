using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Commons
{
    public class AttributeDeclaration : DeclarationBase
    {
        public IEnumerable<FormalParameter> FormalParameters { get; set; }

        public AttributeDeclaration(string name, IEnumerable<FormalParameter> formalParameters, Scope scope)
            : base(name, scope)
        {
            FormalParameters = formalParameters;
        }
    }
}
