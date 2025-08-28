package ast.statements.definition.component.property;

import ast.ASTNode;
import java.util.Collections;
import java.util.List;

public class TemplateUrlPropertyNode extends ComponentPropertyNode {
    private final String value;

    public TemplateUrlPropertyNode(String value, int line) {
        super(line);
        this.value = value;
    }

    @Override
    public String getSymbolName() {
        return "TemplateUrlProperty";
    }

    @Override
    public String getKey() {
        return "templateUrl";
    }

    @Override
    public String getValue() {
        return value;
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
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TemplateUrlPropertyNode at line ").append(getLine()).append("\n");
        sb.append(indent).append("  ").append(value).append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
