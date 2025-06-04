package ast.statements.exports;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class DefaultExportNode extends ExportStatementNode {
    private final String identifier;
    private final  int line;

    public DefaultExportNode(String identifier,int line) {
        this.identifier = identifier;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getSymbolName() {
        return "DefaultExport";
    }

    @Override
    public String generateCode() {
        return "export default " + identifier;
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
        String indent = getIndent(level);
        return indent + "DefaultExport " + identifier + "\n";
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
