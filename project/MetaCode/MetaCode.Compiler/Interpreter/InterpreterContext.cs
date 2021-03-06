﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class InterpreterContext
    {
        public CompilerService CompilerService { get; protected set; }

        private readonly Stack<Dictionary<string, VariableContext>> _variables;
        private readonly Stack<Dictionary<string, FunctionContextBase>> _functions;
        private readonly Stack<Dictionary<string, MacroContextBase>> _macros;
        private readonly Stack<Dictionary<string, TypeContextBase>> _types;

        public InterpreterContext(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            _variables = new Stack<Dictionary<string, VariableContext>>();
            _functions = new Stack<Dictionary<string, FunctionContextBase>>();
            _macros = new Stack<Dictionary<string, MacroContextBase>>();
            _types = new Stack<Dictionary<string, TypeContextBase>>();

            InitializeFunctions();

            PushBlock();
        }

        private InterpreterContext InitializeFunctions()
        {
            _functions.Clear();
            _functions.Push(new Dictionary<string, FunctionContextBase>()
            {
                {"write", new NativeFunctionContext("write", new Func<object, object>(text => {
                    Console.Write(text);
                    return TypeHelper.Void;
                }))},
                {"writeline", new NativeFunctionContext("writeline", new Func<object, object>(text =>{
                    Console.WriteLine(text);
                    return TypeHelper.Void;
                }))}
            });

            return this;
        }

        public InterpreterContext PushBlock()
        {
            _variables.Push(new Dictionary<string, VariableContext>());
            _functions.Push(new Dictionary<string, FunctionContextBase>());
            _macros.Push(new Dictionary<string, MacroContextBase>());
            _types.Push(new Dictionary<string, TypeContextBase>());
            return this;
        }

        public InterpreterContext PopBlock()
        {
            _variables.Pop();
            _functions.Pop();
            _macros.Pop();
            _types.Pop();
            return this;
        }

        private MacroContextBase GetMacroFunction(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            foreach (var block in _macros.Reverse()) {
                MacroContextBase result;

                if (block.TryGetValue(name, out result))
                    return result;
            }

            throw new Exception(string.Format("Macro ({0}) not found!", name));
        }

        private FunctionContextBase GetFunction(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            foreach (var block in _functions.Reverse()) {
                FunctionContextBase result;

                if (block.TryGetValue(name, out result))
                    return result;
            }

            throw new Exception(string.Format("Function ({0}) not found!", name));
        }

        private VariableContext GetVariable(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            foreach (var block in _variables.Reverse()) {
                VariableContext result;

                if (block.TryGetValue(name, out result))
                    return result;
            }

            throw new Exception(string.Format("Variable ({0}) not found!", name));
        }

        public InterpreterContext DeclareFunction(string name, FunctionDeclarationStatementNode function, CodeInterpreter codeInterpreter)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            _functions.First()
                      .Add(name, new FunctionContext(name, function, this, codeInterpreter));

            return this;
        }

        public InterpreterContext DeclareNativeFunction(string name, Delegate function)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);


            var functionScope = _functions.First();
            if (functionScope.ContainsKey(name))
                functionScope[name] = new NativeFunctionContext(name, function);
            else
                functionScope.Add(name, new NativeFunctionContext(name, function));

            return this;
        }

        public InterpreterContext DeclareNativeMacroFunction(string name, Func<Node[], object> function)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            _macros.First()
                   .Add(name, new NativeMacroContext(name, function));

            return this;
        }

        public object InvokeFunction(string name, IEnumerable<object> args)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            var function = GetFunction(name);
            return function.Invoke(args.ToArray()) ?? TypeHelper.Void;
        }

        public object InvokeMacroFunction(string name, IEnumerable<Node> args)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            var macro = GetMacroFunction(name);
            return macro.Invoke(args.ToArray());
        }

        public object GetValueOfVariable(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            return GetVariable(name).With(variable => variable.Value);
        }

        public InterpreterContext SetValueOfVariable(string name, object value)
        {
            var variable = GetVariable(name);

            variable.Value = value;

            return this;
        }

        public InterpreterContext DeclareVariable(string name, object value = null)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            _variables.Peek()
                      .Add(name, new VariableContext(name, value));

            return this;
        }
    }
}
