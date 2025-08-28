package ast.statements.declaration.enums;

import ast.ASTNode;
import ast.expression.basePrimary.LiteralNode;
import ast.statements.declaration.DeclarationNode;

import java.util.Collections;
import java.util.List;

public class EnumValueNode extends DeclarationNode {

    private final String name;
    private final LiteralNode value; // may be null
    private final int line;

    public EnumValueNode(String name, LiteralNode value, int line) {
        this.name = name;
        this.value = value;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public LiteralNode getValue() {
        return value;
    }

    @Override
    public String getSymbolName() {
        return "EnumValue";
    }

    @Override
    public String generateCode() {
        if (value != null) {
            return "\"" + name + "\":" + value.generateCode();
        }
        // If no explicit value, JS enum can just assign auto-increment numbers
        return "\"" + name + "\":" + name; // placeholder; we'll handle auto-number in EnumDefinitionNode
    }


    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return value != null ? Collections.singletonList(value) : Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("EnumValueNode: ").append(name);
        if (value != null) {
            sb.append(" =\n");
            sb.append(value.toString(level + 1));
        } else {
            sb.append("\n");
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
