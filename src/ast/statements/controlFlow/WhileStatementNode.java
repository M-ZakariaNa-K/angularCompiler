package ast.statements.controlFlow;

import ast.ASTNode;
import ast.BlockNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhileStatementNode extends StatementNode {

    private final ExpressionNode condition;
    private final ASTNode body;
    private final int line;

    public WhileStatementNode(ExpressionNode condition, ASTNode body, int line) {
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
        return "WhileStatement";
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(condition);
        children.add(body);
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("WhileStatementNode\n");

        sb.append(indent).append("  Condition:\n");
        sb.append(condition.toString(level + 2));

        sb.append(indent).append("  Body:\n");
        sb.append(body.toString(level + 2));

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
