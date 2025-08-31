package ast.css.expr;

public class CssPercentageTermNode extends CssTermNode {
    private final String number;

    public CssPercentageTermNode(String number, int line) {
        super(line);
        this.number = number;
    }

    @Override public String generateCode() { return number + "%"; }
    @Override public String toString(int level) { return indent(level) + "CssPercentageTerm(" + number + "%)"; }
}
