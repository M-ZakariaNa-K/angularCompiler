package ast.css.at;

import ast.ASTNode;
import ast.css.CssNodeBase;
import ast.css.blocks.CssBlockNode;
import ast.css.selectors.CssSelectorListNode;

import java.util.ArrayList;
import java.util.List;

public class CssAtRuleBlockNode extends CssNodeBase {
    private final String atKeyword; // e.g. "@media", "@supports"
    private final CssSelectorListNode selectorList; // optional
    private final CssBlockNode block;

    public CssAtRuleBlockNode(String atKeyword, CssSelectorListNode selectorList, CssBlockNode block, int line) {
        super(line);
        this.atKeyword = atKeyword;
        this.selectorList = selectorList;
        this.block = block;
    }

    public String getAtKeyword() { return atKeyword; }
    public CssSelectorListNode getSelectorList() { return selectorList; }
    public CssBlockNode getBlock() { return block; }

    @Override
    public String getSymbolName() { return atKeyword; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(atKeyword);
        if (selectorList != null) {
            sb.append(" ").append(selectorList.generateCode());
        }
        sb.append(" ").append(block.generateCode());
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssAtRuleBlock(").append(atKeyword).append(")\n");
        if (selectorList != null) sb.append(selectorList.toString(level + 1)).append("\n");
        sb.append(block.toString(level + 1));
        return sb.toString();
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> out = new ArrayList<ASTNode>();
        if (selectorList != null) out.add(selectorList);
        out.add(block);
        return out;
    }
}
