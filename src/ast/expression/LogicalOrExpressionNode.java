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
        return "";
    }

    @Override
    public int getLine() {
        return operands.get(0).getLine();
    }
}
