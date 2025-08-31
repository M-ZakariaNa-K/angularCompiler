package visitor;

import ast.ASTNode;
import ast.css.CssFileNode;
import gen.CssLexer;
import gen.CssParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CssUtils {

    /**
     * Creates a parser for a given CSS string.
     */
    public static CssParser createParser(String cssContent) {
        CharStream input = CharStreams.fromString(cssContent);
        CssLexer lexer = new CssLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new CssParser(tokens);
    }

    /**
     * Parses CSS content into an AST using CssVisitor.
     */
    public static CssFileNode parseCss(String cssContent) {
        CssParser parser = createParser(cssContent);
        CssVisitor visitor = new CssVisitor();
        ASTNode result = visitor.visitCssFileStat(parser.cssFile());
        if (result instanceof CssFileNode) {
            return (CssFileNode) result;
        }
        throw new IllegalStateException("Expected CssFileNode, got: " + result.getClass().getSimpleName());
    }

    /**
     * Parses a CSS file into an AST.
     */
    public static CssFileNode parseCssFile(Path path) throws IOException {
        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes, StandardCharsets.UTF_8);
        return parseCss(content);
    }
}
