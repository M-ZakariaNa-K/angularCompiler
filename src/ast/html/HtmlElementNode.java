package ast.html;

import ast.ASTNode;

import java.util.List;
import java.util.Collections;

public class HtmlElementNode extends HtmlBaseNode {
    private final String tagName;
    private final List<HtmlAttributeNode> attributes;
    private final List<HtmlBaseNode> children;
    private final int line;

    public HtmlElementNode(String tagName, List<HtmlAttributeNode> attributes, List<HtmlBaseNode> children, int line) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder(indent + "HtmlElementNode: " + tagName + "\n");
        for (HtmlAttributeNode attr : attributes) sb.append(attr.toString(level + 1));
        for (HtmlBaseNode child : children) sb.append(child.toString(level + 1));
        return sb.toString();
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        for (HtmlAttributeNode attr : attributes) sb.append(" ").append(attr.generateCode());
        sb.append(">");
        for (HtmlBaseNode child : children) sb.append(child.generateCode());
        sb.append("</").append(tagName).append(">");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
