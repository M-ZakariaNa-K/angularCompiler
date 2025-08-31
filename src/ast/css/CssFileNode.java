package ast.css;

import ast.ASTNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssFileNode extends CssNodeBase {
    private final List<CssStatementNode> statements;

    public CssFileNode(List<CssStatementNode> statements, int line) {
        super(line);
        this.statements = statements == null ? Collections.<CssStatementNode>emptyList() : statements;
    }

    public List<CssStatementNode> getStatements() { return statements; }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssFile\n");
        for (ASTNode st : statements) {
            sb.append(st.toString(level + 1)).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(statements);
    }
}
