using System;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class ForeachSelector : NodeSelector
    {
        protected override Node ModifyNodeSelection(Node node)
        {
            var statement = node as ForeachLoopStatementNode;
            var result = node;

            TryGetAttribute("body", attribute => {
                result = statement.Body;
            });

            return result;
        }

        protected override bool FilterNode(Node node)
        {
            Func<bool> filter = () => node is ForeachLoopStatementNode;

            TryGetAttribute("loop-variable", attribute => {
                var result = filter();
                var loop = node as ForeachLoopStatementNode;
                filter = () => result && loop.LoopVariable.Name == attribute.Value;
            });

            TryGetAttribute("loop-variable-type", attribute => {
                var result = filter();
                var loop = node as ForeachLoopStatementNode;
                filter = () => result && loop.LoopVariableType.Type == attribute.Value;
            });

            return filter();
        }
    }
}