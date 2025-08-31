package gen;
// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/CssParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code CssFileStat}
	 * labeled alternative in {@link CssParser#cssFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFileStat(CssParser.CssFileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtRuleStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleStat(CssParser.AtRuleStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RuleSetStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSetStat(CssParser.RuleSetStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyframesStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesStat(CssParser.KeyframesStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtRuleBlockStat}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleBlockStat(CssParser.AtRuleBlockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtRuleSemiStat}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleSemiStat(CssParser.AtRuleSemiStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyframePercentage}
	 * labeled alternative in {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframePercentage(CssParser.KeyframePercentageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyframeFromTo}
	 * labeled alternative in {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeFromTo(CssParser.KeyframeFromToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyframesRuleStat}
	 * labeled alternative in {@link CssParser#keyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesRuleStat(CssParser.KeyframesRuleStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyframeEntryStat}
	 * labeled alternative in {@link CssParser#keyframeEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeEntryStat(CssParser.KeyframeEntryStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockRule}
	 * labeled alternative in {@link CssParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockRule(CssParser.BlockRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link CssParser#blockContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CssParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockDeclaration}
	 * labeled alternative in {@link CssParser#blockContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(CssParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RuleSetRule}
	 * labeled alternative in {@link CssParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSetRule(CssParser.RuleSetRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorListRule}
	 * labeled alternative in {@link CssParser#selectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorListRule(CssParser.SelectorListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorRule}
	 * labeled alternative in {@link CssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorRule(CssParser.SelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleSelectorRule}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorRule(CssParser.SimpleSelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPart(CssParser.ClassPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPart(CssParser.IdPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttribPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribPart(CssParser.AttribPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoPart(CssParser.PseudoPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeIdent}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdent(CssParser.TypeIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeStar}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStar(CssParser.TypeStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelectorRule}
	 * labeled alternative in {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelectorRule(CssParser.ClassSelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdSelectorRule}
	 * labeled alternative in {@link CssParser#idSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelectorRule(CssParser.IdSelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttribOnly}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribOnly(CssParser.AttribOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttribIdent}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribIdent(CssParser.AttribIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttribString}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribString(CssParser.AttribStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoFuncOrIdent}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoFuncOrIdent(CssParser.PseudoFuncOrIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoElement}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoFunctionRule}
	 * labeled alternative in {@link CssParser#pseudoFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoFunctionRule(CssParser.PseudoFunctionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CombinatorPlus}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinatorPlus(CssParser.CombinatorPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CombinatorGreater}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinatorGreater(CssParser.CombinatorGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CombinatorTilde}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinatorTilde(CssParser.CombinatorTildeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationRule}
	 * labeled alternative in {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(CssParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyIdent}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyIdent(CssParser.PropertyIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyCssVar}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyCssVar(CssParser.PropertyCssVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrioRule}
	 * labeled alternative in {@link CssParser#prio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrioRule(CssParser.PrioRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRule}
	 * labeled alternative in {@link CssParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRule(CssParser.ExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTerm(CssParser.NumberTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegNumberTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegNumberTerm(CssParser.NegNumberTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimensionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionTerm(CssParser.DimensionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegDimensionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegDimensionTerm(CssParser.NegDimensionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PercentageTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentageTerm(CssParser.PercentageTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegPercentageTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegPercentageTerm(CssParser.NegPercentageTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorTerm(CssParser.ColorTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTerm(CssParser.StringTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UrlTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlTerm(CssParser.UrlTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentTerm(CssParser.IdentTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVarTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVarTerm(CssParser.CssVarTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EaseInOutTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEaseInOutTerm(CssParser.EaseInOutTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LinearTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearTerm(CssParser.LinearTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EaseTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEaseTerm(CssParser.EaseTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EaseInTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEaseInTerm(CssParser.EaseInTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EaseOutTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEaseOutTerm(CssParser.EaseOutTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTerm(CssParser.FunctionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnicodeRangeTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeRangeTerm(CssParser.UnicodeRangeTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(CssParser.ValueExprContext ctx);
}