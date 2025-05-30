package ast.statements.assignment;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class DotAssignmentNode extends AssignmentToNode {

    private final String identifier; // after 'this.'
    private final int line;

    public DotAssignmentNode(String identifier, int line) {
        this.identifier = identifier;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getSymbolName() {
        return "DotAssignment";
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
        return "DotAssignmentNode(identifier=this." + identifier + ", line=" + line + ")";
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }
}
