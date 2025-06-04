package ast.statements.declaration.enums;

import ast.ASTNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumValuesNode implements ASTNode {

    private final List<EnumValueNode> values;
    private final int line;

    public EnumValuesNode(List<EnumValueNode> values, int line) {
        this.values = values;
        this.line = line;
    }

    public List<EnumValueNode> getValues() {
        return values;
    }

    @Override
    public String getSymbolName() {
        return "EnumValues";
    }

    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        for (EnumValueNode value : values) {
            builder.append(value.generateCode()).append(", ");
        }
        if (!values.isEmpty()) {
            builder.setLength(builder.length() - 2); // Remove trailing comma and space
        }
        return builder.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(values);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("EnumValuesNode:\n");
        for (EnumValueNode value : values) {
            sb.append(value.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
