package ast.css.expr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssFunctionTermNode extends CssTermNode {
    private final String name; // from FUNCTION token ("ident(" without '(') - you can pass plain name
    private final List<CssExprNode> args;

    public CssFunctionTermNode(String name, List<CssExprNode> args, int line) {
        super(line);
        this.name = name;
        this.args = args == null ? Collections.<CssExprNode>emptyList() : args;
    }

    public String getName() { return name; }
    public List<CssExprNode> getArgs() { return args; }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("(");
        for (int i = 0; i < args.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(args.get(i).generateCode());
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder(indent(level)).append("CssFunctionTerm(").append(name).append(")\n");
        for (CssExprNode e : args) sb.append(e.toString(level + 1)).append("\n");
        return sb.toString().trim();
    }

    @Override
    public List<ast.ASTNode> getChildren() {
        return new ArrayList<ast.ASTNode>(args);
    }
}
