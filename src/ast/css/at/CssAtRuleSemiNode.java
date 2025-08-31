package ast.css.at;

import ast.ASTNode;
import ast.css.CssNodeBase;
import ast.css.selectors.CssSelectorListNode;

import java.util.ArrayList;
import java.util.List;

public class CssAtRuleSemiNode extends CssNodeBase {
    private final String atKeyword;
    private final CssSelectorListNode selectorList; // optional

    public CssAtRuleSemiNode(String atKeyword, CssSelectorListNode selectorList, int line) {
        super(line);
        this.atKeyword = atKeyword;
        this.selectorList = selectorList;
    }

    public String getAtKeyword() { return atKeyword; }
    public CssSelectorListNode getSelectorList() { return selectorList; }

    @Override
    public String getSymbolName() { return atKeyword; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(atKeyword);
        if (selectorList != null) sb.append(" ").append(selectorList.generateCode());
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssAtRuleSemi(").append(atKeyword).append(")\n");
        if (selectorList != null) sb.append(selectorList.toString(level + 1));
        return sb.toString();
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> out = new ArrayList<ASTNode>();
        if (selectorList != null) out.add(selectorList);
        return out;
    }
}
