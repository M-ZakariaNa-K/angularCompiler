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
}
