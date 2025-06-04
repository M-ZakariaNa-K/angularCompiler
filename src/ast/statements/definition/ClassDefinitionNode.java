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
    private final ImplementsStatementNode implementsStatements; // list of implements
    private final ClassBodyNode classBody;
    private final int line;

    public ClassDefinitionNode(String name, ExtendsStatementNode extendsStatement, ImplementsStatementNode implementsStatements, ClassBodyNode classBody, int line) {
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

    public ImplementsStatementNode getImplementsStatements() {
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
        children.add(implementsStatements);
        children.add(classBody);
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ClassDefinitionNode: ").append(name)
                .append(" at line ").append(line).append("\n");

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
        return String.join("", Collections.nCopies(level, "  "));
    }

}
