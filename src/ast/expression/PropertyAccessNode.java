package ast.expression;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class PropertyAccessNode extends ExpressionNode {
    private final ExpressionNode target;
    private final String property;


    public PropertyAccessNode(ExpressionNode target, String property) {
        this.target = target;
        this.property = property;
    }

    public ExpressionNode getTarget() {
        return target;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public String getSymbolName() {
        return "PropertyAccess";
    }

    @Override
    public String generateCode() {
        return target.generateCode() + "." + property;
    }

    @Override
    public int getLine() {
        return target.getLine();
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(target);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);

        sb.append(indent).append("PropertyAccessNode: .").append(property).append("\n");
        sb.append(target.toString(level + 1)).append("\n");

        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
