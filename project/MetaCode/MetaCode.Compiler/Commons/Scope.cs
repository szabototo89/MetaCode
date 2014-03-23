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

        public Scope(Scope parent)
            : this()
        {
            if (parent == null)
                ThrowHelper.ThrowArgumentNullException(() => parent);

            Parent = parent;
        }

        public bool TryGetVariable(string name, Action<VariableDeclaration> result)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            if (result == null)
                ThrowHelper.ThrowArgumentNullException(() => result);

            var variable = _variableDeclarations.FirstOrDefault(var => var.Name == name);

            if (variable != null)
                result(variable);

            return variable == null;
        }

        public bool ContainsVariable(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            return _variableDeclarations.Any(var => var.Name == name);
        }

        public static Scope CreateGlobalScope()
        {
            return new Scope();
        }

        public Scope CreateScope()
        {
            return new Scope(this);
        }

        public VariableDeclaration DeclareVariable(string name, Type type)
        {
            var declaration = new VariableDeclaration(name, type, this);
            _variableDeclarations.Add(declaration);

            return declaration;
        }
    }
}
