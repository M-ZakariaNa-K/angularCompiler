package ast.css.expr;

public class CssEaseInOutTermNode extends CssTermNode {
    public CssEaseInOutTermNode(int line) { super(line); }
    @Override public String generateCode() { return "ease-in-out"; }
    @Override public String toString(int level) { return indent(level) + "CssEaseInOutTerm(ease-in-out)"; }
}
