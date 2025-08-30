package ast.statements.declaration;

import ast.ASTNode;
import ast.BlockNode;
import ast.parameters.ParameterListNode;
import ast.parameters.ParameterNode;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ConstructorDefinitionNode extends FunctionDeclarationNode {
    private final ParameterListNode parameters;
    private final BlockNode body;
    private final int line;

    public ConstructorDefinitionNode(ParameterListNode parameters, BlockNode body, int line) {
        this.parameters = parameters;
        this.body = body;
        this.line = line;
    }

    public ParameterListNode getParameters() {
        return parameters;
    }

    public BlockNode getBody() {
        return body;
    }

    @Override
    public String getSymbolName() {
        return "ConstructorDefinition";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        // Constructor keyword
        sb.append("constructor(");

        // Parameters (if any)
        if (parameters != null) {
            sb.append(parameters.generateCode());
        }

        sb.append(") ");

        // Body (if any)
        if (body != null) {
            sb.append(body.generateCode());
        } else {
            sb.append("{}");
        }

        return sb.toString();
    }


    @Override
    public int getLine() {
        return line;
    }


    @Override
    public List<ASTNode> getChildren() {
        if (parameters == null && body == null) {
            return Collections.emptyList();
        } else if (parameters == null) {
            return Collections.singletonList(body);
        } else if (body == null) {
            return Collections.singletonList(parameters);
        } else {
            return java.util.Arrays.asList(parameters, body);
        }
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ConstructorDefinitionNode at line ").append(line).append("\n");
        if (parameters != null) {
            sb.append(indent).append("  Parameters:\n");
            sb.append(parameters.toString(level + 2));
        }
        if (body != null) {
            sb.append(indent).append("  Body:\n");
            sb.append(body.toString(level + 2));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
