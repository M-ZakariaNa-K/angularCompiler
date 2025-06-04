package ast.statements.declaration;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.modifiers.AccessModifierNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassVariableDeclarationNode extends DeclarationNode {
    private final AccessModifierNode accessModifier; // optional
    private final String identifier;
    private final TypeNode type;
    private final ExpressionNode initializer; // optional
    private final int line;

    public ClassVariableDeclarationNode(AccessModifierNode accessModifier, String identifier, TypeNode type,
                                        ExpressionNode initializer, int line) {
        this.accessModifier = accessModifier;
        this.identifier = identifier;
        this.type = type;
        this.initializer = initializer;
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

    public ExpressionNode getInitializer() {
        return initializer;
    }

    @Override
    public String getSymbolName() {
        return "ClassVariableDeclaration";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) {
            sb.append(accessModifier.toString().toLowerCase()).append(" ");
        }
        sb.append(identifier).append(": ").append(type.generateCode());
        if (initializer != null) {
            sb.append(" = ").append(initializer.generateCode());
        }
        sb.append(";");
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (accessModifier != null) children.add(accessModifier);
        children.add(type);
        if (initializer != null) children.add(initializer);
        return Collections.unmodifiableList(children);
    }

    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ClassVariableDeclarationNode: ").append(identifier);
        if (accessModifier != null) {
            sb.append(" [").append(accessModifier).append("]");
        }
        sb.append(" : ").append(type != null ? type.toString() : "unknown").append(" at line ").append(line).append("\n");
        if (initializer != null) {
            sb.append(indent).append("  Initializer:\n");
            sb.append(initializer.toString(level + 2));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
