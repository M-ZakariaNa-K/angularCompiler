package ast.expression;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class LogicalOrExpressionNode extends ExpressionNode {
    private final List<ExpressionNode> operands;

    public LogicalOrExpressionNode(List<ExpressionNode> operands) {
        this.operands = operands;
    }

    public List<ExpressionNode> getOperands() {
        return operands;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(operands);
    }

    @Override
    public String getSymbolName() {
        return "LogicalOrExpression";
    }

    @Override
    public String generateCode() {
        if (operands.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operands.size(); i++) {
            sb.append(operands.get(i).generateCode());
            if (i < operands.size() - 1) {
                sb.append(" || ");
            }
        }
        return sb.toString();
    }


    @Override
    public int getLine() {
        return operands.get(0).getLine();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("LogicalOrExpressionNode:\n");
        String indent = getIndent(level + 1);
        for (ExpressionNode operand : operands) {
            sb.append(indent).append(operand.toString(level + 1)).append("\n");
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
