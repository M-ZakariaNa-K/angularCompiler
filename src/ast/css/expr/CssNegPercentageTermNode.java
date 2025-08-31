package ast.css.expr;

public class CssNegPercentageTermNode extends CssTermNode {
    private final String number;

    public CssNegPercentageTermNode(String number, int line) {
        super(line);
        this.number = number;
    }

    @Override public String generateCode() { return "-" + number + "%"; }
    @Override public String toString(int level) { return indent(level) + "CssNegPercentageTerm(-" + number + "%)"; }
}
