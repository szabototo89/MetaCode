﻿using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.Commons.Declarations;
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
        private readonly List<AttributeDeclaration> _attributeDeclarations;
        private readonly List<TypeDeclaration> _typeDeclarations;

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

        public IEnumerable<AttributeDeclaration> AttributeDeclarations
        {
            get { return _attributeDeclarations; }
        }

        public IEnumerable<TypeDeclaration> TypeDeclarations
        {
            get { return _typeDeclarations; }
        }

        private Scope()
        {
            _variableDeclarations = new List<VariableDeclaration>();
            _functionDeclarations = new List<FunctionDeclaration>();
            _macroDeclarations = new List<MacroDeclaration>();
            _attributeDeclarations = new List<AttributeDeclaration>();
            _typeDeclarations = new List<TypeDeclaration>();
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
            var scope = new Scope();
            scope._typeDeclarations.AddRange(new[]
            {
                new ConcreteTypeDeclaration("number", scope, typeof(Double)),     
                new ConcreteTypeDeclaration("boolean", scope, typeof(Boolean)),     
                new ConcreteTypeDeclaration("string", scope, typeof(String)),     
                new ConcreteTypeDeclaration("array", scope, typeof(Object[])),     
            });

            return scope;
        }

        public VariableDeclaration DeclareVariable(string name, Type type)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            var declaration = new VariableDeclaration(name, type, this);
            _variableDeclarations.Add(declaration);

            return declaration;
        }

        public FunctionDeclaration DeclareFunction(string name, Type returnType, FormalParameter[] parameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (returnType == null)
                ThrowHelper.ThrowArgumentNullException(() => returnType);

            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);

            var declaration = new FunctionDeclaration(name, returnType, parameters, this);
            _functionDeclarations.Add(declaration);

            return declaration;
        }

        public AttributeDeclaration DeclareAttributeType(string name, FormalParameter[] formalParameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (formalParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => formalParameters);

            var declaration = new AttributeDeclaration(name, formalParameters, this);
            _attributeDeclarations.Add(declaration);

            return declaration;
        }

        public ObjectTypeDeclaration DeclareObjectType(string name, FormalParameter[] formalParameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (formalParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => formalParameters);

            var declaration = new ObjectTypeDeclaration(name, formalParameters, this);
            _typeDeclarations.Add(declaration);

            return declaration;
        }

        private TDeclaration FindDeclaration<TDeclaration>(string name, Func<Scope, IEnumerable<TDeclaration>> declarations)
           where TDeclaration : DeclarationBase
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            var scope = this;

            do
            {
                var variable = declarations(scope).FirstOrDefault(var => var.Name == name);
                if (variable != null)
                    return variable;

                scope = scope.Parent;
            } while (scope != null);

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

        public TypeDeclaration FindType(string name)
        {
            return FindDeclaration(name, scope => scope.TypeDeclarations);
        }
    }
}
