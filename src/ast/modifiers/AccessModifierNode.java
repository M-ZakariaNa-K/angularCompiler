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
        switch (modifier) {
            case PRIVATE:
                // JavaScript uses '#' prefix for private fields/methods
                return "#";
            case PUBLIC:
            case PROTECTED:
            case READONLY:
            default:
                // Not directly supported, keep as comment for clarity
                return "// " + modifier.name().toLowerCase();
        }
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
        sb.append(indent)
                .append("AccessModifierNode: ")
                .append(modifier.name().toLowerCase())
                .append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
