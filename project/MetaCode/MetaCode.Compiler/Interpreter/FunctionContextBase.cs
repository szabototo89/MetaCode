using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public abstract class FunctionContextBase
    {
        public string Name { get;  protected set; }

        protected FunctionContextBase(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            Name = name;
        }

        public abstract object Invoke(object[] parameters);
    }
}