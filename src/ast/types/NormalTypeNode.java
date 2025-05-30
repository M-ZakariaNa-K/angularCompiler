package ast.types;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;

public class NormalTypeNode extends TypeNode {
    public enum NormalKind {
        NUMBER, STRING, BOOLEAN, ANY, UNKNOWN, VOID, ARRAY, OBJECT, IDENTIFIER
    }

    private final NormalKind kind;
    private final String identifier; // Used if kind == IDENTIFIER
    private final int line;

    public NormalTypeNode(NormalKind kind, String identifier, int line) {
        this.kind = kind;
        this.identifier = identifier;
        this.line = line;
    }

    public NormalKind getKind() {
        return kind;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getSymbolName() {
        return "NormalType";
    }

    @Override
    public String generateCode() {
        return kind == NormalKind.IDENTIFIER ? identifier : kind.name();
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "NormalTypeNode(kind=" + kind +
                (kind == NormalKind.IDENTIFIER ? ", identifier=" + identifier : "") +
                ", line=" + line + ")";
    }

    @Override
    public String getStringType() {
        return kind == NormalKind.IDENTIFIER ? identifier : kind.name();
    }
}
