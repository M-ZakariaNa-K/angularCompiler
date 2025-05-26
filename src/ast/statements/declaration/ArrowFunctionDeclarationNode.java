package ast.statements.declaration;

import ast.ASTNode;
import ast.expressions.functions.ArrowFunctionNode;
import ast.modifiers.FunctionDeclarationKind;

import java.util.Collections;
import java.util.List;

public class ArrowFunctionDeclarationNode extends FunctionDeclarationNode {
    private final FunctionDeclarationKind declarationKind; // LET, VAR, CONST or null
    private final String identifier;
    private final ArrowFunctionNode arrowFunction;
    private final int line;

    public ArrowFunctionDeclarationNode(FunctionDeclarationKind declarationKind, String identifier, ArrowFunctionNode arrowFunction, int line) {
        this.declarationKind = declarationKind;
        this.identifier = identifier;
        this.arrowFunction = arrowFunction;
        this.line = line;
    }

    public FunctionDeclarationKind getDeclarationKind() {
        return declarationKind;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ArrowFunctionNode getArrowFunction() {
        return arrowFunction;
    }

    @Override
    public String getSymbolName() {
        return identifier;
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        if (declarationKind != null) {
            sb.append(declarationKind.name().toLowerCase()).append(" ");
        }
        sb.append(identifier).append(" = ").append(arrowFunction.generateCode()).append(";");
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(arrowFunction);
    }

    @Override
    public String toString() {
        return "ArrowFunctionDeclarationNode(" + identifier + ") at line " + line;
    }
}
