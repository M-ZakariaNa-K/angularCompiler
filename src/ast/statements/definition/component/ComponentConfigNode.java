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

    @Override
    public String getSymbolName() {
        return "ComponentConfig";
    }

    @Override
    public String generateCode() {
        return properties.generateCode();
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
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ComponentConfigNode at line ").append(line).append("\n");
        if (properties != null) {
            sb.append(properties.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
