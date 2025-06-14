package ast.statements.assignment;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentStatementNode extends StatementNode {

    private final List<AssignmentToNode> targets; // includes dot chaining
    private final ExpressionNode expression;
    private final int line;

    public AssignmentStatementNode(List<AssignmentToNode> targets, ExpressionNode expression, int line) {
        this.targets = targets;
        this.expression = expression;
        this.line = line;
    }

    public List<AssignmentToNode> getTargets() {
        return targets;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String getSymbolName() {
        return "AssignmentStatement";
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
        List<ASTNode> children = new ArrayList<>(targets);
        children.add(expression);
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);

        sb.append(indent).append("AssignmentStatementNode\n");
        for (AssignmentToNode target : targets) {
            sb.append(target.toString(level + 1));
        }
        sb.append(expression.toString(level + 1));

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
