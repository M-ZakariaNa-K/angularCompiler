package symboltable;

public class Symbol {
    private final String type;
    private final String symbolType;
    private final String name;
    private final boolean isMutable;
    private  final int line;

    public Symbol( String symbolType,String type, String name, boolean isMutable, int line) {
        this.symbolType = symbolType;
        this.type = type;
        this.name = name;
        this.isMutable = isMutable;
        this.line = line;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isMutable() {
        return isMutable;
    }

    public String getSymbolType() {
        return symbolType;
    }

    @Override
    public String toString() {
        return String.format("Symbol(symbolType=%s type=%s, value=%s, mutable=%s)",symbolType, type, name, isMutable);
    }
}
