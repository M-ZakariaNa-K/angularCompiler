package ast.css.statements;

import ast.ASTNode;
import ast.css.CssStatementNode;
import ast.css.at.CssKeyframesRuleNode;

public class CssKeyframesStatementNode extends CssStatementNode {
    private final CssKeyframesRuleNode keyframes;

    public CssKeyframesStatementNode(CssKeyframesRuleNode keyframes, int line) {
        super(line);
        this.keyframes = keyframes;
    }

    public CssKeyframesRuleNode getKeyframes() { return keyframes; }

    @Override public String generateCode() { return keyframes.generateCode(); }
    @Override public String toString(int level) { return keyframes.toString(level); }
    @Override public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.<ASTNode>singletonList(keyframes);
    }
}
