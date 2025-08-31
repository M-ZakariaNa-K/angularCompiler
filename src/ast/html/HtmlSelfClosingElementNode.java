package ast.html;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class HtmlSelfClosingElementNode extends HtmlBaseNode {
    private final String tagName;
    private final List<HtmlAttributeNode> attributes;
    private final int line;

    public HtmlSelfClosingElementNode(String tagName, List<HtmlAttributeNode> attributes, int line) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.line = line;
    }

    @Override
    public int getLine() { return line; }


    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder(indent + "HtmlSelfClosingElementNode: " + tagName + "\n");
        for (HtmlAttributeNode attr : attributes) sb.append(attr.toString(level + 1));
        return sb.toString();
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        for (HtmlAttributeNode attr : attributes) sb.append(" ").append(attr.generateCode());
        sb.append(" />");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
