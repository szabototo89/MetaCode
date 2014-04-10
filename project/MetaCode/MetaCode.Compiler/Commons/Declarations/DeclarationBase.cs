using MetaCode.Core;

namespace MetaCode.Compiler.Commons.Declarations
{
    public class DeclarationBase
    {
        public string Name { get; protected set; }

        public Scope Scope { get; protected set; }

        protected DeclarationBase(string name, Scope scope)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            if (scope == null)
                ThrowHelper.ThrowArgumentNullException(() => scope);

            Name = name;
            Scope = scope;
        }
    }
}