package ast.statements.definition.component.property;

import ast.ASTNode;
import visitor.FileExporter;

import java.util.Collections;
import java.util.List;

public class TemplateUrlPropertyNode extends ComponentPropertyNode {
    private final String value;
    private final ASTNode htmlAst; // parsed HTML AST

    public TemplateUrlPropertyNode(String value, ASTNode htmlAst, int line) {
        super(line);
        this.value = value;
        this.htmlAst = htmlAst;
    }

    public ASTNode getHtmlAst() {
        return htmlAst;
    }

    @Override
    public String getSymbolName() {
        return "TemplateUrlProperty";
    }

    @Override
    public String getKey() {
        return "templateUrl";
    }

    @Override
    public String getValue() {
        return "\"" + value + "\""; // wrap in quotes for JS
    }

    @Override
    public String generateCode() {
        System.err.println("writing");
        if (htmlAst != null) {
             FileExporter.exportToFile(htmlAst.generateCode(), "html");
        }
        return getKey() + ": " + getValue();
    }

    @Override
    public List<ASTNode> getChildren() {
        return htmlAst != null ? Collections.singletonList(htmlAst) : Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TemplateUrlPropertyNode at line ").append(getLine()).append("\n");
        sb.append(indent).append("  ").append(value).append("\n");
        if (htmlAst != null) {
            sb.append(htmlAst.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
