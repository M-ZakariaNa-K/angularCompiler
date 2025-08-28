package ast.types;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class ArrayTypeNode extends TypeNode {
    private final TypeNode elementType;
    private final int line;

    public ArrayTypeNode(TypeNode elementType,int line) {
        this.elementType = elementType;
        this.line = line;
    }

    public TypeNode getElementType() {
        return elementType;
    }

    @Override
    public String getSymbolName() {
        return "ArrayType";
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
        return Collections.emptyList();
    }

    @Override
    public String getStringType() {
        return elementType.getStringType() + "[]";
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ArrayTypeNode\n");
        sb.append(elementType.toString(level + 1));
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
