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
        return ""; // To be implemented
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
}
