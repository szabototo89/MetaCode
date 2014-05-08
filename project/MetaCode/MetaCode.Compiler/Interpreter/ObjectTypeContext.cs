using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class ObjectTypeContext : TypeContextBase
    {
        public ObjectTypeDeclaration Declaration { get; protected set; }

        public ObjectTypeContext(string name, ObjectTypeDeclaration declaration)
            : base(name)
        {
            if (Declaration == null)
                ThrowHelper.ThrowArgumentNullException(() => declaration);

            Declaration = declaration;
        }
    }
}
