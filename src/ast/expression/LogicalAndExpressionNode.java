package ast.expression;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class LogicalAndExpressionNode extends ExpressionNode {
    private final List<ExpressionNode> operands;

    public LogicalAndExpressionNode(List<ExpressionNode> operands) {
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
        return "LogicalAndExpression";
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return operands.get(0).getLine();
    }
}
