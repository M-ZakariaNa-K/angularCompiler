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
}
