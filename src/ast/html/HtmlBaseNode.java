package ast.html;

import ast.ASTNode;
import java.util.Collections;
import java.util.List;

public abstract class HtmlBaseNode implements ASTNode {

    @Override
    public String getSymbolName() {
        return null; // HTML nodes usually don't have symbols
    }

    @Override
    public int getLine() {
        return 0; // Override in subclasses
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList(); // Override in subclasses
    }

    @Override
    public String toString(int level) {
        return ""; // Override in subclasses
    }

    @Override
    public String generateCode() {
        return ""; // Override in subclasses
    }
}
