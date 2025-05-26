package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.CallExpressionNode;
import ast.expression.ExpressionNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallNode extends PostfixOpNode {
    private final List<ExpressionNode> arguments;

    public FunctionCallNode(List<ExpressionNode> arguments) {
        this.arguments = arguments;
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
        return 0;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.unmodifiableList(arguments);
    }
}
