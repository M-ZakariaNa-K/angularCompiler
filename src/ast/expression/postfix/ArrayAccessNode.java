package ast.expression.postfix;

import ast.ASTNode;
import ast.expression.ExpressionNode;
import ast.expression.IndexedAccessNode;

import java.util.Collections;
import java.util.List;

public class ArrayAccessNode extends PostfixOpNode {
    private final ExpressionNode index;
    private final int line;
    public ArrayAccessNode(ExpressionNode index,int line) {
        this.index = index;
        this.line = line;
    }

    public ExpressionNode getIndex() {
        return index;
    }

    @Override
    public ExpressionNode apply(ExpressionNode target) {
        return new IndexedAccessNode(target, index);
    }

    @Override
    public String getSymbolName() {
        return "ArrayAccess";
    }

    @Override
    public String generateCode() {
        return "[" + index.generateCode() + "]";
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(index);
    }
}
