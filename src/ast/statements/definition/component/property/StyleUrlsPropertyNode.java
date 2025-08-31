package ast.statements.definition.component.property;

import ast.ASTNode;
import visitor.FileExporter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StyleUrlsPropertyNode extends ComponentPropertyNode {
    private final List<String> urls;
    private List<ASTNode> cssAsts;
    public StyleUrlsPropertyNode(List<String> urls, int line,List<ASTNode> cssAsts) {
        super(line);
        this.urls = urls;
        this.cssAsts = cssAsts;
    }

    @Override
    public String getSymbolName() {
        return "StyleUrlsProperty";
    }

    @Override
    public String getKey() {
        return "styleUrls";
    }

    @Override
    public String getValue() {
        return "[" + urls.stream()
                .map(url -> url)
                .collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public String generateCode() {
        for (ASTNode cssAst : cssAsts) {
            if (cssAst != null) {
//                FileExporter.exportToFile(cssAst.generateCode(), "css");
            }
        }
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
        sb.append(indent).append("StyleUrlsPropertyNode at line ").append(getLine()).append("\n");
        for (String url : urls) {
            sb.append(indent).append("  ").append(url).append("\n");
        }
        for (ASTNode cssAst : cssAsts) {
            sb.append(indent).append("  ").append(cssAst.toString(level + 1)).append("\n");
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
