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
        StringBuilder sb = new StringBuilder();
        for (StatementNode stmt : statements) {
            sb.append(stmt.generateCode());
            // Optionally, add a newline between statements
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(statements);    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("ProgramNode:\n");
        if (statements != null && !statements.isEmpty()) {
            for (StatementNode stmt : statements) {
                for (int i = 0; i< level; i++){
                    sb.append(" ");
                }
                sb.append(" ").append(stmt.toString(level + 1)).append("\n");
            }
        }
        return sb.toString();
    }
}
