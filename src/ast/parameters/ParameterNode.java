// File: ast/functions/ParameterNode.java
package ast.parameters;

import ast.ASTNode;
import ast.modifiers.AccessModifierNode;
import ast.statements.StatementNode;
import ast.types.TypeNode;

import java.util.ArrayList;
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
    public String toString() {
        return generateCode();
    }
}
