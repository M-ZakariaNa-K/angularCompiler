package ast.expression;

import ast.ASTNode;

public abstract class ExpressionNode extends ast.statements.StatementNode {
    @Override
    public abstract String generateCode();
}
