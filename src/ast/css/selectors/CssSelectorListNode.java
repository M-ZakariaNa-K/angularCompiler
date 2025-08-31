package ast.css.selectors;

import ast.ASTNode;
import ast.css.CssAstUtils;
import ast.css.CssNodeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssSelectorListNode extends CssNodeBase {
    private final List<CssSelectorNode> selectors;

    public CssSelectorListNode(List<CssSelectorNode> selectors, int line) {
        super(line);
        this.selectors = selectors == null ? Collections.<CssSelectorNode>emptyList() : selectors;
    }

    public List<CssSelectorNode> getSelectors() { return selectors; }

    @Override
    public String generateCode() {
        List<String> parts = new ArrayList<String>();
        for (CssSelectorNode s : selectors) parts.add(s.generateCode());
        return CssAstUtils.joinWithCommaSpace(parts);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssSelectorList\n");
        for (ASTNode s : selectors) sb.append(s.toString(level + 1)).append("\n");
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(selectors);
    }
}
