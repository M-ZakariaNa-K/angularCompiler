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
        if (classMembers != null){
            return classMembers;
        }
        return Collections.emptyList();
    }

    @Override
    public String getSymbolName() {
        return "ClassBody";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        // Optional: emit decorators as comments
        for (DecoratorNode decorator : decorators) {
            sb.append(decorator.generateCode()).append("\n");
        }

        // Emit class members
        for (ASTNode member : classMembers) {
            String memberCode = member.generateCode();
            if (!memberCode.isEmpty()) {
                // indent each line by 2 spaces
                for (String line : memberCode.split("\n")) {
                    sb.append("  ").append(line).append("\n");
                }
            }
        }

        return sb.toString();
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

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("ClassBodyNod ").append("\n");

        if (!decorators.isEmpty()) {
            sb.append(indent).append("  Decorators:\n");
            for (DecoratorNode decorator : decorators) {
                sb.append(decorator.toString(level + 2));
            }
        }

        if (!classMembers.isEmpty()) {
            sb.append(indent).append("  Class Members:\n");
            for (ASTNode member : classMembers) {
                sb.append(member.toString(level + 2));
            }
        }

        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }

}
