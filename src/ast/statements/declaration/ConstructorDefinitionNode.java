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
       return "constructor " + parameters.toString();
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
    public String toString() {
        return "ConstructorDefinitionNode at line " + line;
    }
}
