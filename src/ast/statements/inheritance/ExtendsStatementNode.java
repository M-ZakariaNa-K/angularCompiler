package ast.statements.inheritance;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class ExtendsStatementNode implements ASTNode {
    private final String identifier;
    private final int line;

    public ExtendsStatementNode(String identifier, int line) {
        this.identifier = identifier;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getSymbolName() {
        return "ExtendsStatement";
    }

    @Override
    public String generateCode() {
        return "extends " + identifier;
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
    public String toString() {
        return "ExtendsStatementNode(" + identifier + ") at line " + line;
    }
}
