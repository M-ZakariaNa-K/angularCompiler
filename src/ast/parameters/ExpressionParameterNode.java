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
    public String toString() {
        return "ExpressionParameterNode(" + identifier + ": " + type + ") at line " + line;
    }
}
