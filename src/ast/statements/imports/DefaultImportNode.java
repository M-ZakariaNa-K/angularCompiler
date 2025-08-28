package ast.statements.imports;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class DefaultImportNode extends ImportStatementNode{
    private final String identifier;
    private final String modulePath;
    private final int line;


    public DefaultImportNode(String identifier,String modulePath,int line) {
        this.identifier = identifier;
        this.modulePath = modulePath;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "DefaultImport";
    }

    @Override
    public String generateCode() {
        return "import " + identifier + " from \"" + modulePath + "\";";
    }


    @Override
    public int getLine() {
        return line;
    }

    public String getModulePath() {
        return modulePath;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("DefaultImportNode\n");
        sb.append(indent).append("  ").append(identifier).append("\n");
        sb.append(indent).append("  ").append(modulePath).append("\n");
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }



}
