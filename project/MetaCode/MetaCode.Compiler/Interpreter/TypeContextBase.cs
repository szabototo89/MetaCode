using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public abstract class TypeContextBase
    {
        public string Name { get; protected set; }

        protected TypeContextBase(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowArgumentNullException(() => name);

            Name = name;
        }
    }
}