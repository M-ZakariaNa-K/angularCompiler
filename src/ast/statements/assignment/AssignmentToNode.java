package ast.statements.assignment;

import ast.ASTNode;

public abstract class AssignmentToNode implements ASTNode {
    public abstract String getIdentifier();

    public abstract int getLine();
}
