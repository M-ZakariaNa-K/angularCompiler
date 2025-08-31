package ast.css.Declarations;

public class CssPropertyIdentNode extends CssPropertyNode {
    private final String name;

    public CssPropertyIdentNode(String name, int line) {
        super(line);
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String getSymbolName() { return name; }

    @Override
    public String generateCode() { return name; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssPropertyIdent(" + name + ")";
    }
}
