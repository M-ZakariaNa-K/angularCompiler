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
      return "";
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
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ComponentPropertiesNode at line ").append(line).append("\n");
        for (ComponentPropertyNode property : properties) {
            sb.append(property.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
