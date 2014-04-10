using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public abstract class FunctionContext
    {
        public string Name { get;  protected set; }

        protected FunctionContext(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            Name = name;
        }

        public abstract object Invoke(object[] parameters);
    }
}