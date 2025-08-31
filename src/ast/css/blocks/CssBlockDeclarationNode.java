package ast.css.blocks;

import ast.ASTNode;
import ast.css.Declarations.CssDeclarationNode;

public class CssBlockDeclarationNode extends CssBlockContentNode {
    private final CssDeclarationNode declaration;

    public CssBlockDeclarationNode(CssDeclarationNode declaration, int line) {
        super(line);
        this.declaration = declaration;
    }

    public CssDeclarationNode getDeclaration() { return declaration; }

    @Override
    public String generateCode() { return declaration.generateCode(); }

    @Override
    public String toString(int level) {
        return declaration.toString(level);
    }

    @Override
    public java.util.List<ASTNode> getChildren() {
        return java.util.Collections.<ASTNode>singletonList(declaration);
    }
}
