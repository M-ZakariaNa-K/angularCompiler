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
    public String generateCode() {
        return "styles: [" + styles.stream().collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Styles(" + styles + ")";
    }
}

