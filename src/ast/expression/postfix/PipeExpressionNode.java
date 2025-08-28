package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.AppliedPipeExpressionNode;
import ast.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PipeExpressionNode extends PostfixOpNode {
    private final String pipeName;
    private final List<ExpressionNode> arguments;
    private final int line;

    public PipeExpressionNode(String pipeName, List<ExpressionNode> arguments,int line) {
        this.pipeName = pipeName;
        this.arguments = arguments;
        this.line = line;
    }

    public String getPipeName() {
        return pipeName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public ExpressionNode apply(ExpressionNode target) {
        return new AppliedPipeExpressionNode(target, pipeName, arguments);
    }

    @Override
    public String getSymbolName() {
        return "PipeExpression";
    }

    @Override
    public String generateCode() {
        return ""; // No target available here
    }


    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public List<ASTNode> getChildren() {
         return arguments.stream()
                .map(e -> (ASTNode) e)
                .collect(Collectors.toList());

    }
    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("PipeExpressionNode\n");
        sb.append(indent).append("  Pipe Name: ").append(pipeName).append("\n");
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
