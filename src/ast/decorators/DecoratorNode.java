package ast.decorators;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class DecoratorNode implements ASTNode {
    private final String identifier;
    private final int line;

    public DecoratorNode(String identifier, int line) {
        this.identifier = identifier;
        this.line = line;
    }

    @Override
    public String getSymbolName() {
        return "Decorator";
    }

    @Override
    public String generateCode() {
        return "@" + identifier;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "DecoratorNode(@" + identifier + ") at line " + line;
    }

    public String getIdentifier() {
        return identifier;
    }
}
