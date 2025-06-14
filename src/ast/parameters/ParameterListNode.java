package ast.parameters;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class ParameterListNode implements ASTNode {
    private final List<ExpressionParameterNode> parameters;
    private final int line;

    public ParameterListNode(List<ExpressionParameterNode> parameters, int line) {
        this.parameters = parameters;
        this.line = line;
    }

    public List<ExpressionParameterNode> getParameters() {
        return parameters;
    }

    @Override
    public String getSymbolName() {
        return "parameterList";
    }

    @Override
    public String generateCode() {
        return "(" + parameters.stream()
                .map(ExpressionParameterNode::generateCode)
                .reduce((a, b) -> a + ", " + b)
                .orElse("") + ")";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return parameters.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(parameters);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ParameterListNode\n");
        for (ExpressionParameterNode param : parameters) {
            sb.append(param.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
