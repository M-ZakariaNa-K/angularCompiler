package visitor;

import ast.ASTNode;
import ast.html.*;
import gen.HtmlParser;
import gen.HtmlParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;

public class HTMLVisitor extends AbstractParseTreeVisitor<ASTNode> implements HtmlParserVisitor<ASTNode> {

    @Override
    public ASTNode visitHtmlDocument(HtmlParser.HtmlDocumentContext ctx) {
        List<HtmlBaseNode> contents = new ArrayList<>();
        for (HtmlParser.ContentContext contentCtx : ctx.content()) {
            ASTNode node = visit(contentCtx);
            if (node != null && node instanceof HtmlBaseNode) {
                contents.add((HtmlBaseNode) node);
            }
        }
        return new HtmlDocumentNode(contents, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitContent(HtmlParser.ContentContext ctx) {
        if (ctx.element() != null) return visit(ctx.element());
        if (ctx.COMMENT() != null) return new HtmlCommentNode(ctx.COMMENT().getText(), ctx.getStart().getLine());
        if (ctx.DOCTYPE() != null) {
            String text = ctx.DOCTYPE().getText().replaceAll("<!DOCTYPE", "").replaceAll(">", "").trim();
            return new HtmlDoctypeNode(text, ctx.getStart().getLine());
        }
        if (ctx.CDATA() != null) {
            String text = ctx.CDATA().getText().replaceAll("<!\\[CDATA\\[", "").replaceAll("]]>", "");
            return new HtmlCdataNode(text, ctx.getStart().getLine());
        }
        if (ctx.TEXT() != null) return new HtmlTextNode(ctx.TEXT().getText(), ctx.getStart().getLine());
        if (ctx.INTERPOLATION() != null) {
            String expr = ctx.INTERPOLATION().getText().replace("{{", "").replace("}}", "").trim();
            return new HtmlInterpolationNode(expr, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public ASTNode visitNormalElement(HtmlParser.NormalElementContext ctx) {
        String tagName = ctx.tagOpen().NAME().getText();
        List<HtmlAttributeNode> attributes = new ArrayList<>();
        for (HtmlParser.AttributeContext attrCtx : ctx.tagOpen().attribute()) {
            HtmlAttributeNode attrNode = (HtmlAttributeNode) visit(attrCtx);
            attributes.add(attrNode);
        }

        List<HtmlBaseNode> children = new ArrayList<>();
        for (HtmlParser.ContentContext contentCtx : ctx.content()) {
            ASTNode child = visit(contentCtx);
            if (child != null && child instanceof HtmlBaseNode) {
                children.add((HtmlBaseNode) child);
            }
        }

        return new HtmlElementNode(tagName, attributes, children, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitVoidElementNode(HtmlParser.VoidElementNodeContext ctx) {
        String tagName = ctx.VOID_TAG().getText();
        List<HtmlAttributeNode> attributes = new ArrayList<>();
        for (HtmlParser.AttributeContext attrCtx : ctx.attribute()) {
            HtmlAttributeNode attrNode = (HtmlAttributeNode) visit(attrCtx);
            attributes.add(attrNode);
        }
        return new HtmlVoidElementNode(tagName, attributes, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSelfClosingElement(HtmlParser.SelfClosingElementContext ctx) {
        String tagName = ctx.tagOpen().NAME().getText();
        List<HtmlAttributeNode> attributes = new ArrayList<>();
        for (HtmlParser.AttributeContext attrCtx : ctx.tagOpen().attribute()) {
            HtmlAttributeNode attrNode = (HtmlAttributeNode) visit(attrCtx);
            attributes.add(attrNode);
        }
        return new HtmlSelfClosingElementNode(tagName, attributes, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitTagOpen(HtmlParser.TagOpenContext ctx) {
        // Not needed because we process attributes in element visit
        return null;
    }

    @Override
    public ASTNode visitTagClose(HtmlParser.TagCloseContext ctx) {
        // Not needed because tag name handled in element visit
        return null;
    }

    @Override
    public ASTNode visitAttribute(HtmlParser.AttributeContext ctx) {
        String name = ctx.NAME().getText();
        String value = null;
        if (ctx.attrValue() != null) {
            value = ((HtmlAttributeNode) visit(ctx.attrValue())).getValue();
        }
        return new HtmlAttributeNode(name, value, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAttrValue(HtmlParser.AttrValueContext ctx) {
        String text = ctx.getText();
        if ((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("'") && text.endsWith("'"))) {
            text = text.substring(1, text.length() - 1);
        }
        return new HtmlAttributeNode(null, text, ctx.getStart().getLine());
    }
}
