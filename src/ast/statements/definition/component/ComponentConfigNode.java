package ast.statements.definition.component;

import ast.ASTNode;
import ast.statements.definition.component.property.ComponentPropertyNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComponentConfigNode implements ASTNode {
    private final ComponentPropertiesNode properties;
    private final int line;

    public ComponentConfigNode(ComponentPropertiesNode properties, int line) {
        this.properties = properties;
        this.line = line;
    }

    public ComponentPropertiesNode getProperties() {
        return properties;
    }

    /**
     * Returns a list of property JS key/value strings for easy code generation
     */
    public List<String> getPropertyAssignments() {
        if (properties == null || properties.getProperties() == null) return Collections.emptyList();

        List<String> assignments = new ArrayList<>();
        for (ComponentPropertyNode prop : properties.getProperties()) {
            String key = prop.getKey(); // Each ComponentPropertyNode must have getKey() and getValue()
            String value = prop.getValue();
            prop.generateCode();
            assignments.add(key + " = " + value);
        }
        return assignments;
    }

    @Override
    public String getSymbolName() {
        return "ComponentConfig";
    }

    @Override
    public String generateCode() {
        List<String> assignments = getPropertyAssignments();
        if (assignments.isEmpty()) return "{}";

        StringBuilder sb = new StringBuilder("{\n");
        for (int i = 0; i < assignments.size(); i++) {
            sb.append("  ").append(assignments.get(i));
            if (i < assignments.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(properties);
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ComponentConfigNode at line ").append(line).append("\n");
        if (properties != null) sb.append(properties.toString(level + 1));
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
