package ast.statements.definition.component.property;

import ast.ASTNode;

public abstract class ComponentPropertyNode implements ASTNode {
    protected final int line;

    public ComponentPropertyNode(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
    }

    /**
     * The key in the component metadata object, e.g., "selector", "templateUrl"
     */
    public abstract String getKey();

    /**
     * The value in the component metadata object, e.g., "'employeeCard'" or "'./employee.html'"
     * Must include quotes for string values.
     */
    public abstract String getValue();

    /**
     * Convenience for generating JS property: key: value
     */
    public String generateCode() {
        return getKey() + ": " + getValue();
    }
}
