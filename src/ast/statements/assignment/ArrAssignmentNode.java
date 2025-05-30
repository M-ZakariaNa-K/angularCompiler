package ast.statements.assignment;

import ast.ASTNode;
import ast.expression.ExpressionNode;

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
        return "";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return "ArrAssignmentNode(identifier=" + identifier +
                ", index=" + indexExpression +
                ", line=" + line + ")";
    }


    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(indexExpression);
    }
}
