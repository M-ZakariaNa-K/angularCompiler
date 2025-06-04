import ast.ProgramNode;
import errorHandling.ErrorReporter;
import gen.AngularLexer;
import gen.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import symboltable.SymbolTableManager;
import visitor.BaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class CompilerClass {
    private Path token;
    private final BaseVisitor baseVisitor;

    public CompilerClass( Path token) {
        ErrorReporter errorReporter = new ErrorReporter();
        SymbolTableManager symbolManager = new SymbolTableManager();
        this.baseVisitor = new BaseVisitor(symbolManager,errorReporter);
        this.token = token;
    }

    public Path getToken() {
        return token;
    }


    public BaseVisitor getBaseVisitor() {
        return baseVisitor;
    }

    public void setToken(Path token) {
        this.token = token;
    }

    public void visitAst() {
        try {
            if (!Files.exists(token)) {
                throw new RuntimeException("File not found: " + token.toAbsolutePath());
            }

            CharStream cs = CharStreams.fromPath(token);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);
            ProgramNode programNode = (ProgramNode) baseVisitor.visitProgram(parser.program());
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + token.toAbsolutePath(), e);
        }
    }
}
