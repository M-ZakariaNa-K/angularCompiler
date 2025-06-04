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
        return "DotAssignmentNode(" + identifier + ")";
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "DotAssignmentNode: " + identifier + "\n";
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
