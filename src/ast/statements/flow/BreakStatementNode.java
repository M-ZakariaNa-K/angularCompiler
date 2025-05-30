package ast.statements.flow;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.Collections;
import java.util.List;

public class BreakStatementNode extends StatementNode {

    private final int line;

    public BreakStatementNode(int line) {
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "BreakStatement";
    }

    @Override
    public String generateCode() {
        return "break;";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }
}
