package ast.html;

import java.util.Collections;

public class HtmlInterpolationNode extends HtmlBaseNode {
    private final String expression;
    private final int line;

    public HtmlInterpolationNode(String expression, int line) {
        this.expression = expression;
        this.line = line;
    }

    @Override
    public int getLine() { return line; }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "HtmlInterpolationNode: {{" + expression + "}}\n";
    }

    @Override
    public String generateCode() {
        return "{{" + expression + "}}";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
