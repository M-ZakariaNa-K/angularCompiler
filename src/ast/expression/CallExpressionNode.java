package ast.expression;

import ast.ASTNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CallExpressionNode extends ExpressionNode {
    private final ExpressionNode callee;
    private final List<ExpressionNode> arguments;

    public CallExpressionNode(ExpressionNode callee, List<ExpressionNode> arguments) {
        this.callee = callee;
        this.arguments = arguments;
    }

    public ExpressionNode getCallee() {
        return callee;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String getSymbolName() {
        return "CallExpression";
    }

    @Override
    public String generateCode() {
        return callee.generateCode() + "(" + arguments.stream()
                .map(ExpressionNode::generateCode)
                .collect(Collectors.joining(", ")) + ")";
    }

    @Override
    public int getLine() {
        return callee.getLine();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("CallExpressionNode:\n");
        String indent = getIndent(level);

        sb.append(indent).append("  Callee:\n");
        sb.append(callee.toString(level + 2)).append("\n");

        if (!arguments.isEmpty()) {
            sb.append(indent).append("  Arguments:\n");
            for (ExpressionNode arg : arguments) {
                sb.append(arg.toString(level + 2)).append("\n");
            }
        }

        return sb.toString();
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
