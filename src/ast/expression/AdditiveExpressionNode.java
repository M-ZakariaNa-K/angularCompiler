package ast.expression;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class AdditiveExpressionNode extends ExpressionNode {
    private final List<ExpressionNode> operands;
    private final List<String> operators;

    public AdditiveExpressionNode(List<ExpressionNode> operands, List<String> operators) {
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
        return "AdditiveExpression";
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
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("AdditiveExpressionNode\n");
        for (int i = 0; i < operands.size(); i++) {
            sb.append(operands.get(i).toString(level + 1));
            if (i < operators.size()) {
                sb.append(indent).append("  Operator: ").append(operators.get(i)).append("\n");
            }
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", java.util.Collections.nCopies(level, "  "));
    }


}
