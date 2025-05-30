package ast.expression.basePrimary;

import ast.ASTNode;
import ast.expression.ExpressionNode;

import java.util.Collections;
import java.util.List;

public class ParenthesizedExpressionNode extends BasePrimaryNode {
    private final ExpressionNode expression;
    private final int line;

    public ParenthesizedExpressionNode(ExpressionNode expression, int line) {
        this.expression = expression;
        this.line = line;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String getSymbolName() {
        return "()";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(expression);
    }

    @Override
    public String generateCode() {
        return "(" + expression.generateCode() + ")";
    }
}
