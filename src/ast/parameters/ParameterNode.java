// File: ast/functions/ParameterNode.java
package ast.parameters;

import ast.ASTNode;
import ast.modifiers.AccessModifierNode;
import ast.statements.StatementNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParameterNode implements ASTNode {
    private final AccessModifierNode accessModifier; // Nullable
    private final String identifier;
    private final TypeNode type;
    private final int line;

    public ParameterNode(String identifier, TypeNode type, int line) {
        this(null, identifier, type, line);
    }

    public ParameterNode(AccessModifierNode accessModifier, String identifier, TypeNode type, int line) {
        this.accessModifier = accessModifier;
        this.identifier = identifier;
        this.type = type;
        this.line = line;
    }

    public AccessModifierNode getAccessModifier() {
        return accessModifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public TypeNode getType() {
        return type;
    }

    @Override
    public String getSymbolName() {
        return "Parameter";
    }

    @Override
    public String generateCode() {
        String prefix = accessModifier != null ? accessModifier.generateCode() + " " : "";
        return prefix + identifier + ": " + type.generateCode();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (accessModifier != null) children.add(accessModifier);
        if (type != null) children.add(type);
        return children;
    }
    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ParameterNode: ").append(identifier).append("\n");
        if (accessModifier != null) {
            sb.append(accessModifier.toString(level + 1));
        }
        if (type != null) {
            sb.append(type.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
