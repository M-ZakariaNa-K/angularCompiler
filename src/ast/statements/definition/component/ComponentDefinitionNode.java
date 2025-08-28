package ast.statements.definition.component;

import ast.ASTNode;
import ast.statements.StatementNode;
import ast.statements.definition.ClassBodyNode;
import ast.statements.definition.component.property.ComponentPropertyNode;
import ast.statements.inheritance.ExtendsStatementNode;
import ast.statements.inheritance.ImplementsStatementNode;

import java.util.List;
import java.util.ArrayList;

public class ComponentDefinitionNode extends StatementNode {
    private final ComponentConfigNode componentConfigNode;
    private final String className;
    private final ExtendsStatementNode extendsStatement; // can be null
    private final ImplementsStatementNode implementsStatements;
    private final ClassBodyNode classBody;
    private final int line;
    private final boolean isExported;

    public ComponentDefinitionNode(
            ComponentConfigNode componentConfigNode, String className,
           ExtendsStatementNode extendsStatement, ImplementsStatementNode implementsStatements,
           ClassBodyNode classBody,
           int line,
            boolean isExported
    ) {
        this.componentConfigNode = componentConfigNode;
        this.className = className;
        this.extendsStatement = extendsStatement;
        this.implementsStatements = implementsStatements;
        this.classBody = classBody;
        this.line = line;
        this.isExported = isExported;
    }

    @Override
    public String getSymbolName() {
        return "ComponentDefinition";
    }

    @Override
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Export if needed
        if (isExported) {
            code.append("export ");
        }

        // Class declaration
        code.append("class ").append(className);
        if (extendsStatement != null) {
            String parent = extendsStatement.generateCode();
            if (!parent.isEmpty()) code.append(" ").append(parent);
        }
        code.append(" {\n");

        // Class body members
        if (classBody != null) {
            String bodyCode = classBody.generateCode();
            if (bodyCode != null && !bodyCode.isEmpty()) {
                for (String line : bodyCode.split("\n")) {
                    code.append("  ").append(line).append("\n");
                }
            }
        }
        code.append("}\n");

        // Attach component metadata as static fields
        if (componentConfigNode != null) {
            for (String assignment : componentConfigNode.getPropertyAssignments()) {
                code.append(className).append(".").append(assignment).append(";\n");
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
        List<ASTNode> children = new ArrayList<>();
        children.add(componentConfigNode);
        if (extendsStatement != null) children.add(extendsStatement);
        children.add(implementsStatements);
        children.add(classBody);
        return children;
    }

    @Override
    public String toString() {
        return "ComponentDefinition(" + className + ")";
    }

    public ComponentConfigNode getComponentConfigNode() {
        return componentConfigNode;
    }

    public String getClassName() {
        return className;
    }

    public ExtendsStatementNode getExtendsStatement() {
        return extendsStatement;
    }

    public ImplementsStatementNode getImplementsStatements() {
        return implementsStatements;
    }

    public ClassBodyNode getClassBody() {
        return classBody;
    }

    public boolean isExported() {
        return isExported;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ComponentDefinitionNode(").append(className).append(") at line ").append(line).append("\n");

        sb.append(indent).append("  Exported: ").append(isExported).append("\n");

        if (componentConfigNode != null) {
            sb.append(componentConfigNode.toString(level + 1));
        }

        if (extendsStatement != null) {
            sb.append(extendsStatement.toString(level + 1));
        }

        if (implementsStatements != null) {
            sb.append(implementsStatements.toString(level + 1));
        }

        if (classBody != null) {
            sb.append(classBody.toString(level + 1));
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", java.util.Collections.nCopies(level, "  "));
    }

}
