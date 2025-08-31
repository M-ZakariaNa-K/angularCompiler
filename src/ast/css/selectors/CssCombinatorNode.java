package ast.css.selectors;

import ast.css.CssNodeBase;

public class CssCombinatorNode extends CssNodeBase {
    public enum Type { PLUS, GREATER, TILDE }
    private final Type type;

    public CssCombinatorNode(Type type, int line) {
        super(line);
        this.type = type;
    }

    public Type getType() { return type; }

    @Override
    public String generateCode() {
        switch (type) {
            case PLUS: return "+";
            case GREATER: return ">";
            case TILDE: return "~";
            default: return "";
        }
    }

    @Override
    public String toString(int level) {
        return indent(level) + "CssCombinator(" + generateCode() + ")";
    }
}
