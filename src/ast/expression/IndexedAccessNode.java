package ast.expression;

import ast.ASTNode;

import java.util.Arrays;
import java.util.List;

public class IndexedAccessNode extends ExpressionNode {
    private final ExpressionNode target;
    private final ExpressionNode index;

    public IndexedAccessNode(ExpressionNode target, ExpressionNode index) {
        this.target = target;
        this.index = index;
    }

    public ExpressionNode getTarget() {
        return target;
    }

    public ExpressionNode getIndex() {
        return index;
    }

    @Override
    public String getSymbolName() {
        return "IndexedAccess";
    }

    @Override
    public String generateCode() {
        return target.generateCode() + "[" + index.generateCode() + "]";
    }

    @Override
    public int getLine() {
        return target.getLine();
    }

    @Override
    public List<ASTNode> getChildren() {
        return Arrays.asList(target, index);
    }
}
