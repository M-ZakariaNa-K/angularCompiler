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

    public String getValue() {
        return value;
    }

    @Override
    public String getSymbolName() {
        return "SelectorProperty";
    }

    @Override
    public String generateCode() {
        return "selector: \"" + value + "\"";
    }

    @Override
    public List<ASTNode> getChildren() {
        return  Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent)
                .append("SelectorPropertyNode: \"")
                .append(value)
                .append("\" at line ")
                .append(getLine())
                .append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}

