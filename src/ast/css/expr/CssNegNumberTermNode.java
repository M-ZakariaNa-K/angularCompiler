package ast.css.expr;

public class CssNegNumberTermNode extends CssTermNode {
    private final String text; // includes leading '-'

    public CssNegNumberTermNode(String text, int line) {
        super(line);
        this.text = text;
    }

    @Override public String generateCode() { return text; }
    @Override public String toString(int level) { return indent(level) + "CssNegNumberTerm(" + text + ")"; }
}
