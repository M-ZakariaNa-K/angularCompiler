package visitor;

import ast.ASTNode;
import ast.html.HtmlDocumentNode;
import gen.HtmlLexer;
import gen.HtmlParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HtmlUtils {

    /**
     * Creates a parser for a given HTML string.
     */
    public static HtmlParser createParser(String htmlContent) {
        CharStream input = CharStreams.fromString(htmlContent);
        HtmlLexer lexer = new HtmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new HtmlParser(tokens);
    }

    /**
     * Parses HTML content into an AST using HTMLVisitor.
     */
    public static HtmlDocumentNode parseHtml(String htmlContent) {
        HtmlParser parser = createParser(htmlContent);
        HTMLVisitor visitor = new HTMLVisitor();
        ASTNode result = visitor.visitHtmlDocument(parser.htmlDocument());
        if (result instanceof HtmlDocumentNode) {
            return (HtmlDocumentNode) result;
        }
        throw new IllegalStateException("Expected HtmlDocumentNode, got: " + result.getClass().getSimpleName());
    }

    public static HtmlDocumentNode parseHtmlFile(Path path) throws IOException {
        System.err.println(path);

        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes, StandardCharsets.UTF_8);
        return parseHtml(content);
    }
}
