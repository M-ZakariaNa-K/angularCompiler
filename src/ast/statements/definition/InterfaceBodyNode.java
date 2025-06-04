package ast.statements.definition;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class InterfaceBodyNode implements ASTNode {
    private final List<InterfaceMemberNode> members;
    private final int line;

    public InterfaceBodyNode(List<InterfaceMemberNode> members, int line) {
        this.members = members;
        this.line = line;
    }

    public List<InterfaceMemberNode> getMembers() {
        return members;
    }

    @Override
    public String getSymbolName() {
        return "InterfaceBody"; // Not a named symbol itself
    }

    @Override
    public String generateCode() {
        StringBuilder code = new StringBuilder();
        for (InterfaceMemberNode member : members) {
            code.append("  ").append(member.generateCode()).append("\n");
        }
        return code.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(members);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("InterfaceBody at line ").append(line).append(":\n");
        for (InterfaceMemberNode member : members) {
            sb.append(member.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
