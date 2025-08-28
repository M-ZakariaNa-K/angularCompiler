package ast.expression.basePrimary;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import javafx.util.Pair;

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
        // JS object literal: { key: value, ... }
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
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ObjectNode\n");
        for (Map.Entry<String, ExpressionNode> entry : entries.entrySet()) {
            sb.append(indent).append("  ").append("Key: ").append(entry.getKey()).append("\n");
            sb.append(entry.getValue().toString(level + 2));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
