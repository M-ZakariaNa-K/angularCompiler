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
	 * Enter a parse tree produced by {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HtmlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HtmlParser.ElementContext ctx);
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