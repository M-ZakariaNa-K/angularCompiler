package ast.statements.definition.component.property;

import ast.ASTNode;
import java.util.Collections;
import java.util.List;

public class SelectorPropertyNode extends ComponentPropertyNode {
    private final String value;

    public SelectorPropertyNode(String value, int line) {
        super(line);
        this.value = value;
    }

    @Override
    public String getKey() {
        return "selector";
    }

    @Override
    public String getValue() {
        return "\"" + value + "\""; // wrap in quotes for JS
    }

    @Override
    public String getSymbolName() {
        return "SelectorProperty";
    }

    @Override
    public String generateCode() {
        return getKey() + ": " + getValue();
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "SelectorPropertyNode: \"" + value + "\" at line " + getLine() + "\n";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
