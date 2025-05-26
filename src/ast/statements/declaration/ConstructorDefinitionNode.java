package ast.statements.declaration;

import ast.ASTNode;
import ast.BlockNode;
import ast.parameters.ParameterNode;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ConstructorDefinitionNode extends FunctionDeclarationNode {
    private final List<ParameterNode> parameters;
    private final BlockNode body;
    private final int line;

    public ConstructorDefinitionNode(List<ParameterNode> parameters, BlockNode body, int line) {
        this.parameters = parameters;
        this.body = body;
        this.line = line;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public BlockNode getBody() {
        return body;
    }

    @Override
    public String getSymbolName() {
        return "constructor";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder("constructor(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generateCode());
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(") ").append(body.generateCode());
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return parameters.isEmpty() ?
                Collections.singletonList(body) :
                Collections.unmodifiableList(parameters);
    }

    @Override
    public String toString() {
        return "ConstructorDefinitionNode at line " + line;
    }
}
