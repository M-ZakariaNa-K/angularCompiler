package ast.css.expr;

public class CssCssVarTermNode extends CssTermNode {
    private final String varName; // after --, per lexer CSS_VAR: 'var(' '--' IDENTIFIER ')'

    public CssCssVarTermNode(String varName, int line) {
        super(line);
        this.varName = varName;
    }

    @Override public String getSymbolName() { return "--" + varName; }
    @Override public String generateCode() { return "var(--" + varName + ")"; }
    @Override public String toString(int level) { return indent(level) + "CssCssVarTerm(var(--" + varName + "))"; }
}
