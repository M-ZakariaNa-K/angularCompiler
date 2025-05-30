package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.expression.PropertyAccessNode;

import java.util.Collections;
import java.util.List;

public class DotAccessNode extends PostfixOpNode {
    private final String identifier;
    private final int line;

    public DotAccessNode(String identifier,int line) {
        this.identifier = identifier;
        this.line = line;
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
        return line; // Provide actual line if needed
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }
}
