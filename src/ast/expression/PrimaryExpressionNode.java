package ast.expression;

import ast.ASTNode;
import ast.expression.basePrimary.BasePrimaryNode;
import ast.expression.postfix.PostfixOpNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimaryExpressionNode extends ExpressionNode {
    private final BasePrimaryNode base;
    private final List<PostfixOpNode> postfixOps;
    private final int line;

    public PrimaryExpressionNode(BasePrimaryNode base, List<PostfixOpNode> postfixOps, int line) {
        this.base = base;
        this.postfixOps = postfixOps != null ? postfixOps : Collections.emptyList();
        this.line = line;
    }

    public BasePrimaryNode getBase() {
        return base;
    }

    public List<PostfixOpNode> getPostfixOps() {
        return postfixOps;
    }

    @Override
    public String getSymbolName() {
        return "PrimaryExpression";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder(base.generateCode());
        for (PostfixOpNode op : postfixOps) {
            sb.append(op.generateCode());
        }
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(base);
        children.addAll(postfixOps);
        return children;
    }

    @Override
    public String toString() {
        return "PrimaryExpressionNode at line " + line;
    }
}
