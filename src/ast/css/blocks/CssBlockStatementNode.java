package ast.css.blocks;

import ast.ASTNode;
import ast.css.CssStatementNode;

public class CssBlockStatementNode extends CssBlockContentNode {
    private final CssStatementNode statement;

    public CssBlockStatementNode(CssStatementNode statement, int line) {
        super(line);
        this.statement = statement;
    }

    public CssStatementNode getStatement() { return statement; }

    @Override
    public String generateCode() { return statement.generateCode(); }

    @Override
    public String toString(int level) {
        return statement.toString(level);
    }

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.<ASTNode>singletonList(statement);
    }
}
