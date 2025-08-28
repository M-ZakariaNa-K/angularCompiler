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
        return identifier;
    }

    @Override
    public int getLine() {
        return line; // Provide actual line if needed
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }
    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("DotAccessNode\n");
        sb.append(indent).append("  Identifier: ").append(identifier).append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
