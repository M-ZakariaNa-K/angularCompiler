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
}
