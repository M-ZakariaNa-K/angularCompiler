package ast.statements.flow;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.Collections;
import java.util.List;

public class ContinueStatementNode extends StatementNode {

    private final int line;

    public ContinueStatementNode(int line) {
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "ContinueStatement";
    }

    @Override
    public String generateCode() {
        return "continue;";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ContinueStatementNode\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
