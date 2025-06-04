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
    public String generateCode() {
        return "templateUrl: \"" + value + "\"";
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("TemplateUrlPropertyNode at line ").append(getLine()).append("\n");
        sb.append(indent).append("  ").append("\"").append(value).append("\"").append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}

