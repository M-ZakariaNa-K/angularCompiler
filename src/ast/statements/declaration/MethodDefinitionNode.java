package ast.statements.declaration;

import ast.ASTNode;
import ast.BlockNode;
import ast.parameters.ParameterNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodDefinitionNode extends DeclarationNode {
    private final String methodName;
    private final List<ParameterNode> parameters;
    private final TypeNode returnType; // can be null
    private final BlockNode block;
    private final int line;

    public MethodDefinitionNode(String methodName, List<ParameterNode> parameters, TypeNode returnType,
                                BlockNode block, int line) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
        this.line = line;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public TypeNode getReturnType() {
        return returnType;
    }

    public BlockNode getBlock() {
        return block;
    }

    @Override
    public String getSymbolName() {
        return methodName;
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(methodName).append("(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generateCode());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        sb.append(")");
        if (returnType != null) {
            sb.append(": ").append(returnType.generateCode());
        }
        sb.append(" ").append(block.generateCode());
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
        children.add(block);
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString() {
        return "MethodDefinitionNode(" + methodName + ") at line " + line;
    }
}
