package ast;

import ast.statements.StatementNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramNode implements ASTNode {
    private final List<StatementNode> statements;
    private final int line;

    public ProgramNode(int line) {
        this.statements = new ArrayList<>();
        this.line = line;
    }

    public void addStatement(StatementNode statement) {
        if (statement != null) {
            this.statements.add(statement);
        }
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public String getSymbolName() {
        return "Program";
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(statements);    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProgramNode:\n");
        for (StatementNode stmt : statements) {
            sb.append("  ").append(stmt).append("\n");
        }
        return sb.toString();
    }
}
