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
    private final List<ImplementsStatementNode> implementsStatements;
    private final ClassBodyNode classBody;
    private final int line;
    private final boolean isExported;

    public ComponentDefinitionNode(
            ComponentConfigNode componentConfigNode, String className,
           ExtendsStatementNode extendsStatement, List<ImplementsStatementNode> implementsStatements,
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
        StringBuilder code = new StringBuilder("@Component({\n");
        code.append(componentConfigNode.generateCode());
        code.append("})\nclass ").append(className);
        if (extendsStatement != null) code.append(" ").append(extendsStatement.generateCode());
        for (ASTNode impl : implementsStatements) {
            code.append(" ").append(impl.generateCode());
        }
        code.append(" ").append(classBody.generateCode());
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
        children.addAll(implementsStatements);
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

    public List<ImplementsStatementNode> getImplementsStatements() {
        return implementsStatements;
    }

    public ClassBodyNode getClassBody() {
        return classBody;
    }

    public boolean isExported() {
        return isExported;
    }
}
