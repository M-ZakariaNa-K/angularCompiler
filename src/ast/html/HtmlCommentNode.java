package ast.html;

import java.util.Collections;

public class HtmlCommentNode extends HtmlBaseNode {
    private final String comment;
    private final int line;

    public HtmlCommentNode(String comment, int line) {
        this.comment = comment;
        this.line = line;
    }

    @Override
    public int getLine() { return line; }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "HtmlCommentNode: <!--" + comment + "-->\n";
    }

    @Override
    public String generateCode() {
        return "<!--" + comment + "-->";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
