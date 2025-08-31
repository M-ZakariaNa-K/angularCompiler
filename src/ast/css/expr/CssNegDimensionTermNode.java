package ast.css.expr;

public class CssNegDimensionTermNode extends CssTermNode {
    private final String number; // "10"
    private final String unit;   // "px"

    public CssNegDimensionTermNode(String number, String unit, int line) {
        super(line);
        this.number = number;
        this.unit = unit;
    }

    @Override public String generateCode() { return "-" + number + unit; }
    @Override public String toString(int level) { return indent(level) + "CssNegDimensionTerm(-" + number + unit + ")"; }
}
