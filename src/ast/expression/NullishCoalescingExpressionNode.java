package ast.expression;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NullishCoalescingExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right; // May be null if only left-hand expression is present

    public NullishCoalescingExpressionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    @Override
    public List<ASTNode> getChildren() {
        return right == null
                ? Collections.singletonList(left)
                : Arrays.asList(left, right);
    }

    @Override
    public String getSymbolName() {
        return "NullishCoalescingExpression";
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return left.getLine();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("NullishCoalescingExpressionNode:\n");
        String indent = getIndent(level + 1);

        sb.append(indent).append(left.toString(level + 1)).append("\n");
        if (right != null) {
            sb.append(indent).append("??\n");
            sb.append(indent).append(right.toString(level + 1)).append("\n");
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
