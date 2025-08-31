package ast.css.selectors;

import ast.ASTNode;
import ast.css.CssNodeBase;
import ast.css.expr.CssValueExprNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssPseudoFunctionNode extends CssNodeBase {
    private final List<CssValueExprNode> values;

    public CssPseudoFunctionNode(List<CssValueExprNode> values, int line) {
        super(line);
        this.values = values == null ? Collections.<CssValueExprNode>emptyList() : values;
    }

    public List<CssValueExprNode> getValues() { return values; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(values.get(i).generateCode());
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssPseudoFunction\n");
        for (ASTNode v : values) sb.append(v.toString(level + 1)).append("\n");
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(values);
    }
}
