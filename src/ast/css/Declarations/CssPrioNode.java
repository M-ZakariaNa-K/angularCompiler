package ast.css.Declarations;

import ast.css.CssNodeBase;

public class CssPrioNode extends CssNodeBase {
    public CssPrioNode(int line) { super(line); }

    @Override
    public String getSymbolName() { return "important"; }

    @Override
    public String generateCode() { return "!important"; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssPrio(!important)";
    }
}
