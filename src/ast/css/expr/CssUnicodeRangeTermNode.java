package ast.css.expr;

public class CssUnicodeRangeTermNode extends CssTermNode {
    private final String text; // e.g., "U+00A0-00FF"

    public CssUnicodeRangeTermNode(String text, int line) {
        super(line);
        this.text = text;
    }

    @Override public String generateCode() { return text; }
    @Override public String toString(int level) { return indent(level) + "CssUnicodeRangeTerm(" + text + ")"; }
}
