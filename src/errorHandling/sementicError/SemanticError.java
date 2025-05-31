package errorHandling.sementicError;

import errorHandling.ErrorInterface;
import errorHandling.ErrorType;
import symboltable.Symbol;
import symboltable.SymbolTable;

public class SemanticError implements ErrorInterface {
    private final String message;
    private final int line;
    private final int column;
    private final SymbolTable scope;
    private final Symbol relatedSymbol; // optional
    private final ErrorType semanticErrorType;
    public SemanticError(String message, int line, int column, SymbolTable scope, Symbol relatedSymbol, ErrorType semanticErrorType) {
        this.message = message;
        this.line = line;
        this.column = column;
        this.scope = scope;
        this.relatedSymbol = relatedSymbol;
        this.semanticErrorType = semanticErrorType;
    }

    // Overload: for errors without a related symbol
    public SemanticError(String message, int line, int column, SymbolTable scope, ErrorType semanticErrorType) {
        this(message, line, column, scope, null,semanticErrorType);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public SymbolTable getScope() {
        return scope;
    }

    public Symbol getRelatedSymbol() {
        return relatedSymbol;
    }

    @Override
    public String toString() {
        return String.format(
                "Semantic Error at line %d:%d - %s%s",
                line, column, message,
                (relatedSymbol != null ? " [Symbol: " + relatedSymbol + "]" : "")
        );
    }
}
