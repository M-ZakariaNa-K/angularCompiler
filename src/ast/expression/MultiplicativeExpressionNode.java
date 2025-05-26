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
}
