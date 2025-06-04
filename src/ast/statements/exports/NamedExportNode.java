package ast.statements.exports;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class NamedExportNode extends ExportStatementNode {
    private final List<String> identifiers;
    private final int line;

    public NamedExportNode(List<String> identifiers,int line) {
        this.identifiers = identifiers;
        this.line = line;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String getSymbolName() {
        return "NamedExport";
    }

    @Override
    public String generateCode() {
        return  "export { " + String.join(", ", identifiers) + " };";
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
        sb.append(indent).append("NamedExportNode\n");

        if (!identifiers.isEmpty()) {
            sb.append(indent).append("  Identifiers:\n");
            for (String id : identifiers) {
                sb.append(indent).append("    ").append(id).append("\n");
            }
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
