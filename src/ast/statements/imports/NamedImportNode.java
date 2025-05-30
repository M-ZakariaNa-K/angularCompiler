package ast.statements.imports;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class NamedImportNode extends ImportStatementNode{
    private final List<String> identifiers;
    private final String modulePath;
    private final int line;

    public NamedImportNode(List<String> identifiers, String modulePath,int line) {
        this.identifiers = identifiers;
        this.modulePath = modulePath;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "NamedImport";
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public String getModulePath() {
        return modulePath;
    }

    @Override
    public String generateCode() {
        return "import { " + String.join(", ", identifiers) + " }" + " from " + modulePath + ";";
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
        return "NamedImportNode(identifier={" + String.join(", ", identifiers) + "}, module path=" + modulePath +   ", line=" + line + ")";
    }
}
