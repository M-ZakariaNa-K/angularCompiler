package ast.statements.definition.component.property;

import ast.ASTNode;
import ast.html.HtmlDocumentNode;

import java.util.Collections;
import java.util.List;

public class TemplatePropertyNode extends ComponentPropertyNode {
    private final String templateContent;
    private final HtmlDocumentNode htmlAst; // store parsed HTML

    public TemplatePropertyNode(String templateContent, HtmlDocumentNode htmlAst, int line) {
        super(line);
        this.templateContent = templateContent;
        this.htmlAst = htmlAst;
    }

    @Override
    public String getSymbolName() {
        return "TemplateProperty";
    }

    @Override
    public String getKey() {
        return "template";
    }

    @Override
    public String getValue() {
        return templateContent;
    }

    @Override
    public String generateCode() {
        // you can generate Angular template code or serialized HTML
        return getKey() + ": `" + templateContent + "`";
    }

    @Override
    public List<ASTNode> getChildren() {
        // return HTML AST as a child
        return htmlAst != null ? Collections.singletonList(htmlAst) : Collections.emptyList();
    }

    @Override
    public String toString(int level) {
        String indent = getIndent(level);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TemplatePropertyNode at line ").append(getLine()).append("\n");
        sb.append(indent).append("  ").append(templateContent).append("\n");
        if (htmlAst != null) {
            sb.append(htmlAst.toString(level + 1));
        }
        return sb.toString();
    }

    private String getIndent(int level) {
        return String.join("", Collections.nCopies(level, "  "));
    }
}
