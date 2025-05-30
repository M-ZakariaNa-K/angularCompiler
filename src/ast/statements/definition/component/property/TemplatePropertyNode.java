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
    public String generateCode() {
        return "template: " + templateContent;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Template(" + templateContent + ")";
    }
}

