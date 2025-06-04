package symboltable;

import ast.ASTNode;
import java.util.*;

public class SymbolTable {

    private final Map<String, Symbol> symbols = new LinkedHashMap<>();
    String scope;
    private final SymbolTable parent;

    public SymbolTable(String scope) {
        this.parent = null;
        this.scope = scope;
    }

    public SymbolTable(SymbolTable parent,String scope) {
        this.parent = parent;
        this.scope = scope;
    }

    public void define(String name, Symbol symbol) {
        symbols.put(name, symbol);
    }

    public Symbol resolve(String name) {
        Symbol value = symbols.get(name);
        if (value != null) return value;
        if (parent != null) return parent.resolve(name);
        return null;
    }

    public Symbol resolveFromSuperScope(String name) {
        if (parent != null) return parent.resolve(name);
        return null;
    }

    public boolean containsInCurrentScope(String name) {
        return symbols.containsKey(name);
    }

    public boolean containsInGreaterScope (String name) {
        boolean isContained = false;
        if (symbols.containsKey(name)){
            isContained = true;
        } else if (parent != null) {
            isContained = parent.containsInGreaterScope(name);
        }

        return isContained;
    }

    public boolean containsInSuperScope (String name) {
        boolean isContained = false;
        if (parent != null) {
            isContained = parent.containsInGreaterScope(name);
        }

        return isContained;
    }
    public SymbolTable getParent() {
        return parent;
    }

    public Set<String> getNames() {
        return symbols.keySet();
    }

    public Collection<Symbol> getAllSymbols() {
        return symbols.values();
    }


    public void print() {
        print(0);
    }

    private void print(int indentLevel) {
        String indent = repeat("  ", indentLevel);
        if (symbols.isEmpty()) {
            System.out.println(indent + "Scope: " + scope + " has no symbols");
            System.out.println(indent + "========================================================================================================================");
            return;
        } else {
            System.out.println(indent + "Scope: " + scope);
            System.out.println(indent + "========================================================================================================================");
            System.out.printf(indent + "%-20s | %-30s | %-30s | %-30s | %-10s\n", "symbol", "SymbolType","name", "type", "Mutable");
            System.out.println(indent + "-------------------------------------------------------------------------------------------------------------------------");

            for (Map.Entry<String, Symbol> entry : symbols.entrySet()) {
                String name = entry.getKey();
                Symbol symbol = entry.getValue();
                System.out.printf(indent + "%-20s | %-30s | %-30s | %-30s | %-10s \n",
                        name,
                        symbol.getSymbolType(),
                        symbol.getName(),
                        symbol.getType(),
                        symbol.isMutable());
            }

            System.out.println(indent + "========================================================================================================================");
        }

    }

    private String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public String getScope() {
        return scope;
    }
}
