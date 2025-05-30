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
        return "";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(body);
    }
}
