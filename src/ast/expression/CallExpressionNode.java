package ast.expression;

import ast.ASTNode;

import java.util.ArrayList;
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
    public List<ASTNode> getChildren() {
        return arguments.stream()
                .map(e -> (ASTNode) e)
                .collect(Collectors.toList());
    }
}
