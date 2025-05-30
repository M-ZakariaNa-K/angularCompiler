package ast.statements.controlFlow;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.Arrays;
import java.util.List;

public class IfStatementNode extends StatementNode {
    private final ExpressionNode condition;
    private final ASTNode body;
    private final int line;

    public IfStatementNode(ExpressionNode condition, ASTNode body, int line) {
        this.condition = condition;
        this.body = body;
        this.line = line;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String getSymbolName() {
        return "IfStatement";
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
        return Arrays.asList(condition, body);
    }
}
