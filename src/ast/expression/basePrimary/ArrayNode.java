package ast.expression.basePrimary;

import ast.ASTNode;
import ast.expression.ExpressionNode;

import java.util.Collections;
import java.util.List;

public class ArrayNode extends BasePrimaryNode {
    private final List<ExpressionNode> elements;
    private final int line;

    public ArrayNode(List<ExpressionNode> elements, int line) {
        this.elements = elements;
        this.line = line;
    }

    public List<ExpressionNode> getElements() {
        return elements;
    }

    @Override
    public String getSymbolName() {
        return "Array";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).generateCode());
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.unmodifiableList(elements);
    }

    @Override
    public String toString() {
        return "ArrayNode at line " + line;
    }
}
