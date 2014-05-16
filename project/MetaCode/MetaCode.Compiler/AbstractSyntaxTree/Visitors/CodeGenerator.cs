using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics.Tracing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class CodeGenerator : TreeVisitorBase<StringBuilder>
    {
        private StringBuilder _codeBuilder;

        public CodeGenerator()
        {
            Initialize();
        }

        public string GeneratedCode { get { return _codeBuilder.ToString(); } }

        private void Initialize()
        {
            _codeBuilder = new StringBuilder();

            this
                .DefaultVisitor(
                    (visitor, node) => string.Join("", node.Children.Select(visitor.VisitChild)).ToStringBuilder())
                .If<CompilationUnit>((visitor, node) => {
                    var builder = new StringBuilder()
                        .Clear()
                        .AppendLine("// Generated code by compiler after AST transformation")
                        .AppendLine();

                    var result =
                        string.Join("", node.Children.Select(visitor.VisitChild)).ToStringBuilder();

                    return builder.AppendLine(result);
                })
                .If<IdentifierNode>((visitor, node) => node.Name.ToStringBuilder())
                .If<IdentifierExpressionNode>((visitor, node) => node.Name.ToStringBuilder())
                .If<TypeNameNode>((_, node) => node.Type.ToStringBuilder())
                .If<MemberExpressionNode>(
                    (visitor, node) => string.Join(".", node.Members.Select(member => member.Name)).ToStringBuilder())
                .If<FunctionCallExpressionNode>((visitor, node) => {
                    var result = new StringBuilder()
                        .Append(visitor.VisitChild(node.FunctionName))
                        .AppendFormat("({0})",
                            string.Join(", ",
                                node.ActualParameters.Select(visitor.VisitChild)));

                    return result;
                })
                .If<NumberConstantLiteralNode>((visitor, node) => node.Value.ToString(CultureInfo.InvariantCulture).ToStringBuilder())
                .If<BooleanConstantLiteralNode>((visitor, node) => node.Value.ToString(CultureInfo.InvariantCulture).ToStringBuilder())
                .If<NullConstantLiteralNode>((visitor, node) => "null".ToStringBuilder())
                .If<StringConstantLiteralNode>((visitor, node) => string.Format("'{0}'", node.Value).ToStringBuilder())
                .If<ArrayConstantLiteralNode>((visitor, node) =>
                        string.Format("[{0}]", string.Join(", ", node.Value.Select(visitor.VisitChild)))
                            .ToStringBuilder())
                .If<ExpressionStatementNode>((visitor, node) => visitor.VisitChild(node.Expression).AppendLine(";"))
                .If<InnerExpressionNode>((visitor, node) => string.Format("({0})", visitor.VisitChild(node.Expression)).ToStringBuilder())
                .If<UnaryExpressionNode>((visitor, node) => node.Operator.Operator.ToStringBuilder()
                                                                .Append(visitor.VisitChild(node.Expression)))
                .If<BinaryExpressionNode>((visitor, node) => {
                    var result = visitor.VisitChild(node.Left)
                        .AppendFormat(" {0} ", node.Operator.Operator.ToStringBuilder())
                        .Append(visitor.VisitChild(node.Right));
                    return result;
                })
                .If<VariableDeclarationStatementNode>((visitor, node) => {
                    return "var ".ToStringBuilder()
                        .Append(visitor.VisitChild(node.Identifier))
                        .Append(" : ")
                        .Append(visitor.VisitChild(node.VariableType))
                        .Append(" = ")
                        .Append(visitor.VisitChild(node.InitialValue));
                })
                .If<FormalParameterNode>((visitor, node) => {
                    return node.Name.ToStringBuilder()
                        .Append(": ")
                        .Append(visitor.VisitChild(node.TypeName));
                })
                .If<FunctionDeclarationStatementNode>((visitor, node) => {
                    return "function ".ToStringBuilder()
                        .Append(visitor.VisitChild(node.Identifier))
                        .Append("(")
                        .Append(string.Join(", ", node.Parameters.Select(visitor.VisitChild)))
                        .Append(") : ")
                        .Append(visitor.VisitChild(node.ReturnType))
                        .AppendLine(" do ")
                        .Append(string.Join("", node.FunctionBody.Statements.Select(visitor.VisitChild)))
                        .AppendLine("end;");
                })
                .If<SkipStatementNode>((_, node) => "skip;".ToStringBuilder().AppendLine())
                .If<AssignmentExpressionNode>((visitor, node) => visitor.VisitChild(node.LeftValue)
                                                                    .Append(" = ")
                                                                    .Append(visitor.VisitChild(node.RightValue)))
                .If<WhileLoopStatementNode>((visitor, node) => {
                    return "while".ToStringBuilder()
                        .Append(" (")
                        .Append(visitor.VisitChild(node.ConditionExpression))
                        .Append(") ")
                        .Append(visitor.VisitChild(node.Body));

                })
                .If<ForeachLoopStatementNode>((visitor, node) => {
                    return "foreach".ToStringBuilder()
                        .Append(" (var ")
                        .Append(visitor.VisitChild(node.LoopVariable))
                        .Append(" : ")
                        .Append(visitor.VisitChild(node.LoopVariableType))
                        .Append(" in ")
                        .Append(visitor.VisitChild(node.Expression))
                        .Append(") ")
                        .Append(visitor.VisitChild(node.Body));
                })
                .If<BlockStatementNode>((visitor, node) => {
                    return "do".ToStringBuilder()
                        .AppendLine()
                        .Append(string.Join("", node.Statements.Select(visitor.VisitChild)))
                        .AppendLine("end;");
                })

                ;
        }
    }
}
