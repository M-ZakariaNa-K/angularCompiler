package ast.css.expr;

public class CssEaseOutTermNode extends CssTermNode {
    public CssEaseOutTermNode(int line) { super(line); }
    @Override public String generateCode() { return "ease-out"; }
    @Override public String toString(int level) { return indent(level) + "CssEaseOutTerm(ease-out)"; }
}
