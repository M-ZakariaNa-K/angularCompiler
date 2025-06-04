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
        return "ImplementsStatement";
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
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ImplementsStatementNode\n");
        for (String iface : interfaces) {
            sb.append(indent).append("  ").append(iface).append("\n");
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
