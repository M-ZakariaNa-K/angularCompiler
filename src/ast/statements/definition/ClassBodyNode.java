package ast.statements.definition;

import ast.ASTNode;
import ast.decorators.DecoratorNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassBodyNode implements ASTNode {

    private final List<DecoratorNode> decorators;
    private final List<ASTNode> classMembers; // can be ConstructorDefinitionNode, VarDeclarationNode, ConstDeclarationNode, MethodDefinitionNode, EnumDefinitionNode
    private final int line;

    public ClassBodyNode(List<DecoratorNode> decorators, List<ASTNode> classMembers, int line) {
        this.decorators = decorators;
        this.classMembers = classMembers;
        this.line = line;
    }

    public List<DecoratorNode> getDecorators() {
        return decorators;
    }

    public List<ASTNode> getClassMembers() {
        return classMembers;
    }

    @Override
    public String getSymbolName() {
        return "ClassBody";
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
        List<ASTNode> all = new ArrayList<>();
        all.addAll(decorators);
        all.addAll(classMembers);
        return Collections.unmodifiableList(all);
    }
}
