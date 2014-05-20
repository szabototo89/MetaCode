using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Globalization;
using System.Linq;
using System.Net.NetworkInformation;
using System.Runtime.InteropServices;
using System.Runtime.Remoting.Messaging;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Factories;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Numerics;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Interpreter;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    // TODO: Add attribute declaration to MacroInterpreter 
    public class MacroInterpreter : TreeVisitorBase<MacroInterpreter>
    {
        public CompilerService CompilerService { get; set; }

        public InterpreterContext InterpreterContext { get; protected set; }
        private readonly CodeInterpreter _codeInterpreter;
        private readonly Stack<object> _expressionStack;

        private bool _isInInterpreterMode;

        private List<AttributeDeclarationStatementNode> _attributes;

        public CompilationUnit Root { get; protected set; }

        public MacroInterpreter(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            _isInInterpreterMode = false;

            CompilerService = compilerService;
            _expressionStack = new Stack<object>();
            _codeInterpreter = new CodeInterpreter(compilerService);
            InterpreterContext = _codeInterpreter.InterpreterContext;
            _attributes = new List<AttributeDeclarationStatementNode>();

            Initialize();
            InitializeNativeFunctions();
        }

        private void InitializeNativeFunctions()
        {
            InterpreterContext.DeclareNativeFunction("convertToString", new Func<object, object>(value =>
            {
                var codeGenerator = new CodeGenerator();

                if (!(value is IEnumerable<Node>))
                {
                    CompilerService.Error("Invalid use of convertToString. The actual parameter is not AST!");
                    return Enumerable.Empty<Node>();
                }

                var result = (value as IEnumerable<Node>).Select(codeGenerator.Visit);
                return result;
            }));

            InterpreterContext.DeclareNativeFunction("functionCall", new Func<object, object[], object>((functionName, args) =>
            {
                return GetParameterByType<string>(functionName, name =>
                {
                    var func = string.Format("{0}({1})",
                        name, string.Join(", ", args)
                    );

                    return GetAbstractSyntaxTree(func);
                });
            }));

            InterpreterContext.DeclareNativeFunction("str", new Func<object, object>(value =>
            {
                return GetParameterByType<string>(value, str => string.Format("\"{0}\"", str));
            }));

            InterpreterContext.DeclareNativeFunction("ast", new Func<object, object>(GetAbstractSyntaxTree));

            InterpreterContext.DeclareNativeFunction("parameter", new Func<object, object, object>((_name, _type) =>
            {
                return GetParameterByType<string>(_name, name =>
                {
                    return GetParameterByType<string>(_type, type =>
                    {
                        return new FormalParameterNode(name, new TypeNameNode(type));
                    });
                });
            }));

            InterpreterContext.DeclareNativeFunction("func", new Func<object, object, object, object>((_name, _params, _body) =>
            {
                return GetParameterByType<string>(_name, "Invalid first argument of function()", name =>
                {
                    return GetParameterByType<IEnumerable<FormalParameterNode>>(_params.As<IEnumerable>().OfType<FormalParameterNode>(), "Invalid second argument function()", parameters =>
                    {
                        return GetParameterByType<IEnumerable<StatementNodeBase>>((_body.As<IEnumerable>().OfType<StatementNodeBase>()), "Invalid third argument function()",
                            body =>
                            {
                                var factory = new StatementFactory(CompilerService);
                                return new[] { factory.Function(name, new TypeNameNode("any"), parameters.ToArray(), factory.Block(body.ToArray()), new AttributeNode[0]) };
                            });
                    });
                });
            }));

            InterpreterContext.DeclareNativeFunction("sequence", new Func<object, object>(
                (_commands) =>
                {
                    return GetParameterByType<IEnumerable>(_commands, commands =>
                    {
                        return new[] {new BlockStatementNode(commands.OfType<StatementNodeBase>(),
                            Enumerable.Empty<AttributeNode>()) };
                    });
                }));

            InterpreterContext.DeclareNativeFunction("formalParameter", new Func<object, object, object>(
                (_name, _type) =>
                {
                    return GetParameterByType<string>(_name, name =>
                    {
                        return GetParameterByType<string>(_type, type =>
                        {
                            return new FormalParameterNode(name, new TypeNameNode(type));
                        });
                    });
                }));

            InterpreterContext.DeclareNativeFunction("ifThenElse", new Func<object, object, object, object>(
                (_condition, _trueStatement, _falseStatement) =>
                {
                    return GetParameterByType<IEnumerable>(_condition, condition =>
                    {
                        return GetParameterByType<IEnumerable>(_trueStatement, trueStatement =>
                        {
                            return GetParameterByType<IEnumerable>(_falseStatement, falseStatement =>
                            {
                                var expr = condition.OfType<ExpressionNode>().First();
                                var trueStmt = trueStatement.OfType<BlockStatementNode>().First();
                                var falseStmt = falseStatement.OfType<BlockStatementNode>().First();

                                return new[] { new IfStatementNode(expr, trueStmt, falseStmt, Enumerable.Empty<AttributeNode>()) };
                            });
                        });
                    });
                }));

            InterpreterContext.DeclareNativeFunction("find", new Func<object, object, object>((tree, filter) =>
            {
                if (!(tree is IEnumerable<Node>) && !(tree is string))
                    throw new Exception("The first parameter must be a node or string!");

                if (!filter.Is<string>())
                    throw new Exception("The second parameter must be a string!");

                var treeSelectorCompiler = new TreeSelectorCompiler();
                var selectors = treeSelectorCompiler.Parse(filter.ToString());
                var result = new List<Node>();

                foreach (var selector in selectors)
                {
                    if (tree is IEnumerable<Node>)
                        foreach (var node in tree.As<IEnumerable<Node>>())
                            result.AddRange(selector.SelectNode(node));
                    else
                    {
                        var compiler = new MetaCodeCompiler();
                        var node = compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(
                                               tree.ToString(),
                                               () => new AbstractTreeVisitor(CompilerService.Instance));

                        result.AddRange(selector.SelectNode(node));
                    }
                }

                return result;
            }));

            InterpreterContext.DeclareNativeFunction("appendTo", new Func<object, object, object>((that, treeDestination) =>
            {
                if (that.As<IEnumerable>().OfType<StatementNodeBase>().Any())
                    return GetParameterByType<IEnumerable<StatementNodeBase>>(
                        that.As<IEnumerable>().OfType<StatementNodeBase>(), "Invalid first argument of appendTo()", nodes =>
                        {
                            return GetParameterByType<IEnumerable>(treeDestination.As<IEnumerable>(), "Invalid second argument of appendTo()", destinations =>
                            {
                                foreach (var destination in destinations)
                                {
                                    if (destination is BlockStatementNode)
                                    {
                                        destination.As<BlockStatementNode>().AppendStatement(nodes.ToArray());
                                    }
                                    else
                                    {
                                        (destination as Node).AddChildren(nodes);
                                    }
                                }
                                return TypeHelper.Void;
                            });
                        });

                if (that.As<IEnumerable>().OfType<FormalParameterNode>().Any())
                    return GetParameterByType<IEnumerable<FormalParameterNode>>(that.As<IEnumerable>().OfType<FormalParameterNode>(), nodes =>
                    {
                        return GetParameterByType<IEnumerable<ObjectDeclarationStatementNode>>(treeDestination.As<IEnumerable>().OfType<ObjectDeclarationStatementNode>(), destinations =>
                        {
                            foreach (var destination in destinations)
                            {
                                destination.Parameters.AddRange(nodes);
                                destination.AddChildren(nodes);
                            }
                            return TypeHelper.Void;
                        });
                    });
                return null;
            }));

            InterpreterContext.DeclareNativeFunction("prependTo", new Func<object, object, object>((that, treeDestination) =>
            {
                return GetParameterByType<IEnumerable<StatementNodeBase>>(that.As<IEnumerable>().OfType<StatementNodeBase>(), "Invalid first argument of prependTo()", nodes =>
                {
                    return GetParameterByType<IEnumerable>(treeDestination.As<IEnumerable>(), "Invalid second argument of prepend()", destinations =>
                    {
                        foreach (var destination in destinations)
                        {
                            if (destination is BlockStatementNode)
                                destination.As<BlockStatementNode>().PrependStatement(nodes.ToArray());
                            else
                            {
                                (destination as Node).InsertChildren(0, nodes);
                            }
                        }
                        return TypeHelper.Void;
                    });
                });
            }));

            InterpreterContext.DeclareNativeFunction("detach", new Func<object, object>(that =>
            {
                var detachNode = new Action<Node>(node =>
                {
                    if (node is BlockStatementNode)
                        node.As<BlockStatementNode>().ClearChildren();
                    else
                        node.Parent.DetachChild(node);
                });

                return GetParameterByType<IEnumerable>(that, nodes =>
                {
                    foreach (var node in nodes.OfType<Node>())
                        detachNode(node);

                    return nodes;
                }) ?? GetParameterByType<Node>(that, "Invalid first argument of detach()", node =>
                {
                    detachNode(node);
                    return new[] { node };
                });
            }));

            InterpreterContext.DeclareNativeFunction("parent", new Func<object, object>(arg =>
            {
                return GetParameterByType<IEnumerable<Node>>(arg, "Invalid argument of parent()", nodes =>
                {
                    var result = nodes.Select(node => node.Parent);
                    return result;
                }) ?? GetParameterByType<Node>(arg, node => new[] { node.Parent });
            }));

            InterpreterContext.DeclareNativeFunction("members", new Func<object, object>(arg =>
            {
                return GetParameterByType<IEnumerable>(arg, "Invalid argument of members()", nodes =>
                {
                    var result = nodes.OfType<ObjectDeclarationStatementNode>().SelectMany(o => o.Parameters).ToArray();
                    return result;
                }) ?? GetParameterByType<ObjectDeclarationStatementNode>(arg, node => new[] { node.Parameters });
            }));

            InterpreterContext.DeclareNativeFunction("name", new Func<object, object>(arg =>
            {
                return GetParameterByType<IEnumerable>(arg, "Invalid argument of name()", nodes =>
                {
                    var result = nodes.OfType<FormalParameterNode>().Select(o => o.Name).ToArray();
                    if (result.Count() > 1)
                        return result;
                    return result.First();
                }) ?? GetParameterByType<FormalParameterNode>(arg, node => new[] { node.Name });
            }));

            InterpreterContext.DeclareNativeFunction("type", new Func<object, object>(arg =>
            {
                return GetParameterByType<object>(arg, "Invalid argument of type()", nodes =>
                {
                    if (nodes is FormalParameterNode)
                    {
                        return new[] { nodes.As<FormalParameterNode>().TypeName };
                    }
                    if (nodes is IEnumerable)
                    {
                        var result =
                            nodes.As<IEnumerable>().OfType<FormalParameterNode>().Select(o => o.TypeName).ToArray();
                        return result;
                    }
                    return null;
                });
            }));

            InterpreterContext.DeclareNativeFunction("equals", new Func<object, object, object>((_fst, _snd) =>
            {
                if (_fst.Equals(_snd))
                    return true;
                if (_fst is IEnumerable)
                {
                    var result = _fst.As<IEnumerable>().OfType<object>().All(item => item != null && item.Equals(_snd));
                    return result;
                }

                return false;
            }));

            InterpreterContext.DeclareNativeFunction("root", new Func<object>(() => new[] { Root }));

            InterpreterContext.DeclareNativeFunction("getAttributeValue", new Func<object, object, object>(
                (_attribute, _index) =>
                {
                    double index = 0;
                    double.TryParse(_index.ToString(), NumberStyles.Any, CultureInfo.InvariantCulture, out index);
                    object result = null;

                    _attribute.Is<AttributeNode>(attribute =>
                    {
                        var expressions = attribute.Expressions.ToArray();
                        if (index >= expressions.Length)
                            return;

                        var constant = expressions[(int)index].As<ConstantExpressionNode>();
                        if (constant != null)
                            result = new[] { constant.Constant.Value };
                    });

                    _attribute.Is<IEnumerable>(attributes =>
                    {
                        foreach (var attribute in attributes.OfType<AttributeNode>())
                        {
                            var expressions = attribute.Expressions.ToArray();
                            if (index >= expressions.Length)
                                return;

                            var constant = expressions[(int)index].As<ConstantExpressionNode>();
                            if (constant != null)
                                result = new[] { constant.Constant.Value };
                        }
                    });

                    return result ?? TypeHelper.Void;
                }));

            InterpreterContext.DeclareNativeFunction("change", new Func<object, object, object, object>((_type, _node, _value) =>
            {
                return GetParameterByType<string>(_type, "Invalid argument of parent()", type =>
                {
                    if (type == "type")
                        return GetParameterByType<IEnumerable>(_node, node =>
                        {
                            var nodes = node.OfType<TypeNameNode>().ToArray();
                            return GetParameterByType<object>(_value, value =>
                            {
                                foreach (var typeName in nodes)
                                    typeName.Type = value.ToString();
                                return _node;
                            });
                        });
                    if (type == "name")
                    {
                        return GetParameterByType<IEnumerable>(_node, node =>
                        {
                            var nodes = node.OfType<FormalParameterNode>().ToArray();
                            if (nodes.Any())
                                return GetParameterByType<object>(_value, value =>
                                {
                                    foreach (var name in nodes)
                                        name.Name = value.ToString();
                                    return _node;
                                });
                            var functions = node.OfType<FunctionDeclarationStatementNode>().ToArray();
                            if (functions.Any())
                                return GetParameterByType<object>(_value, value =>
                                {
                                    foreach (var func in functions)
                                        func.FunctionName = value.ToString();
                                    return _node;
                                });

                            return null;
                        }) ?? GetParameterByType<FormalParameterNode>(_node, param => GetParameterByType<object>(_value, value =>
                        {
                            param.Name = value.ToString();
                            return _node;
                        }));
                    }
                    return null;
                });
            }));
        }

        private object GetAbstractSyntaxTree(object value)
        {
            var compiler = new MetaCodeCompiler();
            var result =
                compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(value.ToString(),
                    () => new AbstractTreeVisitor(CompilerService.Instance)) as CompilationUnit;
            if (result == null)
            {
                CompilerService.Error("An error occured in ast() method!");
                return null;
            }
            return result.Children;
        }

        private object GetParameterByType<TResult>(object that, Func<TResult, object> func)
            where TResult : class
        {
            return GetParameterByType<TResult>(that, string.Empty, func);
        }

        private object GetParameterByType<TResult>(object that, string errorMessage, Func<TResult, object> func)
            where TResult : class
        {
            var result = (that as TResult);
            if (result == null)
                return null;
            return func(result) ?? TypeHelper.Void;
        }

        private void Initialize()
        {
            this
                .DefaultVisitor((visitor, node) =>
                {
                    node.Is<CompilationUnit>(unit => { Root = unit; _attributes.Clear(); });

                    foreach (var child in node.Children)
                    {
                        if (child is ISupportAttributes)
                        {
                            var attributes = ((ISupportAttributes)child).Attributes;
                            foreach (var attribute in attributes.Where(attr => attr != null))
                            {
                                if (!_attributes.Any(attr => attr.AttributeName == attribute.Name))
                                {
                                    CompilerService.Error(string.Format("Unrecognized attribute: {0}!", attribute.Name));
                                    break;
                                }
                            }
                        }
                        visitor.VisitChild(child);
                    }
                    return this;
                })
                .If<AttributeDeclarationStatementNode>((visitor, node) =>
                {
                    _attributes.Add(node);
                    return this;
                })
                .If<MacroDeclarationStatementNode>((visitor, node) =>
                {
                    var treeSelector = new TreeSelectorCompiler();

                    var scope = _codeInterpreter.InterpreterContext.PushBlock();

                    foreach (var parameter in node.FormalParameters)
                    {
                        var selectors = treeSelector.Parse(parameter.Selector);
                        var value = new List<Node>();

                        foreach (var selector in selectors)
                            value.AddRange(selector.SelectNode(Root));

                        scope.DeclareVariable(parameter.Name, value);
                    }

                    _codeInterpreter.VisitChild(node.Body);

                    _codeInterpreter.InterpreterContext.PopBlock();

                    return this;
                });

        }
    }
}
