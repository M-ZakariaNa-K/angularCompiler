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
    public String toString() {
        StringBuilder sb = new StringBuilder("AssignmentStatementNode(line=");
        sb.append(line).append(", targets=[");

        for (int i = 0; i < targets.size(); i++) {
            sb.append(targets.get(i).toString());
            if (i < targets.size() - 1) {
                sb.append(".");
            }
        }

        sb.append("], expression=");
        sb.append(expression);
        sb.append(")");

        return sb.toString();
    }


    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>(targets);
        children.add(expression);
        return Collections.unmodifiableList(children);
    }
}
