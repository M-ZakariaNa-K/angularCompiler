package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.expression.PropertyAccessNode;

import java.util.Collections;
import java.util.List;

public class DotAccessNode extends PostfixOpNode {
    private final String identifier;

    public DotAccessNode(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public ExpressionNode apply(ExpressionNode target) {
        return new PropertyAccessNode(target, identifier);
    }

    @Override
    public String getSymbolName() {
        return "DotAccess";
    }

    @Override
    public String generateCode() {
        return "." + identifier;
    }

    @Override
    public int getLine() {
        return 0; // Provide actual line if needed
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }
}
