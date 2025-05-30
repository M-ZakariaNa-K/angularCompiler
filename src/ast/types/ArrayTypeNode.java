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
        return elementType.getSymbolName() + "[]";
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
        return "ArrayTypeNode{" +
                "elementType=" + elementType +
                ", line=" + line +
                '}';
    }

    @Override
    public String getStringType() {
        return elementType.getStringType() + "[]";
    }
}
