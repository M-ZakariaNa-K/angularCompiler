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
        return "";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(values);
    }

}
