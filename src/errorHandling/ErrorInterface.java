package errorHandling;

import symboltable.SymbolTable;

public interface ErrorInterface {
    String getMessage();
    int getLine();
    int getColumn();
    SymbolTable getScope();
    String toString();
}
