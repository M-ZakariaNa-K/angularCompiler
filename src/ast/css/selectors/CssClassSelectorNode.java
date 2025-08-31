package ast.css.selectors;

public class CssClassSelectorNode extends CssSimpleSelectorPartNode {
    private final String ident;

    public CssClassSelectorNode(String ident, int line) {
        super(line);
        this.ident = ident;
    }

    public String getIdent() { return ident; }

    @Override
    public String generateCode() { return "." + ident; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssClassSelector(." + ident + ")";
    }
}
