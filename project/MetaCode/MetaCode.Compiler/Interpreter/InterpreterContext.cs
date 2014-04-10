using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class InterpreterContext
    {
        public CompilerService CompilerService { get; protected set; }

        private readonly Stack<Dictionary<string, VariableContext>> _variables;
        private readonly Stack<Dictionary<string, FunctionContext>> _functions;

        public InterpreterContext(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            _variables = new Stack<Dictionary<string, VariableContext>>();
            _functions = new Stack<Dictionary<string, FunctionContext>>();

            InitializeFunctions();

            PushBlock();
        }

        private InterpreterContext InitializeFunctions()
        {
            _functions.Clear();
            _functions.Push(new Dictionary<string, FunctionContext>()
            {
                {"write", new NativeFunctionContext("write", new Action<object>(Console.Write))},
                {"writeline", new NativeFunctionContext("writeline", new Action<object>(Console.WriteLine))}
            });

            return this;
        }

        public InterpreterContext PushBlock()
        {
            _variables.Push(new Dictionary<string, VariableContext>());
            _functions.Push(new Dictionary<string, FunctionContext>());
            return this;
        }

        public InterpreterContext PopBlock()
        {
            _variables.Pop();
            _functions.Pop();
            return this;
        }

        private FunctionContext GetFunction(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            foreach (var block in _functions.Reverse())
            {
                FunctionContext result;

                if (block.TryGetValue(name, out result))
                    return result;
            }

            throw new Exception(string.Format("Function ({0}) not found!", name));
        }

        private VariableContext GetVariable(string name)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            foreach (var block in _variables.Reverse())
            {
                VariableContext result;

                if (block.TryGetValue(name, out result))
                    return result;
            }

            throw new Exception(string.Format("Variable ({0}) not found!", name));
        }

        public InterpreterContext DeclareNativeFunction(string name, Delegate function)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            _functions.First()
                      .Add(name, new NativeFunctionContext(name, function));

            return this;
        }

        public object InvokeFunction(string name, IEnumerable<object> args)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            var function = GetFunction(name);
            return function.Invoke(args.ToArray());
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
