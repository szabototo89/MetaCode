using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Dfa;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Factories;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Core;

namespace MetaCode.Compiler.Services
{
    public class CompilerService
    {
        private Scope _currentScope { get; set; }
        private Scope _globalScope { get; set; }
        protected Dictionary<Node, Scope> _scopes { get; set; }

        public List<string> Errors { get; protected set; }

        public List<string> Warnings { get; protected set; }

        public ExpressionFactory ExpressionFactory { get; internal set; }

        public StatementFactory StatementFactory { get; internal set; }

        public ConstantLiteralFactory ConstantLiteralFactory { get; internal set; }

        public CompilerService()
        {
            Errors = new List<string>();
            Warnings = new List<string>();
            _scopes = new Dictionary<Node, Scope>();

            _globalScope = _currentScope = Scope.CreateGlobalScope();
        }

        public CompilerService Warning(string message)
        {
            string warning = message;

            if (CurrentSpan != null)
                warning = string.Format("({0}:{1}) {2}", CurrentSpan.Start.Line, CurrentSpan.Start.Offset, message);

            Warnings.Add(warning);
            return this;
        }

        public CompilerService Error(string message)
        {
            string error = message;

            if (CurrentSpan != null)
                string.Format("({0}:{1}) {2}", CurrentSpan.Start.Line, CurrentSpan.Start.Offset, message);

            Errors.Add(error);
            return this;
        }

        public static CompilerService Instance
        {
            get { return Singleton<CompilerService>.Instance; }
        }

        public Scope PushFunctionScope(Node node, FunctionDeclaration function)
        {
            if (node == null)
                ThrowHelper.ThrowArgumentNullException(() => node);

            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            _currentScope = _currentScope.CreateFunctionScope(function);
            return PushScope(node, _currentScope);
        }

        public Scope PushScope(Node node)
        {
            _currentScope = _currentScope.CreateScope();
            return PushScope(node, _currentScope);
        }

        protected Scope PushScope(Node node, Scope scope)
        {
            if (node == null)
                ThrowHelper.ThrowArgumentNullException(() => node);
            if (scope == null)
                ThrowHelper.ThrowArgumentNullException(() => scope);

            _scopes.Add(node, scope);

            return scope;
        }

        public void PopScope()
        {
            if (_currentScope.Parent == null)
                throw new Exception("Invalid operation!");

            _currentScope = _currentScope.Parent;
        }

        private TDeclaration FindDeclaration<TDeclaration>(string name, Func<Scope, IEnumerable<TDeclaration>> declarations)
            where TDeclaration : DeclarationBase
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            var scope = _currentScope;

            do
            {
                var variable = declarations(scope).FirstOrDefault(var => var.Name == name);
                if (variable != null)
                    return variable;

                scope = scope.Parent;
            } while (scope != null && scope != _globalScope);

            return null;
        }

        public VariableDeclaration FindVariable(string name)
        {
            return FindDeclaration(name, scope => scope.VariableDeclarations);
        }

        public FunctionDeclaration FindFunction(string name)
        {
            return FindDeclaration(name, scope => scope.FunctionDeclarations);
        }

        public AttributeDeclaration FindAttribute(string name)
        {
            return FindDeclaration(name, scope => scope.AttributeDeclarations);
        }

        public Scope GetScopeByNode(Node node)
        {
            Scope result = null;
            if (!_scopes.TryGetValue(node, out result))
                return null;

            return result;
        }

        public FunctionScope GetFunctionScope(Scope scope)
        {
            if (scope == null)
                ThrowHelper.ThrowArgumentNullException(() => scope);

            var current = scope;
            do
            {
                current = current.Parent;
            } while (current != null && !(current is FunctionScope));

            return current as FunctionScope;
        }

        public Scope GetGlobalScope()
        {
            return _globalScope;
        }

        public Scope GetScope()
        {
            return _currentScope;
        }

        public TextSpan CurrentSpan { get; set; }
    }
}