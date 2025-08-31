package gen;
// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/HtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HtmlParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HtmlParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(HtmlParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidElementNode}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElementNode(HtmlParser.VoidElementNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(HtmlParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tagOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpen(HtmlParser.TagOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tagClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClose(HtmlParser.TagCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HtmlParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValue(HtmlParser.AttrValueContext ctx);
}