package ast.css.Declarations;

public class CssPropertyCssVarNode extends CssPropertyNode {
    private final String name; // identifier after "--"

    public CssPropertyCssVarNode(String name, int line) {
        super(line);
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String getSymbolName() { return "--" + name; }

    @Override
    public String generateCode() { return "--" + name; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssPropertyCssVar(--" + name + ")";
    }
}
