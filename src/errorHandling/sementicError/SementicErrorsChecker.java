package errorHandling.sementicError;

import errorHandling.ErrorReporter;
import errorHandling.ErrorType;
import gen.AngularParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import symboltable.SymbolTableManager;

public class SementicErrorsChecker {
    public SementicErrorsChecker() {
    }

    public void checkForUndefinedIdentifiers(ParserRuleContext ctx, SymbolTableManager symbolTableManager, ErrorReporter errorReporter) {
        if (ctx == null || ctx.children == null) return;

        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.IdContext) {
                AngularParser.IdContext idCtx = (AngularParser.IdContext) child;
                String name = idCtx.getText(); // IDENTIFIER name

                boolean isDefined = symbolTableManager.currentScope().containsInGreaterScope(name);
                if (!isDefined) {
                    errorReporter.report(
                            "Undeclared variable: " + name + " at line : " + idCtx.getStart().getLine(),
                            idCtx.getStart().getLine(),
                            idCtx.getStart().getCharPositionInLine(),
                            symbolTableManager.currentScope(),
                            ErrorType.UNDECLARED_IDENTIFIER
                    );
                }
            }
            // Recursive check for nested expressions
            if (child instanceof ParserRuleContext) {
                checkForUndefinedIdentifiers((ParserRuleContext) child,symbolTableManager,errorReporter);
            }
        }
    }

    public void checkForDuplicateDeclaration (String id, SymbolTableManager symbolTableManager, ErrorReporter errorReporter) {
        if (id == null ) return;

        boolean isDefined =  symbolTableManager.currentScope().containsInCurrentScope(id);
        if (isDefined) {
            errorReporter.report(
                    id + " is already defined at line : 17",
                    18,
                    5,
                    symbolTableManager.currentScope(),
                    ErrorType.DUPLICATE_DECLARATION
            );
        }
    }
}
