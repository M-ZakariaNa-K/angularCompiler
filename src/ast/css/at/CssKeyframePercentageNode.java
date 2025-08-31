package ast.css.at;

public class CssKeyframePercentageNode extends CssKeyframeSelectorNode {
    private final String percentage; // e.g. "0%", "50%"

    public CssKeyframePercentageNode(String percentage, int line) {
        super(line);
        this.percentage = percentage;
    }

    public String getPercentage() { return percentage; }

    @Override
    public String getSymbolName() { return percentage; }

    @Override
    public String generateCode() { return percentage; }

    @Override
    public String toString(int level) {
        return indent(level) + "CssKeyframePercentage(" + percentage + ")";
    }
}
