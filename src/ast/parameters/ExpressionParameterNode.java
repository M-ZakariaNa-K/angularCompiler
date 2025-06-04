package ast.parameters;

import ast.ASTNode;
import ast.types.TypeNode;

import java.util.Collections;
import java.util.List;

public class ExpressionParameterNode implements ASTNode {
    private final String identifier;
    private final TypeNode type;
    private final int line;

    public ExpressionParameterNode(String identifier, TypeNode type, int line) {
        this.identifier = identifier;
        this.type = type;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    public TypeNode getType() {
        return type;
    }

    @Override
    public String getSymbolName() {
        return "ExpressionParameter";
    }

    @Override
    public String generateCode() {
        return identifier + ": " + type.generateCode();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(type);
    }
    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ExpressionParameterNode\n");
        sb.append(indent).append("  ").append(identifier).append("\n");
        sb.append(type.toString(level + 1));
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
