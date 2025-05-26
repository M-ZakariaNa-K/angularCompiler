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
        return "EnumValue: " + name;
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return value != null ? Collections.singletonList(value) : Collections.emptyList();
    }

}
