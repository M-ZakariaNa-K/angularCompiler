package ast.css.expr;

public class CssLinearTermNode extends CssTermNode {
    public CssLinearTermNode(int line) { super(line); }
    @Override public String generateCode() { return "linear"; }
    @Override public String toString(int level) { return indent(level) + "CssLinearTerm(linear)"; }
}
