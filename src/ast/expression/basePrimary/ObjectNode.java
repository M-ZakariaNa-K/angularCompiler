package ast.expression.basePrimary;

import ast.ASTNode;
import ast.expression.ExpressionNode;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjectNode extends BasePrimaryNode {
    private final Map<String, ExpressionNode> entries;
    private final int line;

    public ObjectNode(Map<String, ExpressionNode> entries, int line) {
        this.entries = new LinkedHashMap<>(entries);
        this.line = line;
    }

    public Map<String, ExpressionNode> getEntries() {
        return entries;
    }

    @Override
    public String getSymbolName() {
        return "Object";
    }

    @Override
    public String generateCode() {
        return "{" + entries.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue().generateCode())
                .collect(Collectors.joining(", ")) + "}";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.unmodifiableList(entries.values().stream().collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "ObjectNode at line " + line;
    }
}
