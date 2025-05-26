package ast.expression;

import ast.ASTNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppliedPipeExpressionNode extends ExpressionNode {
    private final ExpressionNode input;
    private final String pipeName;
    private final List<ExpressionNode> arguments;

    public AppliedPipeExpressionNode(ExpressionNode input, String pipeName, List<ExpressionNode> arguments) {
        this.input = input;
        this.pipeName = pipeName;
        this.arguments = arguments;
    }

    public ExpressionNode getInput() {
        return input;
    }

    public String getPipeName() {
        return pipeName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String getSymbolName() {
        return "PipeExpression";
    }

    @Override
    public String generateCode() {
        String args = arguments.isEmpty() ? "" : ":" + arguments.stream()
                .map(ExpressionNode::generateCode)
                .collect(Collectors.joining(":"));
        return input.generateCode() + " | " + pipeName + args;
    }

    @Override
    public int getLine() {
        return input.getLine();
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> all = new ArrayList<>();
        all.add(input);
        all.addAll(arguments);
        return all;
    }
}
