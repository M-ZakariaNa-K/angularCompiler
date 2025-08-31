package ast.statements.declaration.enums;

import ast.ASTNode;
import ast.statements.StatementNode;
import ast.statements.declaration.DeclarationNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumDefinitionNode extends StatementNode {

    private final String name;
    private final EnumValuesNode values;
    private final int line;

    public EnumDefinitionNode(String name, EnumValuesNode values, int line) {
        this.name = name;
        this.values = values;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public EnumValuesNode getValues() {
        return values;
    }

    @Override
    public String getSymbolName() {
        return "EnumDefinition";
    }

    @Override
    public String generateCode() {
        StringBuilder code = new StringBuilder();
        code.append("const ").append(name).append(" = {};\n");
        if (values != null && !values.getValues().isEmpty()) {
            for (EnumValueNode value : values.getValues()) {
                String valCode = value.getValue() != null ? value.getValue().generateCode() : "\"" + value.getName() + "\"";
                code.append(name).append("[\"").append(value.getName()).append("\"] = ").append(valCode).append(";\n");
            }
        }
        return code.toString();
    }



    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(values);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("EnumDefinitionNode: ").append(name).append("\n");
        sb.append(values.toString(level + 1));
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
