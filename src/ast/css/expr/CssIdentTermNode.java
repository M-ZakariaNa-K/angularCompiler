package ast.css.expr;

public class CssIdentTermNode extends CssTermNode {
    private final String ident;

    public CssIdentTermNode(String ident, int line) {
        super(line);
        this.ident = ident;
    }

    @Override public String getSymbolName() { return ident; }
    @Override public String generateCode() { return ident; }
    @Override public String toString(int level) { return indent(level) + "CssIdentTerm(" + ident + ")"; }
}
