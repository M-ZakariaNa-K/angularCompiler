package ast.css.at;

import ast.ASTNode;
import ast.css.CssNodeBase;
import ast.css.Declarations.CssDeclarationNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssKeyframeEntryNode extends CssNodeBase {
    private final CssKeyframeSelectorNode selector;
    private final List<CssDeclarationNode> declarations;

    public CssKeyframeEntryNode(CssKeyframeSelectorNode selector, List<CssDeclarationNode> declarations, int line) {
        super(line);
        this.selector = selector;
        this.declarations = declarations == null ? Collections.<CssDeclarationNode>emptyList() : declarations;
    }

    public CssKeyframeSelectorNode getSelector() { return selector; }
    public List<CssDeclarationNode> getDeclarations() { return declarations; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(selector.generateCode()).append(" {");
        for (int i = 0; i < declarations.size(); i++) {
            sb.append(" ").append(declarations.get(i).generateCode());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssKeyframeEntry\n");
        sb.append(selector.toString(level + 1)).append("\n");
        for (ASTNode d : declarations) {
            sb.append(d.toString(level + 1)).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> out = new ArrayList<ASTNode>();
        out.add(selector);
        out.addAll(declarations);
        return out;
    }
}
