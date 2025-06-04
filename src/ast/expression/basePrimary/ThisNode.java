package ast.expression.basePrimary;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class ThisNode extends BasePrimaryNode{
    private final String thisString = "this";
    private final int line;

    public ThisNode(int line) {
        this.line = line;
    }

    public String getThisString() {
        return thisString;
    }

    @Override
    public String getSymbolName() {
        return "this";
    }

    @Override
    public String generateCode() {
        return thisString;
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
        String indent = getIndent(level);
        sb.append(indent).append("ThisNode\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
