package ast.html;

import java.util.Collections;

public class HtmlCdataNode extends HtmlBaseNode {
    private final String content;
    private final int line;

    public HtmlCdataNode(String content, int line) {
        this.content = content;
        this.line = line;
    }

    @Override
    public int getLine() { return line; }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "HtmlCdataNode: <![CDATA[" + content + "]]>\n";
    }

    @Override
    public String generateCode() {
        return "<![CDATA[" + content + "]]>";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
