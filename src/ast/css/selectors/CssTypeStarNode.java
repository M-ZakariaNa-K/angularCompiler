package ast.css.selectors;

public class CssTypeStarNode extends CssTypeSelectorNode {
    public CssTypeStarNode(int line) { super(line); }

    @Override
    public String generateCode() { return "*"; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssTypeStar(*)";
    }
}
