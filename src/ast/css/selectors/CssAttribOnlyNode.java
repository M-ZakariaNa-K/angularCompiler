package ast.css.selectors;

public class CssAttribOnlyNode extends CssAttribNode {
    private final String ident;

    public CssAttribOnlyNode(String ident, int line) {
        super(line);
        this.ident = ident;
    }

    @Override
    public String generateCode() { return "[" + ident + "]"; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssAttribOnly([" + ident + "])";
    }
}
