using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Commons
{
    public class Scope
    {
        private readonly List<FunctionDeclaration> _functionDeclarations;
        private readonly List<VariableDeclaration> _variableDeclarations;
        private readonly List<MacroDeclaration> _macroDeclarations;

        public Scope Parent { get; protected set; }

        public IEnumerable<VariableDeclaration> VariableDeclarations
        {
            get { return _variableDeclarations; }
        }

        public IEnumerable<FunctionDeclaration> FunctionDeclarations
        {
            get { return _functionDeclarations; }
        }

        public IEnumerable<MacroDeclaration> MacroDeclarations
        {
            get { return _macroDeclarations; }
        }

        private Scope()
        {
            _variableDeclarations = new List<VariableDeclaration>();
            _functionDeclarations = new List<FunctionDeclaration>();
            _macroDeclarations = new List<MacroDeclaration>();
        }

        public Scope(Scope parent) : this()
        {
            if (parent == null)
                ThrowHelper.ThrowArgumentNullException(() => parent);

            Parent = parent;
        }

        public static Scope CreateGlobalScope()
        {
            return new Scope();
        }

        public Scope CreateScope()
        {
            return new Scope(this);
        }

        public Scope DeclareVariable(string name, Type type)
        {
            _variableDeclarations.Add(new VariableDeclaration());

            return this;
        }
    }
}
