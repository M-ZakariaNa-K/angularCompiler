package ast.css.expr;

public class CssUrlTermNode extends CssTermNode {
    private final String inside; // raw inside url(...)

    public CssUrlTermNode(String inside, int line) {
        super(line);
        this.inside = inside;
    }

    @Override public String generateCode() { return "url(" + inside + ")"; }
    @Override public String toString(int level) { return indent(level) + "CssUrlTerm(url(" + inside + "))"; }
}
