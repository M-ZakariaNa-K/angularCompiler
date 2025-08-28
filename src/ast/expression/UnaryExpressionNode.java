package ast.expression;

import ast.ASTNode;
import java.util.Collections;
import java.util.List;

public class UnaryExpressionNode extends ExpressionNode {
    private final String operator; // Can be null if no unary operator is present
    private final ExpressionNode operand;

    public UnaryExpressionNode(String operator, ExpressionNode operand) {
        this.operator = operator;
        this.operand = operand;
    }

    public String getOperator() {
        return operator;
    }

    public ExpressionNode getOperand() {
        return operand;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(operand);
    }

    @Override
    public String getSymbolName() {
        return "UnaryExpression";
    }

    @Override
    public String generateCode() {
        if (operator != null) {
            return operator + operand.generateCode();
        }
        return operand.generateCode();
    }


    @Override
    public int getLine() {
        return operand.getLine();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);

        sb.append(indent).append("UnaryExpressionNode");
        if (operator != null) {
            sb.append(" [operator=").append(operator).append("]");
        }
        sb.append(":\n");
        sb.append(operand.toString(level + 1));

        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
