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
}
