package ast.css.expr;

import ast.ASTNode;
import ast.css.CssAstUtils;
import ast.css.CssNodeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssExprNode extends CssNodeBase {
    private final List<CssTermNode> terms;

    public CssExprNode(List<CssTermNode> terms, int line) {
        super(line);
        this.terms = terms == null ? Collections.<CssTermNode>emptyList() : terms;
    }

    public List<CssTermNode> getTerms() { return terms; }

    @Override
    public String generateCode() {
        List<String> parts = new ArrayList<String>();
        for (CssTermNode t : terms) parts.add(t.generateCode());
        return CssAstUtils.joinWithSpace(parts);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssExpr\n");
        for (ASTNode t : terms) sb.append(t.toString(level + 1)).append("\n");
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(terms);
    }
}
