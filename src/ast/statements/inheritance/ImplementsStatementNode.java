package ast.statements.inheritance;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class ImplementsStatementNode implements ASTNode {
    private final List<String> interfaces;
    private final int line;

    public ImplementsStatementNode(List<String> interfaces, int line) {
        this.interfaces = interfaces;
        this.line = line;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    @Override
    public String getSymbolName() {
        return "implements";
    }

    @Override
    public String generateCode() {
        return "implements " + String.join(", ", interfaces);
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
        return "ImplementsStatementNode(" + String.join(", ", interfaces) + ") at line " + line;
    }
}
