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
}
