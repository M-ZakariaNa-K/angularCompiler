package ast.statements.controlFlow;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.Collections;
import java.util.List;

public class ElseStatementNode extends StatementNode {

    private final ASTNode body;
    private final int line;

    public ElseStatementNode(ASTNode body, int line) {
        this.body = body;
        this.line = line;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String getSymbolName() {
        return "ElseStatement";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("else \n");
        sb.append(body.generateCode());

        return sb.toString();
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(body);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ElseStatementNode\n");

        if (body != null) {
            if (body instanceof StatementNode) {
                sb.append(((StatementNode) body).toString(level + 1));
            } else {
                sb.append(indent).append("  ").append(body.toString()).append("\n");
            }
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
