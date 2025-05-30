package ast.statements.declaration;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.statements.StatementNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.List;

public class ConstantDeclarationNode extends StatementNode {
    private final String identifier;
    private final TypeNode type;
    private final ExpressionNode expression;
    private final int line;

    public ConstantDeclarationNode(String identifier, TypeNode type, ExpressionNode expression, int line) {
        this.identifier = identifier;
        this.type = type;
        this.expression = expression;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "ConstantDeclaration";
    }

    @Override
    public String generateCode() {
        return "const " + identifier + ": " + type.generateCode() + " = " + expression.generateCode() + ";";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(type);
        children.add(expression);
        return children;
    }

    @Override
    public String toString() {
        return "ConstantDeclarationNode(" +
                "const " + identifier +
                (type != null ? ": " + type.toString() : "") +
                " = " + (expression != null ? expression.toString() : "null") +
                ") at line " + line;
    }


    public String getIdentifier() {
        return identifier;
    }

    public TypeNode getType() {
        return type;
    }

    public ExpressionNode getExpression() {
        return expression;
    }
}
