package ast.css.blocks;

import ast.ASTNode;
import ast.css.CssNodeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssBlockNode extends CssNodeBase {
    private final List<CssBlockContentNode> contents;

    public CssBlockNode(List<CssBlockContentNode> contents, int line) {
        super(line);
        this.contents = contents == null ? Collections.<CssBlockContentNode>emptyList() : contents;
    }

    public List<CssBlockContentNode> getContents() { return contents; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder("{");
        for (CssBlockContentNode bc : contents) {
            sb.append(" ").append(bc.generateCode());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssBlock\n");
        for (ASTNode c : contents) {
            sb.append(c.toString(level + 1)).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(contents);
    }
}
