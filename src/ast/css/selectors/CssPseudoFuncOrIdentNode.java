package ast.css.selectors;

import ast.ASTNode;
import ast.css.expr.CssValueExprNode;

import java.util.Collections;
import java.util.List;

public class CssPseudoFuncOrIdentNode extends CssSimpleSelectorPartNode {
    private final String name;
    private final CssValueExprNode arg; // optional

    public CssPseudoFuncOrIdentNode(String name, CssValueExprNode arg, int line) {
        super(line);
        this.name = name;
        this.arg = arg;
    }

    public String getName() { return name; }
    public CssValueExprNode getArg() { return arg; }

    @Override
    public String generateCode() {
        return arg == null ? ":" + name : ":" + name + "(" + arg.generateCode() + ")";
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssPseudoFuncOrIdent(:").append(name).append(")\n");
        if (arg != null) sb.append(arg.toString(level + 1));
        return sb.toString();
    }

    @Override
    public List<ASTNode> getChildren() {
        return arg == null ? Collections.<ASTNode>emptyList() : java.util.Collections.<ASTNode>singletonList(arg);
    }
}
