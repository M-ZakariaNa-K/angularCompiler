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
        return "";
    }

    @Override
    public int getLine() {
        return operand.getLine();
    }
}
