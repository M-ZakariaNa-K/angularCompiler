package ast.statements.assignment;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.Collections;
import java.util.List;

public class ArrAssignmentNode extends AssignmentToNode {

    private final String identifier;
    private final ExpressionNode indexExpression;
    private final int line;

    public ArrAssignmentNode(String identifier, ExpressionNode indexExpression, int line) {
        this.identifier = identifier;
        this.indexExpression = indexExpression;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionNode getIndexExpression() {
        return indexExpression;
    }

    @Override
    public String getSymbolName() {
        return "ArrAssignment";
    }

    @Override
    public String generateCode() {
        return identifier + "[" + indexExpression.generateCode() + "]";
    }


    @Override
    public int getLine() {
        return line;
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(indexExpression);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);

        sb.append(indent).append("ArrAssignmentNode [identifier=").append(identifier).append("]\n");
        sb.append(indexExpression.toString(level + 1));

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
