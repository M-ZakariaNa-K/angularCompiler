package ast;

import ast.statements.StatementNode;

import java.util.List;
import java.util.ArrayList;

public class BlockNode implements ASTNode {
    private final List<StatementNode> statements;
    private final int line;

    public BlockNode(List<StatementNode> statements,int line) {
        this.statements = statements;
        this.line = line;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public String getSymbolName() {
        return "BlockNode";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (StatementNode stmt : statements) {
            sb.append(stmt.generateCode()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(statements);
    }

    @Override
    public String toString() {
        return getSymbolName() + " at line " + line;
    }
}
