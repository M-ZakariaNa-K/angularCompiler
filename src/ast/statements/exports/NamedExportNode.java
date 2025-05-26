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
        return "namedExport";
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
    public String toString() {
        return "NamedExportNode(identifiers={" + String.join(", ", identifiers) + "}, line=" + line + ")";
    }

}
