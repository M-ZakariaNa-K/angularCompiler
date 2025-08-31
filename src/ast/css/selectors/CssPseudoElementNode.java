package ast.css.selectors;

public class CssPseudoElementNode extends CssSimpleSelectorPartNode {
    private final String name;

    public CssPseudoElementNode(String name, int line) {
        super(line);
        this.name = name;
    }

    @Override
    public String generateCode() { return "::" + name; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssPseudoElement(::" + name + ")";
    }
}
