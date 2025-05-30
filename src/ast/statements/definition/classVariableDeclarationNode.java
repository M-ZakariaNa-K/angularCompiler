package ast.statements.definition;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.modifiers.AccessModifierNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class classVariableDeclarationNode implements ASTNode {
    private final AccessModifierNode accessModifier;
    private final TypeNode type;
    private final String  identifier;
    private final ExpressionNode expression;
    private final int line;

    public classVariableDeclarationNode(AccessModifierNode accessModifier, TypeNode type, String identifier, ExpressionNode expression,int line) {
        this.accessModifier = accessModifier;
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
        this.line = line;
    }

    public AccessModifierNode getAccessModifier() {
        return accessModifier;
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

    @Override
    public String getSymbolName() {
        return "classVariableDeclaration";
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
        children.add(type);
        if (expression != null) {
            children.add(expression);
        }
        if (accessModifier != null) {
            children.add(accessModifier);
        }

        return children;
    }

    @Override
    public String toString() {
        return "classVariableDeclarationNode(" + identifier + ") at line " + line;
    }
}
