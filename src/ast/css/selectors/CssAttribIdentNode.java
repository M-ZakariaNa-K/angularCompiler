package ast.css.selectors;

public class CssAttribIdentNode extends CssAttribNode {
    private final String left;
    private final String right;

    public CssAttribIdentNode(String left, String right, int line) {
        super(line);
        this.left = left;
        this.right = right;
    }

    @Override
    public String generateCode() { return "[" + left + "=" + right + "]"; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssAttribIdent([" + left + "=" + right + "])";
    }
}
