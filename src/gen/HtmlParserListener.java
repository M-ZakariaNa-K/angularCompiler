package gen;
// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/HtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HtmlParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HtmlParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HtmlParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HtmlParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(HtmlParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(HtmlParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidElementNode}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterVoidElementNode(HtmlParser.VoidElementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidElementNode}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitVoidElementNode(HtmlParser.VoidElementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(HtmlParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(HtmlParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void enterTagOpen(HtmlParser.TagOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void exitTagOpen(HtmlParser.TagOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tagClose}.
	 * @param ctx the parse tree
	 */
	void enterTagClose(HtmlParser.TagCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tagClose}.
	 * @param ctx the parse tree
	 */
	void exitTagClose(HtmlParser.TagCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HtmlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HtmlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(HtmlParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(HtmlParser.AttrValueContext ctx);
}