package ast.css.selectors;

public class CssTypeIdentNode extends CssTypeSelectorNode {
    private final String ident;

    public CssTypeIdentNode(String ident, int line) {
        super(line);
        this.ident = ident;
    }

    public String getIdent() { return ident; }

    @Override
    public String getSymbolName() { return ident; }

    @Override
    public String generateCode() { return ident; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssTypeIdent(" + ident + ")";
    }
}
