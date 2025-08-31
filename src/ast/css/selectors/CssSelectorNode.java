package ast.css.selectors;

import ast.ASTNode;
import ast.css.CssNodeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssSelectorNode extends CssNodeBase {
    private final CssSimpleSelectorNode first;
    private final List<CssSelectorTailItem> tails;

    public static class CssSelectorTailItem {
        public final CssCombinatorNode combinator;
        public final CssSimpleSelectorNode selector;
        public CssSelectorTailItem(CssCombinatorNode c, CssSimpleSelectorNode s) {
            this.combinator = c; this.selector = s;
        }
    }

    public CssSelectorNode(CssSimpleSelectorNode first, List<CssSelectorTailItem> tails, int line) {
        super(line);
        this.first = first;
        this.tails = tails == null ? Collections.<CssSelectorTailItem>emptyList() : tails;
    }

    public CssSimpleSelectorNode getFirst() { return first; }
    public List<CssSelectorTailItem> getTails() { return tails; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder(first.generateCode());
        for (CssSelectorTailItem t : tails) {
            sb.append(" ").append(t.combinator.generateCode()).append(" ").append(t.selector.generateCode());
        }
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssSelector\n");
        sb.append(first.toString(level + 1)).append("\n");
        for (CssSelectorTailItem t : tails) {
            sb.append(t.combinator.toString(level + 1)).append("\n");
            sb.append(t.selector.toString(level + 1)).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        ArrayList<ASTNode> out = new ArrayList<ASTNode>();
        out.add(first);
        for (CssSelectorTailItem t : tails) {
            out.add(t.combinator);
            out.add(t.selector);
        }
        return out;
    }
}
