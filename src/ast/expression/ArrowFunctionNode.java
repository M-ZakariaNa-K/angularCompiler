package ast.expression;

import ast.ASTNode;
import ast.parameters.ParameterNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrowFunctionNode extends ExpressionNode {
    private final List<ParameterNode> parameters;
    private final TypeNode returnType; // Optional
    private final ASTNode body; // Either ExpressionNode or BlockNode
    private final int line;

    public ArrowFunctionNode(List<ParameterNode> parameters, TypeNode returnType, ASTNode body, int line) {
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
        this.line = line;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public TypeNode getReturnType() {
        return returnType;
    }

    public String getReturnTypeString() {
        return returnType.getStringType();
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String getSymbolName() {
        return "ArrowFunction";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generateCode());
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        if (returnType != null) {
            sb.append(": ").append(returnType.generateCode());
        }
        sb.append(" => ");
        sb.append(body.generateCode());
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>(parameters);
        if (returnType != null) children.add(returnType);
        children.add(body);
        return children;
    }

    @Override
    public String toString() {
        return "(" + parameters.stream().map(Object::toString).collect(Collectors.joining(", ")) + ") => { ... }";
    }

}
