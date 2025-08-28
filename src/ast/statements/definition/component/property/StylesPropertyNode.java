package ast.statements.definition.component.property;

import ast.ASTNode;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class StylesPropertyNode extends ComponentPropertyNode {
    private final List<String> styles;

    public StylesPropertyNode(List<String> styles, int line) {
        super(line);
        this.styles = styles;
    }

    @Override
    public String getSymbolName() {
        return "StylesProperty";
    }

    @Override
    public String getKey() {
        return "styles";
    }

    @Override
    public String getValue() {
        // Wrap each style in quotes for valid JS
        return "[" + styles.stream()
                .map(s -> s)
                .collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public String generateCode() {
        return getKey() + ": " + getValue();
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("StylesPropertyNode at line ").append(getLine()).append("\n");
        for (String style : styles) {
            sb.append(indent).append("  ").append(style).append("\n");
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
