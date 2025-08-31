package errorHandling;

import errorHandling.sementicError.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {
    private final List<ErrorInterface> errors;

    public ErrorReporter() {
        this.errors = new ArrayList<>();
    }

    public void report(ErrorInterface error) {
        errors.add(error);
    }

    public void report(String message, int line, int column, symboltable.SymbolTable scope,ErrorType errorType) {
        errors.add(new SemanticError(message, line, column, scope,errorType));
    }

    public void report(String message, int line, int column, symboltable.SymbolTable scope, symboltable.Symbol symbol,ErrorType errorType) {
        errors.add(new SemanticError(message, line, column, scope, symbol, errorType));
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<ErrorInterface> getErrors() {
        return errors;
    }

    public void printAll() {
        for (ErrorInterface error : errors) {
            System.err.println("+++++++++++++++++++++++++++********************************++++++++++++++++++++++++");
            System.err.println(error);
            System.err.println("+++++++++++++++++++++++++++********************************++++++++++++++++++++++++");
        }
    }

    public void clear() {
        errors.clear();
    }
}
