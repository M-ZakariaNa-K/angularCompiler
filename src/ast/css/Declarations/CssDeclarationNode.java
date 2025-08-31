package ast.css.Declarations;

import ast.ASTNode;
import ast.css.CssNodeBase;
import ast.css.expr.CssExprNode;

import java.util.ArrayList;
import java.util.List;

public class CssDeclarationNode extends CssNodeBase {
    private final CssPropertyNode property;
    private final CssExprNode expr;
    private final CssPrioNode prio; // optional

    public CssDeclarationNode(CssPropertyNode property, CssExprNode expr, CssPrioNode prio, int line) {
        super(line);
        this.property = property;
        this.expr = expr;
        this.prio = prio;
    }

    public CssPropertyNode getProperty() { return property; }
    public CssExprNode getExpr() { return expr; }
    public CssPrioNode getPrio() { return prio; }

    @Override
    public String getSymbolName() { return property.getSymbolName(); }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(property.generateCode()).append(": ").append(expr.generateCode());
        if (prio != null) sb.append(" ").append(prio.generateCode());
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String toString(int level) {
        String ind = indent(level);
        StringBuilder sb = new StringBuilder(ind).append("CssDeclaration\n");
        sb.append(property.toString(level + 1)).append("\n");
        sb.append(expr.toString(level + 1));
        if (prio != null) sb.append("\n").append(prio.toString(level + 1));
        return sb.toString();
    }

    @Override
    public List<ASTNode> getChildren() {
        ArrayList<ASTNode> out = new ArrayList<ASTNode>();
        out.add(property);
        out.add(expr);
        if (prio != null) out.add(prio);
        return out;
    }
}
