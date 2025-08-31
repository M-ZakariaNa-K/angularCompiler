package ast.css.expr;

public class CssNumberTermNode extends CssTermNode {
    private final String text;

    public CssNumberTermNode(String text, int line) {
        super(line);
        this.text = text;
    }

    @Override public String generateCode() { return text; }
    @Override public String toString(int level) { return indent(level) + "CssNumberTerm(" + text + ")"; }
}
