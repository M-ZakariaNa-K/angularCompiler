package ast.statements.controlFlow;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.Arrays;
import java.util.List;

public class IfStatementNode extends StatementNode {
    private final ExpressionNode condition;
    private final ASTNode body;
    private final int line;

    public IfStatementNode(ExpressionNode condition, ASTNode body, int line) {
        this.condition = condition;
        this.body = body;
        this.line = line;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String getSymbolName() {
        return "IfStatement";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("if (");
        sb.append(condition.generateCode());
        sb.append(") \n");

        sb.append(body.generateCode());

        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Arrays.asList(condition, body);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("IfStatementNode\n");

        sb.append(indent).append("  Condition:\n");
        sb.append(condition.toString(level + 2));

        sb.append(indent).append("  Body:\n");
        if (body instanceof StatementNode) {
            sb.append(((StatementNode) body).toString(level + 2));
        } else {
            sb.append(indent).append("    ").append(body.toString()).append("\n");
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
