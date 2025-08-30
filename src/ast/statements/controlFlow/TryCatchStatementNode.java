package ast.statements.controlFlow;

import ast.ASTNode;
import ast.BlockNode;
import ast.statements.StatementNode;
import ast.types.TypeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TryCatchStatementNode extends StatementNode {

    private final BlockNode tryBlock;
    private final String exceptionIdentifier;
    private final BlockNode catchBlock;
    private final TypeNode  exceptionType;
    private final BlockNode finallyBlock; // Nullable
    private final int line;

    public TryCatchStatementNode(BlockNode tryBlock, String exceptionIdentifier, BlockNode catchBlock, BlockNode finallyBlock,TypeNode exceptionType, int line) {
        this.tryBlock = tryBlock;
        this.exceptionIdentifier = exceptionIdentifier;
        this.catchBlock = catchBlock;
        this.finallyBlock = finallyBlock;
        this.exceptionType = exceptionType;
        this.line = line;
    }

    public BlockNode getTryBlock() {
        return tryBlock;
    }

    public String getExceptionIdentifier() {
        return exceptionIdentifier;
    }

    public BlockNode getCatchBlock() {
        return catchBlock;
    }

    public BlockNode getFinallyBlock() {
        return finallyBlock;
    }

    @Override
    public String getSymbolName() {
        return "TryCatchStatement";
    }

    public TypeNode getExceptionType() {
        return exceptionType;
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        // Try block
        sb.append(tryBlock.generateCode());

        // Catch block (must always have an identifier in JS)
        if (catchBlock != null) {
            if (exceptionIdentifier == null || exceptionIdentifier.trim().isEmpty()) {
                throw new IllegalStateException("Catch block requires an exception identifier for code generation.");
            }

            sb.append("catch (").append(exceptionIdentifier).append(")\n");
            sb.append(catchBlock.generateCode());
        }

        // Finally block
        if (finallyBlock != null) {
            sb.append("finally\n");
            sb.append(finallyBlock.generateCode());
        }

        return sb.toString();
    }


    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(tryBlock);
        children.add(catchBlock);
        if (finallyBlock != null) {
            children.add(finallyBlock);
        }
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = getIndent(level);
        sb.append(indent).append("TryCatchStatementNode\n");

        sb.append(indent).append("  TryBlock:\n");
        sb.append(tryBlock.toString(level + 2));

        sb.append(indent).append("  CatchBlock:\n");
        sb.append(catchBlock.toString(level + 2));

        if (finallyBlock != null) {
            sb.append(indent).append("  FinallyBlock:\n");
            sb.append(finallyBlock.toString(level + 2));
        }

        sb.append(indent).append("  ExceptionIdentifier: ").append(exceptionIdentifier).append("\n");
        sb.append(indent).append("  ExceptionType:\n");
        sb.append(exceptionType.toString(level + 2));

        return sb.toString();
    }

    private String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

}
