package ast.html;

import java.util.Collections;

public class HtmlTextNode extends HtmlBaseNode {
    private final String text;
    private final int line;

    public HtmlTextNode(String text, int line) {
        this.text = text;
        this.line = line;
    }

    @Override
    public int getLine() { return line; }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "HtmlTextNode: \"" + text + "\"\n";
    }

    @Override
    public String generateCode() {
        return text;
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
