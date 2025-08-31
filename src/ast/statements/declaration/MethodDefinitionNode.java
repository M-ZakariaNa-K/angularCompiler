package ast.statements.declaration;

import ast.ASTNode;
import ast.BlockNode;
import ast.parameters.ParameterListNode;
import ast.parameters.ParameterNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodDefinitionNode extends DeclarationNode {
    private final String methodName;
    private final ParameterListNode parameters;
    private final TypeNode returnType; // can be null
    private final BlockNode block;
    private final int line;

    public MethodDefinitionNode(String methodName, ParameterListNode parameters, TypeNode returnType,
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

    public ParameterListNode getParameters() {
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
        return "MethodDefinition";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(methodName);
        if (parameters != null) {
            sb.append(parameters.generateCode());
        }
        // Method body
        if (block != null) {
            sb.append(block.generateCode());
        } else {
            sb.append("{}"); // empty body
        }

        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (parameters != null) {
            children.add(parameters);
        }
        if (returnType != null) {
            children.add(returnType);
        }
        if (block != null) {
            children.add(block);
        }
        return children;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("MethodDefinitionNode: ").append(methodName);
        if (returnType != null) {
            sb.append(" : ").append(returnType.toString());
        }
        sb.append(" at line ").append(line).append("\n");

        if (parameters != null) {
            sb.append(indent).append("  Parameters:\n");
            sb.append(parameters.toString(level + 2));
        }

        if (block != null) {
            sb.append(indent).append("  Body:\n");
            sb.append(block.toString(level + 2));
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }


}
