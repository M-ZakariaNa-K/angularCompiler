package ast.css.expr;

import ast.ASTNode;
import ast.css.CssNodeBase;

import java.util.Collections;
import java.util.List;

public class CssValueExprNode extends CssNodeBase {
    private final CssExprNode expr;

    public CssValueExprNode(CssExprNode expr, int line) {
        super(line);
        this.expr = expr;
    }

    public CssExprNode getExpr() { return expr; }

    @Override
    public String generateCode() {
        return expr.generateCode();
    }

    @Override
    public String toString(int level) {
        return indent(level) + "CssValueExpr\n" + expr.toString(level + 1);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.<ASTNode>singletonList(expr);
    }
}
