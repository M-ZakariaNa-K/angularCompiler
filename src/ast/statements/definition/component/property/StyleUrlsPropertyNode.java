package ast.statements.definition.component.property;

import ast.ASTNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StyleUrlsPropertyNode extends ComponentPropertyNode {
    private final List<String> urls;

    public StyleUrlsPropertyNode(List<String> urls, int line) {
        super(line);
        this.urls = urls;
    }

    @Override
    public String getSymbolName() {
        return "StyleUrlsProperty";
    }

    @Override
    public String generateCode() {
        return "styleUrls: [" + urls.stream()
                .map(s -> "\"" + s + "\"")
                .collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "StyleUrls(" + urls + ")";
    }
}
