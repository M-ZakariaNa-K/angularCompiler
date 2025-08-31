package ast.css.selectors;

import ast.ASTNode;
import ast.css.CssNodeBase;
import ast.css.blocks.CssBlockNode;

import java.util.ArrayList;
import java.util.List;

public class CssRuleSetNode extends CssNodeBase {
    private final CssSelectorListNode selectorList;
    private final CssBlockNode block;

    public CssRuleSetNode(CssSelectorListNode selectorList, CssBlockNode block, int line) {
        super(line);
        this.selectorList = selectorList;
        this.block = block;
    }

    public CssSelectorListNode getSelectorList() { return selectorList; }
    public CssBlockNode getBlock() { return block; }

    @Override
    public String generateCode() {
        return selectorList.generateCode() + " " + block.generateCode();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssRuleSet\n");
        sb.append(selectorList.toString(level + 1)).append("\n");
        sb.append(block.toString(level + 1));
        return sb.toString();
    }

    @Override
    public List<ASTNode> getChildren() {
        java.util.ArrayList<ASTNode> out = new ArrayList<ASTNode>();
        out.add(selectorList);
        out.add(block);
        return out;
    }
}
