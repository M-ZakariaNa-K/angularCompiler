package ast.css.statements;

import ast.ASTNode;
import ast.css.CssStatementNode;

public class CssAtRuleStatementNode extends CssStatementNode {
    private final ASTNode at; // CssAtRuleBlockNode or CssAtRuleSemiNode

    public CssAtRuleStatementNode(ASTNode at, int line) {
        super(line);
        this.at = at;
    }

    public ASTNode getAt() { return at; }

    @Override public String generateCode() { return at.generateCode(); }

    @Override public String toString(int level) { return at.toString(level); }

    @Override public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.<ASTNode>singletonList(at);
    }
}
