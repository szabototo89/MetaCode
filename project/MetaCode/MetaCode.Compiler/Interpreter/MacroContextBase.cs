using System;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public abstract class MacroContextBase
    {
        public string Name { get; protected set; }

        public MacroContextBase(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            Name = name;
        }

        public abstract object Invoke(Node[] parameters);
    }

    public class NativeMacroContext : MacroContextBase
    {
        public Func<Node[], object> MacroFunction { get; set; }

        public NativeMacroContext(string name, Func<Node[], object> macroFunction) : base(name)
        {
            if (macroFunction == null) 
                ThrowHelper.ThrowArgumentNullException(() => macroFunction);
            MacroFunction = macroFunction;
        }

        public override object Invoke(Node[] parameters)
        {
            return MacroFunction(parameters);
        }
    }
}