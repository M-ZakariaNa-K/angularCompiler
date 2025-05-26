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
        return "DefaultImportNode";
    }

    @Override
    public String generateCode() {
        return "import " + identifier + " from " + modulePath + ";";
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
    public String toString() {
        return "DefaultImportNode(identifier=" + identifier + ", module path=" + modulePath +   ", line=" + line + ")";
    }

}
