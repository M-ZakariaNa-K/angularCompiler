package ast.html;

import java.util.Collections;

public class HtmlDoctypeNode extends HtmlBaseNode {
    private final String content;
    private final int line;

    public HtmlDoctypeNode(String content, int line) {
        this.content = content;
        this.line = line;
    }

    @Override
    public int getLine() { return line; }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "HtmlDoctypeNode: <!DOCTYPE " + content + ">\n";
    }

    @Override
    public String generateCode() {
        return "<!DOCTYPE " + content + ">";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
