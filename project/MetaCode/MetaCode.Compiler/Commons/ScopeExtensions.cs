using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons
{
    public static class ScopeExtensions
    {
        public static Scope CreateScope(this Scope scope)
        {
            return new Scope(scope);
        }

        public static FunctionScope CreateFunctionScope(this Scope scope, FunctionDeclaration function)
        {
            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);
            return new FunctionScope(scope, function);
        }
    }
}