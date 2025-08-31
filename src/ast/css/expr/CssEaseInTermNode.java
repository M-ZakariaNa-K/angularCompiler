package ast.css.expr;

public class CssEaseInTermNode extends CssTermNode {
    public CssEaseInTermNode(int line) { super(line); }
    @Override public String generateCode() { return "ease-in"; }
    @Override public String toString(int level) { return indent(level) + "CssEaseInTerm(ease-in)"; }
}
