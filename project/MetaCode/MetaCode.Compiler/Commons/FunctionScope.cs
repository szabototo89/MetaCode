using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons
{
    public class FunctionScope : Scope
    {
        public FunctionDeclaration Function { get; set; }

        public FunctionScope(Scope parent, FunctionDeclaration function)
            : base(parent)
        {
            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            Function = function;
        }
    }
}