package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.CallExpressionNode;
import ast.expression.ExpressionNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallNode extends PostfixOpNode {
    private final List<ExpressionNode> arguments;
    private final int line;

    public FunctionCallNode(List<ExpressionNode> arguments,int line) {
        this.arguments = arguments;
        this.line = line;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public ExpressionNode apply(ExpressionNode target) {
        return new CallExpressionNode(target, arguments);
    }

    @Override
    public String getSymbolName() {
        return "FunctionCall";
    }

    @Override
    public String generateCode() {
        return "(" + arguments.stream().map(ExpressionNode::generateCode).collect(Collectors.joining(", ")) + ")";
    }

    @Override
    public int getLine() {
        return line;
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("FunctionCallNode\n");
        if (!arguments.isEmpty()) {
            sb.append(indent).append("  Arguments:\n");
            for (ExpressionNode arg : arguments) {
                sb.append(arg.toString(level + 2));
            }
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
