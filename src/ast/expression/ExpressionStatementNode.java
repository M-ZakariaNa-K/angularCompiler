package ast.expression;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.Arrays;
import java.util.List;

public class ExpressionStatementNode extends StatementNode {

    private final ExpressionNode expression;
    public ExpressionStatementNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String getSymbolName() {
        return "ExpressionWrapper";
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return expression.getLine();
    }

    @Override
    public List<ASTNode> getChildren() {
        return Arrays.asList(expression);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("ExpressionStatementNode:\n");
        String indent = getIndent(level + 1);
        sb.append(indent).append(expression.toString(level + 1)).append("\n");
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
