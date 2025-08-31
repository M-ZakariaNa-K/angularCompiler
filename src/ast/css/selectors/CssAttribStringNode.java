package ast.css.selectors;

public class CssAttribStringNode extends CssAttribNode {
    private final String left;
    private final String str; // includes quotes or raw? store raw value; generator will quote

    public CssAttribStringNode(String left, String str, int line) {
        super(line);
        this.left = left;
        this.str = str;
    }

    @Override
    public String generateCode() { return "[" + left + "=\"" + str + "\"]"; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssAttribString([" + left + "=\"" + str + "\"])";
    }
}
