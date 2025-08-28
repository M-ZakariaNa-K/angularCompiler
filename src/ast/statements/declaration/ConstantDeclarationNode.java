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
        return "const " + identifier +  " = " + expression.generateCode() + ";";
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


    public String getIdentifier() {
        return identifier;
    }

    public TypeNode getType() {
        return type;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ConstantDeclarationNode: const ").append(identifier);
        if (type != null) {
            sb.append(": ").append(type.toString());
        }
        sb.append(" at line ").append(line).append("\n");
        if (expression != null) {
            sb.append(indent).append("  Initializer:\n");
            sb.append(expression.toString(level + 2));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", java.util.Collections.nCopies(level, "  "));
    }

}
