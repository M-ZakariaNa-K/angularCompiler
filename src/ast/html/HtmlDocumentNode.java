package ast.html;

import ast.ASTNode;

import java.util.List;
import java.util.Collections;

public class HtmlDocumentNode extends HtmlBaseNode {
    private final List<HtmlBaseNode> contents;
    private final int line;

    public HtmlDocumentNode(List<HtmlBaseNode> contents,int line) {
        this.contents = contents;
        this.line = line;
    }

    public List<HtmlBaseNode> getContents() {
        return contents;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.unmodifiableList(contents);
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder(indent + "HtmlDocumentNode\n");
        for (HtmlBaseNode c : contents) {
            sb.append(c.toString(level + 1));
        }
        return sb.toString();
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        for (HtmlBaseNode c : contents) {
            sb.append(c.generateCode());
        }
        return sb.toString();
    }
    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
