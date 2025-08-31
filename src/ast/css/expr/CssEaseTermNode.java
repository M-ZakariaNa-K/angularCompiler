package ast.css.expr;

public class CssEaseTermNode extends CssTermNode {
    public CssEaseTermNode(int line) { super(line); }
    @Override public String generateCode() { return "ease"; }
    @Override public String toString(int level) { return indent(level) + "CssEaseTerm(ease)"; }
}
