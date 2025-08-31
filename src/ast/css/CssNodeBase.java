package ast.css;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public abstract class CssNodeBase implements ASTNode {
    protected final int line;

    protected CssNodeBase(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
    }

    /** Default: no symbol. Override where relevant. */
    @Override
    public String getSymbolName() {
        return null;
    }

    /** Default codegen falls back to pretty-printed form. Override for exact emission. */
    @Override
    public String generateCode() {
        return toString(0);
    }

    /** Default: no children. Override in composites. */
    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    protected static String indent(int level) {
        StringBuilder sb = new StringBuilder(level * 2);
        for (int i = 0; i < level; i++) sb.append("  ");
        return sb.toString();
    }
}


