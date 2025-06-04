package ast.statements.definition;

import ast.ASTNode;
import ast.types.TypeNode;
import java.util.Collections;
import java.util.List;

public class InterfaceMemberNode implements ASTNode {
    private final String name;
    private final TypeNode type;
    private final int line;

    public InterfaceMemberNode(String name, TypeNode type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "InterfaceMember";
    }

    @Override
    public String generateCode() {
        return name + ": " + type.generateCode() + ";";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(type);
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        return indent + "InterfaceMember " + name + ": " + type.getSymbolName() + " at line " + line + "\n";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
