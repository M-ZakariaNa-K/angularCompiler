package ast.expression.basePrimary;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class  IdentifierNode extends BasePrimaryNode{
    private final String id;
    private final int line;

    public IdentifierNode(String id, int line) {
        this.id = id;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "Identifier";
    }

    @Override
    public String generateCode() {
        return id;
    }

    @Override
    public int getLine() {
        return line;
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(level)).append("IdentifierNode: ").append(id).append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }

}
