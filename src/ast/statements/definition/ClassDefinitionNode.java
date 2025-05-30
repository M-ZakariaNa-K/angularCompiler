package ast.statements.definition;

import ast.ASTNode;
import ast.statements.StatementNode;
import ast.statements.inheritance.ExtendsStatementNode;
import ast.statements.inheritance.ImplementsStatementNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassDefinitionNode extends StatementNode {

    private final String name;
    private final ExtendsStatementNode extendsStatement; // nullable
    private final List<ImplementsStatementNode> implementsStatements; // list of implements
    private final ClassBodyNode classBody;
    private final int line;

    public ClassDefinitionNode(String name, ExtendsStatementNode extendsStatement, List<ImplementsStatementNode> implementsStatements, ClassBodyNode classBody, int line) {
        this.name = name;
        this.extendsStatement = extendsStatement;
        this.implementsStatements = implementsStatements;
        this.classBody = classBody;
        this.line = line;
    }

    public String getName() {
        return name;
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

    @Override
    public String getSymbolName() {
        return "ClassDefinition";
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
        List<ASTNode> children = new ArrayList<>();
        if (extendsStatement != null) {
            children.add(extendsStatement);
        }
        children.addAll(implementsStatements);
        children.add(classBody);
        return Collections.unmodifiableList(children);
    }
}
