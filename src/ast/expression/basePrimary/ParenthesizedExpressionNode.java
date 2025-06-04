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

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ParenthesizedExpressionNode\n");
        sb.append(expression.toString(level + 1));
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
