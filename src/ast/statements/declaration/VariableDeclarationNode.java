package ast.statements.declaration;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.modifiers.VariableDeclarationKind;
import ast.statements.StatementNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VariableDeclarationNode extends StatementNode {
    private final TypeNode type;
    private final String identifier;
    private final int line;
    private final ExpressionNode expression; // Can be null
    private final VariableDeclarationKind declarationKind;

    public VariableDeclarationNode(TypeNode type, String identifier, int line,
                                   ExpressionNode expression, VariableDeclarationKind declarationKind) {
        this.type = type;
        this.identifier = identifier;
        this.line = line;
        this.expression = expression;
        this.declarationKind = declarationKind;
    }

    @Override
    public String getSymbolName() {
        return "variableDeclaration";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(declarationKind.toString().toLowerCase()).append(" ");
        sb.append(identifier).append(": ").append(type.generateCode());
        if (expression != null) {
            sb.append(" = ").append(expression.generateCode());
        }
        sb.append(";");
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(type);
        if (expression != null) {
            children.add(expression);
        }
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VariableDeclarationNode at line : " + line + "\n");
        sb
            .append("  ").append(type.toString()).append("\n");

        return sb.toString();
    }

    public TypeNode getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public VariableDeclarationKind getDeclarationKind() {
        return declarationKind;
    }
}
