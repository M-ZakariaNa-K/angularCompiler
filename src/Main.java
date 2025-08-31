import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src", "/test/userCard/userCard.ts");
        CompilerClass compiler = new CompilerClass(path);
        compiler.visitAst();
    }
}