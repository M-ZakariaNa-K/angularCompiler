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

    public PipeExpressionNode(String pipeName, List<ExpressionNode> arguments) {
        this.pipeName = pipeName;
        this.arguments = arguments;
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
        String args = arguments.isEmpty() ? "" : ":" + arguments.stream()
                .map(ExpressionNode::generateCode)
                .collect(Collectors.joining(":"));
        return " | " + pipeName + args;
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

}
