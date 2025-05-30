package ast.statements.imports;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class SideEffectImportNode extends ImportStatementNode{
    private final String modulePath;
    private final int line;

    public SideEffectImportNode(String modulePath,int line) {
        this.modulePath = modulePath;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "SideEffectImport";
    }

    @Override
    public String generateCode() {
        return "import " + modulePath + ";";
    }

    @Override
    public int getLine() {
        return line;
    }

    public String getModulePath() {
        return modulePath;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "sideEffectImport(module path=" + modulePath + ", line=" + line + ")";
    }

}
