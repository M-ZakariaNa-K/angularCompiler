package ast.statements.definition;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.Collections;
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


        // Option 2: emit JSDoc for documentation

        return "/**\n * @interface " + name + "\n */\n" + "const " + name + " = {};\n";
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
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("InterfaceDefinition ").append(name)
                .append(" at line ").append(line).append(":\n");
        sb.append(members.toString(level + 1));
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
