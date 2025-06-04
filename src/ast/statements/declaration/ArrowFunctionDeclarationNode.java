package ast.statements.declaration;

import ast.ASTNode;
import ast.expression.ArrowFunctionNode;
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
        return "ArrowFunctionDeclaration";
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


    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ArrowFunctionDeclarationNode: ").append(identifier);
        if (declarationKind != null) {
            sb.append(" [").append(declarationKind.name()).append("]");
        }
        sb.append(" at line ").append(line).append("\n");
        if (arrowFunction != null) {
            sb.append(arrowFunction.toString(level + 1));
        }
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
