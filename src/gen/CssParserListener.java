package gen;
// Generated from C:/Users/ASUS/Documents/GitHub/angularCompiler/src/CssParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code CssFileStat}
	 * labeled alternative in {@link CssParser#cssFile}.
	 * @param ctx the parse tree
	 */
	void enterCssFileStat(CssParser.CssFileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFileStat}
	 * labeled alternative in {@link CssParser#cssFile}.
	 * @param ctx the parse tree
	 */
	void exitCssFileStat(CssParser.CssFileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtRuleStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleStat(CssParser.AtRuleStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtRuleStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleStat(CssParser.AtRuleStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RuleSetStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRuleSetStat(CssParser.RuleSetStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RuleSetStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRuleSetStat(CssParser.RuleSetStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyframesStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterKeyframesStat(CssParser.KeyframesStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyframesStat}
	 * labeled alternative in {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitKeyframesStat(CssParser.KeyframesStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtRuleBlockStat}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleBlockStat(CssParser.AtRuleBlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtRuleBlockStat}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleBlockStat(CssParser.AtRuleBlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtRuleSemiStat}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleSemiStat(CssParser.AtRuleSemiStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtRuleSemiStat}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleSemiStat(CssParser.AtRuleSemiStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyframePercentage}
	 * labeled alternative in {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframePercentage(CssParser.KeyframePercentageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyframePercentage}
	 * labeled alternative in {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframePercentage(CssParser.KeyframePercentageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyframeFromTo}
	 * labeled alternative in {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeFromTo(CssParser.KeyframeFromToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyframeFromTo}
	 * labeled alternative in {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeFromTo(CssParser.KeyframeFromToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyframesRuleStat}
	 * labeled alternative in {@link CssParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void enterKeyframesRuleStat(CssParser.KeyframesRuleStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyframesRuleStat}
	 * labeled alternative in {@link CssParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void exitKeyframesRuleStat(CssParser.KeyframesRuleStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyframeEntryStat}
	 * labeled alternative in {@link CssParser#keyframeEntry}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeEntryStat(CssParser.KeyframeEntryStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyframeEntryStat}
	 * labeled alternative in {@link CssParser#keyframeEntry}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeEntryStat(CssParser.KeyframeEntryStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockRule}
	 * labeled alternative in {@link CssParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockRule(CssParser.BlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockRule}
	 * labeled alternative in {@link CssParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockRule(CssParser.BlockRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link CssParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CssParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link CssParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CssParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockDeclaration}
	 * labeled alternative in {@link CssParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(CssParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockDeclaration}
	 * labeled alternative in {@link CssParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(CssParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RuleSetRule}
	 * labeled alternative in {@link CssParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSetRule(CssParser.RuleSetRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RuleSetRule}
	 * labeled alternative in {@link CssParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSetRule(CssParser.RuleSetRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorListRule}
	 * labeled alternative in {@link CssParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorListRule(CssParser.SelectorListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorListRule}
	 * labeled alternative in {@link CssParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorListRule(CssParser.SelectorListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorRule}
	 * labeled alternative in {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorRule(CssParser.SelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorRule}
	 * labeled alternative in {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorRule(CssParser.SelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSelectorRule}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorRule(CssParser.SimpleSelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSelectorRule}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorRule(CssParser.SimpleSelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterClassPart(CssParser.ClassPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitClassPart(CssParser.ClassPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterIdPart(CssParser.IdPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitIdPart(CssParser.IdPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttribPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterAttribPart(CssParser.AttribPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttribPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitAttribPart(CssParser.AttribPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterPseudoPart(CssParser.PseudoPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoPart}
	 * labeled alternative in {@link CssParser#simpleSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitPseudoPart(CssParser.PseudoPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdent}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdent(CssParser.TypeIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdent}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdent(CssParser.TypeIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeStar}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeStar(CssParser.TypeStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeStar}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeStar(CssParser.TypeStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelectorRule}
	 * labeled alternative in {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelectorRule(CssParser.ClassSelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelectorRule}
	 * labeled alternative in {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelectorRule(CssParser.ClassSelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdSelectorRule}
	 * labeled alternative in {@link CssParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelectorRule(CssParser.IdSelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdSelectorRule}
	 * labeled alternative in {@link CssParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelectorRule(CssParser.IdSelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttribOnly}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttribOnly(CssParser.AttribOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttribOnly}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttribOnly(CssParser.AttribOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttribIdent}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttribIdent(CssParser.AttribIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttribIdent}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttribIdent(CssParser.AttribIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttribString}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttribString(CssParser.AttribStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttribString}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttribString(CssParser.AttribStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoFuncOrIdent}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudoFuncOrIdent(CssParser.PseudoFuncOrIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoFuncOrIdent}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudoFuncOrIdent(CssParser.PseudoFuncOrIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoElement}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoElement}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoFunctionRule}
	 * labeled alternative in {@link CssParser#pseudoFunction}.
	 * @param ctx the parse tree
	 */
	void enterPseudoFunctionRule(CssParser.PseudoFunctionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoFunctionRule}
	 * labeled alternative in {@link CssParser#pseudoFunction}.
	 * @param ctx the parse tree
	 */
	void exitPseudoFunctionRule(CssParser.PseudoFunctionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CombinatorPlus}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinatorPlus(CssParser.CombinatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CombinatorPlus}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinatorPlus(CssParser.CombinatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CombinatorGreater}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinatorGreater(CssParser.CombinatorGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CombinatorGreater}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinatorGreater(CssParser.CombinatorGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CombinatorTilde}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinatorTilde(CssParser.CombinatorTildeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CombinatorTilde}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinatorTilde(CssParser.CombinatorTildeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationRule}
	 * labeled alternative in {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationRule(CssParser.DeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationRule}
	 * labeled alternative in {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationRule(CssParser.DeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyIdent}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterPropertyIdent(CssParser.PropertyIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyIdent}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitPropertyIdent(CssParser.PropertyIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyCssVar}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterPropertyCssVar(CssParser.PropertyCssVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyCssVar}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitPropertyCssVar(CssParser.PropertyCssVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrioRule}
	 * labeled alternative in {@link CssParser#prio}.
	 * @param ctx the parse tree
	 */
	void enterPrioRule(CssParser.PrioRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrioRule}
	 * labeled alternative in {@link CssParser#prio}.
	 * @param ctx the parse tree
	 */
	void exitPrioRule(CssParser.PrioRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRule}
	 * labeled alternative in {@link CssParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRule(CssParser.ExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRule}
	 * labeled alternative in {@link CssParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRule(CssParser.ExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNumberTerm(CssParser.NumberTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNumberTerm(CssParser.NumberTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegNumberTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNegNumberTerm(CssParser.NegNumberTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegNumberTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNegNumberTerm(CssParser.NegNumberTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimensionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDimensionTerm(CssParser.DimensionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimensionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDimensionTerm(CssParser.DimensionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegDimensionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNegDimensionTerm(CssParser.NegDimensionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegDimensionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNegDimensionTerm(CssParser.NegDimensionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PercentageTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPercentageTerm(CssParser.PercentageTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PercentageTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPercentageTerm(CssParser.PercentageTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegPercentageTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNegPercentageTerm(CssParser.NegPercentageTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegPercentageTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNegPercentageTerm(CssParser.NegPercentageTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterColorTerm(CssParser.ColorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitColorTerm(CssParser.ColorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStringTerm(CssParser.StringTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStringTerm(CssParser.StringTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UrlTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUrlTerm(CssParser.UrlTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UrlTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUrlTerm(CssParser.UrlTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIdentTerm(CssParser.IdentTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIdentTerm(CssParser.IdentTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVarTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssVarTerm(CssParser.CssVarTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVarTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssVarTerm(CssParser.CssVarTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EaseInOutTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterEaseInOutTerm(CssParser.EaseInOutTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EaseInOutTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitEaseInOutTerm(CssParser.EaseInOutTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LinearTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLinearTerm(CssParser.LinearTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LinearTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLinearTerm(CssParser.LinearTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EaseTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterEaseTerm(CssParser.EaseTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EaseTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitEaseTerm(CssParser.EaseTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EaseInTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterEaseInTerm(CssParser.EaseInTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EaseInTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitEaseInTerm(CssParser.EaseInTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EaseOutTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterEaseOutTerm(CssParser.EaseOutTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EaseOutTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitEaseOutTerm(CssParser.EaseOutTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTerm(CssParser.FunctionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTerm(CssParser.FunctionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnicodeRangeTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeRangeTerm(CssParser.UnicodeRangeTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnicodeRangeTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeRangeTerm(CssParser.UnicodeRangeTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(CssParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(CssParser.ValueExprContext ctx);
}