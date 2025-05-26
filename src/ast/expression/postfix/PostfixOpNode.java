package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.ExpressionNode;

public abstract class PostfixOpNode implements ASTNode {
    public abstract ExpressionNode apply(ExpressionNode target);
}
