package ast.expression;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplicativeExpressionNode extends ExpressionNode {
    private final List<ExpressionNode> operands;
    private final List<String> operators;

    public MultiplicativeExpressionNode(List<ExpressionNode> operands, List<String> operators) {
        this.operands = operands;
        this.operators = operators;
    }

    public List<ExpressionNode> getOperands() {
        return operands;
    }

    public List<String> getOperators() {
        return operators;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(operands);
    }

    @Override
    public String getSymbolName() {
        return "MultiplicativeExpression";
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return operands.get(0).getLine();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("MultiplicativeExpressionNode:\n");
        String indent = getIndent(level + 1);
        for (int i = 0; i < operands.size(); i++) {
            sb.append(indent).append(operands.get(i).toString(level + 1)).append("\n");
            if (i < operators.size()) {
                sb.append(indent).append("  ").append(operators.get(i)).append("\n");
            }
        }
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
