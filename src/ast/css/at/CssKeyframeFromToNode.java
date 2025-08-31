package ast.css.at;

public class CssKeyframeFromToNode extends CssKeyframeSelectorNode {
    private final String ident; // "from" or "to" (per grammar, IDENTIFIER)

    public CssKeyframeFromToNode(String ident, int line) {
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
        return indent(level) + "CssKeyframeFromTo(" + ident + ")";
    }
}
