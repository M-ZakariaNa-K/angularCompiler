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
    public String toString() {
        return "Selector(" + value + ")";
    }
}

