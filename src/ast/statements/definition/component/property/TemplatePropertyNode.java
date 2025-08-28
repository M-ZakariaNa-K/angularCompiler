package ast.statements.definition.component.property;

import ast.ASTNode;
import java.util.Collections;
import java.util.List;

public class TemplatePropertyNode extends ComponentPropertyNode {
    private final String templateContent;

    public TemplatePropertyNode(String templateContent, int line) {
        super(line);
        this.templateContent = templateContent;
    }

    @Override
    public String getSymbolName() {
        return "TemplateProperty";
    }

    @Override
    public String getKey() {
        return "template";
    }

    @Override
    public String getValue() {
        return templateContent;
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
        sb.append(indent).append("TemplatePropertyNode at line ").append(getLine()).append("\n");
        sb.append(indent).append("  ").append(templateContent).append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
