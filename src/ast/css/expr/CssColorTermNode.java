package ast.css.expr;

public class CssColorTermNode extends CssTermNode {
    private final String hex; // without '#'? pass full text including '#'

    public CssColorTermNode(String hex, int line) {
        super(line);
        this.hex = hex;
    }

    @Override public String generateCode() { return hex; }
    @Override public String toString(int level) { return indent(level) + "CssColorTerm(" + hex + ")"; }
}
