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
            return "\"" + value + "\"";
        }
        return value.toString();
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
        return "LiteralNode(" + value + ") at line " + line;
    }
}
