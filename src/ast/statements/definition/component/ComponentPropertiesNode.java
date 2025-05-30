package ast.statements.definition.component;

import ast.ASTNode;
import ast.statements.definition.component.property.ComponentPropertyNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComponentPropertiesNode implements ASTNode {
    private final List<ComponentPropertyNode> properties;
    private final int line;

    public ComponentPropertiesNode(List<ComponentPropertyNode> properties, int line) {
        this.properties = properties;
        this.line = line;
    }

    public List<ComponentPropertyNode> getProperties() {
        return properties;
    }

    @Override
    public String getSymbolName() {
        return "ComponentProperties";
    }

    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < properties.size(); i++) {
            builder.append(properties.get(i).generateCode());
            if (i < properties.size() - 1) {
                builder.append(",\n");
            }
        }
        return builder.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(properties);
    }

    @Override
    public String toString() {
        return "ComponentProperties(" + properties.size() + ")";
    }
}
