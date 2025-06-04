package ast.statements.declaration;

import ast.ASTNode;
import ast.BlockNode;
import ast.parameters.ExpressionParameterNode;
import ast.parameters.ParameterNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.List;

public class NormalFunctionDeclarationNode extends FunctionDeclarationNode {
    private final String name; // IDENTIFIER
    private final List<ExpressionParameterNode> parameterList;
    private final TypeNode type; // Optional
    private final BlockNode block;
    private final int line;

    public NormalFunctionDeclarationNode(String name, List<ExpressionParameterNode> parameterList, TypeNode type, BlockNode block, int line) {
        this.name = name;
        this.parameterList = parameterList;
        this.type = type;
        this.block = block;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "NormalFunctionDeclaration";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(name).append("(");
        for (int i = 0; i < parameterList.size(); i++) {
            sb.append(parameterList.get(i).generateCode());
            if (i < parameterList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        if (type != null) {
            sb.append(": ").append(type.generateCode());
        }
        sb.append(" ");
        sb.append(block.generateCode());
        return sb.toString();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.addAll(parameterList);
        if (type != null) {
            children.add(type);
        }
        children.add(block);
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NormalFunctionDeclarationNode(")
                .append(name)
                .append("(");

        for (int i = 0; i < parameterList.size(); i++) {
            sb.append(parameterList.get(i).toString());
            if (i < parameterList.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(")");
        if (type != null) {
            sb.append(": ").append(type.toString());
        }

        sb.append(") at line ").append(line);
        return sb.toString();
    }


    public String getName() {
        return name;
    }

    public List<ExpressionParameterNode> getParameterList() {
        return parameterList;
    }

    public BlockNode getBlock() {
        return block;
    }

    public TypeNode getType() {
        return type;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("NormalFunctionDeclarationNode: ").append(name);
        if (type != null) {
            sb.append(" : ").append(type.toString());
        }
        sb.append(" at line ").append(line).append("\n");

        if (!parameterList.isEmpty()) {
            sb.append(indent).append("  Parameters:\n");
            for (ExpressionParameterNode param : parameterList) {
                sb.append(param.toString(level + 2));
            }
        }

        if (block != null) {
            sb.append(indent).append("  Body:\n");
            sb.append(block.toString(level + 2));
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", java.util.Collections.nCopies(level, "  "));
    }

}
