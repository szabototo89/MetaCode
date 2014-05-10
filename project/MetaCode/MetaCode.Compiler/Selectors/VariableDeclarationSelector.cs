using System;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.Selectors
{
    public class VariableDeclarationSelector : NodeSelector
    {
        protected override Node ModifyNodeSelection(Node node)
        {
            var variable = node as VariableDeclarationStatementNode;
            var result = node;

            TryGetAttribute("identifier", attribute =>
            {
                result = variable.Identifier;
            });

            TryGetAttribute("initial-value", attribute =>
            {
                result = variable.InitialValue;
            });

            TryGetAttribute("type", attribute =>
            {
                result = variable.VariableType;
            });

            return base.ModifyNodeSelection(node);
        }

        protected override bool FilterNode(Node node)
        {
            Func<bool> filter = () => (node is VariableDeclarationStatementNode);

            TryGetAttribute("identifier", attribute =>
            {
                var result = filter();
                filter = () => result && 
                               (node as VariableDeclarationStatementNode).VariableName == attribute.Value;
            });

            TryGetAttribute("type", attribute =>
            {
                var result = filter();

                filter =
                    () => result &&
                          (node as VariableDeclarationStatementNode).VariableType.Type == attribute.Value;
            });

            return filter();
        }
    }
}