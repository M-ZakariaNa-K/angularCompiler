package ast.css.statements;

import ast.ASTNode;
import ast.css.CssStatementNode;
import ast.css.selectors.CssRuleSetNode;

public class CssRuleSetStatementNode extends CssStatementNode {
    private final CssRuleSetNode ruleSet;

    public CssRuleSetStatementNode(CssRuleSetNode ruleSet, int line) {
        super(line);
        this.ruleSet = ruleSet;
    }

    public CssRuleSetNode getRuleSet() { return ruleSet; }

    @Override public String generateCode() { return ruleSet.generateCode(); }
    @Override public String toString(int level) { return ruleSet.toString(level); }
    @Override public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.<ASTNode>singletonList(ruleSet);
    }
}
