using System;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class NativeFunctionContext : FunctionContextBase
    {
        public Delegate Function { get; protected set; }

        public NativeFunctionContext(string name, Delegate function) 
            : base(name)
        {
            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            Function = function;
        }

        public override object Invoke(object[] parameters)
        {
            return Function.DynamicInvoke(parameters);
        }
    }
}