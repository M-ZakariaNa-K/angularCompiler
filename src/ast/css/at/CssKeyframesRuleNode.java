package ast.css.at;

import ast.ASTNode;
import ast.css.CssNodeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssKeyframesRuleNode extends CssNodeBase {
    private final String atKeyword; // e.g. "@keyframes"
    private final String name;      // IDENTIFIER (animation name)
    private final List<CssKeyframeEntryNode> entries;

    public CssKeyframesRuleNode(String atKeyword, String name, List<CssKeyframeEntryNode> entries, int line) {
        super(line);
        this.atKeyword = atKeyword;
        this.name = name;
        this.entries = entries == null ? Collections.<CssKeyframeEntryNode>emptyList() : entries;
    }

    public String getAtKeyword() { return atKeyword; }
    public String getName() { return name; }
    public List<CssKeyframeEntryNode> getEntries() { return entries; }

    @Override
    public String getSymbolName() { return name; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(atKeyword).append(" ").append(name).append(" {");
        for (CssKeyframeEntryNode e : entries) {
            sb.append(" ").append(e.generateCode());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level))
                .append("CssKeyframesRule(").append(name).append(")\n");
        for (ASTNode e : entries) {
            sb.append(e.toString(level + 1)).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(entries);
    }
}
