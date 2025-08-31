package ast.html;

import java.util.Collections;

public class HtmlAttributeNode extends HtmlBaseNode {
    private final String name;
    private final String value;
    private final int line;

    public HtmlAttributeNode(String name, String value, int line) {
        this.name = name;
        this.value = value;
        this.line = line;
    }

    public String getValue() {
        return this.value;
    }
    @Override
    public int getLine() { return line; }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "HtmlAttributeNode: " + name + "=\"" + value + "\"\n";
    }

    @Override
    public String generateCode() {
        if (value == null || value.isEmpty()) return name;
        return name + "=\"" + value + "\"";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
