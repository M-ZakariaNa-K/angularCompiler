package ast.statements.assignment;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class IdAssignmentNode extends AssignmentToNode {

    private final String identifier;
    private final int line;

    public IdAssignmentNode(String identifier, int line) {
        this.identifier = identifier;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getSymbolName() {
        return "IdAssignment";
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
    public String toString() {
        return "IdAssignmentNode(identifier=" + identifier + ", line=" + line + ")";
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }
}
