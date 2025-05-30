package ast.statements.definition;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.List;
import java.util.ArrayList;

public class InterfaceDefinitionNode extends StatementNode {
    private final String name;
    private final InterfaceBodyNode members;
    private final int line;

    public InterfaceDefinitionNode(String name,InterfaceBodyNode members, int line) {
        this.name = name;
        this.members = members;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "InterfaceDefinition";
    }

    @Override
    public String generateCode() {
        StringBuilder code = new StringBuilder("interface " + name + " {\n");
            code.append("  ").append(members.generateCode()).append("\n");
        code.append("}");
        return code.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(members.getChildren());
    }

    @Override
    public String toString() {
        return "InterfaceDefinition(" + name + ")";
    }
}
