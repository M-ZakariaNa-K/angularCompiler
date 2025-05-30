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
    public String toString() {
        return "TemplateUrl(" + value + ")";
    }
}

