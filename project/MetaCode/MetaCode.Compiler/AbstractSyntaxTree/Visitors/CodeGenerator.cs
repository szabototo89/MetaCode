using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics.Tracing;
using System.Globalization;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using Antlr4.Runtime.Tree;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class CodeGenerator : TreeVisitorBase<CodeBuilder>
    {
        private CodeBuilder _codeBuilder;

        public CodeGenerator()
        {
            Initialize();
        }

        public string GeneratedCode { get { return _codeBuilder.ToString(); } }

        private void Initialize()
        {
            _codeBuilder = new CodeBuilder();
            this
                .DefaultVisitor(
                    (visitor, node) => string.Join("", node.Children.Select(visitor.VisitChild)).ToCodeBuilder())
                .If<CompilationUnit>((visitor, node) => {
                    _codeBuilder = new CodeBuilder()
                        .Clear()
                        .AppendLine("// Generated code by compiler after AST transformation")
                        .AppendLine();

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    return _codeBuilder;
                })
                .If<IdentifierNode>((visitor, node) => _codeBuilder.Append(node.Name))
                .If<IdentifierExpressionNode>((visitor, node) => _codeBuilder.Append(node.Name))
                .If<TypeNameNode>((_, node) => _codeBuilder.Append(node.Type))
                .If<MemberExpressionNode>((visitor, node) => _codeBuilder.Append(string.Join(".", node.Members.Select(member => member.Name))))
                .If<FunctionCallExpressionNode>((visitor, node) => {
                    visitor.VisitChild(node.FunctionName);
                    _codeBuilder.Append("(");
                    JoinByComma(node.ActualParameters, visitor);
                    _codeBuilder.Append(")");

                    return _codeBuilder;
                })
                .If<NumberConstantLiteralNode>((visitor, node) => _codeBuilder.Append(node.Value.ToString(CultureInfo.InvariantCulture)))
                .If<BooleanConstantLiteralNode>((visitor, node) => _codeBuilder.Append(node.Value.ToString().ToLowerInvariant()))
                .If<NullConstantLiteralNode>((visitor, node) => _codeBuilder.Append("null"))
                .If<StringConstantLiteralNode>((visitor, node) => _codeBuilder.Append(string.Format("'{0}'", node.Value)))
                .If<ArrayConstantLiteralNode>((visitor, node) => {
                    _codeBuilder.Append("[");
                    JoinByComma(node.Value, visitor);
                    _codeBuilder.Append("]");
                    return _codeBuilder;
                })
                .If<ExpressionStatementNode>((visitor, node) => visitor.VisitChild(node.Expression).Append(";" + Environment.NewLine))
                .If<InnerExpressionNode>((visitor, node) => {
                    _codeBuilder.Append("(");
                    visitor.VisitChild(node.Expression);
                    _codeBuilder.Append(")");
                    return _codeBuilder;
                })
                .If<UnaryExpressionNode>((visitor, node) => _codeBuilder.Append(node.Operator.Operator)
                                                                        .Do(() => visitor.VisitChild(node.Expression)))
                .If<BinaryExpressionNode>((visitor, node) => {
                    return visitor.VisitChild(node.Left)
                        .AppendFormat(" {0} ", node.Operator.Operator)
                        .Do(() => visitor.VisitChild(node.Right));
                })
                .If<VariableDeclarationStatementNode>((visitor, node) => {
                    return _codeBuilder.Append("var ")
                        .Do(() => visitor.VisitChild(node.Identifier))
                        .Append(" : ")
                        .Do(() => visitor.VisitChild(node.VariableType))
                        .Append(" = ")
                        .Do(() => visitor.VisitChild(node.InitialValue))
                        .Append(";");
                })
                .If<ObjectDeclarationStatementNode>((visitor, node) => {
                    return _codeBuilder.Append("object ")
                        .Do(() => visitor.VisitChild(node.Identifier))
                        .AppendLine()
                        .RaiseIndentation()
                        .Do(() => {
                            foreach (var child in node.Parameters) {
                                _codeBuilder.ApplyIndentation();
                                visitor.VisitChild(child);
                                _codeBuilder.AppendLine(";");
                            }
                        })
                        .ReduceIndentation()
                        .AppendLine("end;");
                })
                .If<MacroDeclarationStatementNode>((visitor, node) => _codeBuilder)
                .If<AttributeDeclarationStatementNode>((visitor, node) => {
                    return _codeBuilder.Append("attribute ")
                        .Do(() => visitor.VisitChild(node.Identifier))
                        .Append("(")
                        .Do(() => JoinByComma(node.Parameters, visitor))
                        .AppendLine(");");
                })
                .If<FormalParameterNode>((visitor, node) => {
                    return _codeBuilder.Append(node.Name)
                        .Append(": ")
                        .Do(() => visitor.VisitChild(node.TypeName));
                })
                .If<FunctionDeclarationStatementNode>((visitor, node) => {
                    _codeBuilder.Append("function ")
                        .Do(() => visitor.VisitChild(node.Identifier))
                        .Append("(")
                        .Do(() => JoinByComma(node.Parameters, visitor))
                        .Append(") : ")
                        .Do(() => visitor.VisitChild(node.ReturnType))
                        .AppendLine(" do ")
                        .RaiseIndentation()
                        .Do(() => {
                            foreach (var statement in node.FunctionBody.Statements) {
                                _codeBuilder.ApplyIndentation();
                                visitor.VisitChild(statement);
                            }
                        })
                        .ReduceIndentation()
                        .ApplyIndentation()
                        .AppendLine("end;");

                    return _codeBuilder;
                })
                .If<SkipStatementNode>((_, node) => _codeBuilder.Append("skip;").AppendLine())
                .If<AssignmentExpressionNode>((visitor, node) => visitor.VisitChild(node.LeftValue)
                                                                    .Append(" = ")
                                                                    .Append(visitor.VisitChild(node.RightValue)))
                .If<WhileLoopStatementNode>((visitor, node) => {
                    return _codeBuilder.Append("while")
                        .Append(" (")
                        .Do(() => visitor.VisitChild(node.ConditionExpression))
                        .Append(") ")
                        .Do(() => visitor.VisitChild(node.Body));

                })
                .If<ForeachLoopStatementNode>((visitor, node) => {
                    return _codeBuilder.Append("foreach")
                        .Append(" (var ")
                        .Do(() => visitor.VisitChild(node.LoopVariable))
                        .Append(" : ")
                        .Do(() => visitor.VisitChild(node.LoopVariableType))
                        .Append(" in ")
                        .Do(() => visitor.VisitChild(node.Expression))
                        .Append(") ")
                        .Do(() => visitor.VisitChild(node.Body));
                })
                .If<BlockStatementNode>((visitor, node) => {
                    return _codeBuilder.Append("do")
                        .AppendLine()
                        .RaiseIndentation()
                        .Do(() => {
                            foreach (var statement in node.Statements) {
                                _codeBuilder.ApplyIndentation();
                                visitor.VisitChild(statement);
                            }
                        })
                        .ReduceIndentation()
                        .ApplyIndentation()
                        .AppendLine("end;");
                })
                .If<IfStatementNode>((visitor, node) => {
                    _codeBuilder.Append("if ")
                        .Append("(")
                        .Do(() => visitor.VisitChild(node.ConditionExpression))
                        .AppendLine(")")
                        .RaiseIndentation()
                        .Do(() => {
                            foreach (var child in node.TrueStatementNode.Statements) {
                                _codeBuilder.ApplyIndentation();
                                visitor.VisitChild(child);
                            }
                        })
                        .ReduceIndentation();

                    if (node.FalseStatementNode.Statements.Any()) {
                        _codeBuilder
                            .ApplyIndentation()
                            .AppendLine("else")
                            .RaiseIndentation()
                            .Do(() => {
                                foreach (var child in node.FalseStatementNode.Statements) {
                                    _codeBuilder.ApplyIndentation();
                                    visitor.VisitChild(child);
                                }
                            })
                            .ReduceIndentation();
                    }

                    _codeBuilder
                        .ApplyIndentation()
                        .AppendLine("end;");
                    return _codeBuilder;
                })
                ;
        }

        public string Visit(Node node)
        {
            var result = VisitChild(node).ToString();
            _codeBuilder.Clear();
            return result;
        }

        private void JoinByComma<TNode>(IEnumerable<TNode> collection, TreeVisitorBase<CodeBuilder> visitor)
            where TNode : Node
        {
            JoinBySeparator(", ", collection, visitor);
        }
        private void JoinBySeparator<TNode>(string separator, IEnumerable<TNode> collection, TreeVisitorBase<CodeBuilder> visitor)
                    where TNode : Node
        {
            if (collection.Any()) {
                foreach (var item in collection.Take(collection.Count() - 1)) {
                    _codeBuilder.Do(() => visitor.VisitChild(item))
                        .Append(separator);
                }
                _codeBuilder.Do(() => visitor.VisitChild(collection.Last()));
            }
        }
    }
}
