package ast.statements.controlFlow;

import ast.ASTNode;
import ast.statements.StatementNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConditionalStatementNode extends StatementNode {

    private final IfStatementNode ifBranch;
    private final List<IfStatementNode> elseIfBranches;
    private final ElseStatementNode elseBranch;
    private final int line;

    public ConditionalStatementNode(IfStatementNode ifBranch, List<IfStatementNode> elseIfBranches, ElseStatementNode elseBranch, int line) {
        this.ifBranch = ifBranch;
        this.elseIfBranches = elseIfBranches;
        this.elseBranch = elseBranch;
        this.line = line;
    }

    public IfStatementNode getIfBranch() {
        return ifBranch;
    }

    public List<IfStatementNode> getElseIfBranches() {
        return elseIfBranches;
    }

    public ElseStatementNode getElseBranch() {
        return elseBranch;
    }

    @Override
    public String getSymbolName() {
        return "ConditionalStatement";
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
        List<ASTNode> children = new ArrayList<>();
        children.add(ifBranch);
        children.addAll(elseIfBranches);
        if (elseBranch != null) {
            children.add(elseBranch);
        }
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ConditionalStatementNode\n");

        sb.append(ifBranch.toString(level + 1));

        for (IfStatementNode elseIf : elseIfBranches) {
            sb.append(elseIf.toString(level + 1));
        }

        if (elseBranch != null) {
            sb.append(elseBranch.toString(level + 1));
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
