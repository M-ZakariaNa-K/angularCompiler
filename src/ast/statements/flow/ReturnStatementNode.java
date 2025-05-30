package ast.statements.flow;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.Collections;
import java.util.List;

public class ReturnStatementNode extends StatementNode {

    private final ExpressionNode expression; // nullable
    private final int line;

    public ReturnStatementNode(ExpressionNode expression, int line) {
        this.expression = expression;
        this.line = line;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String getSymbolName() {
        return "ReturnStatement";
    }

    @Override
    public String generateCode() {
        return "return" + (expression != null ? " " + expression.generateCode() : "") + ";";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return expression != null ? Collections.singletonList(expression) : Collections.emptyList();
    }
}
