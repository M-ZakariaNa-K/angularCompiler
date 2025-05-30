package ast.statements.controlFlow;

import ast.ASTNode;
import ast.BlockNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhileStatementNode extends StatementNode {

    private final ExpressionNode condition;
    private final ASTNode body;
    private final int line;

    public WhileStatementNode(ExpressionNode condition, ASTNode body, int line) {
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
        return "WhileStatement";
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
        children.add(condition);
        children.add(body);
        return Collections.unmodifiableList(children);
    }
}
