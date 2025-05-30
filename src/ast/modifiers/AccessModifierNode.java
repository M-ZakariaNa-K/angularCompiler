package ast.modifiers;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.Collections;
import java.util.List;

public class AccessModifierNode implements ASTNode {
    public enum Modifier {
        PUBLIC, PRIVATE, PROTECTED, READONLY
    }

    private final Modifier modifier;
    private final int line;

    public AccessModifierNode(Modifier modifier, int line) {
        this.modifier = modifier;
        this.line = line;
    }

    public Modifier getModifier() {
        return modifier;
    }

    @Override
    public String getSymbolName() {
        return "AccessModifier";
    }

    @Override
    public String generateCode() {
        return modifier.name().toLowerCase();
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
        return generateCode();
    }
}
