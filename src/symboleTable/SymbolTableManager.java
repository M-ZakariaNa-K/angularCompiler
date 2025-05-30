package symboltable;

import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;

public class SymbolTableManager {

    private final Deque<SymbolTable> scopeStack = new ArrayDeque<>();
    private final List<SymbolTable> allScopes = new ArrayList<>();


    public SymbolTableManager() {
        // Start with the global scope
        SymbolTable symbolTable = new SymbolTable(null,"global");
        scopeStack.push(symbolTable);
        allScopes.add(symbolTable);
    }

    public void enterScope(String scope) {
        SymbolTable newScope = new SymbolTable(currentScope(),scope);
        scopeStack.push(newScope);
        allScopes.add(newScope);
    }

    public void exitScope() {
        if (scopeStack.size() <= 1) {
            throw new IllegalStateException("Cannot exit global scope.");
        }
        scopeStack.pop();
    }

    public SymbolTable currentScope() {
        return scopeStack.peek();
    }

    public void define(String name, Symbol symbol) {
        currentScope().define(name, symbol);
    }

    public Symbol resolve(String name) {
        return currentScope().resolve(name);
    }

    public boolean containsInCurrentScope(String name) {
        return currentScope().containsInCurrentScope(name);
    }

    public List<SymbolTable> getAllScopes() {
        return allScopes;
    }

    public void printAllScopes() {
        for (SymbolTable table : allScopes) {
            table.print();
        }
    }

}
