package ast.css.selectors;

import ast.ASTNode;
import ast.css.CssNodeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssSimpleSelectorNode extends CssNodeBase {
    private final CssTypeSelectorNode typeSelector; // optional
    private final List<CssSimpleSelectorPartNode> parts;

    public CssSimpleSelectorNode(CssTypeSelectorNode typeSelector, List<CssSimpleSelectorPartNode> parts, int line) {
        super(line);
        this.typeSelector = typeSelector;
        this.parts = parts == null ? Collections.<CssSimpleSelectorPartNode>emptyList() : parts;
    }

    public CssTypeSelectorNode getTypeSelector() { return typeSelector; }
    public List<CssSimpleSelectorPartNode> getParts() { return parts; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        if (typeSelector != null) sb.append(typeSelector.generateCode());
        for (CssSimpleSelectorPartNode p : parts) sb.append(p.generateCode());
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssSimpleSelector\n");
        if (typeSelector != null) sb.append(typeSelector.toString(level + 1)).append("\n");
        for (ASTNode p : parts) sb.append(p.toString(level + 1)).append("\n");
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        ArrayList<ASTNode> out = new ArrayList<ASTNode>();
        if (typeSelector != null) out.add(typeSelector);
        out.addAll(parts);
        return out;
    }
}
