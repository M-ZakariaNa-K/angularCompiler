package ast.css.expr;

public class CssStringTermNode extends CssTermNode {
    private final String value; // raw without quotes
    private final char quote;   // '"' or '\''

    public CssStringTermNode(String value, char quote, int line) {
        super(line);
        this.value = value;
        this.quote = quote;
    }

    @Override public String generateCode() { return quote + value + quote; }
    @Override public String toString(int level) { return indent(level) + "CssStringTerm(" + quote + value + quote + ")"; }
}
