package ast.expression.basePrimary;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class LiteralNode extends BasePrimaryNode {
    private final Object value;
    private final int line;

    public LiteralNode(Object value, int line) {
        this.value = value;
        this.line = line;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String getSymbolName() {
        return "Literal";
    }

    @Override
    public String generateCode() {
        if (value == null) {
            return "null";
        }
        if (value instanceof String) {
            // Escape quotes and backslashes for JS string
            String escaped = ((String) value)
                    .replace("\\", "\\\\")
                    .replace("\"", "\\\"");
            return "\"" + escaped + "\"";
        }
        if (value instanceof Boolean) {
            return ((Boolean) value) ? "true" : "false";
        }
        return value.toString(); // Numbers are printed as-is
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
        return getIndent(level) + "LiteralNode: " + generateCode() + "\n";
    }

    private String getIndent(int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }
}
