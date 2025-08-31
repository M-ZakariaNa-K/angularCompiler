package ast.css.expr;

public class CssDimensionTermNode extends CssTermNode {
    private final String number; // e.g. "10"
    private final String unit;   // e.g. "px"

    public CssDimensionTermNode(String number, String unit, int line) {
        super(line);
        this.number = number;
        this.unit = unit;
    }

    @Override public String generateCode() { return number + unit; }
    @Override public String toString(int level) { return indent(level) + "CssDimensionTerm(" + number + unit + ")"; }
}
