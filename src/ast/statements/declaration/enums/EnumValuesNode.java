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
    public String toString() {
        return "EnumValues(" + values.size() + " values)";
    }
}
