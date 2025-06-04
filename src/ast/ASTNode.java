package ast;

import ast.statements.StatementNode;

import java.util.List;

public interface ASTNode {

    /** For semantic analysis: returns the name used in the symbol table (if any) */
    String getSymbolName();

    /** For code generation (optional, can return partial code or be overridden) */
    String generateCode();

    /** For error reporting or tracing */
    int getLine();

    String toString(int level);
    /**
     * For symbol table construction: collect children nodes
     */
    List<ASTNode> getChildren();
}
