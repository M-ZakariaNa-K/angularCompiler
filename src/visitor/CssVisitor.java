package visitor;

import ast.ASTNode;

// file & statements
import ast.css.CssFileNode;
import ast.css.CssStatementNode;
import ast.css.statements.CssAtRuleStatementNode;
import ast.css.statements.CssRuleSetStatementNode;
import ast.css.statements.CssKeyframesStatementNode;

// at-rules & keyframes
import ast.css.at.CssAtRuleBlockNode;
import ast.css.at.CssAtRuleSemiNode;
import ast.css.at.CssKeyframeSelectorNode;
import ast.css.at.CssKeyframePercentageNode;
import ast.css.at.CssKeyframeFromToNode;
import ast.css.at.CssKeyframeEntryNode;
import ast.css.at.CssKeyframesRuleNode;

// blocks
import ast.css.blocks.CssBlockNode;
import ast.css.blocks.CssBlockContentNode;
import ast.css.blocks.CssBlockStatementNode;
import ast.css.blocks.CssBlockDeclarationNode;

// selectors
import ast.css.selectors.CssRuleSetNode;
import ast.css.selectors.CssSelectorListNode;
import ast.css.selectors.CssSelectorNode;
import ast.css.selectors.CssSimpleSelectorNode;
import ast.css.selectors.CssSimpleSelectorPartNode;
import ast.css.selectors.CssTypeSelectorNode;
import ast.css.selectors.CssTypeIdentNode;
import ast.css.selectors.CssTypeStarNode;
import ast.css.selectors.CssClassSelectorNode;
import ast.css.selectors.CssIdSelectorNode;
import ast.css.selectors.CssAttribNode;
import ast.css.selectors.CssAttribOnlyNode;
import ast.css.selectors.CssAttribIdentNode;
import ast.css.selectors.CssAttribStringNode;
import ast.css.selectors.CssPseudoFuncOrIdentNode;
import ast.css.selectors.CssPseudoElementNode;
import ast.css.selectors.CssPseudoFunctionNode;
import ast.css.selectors.CssCombinatorNode;

// declarations
import ast.css.Declarations.CssDeclarationNode;
import ast.css.Declarations.CssPropertyNode;
import ast.css.Declarations.CssPropertyIdentNode;
import ast.css.Declarations.CssPropertyCssVarNode;
import ast.css.Declarations.CssPrioNode;

// expr & terms
import ast.css.expr.CssExprNode;
import ast.css.expr.CssTermNode;
import ast.css.expr.CssNumberTermNode;
import ast.css.expr.CssNegNumberTermNode;
import ast.css.expr.CssDimensionTermNode;
import ast.css.expr.CssNegDimensionTermNode;
import ast.css.expr.CssPercentageTermNode;
import ast.css.expr.CssNegPercentageTermNode;
import ast.css.expr.CssColorTermNode;
import ast.css.expr.CssStringTermNode;
import ast.css.expr.CssUrlTermNode;
import ast.css.expr.CssIdentTermNode;
import ast.css.expr.CssCssVarTermNode;
import ast.css.expr.CssEaseInOutTermNode;
import ast.css.expr.CssLinearTermNode;
import ast.css.expr.CssEaseTermNode;
import ast.css.expr.CssEaseInTermNode;
import ast.css.expr.CssEaseOutTermNode;
import ast.css.expr.CssFunctionTermNode;
import ast.css.expr.CssUnicodeRangeTermNode;
import ast.css.expr.CssValueExprNode;

import gen.CssParser;
import gen.CssParserVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CssVisitor extends AbstractParseTreeVisitor<ASTNode> implements CssParserVisitor<ASTNode> {

    // ------------------------------
    // Helpers
    // ------------------------------
    private static int lineOf(Token t) { return t == null ? 0 : t.getLine(); }

    private static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        char c0 = s.charAt(0);
        char c1 = s.charAt(s.length() - 1);
        if ((c0 == '"' && c1 == '"') || (c0 == '\'' && c1 == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    private static char detectQuote(String s) {
        if (s != null && s.length() >= 2) {
            char c0 = s.charAt(0);
            char c1 = s.charAt(s.length() - 1);
            if (c0 == '"' && c1 == '"') return '"';
            if (c0 == '\'' && c1 == '\'') return '\'';
        }
        return '"';
    }

    private static String[] splitNumberUnit(String dimText, boolean negative) {
        // dimText like "12px" or "0.5rem" etc., no leading '-'
        // Find first non [0-9.] char
        int i = 0;
        int n = dimText.length();
        while (i < n) {
            char ch = dimText.charAt(i);
            if (!((ch >= '0' && ch <= '9') || ch == '.')) break;
            i++;
        }
        String number = dimText.substring(0, i);
        String unit = dimText.substring(i);
        if (negative) number = "-" + number;
        return new String[]{number, unit};
    }

    private static String stripPrefix(String s, String prefix) {
        if (s != null && s.startsWith(prefix)) return s.substring(prefix.length());
        return s;
    }

    // ------------------------------
    // Top-level
    // ------------------------------
    @Override
    public ASTNode visitCssFileStat(CssParser.CssFileStatContext ctx) {
        List<CssStatementNode> statements = new ArrayList<CssStatementNode>();
        for (CssParser.StatementContext sc : ctx.statement()) {
            ASTNode n = visit(sc);
            if (n instanceof CssStatementNode) {
                statements.add((CssStatementNode) n);
            }
        }
        int line = ctx.getStart() != null ? ctx.getStart().getLine() : 0;
        return new CssFileNode(statements, line);
    }

    // ------------------------------
    // Statements (wrappers)
    // ------------------------------
    @Override
    public ASTNode visitAtRuleStat(CssParser.AtRuleStatContext ctx) {
        ASTNode at = visit(ctx.atRule());
        int line = ctx.getStart().getLine();
        return new CssAtRuleStatementNode(at, line);
    }

    @Override
    public ASTNode visitRuleSetStat(CssParser.RuleSetStatContext ctx) {
        CssRuleSetNode rs = (CssRuleSetNode) visit(ctx.ruleSet());
        int line = ctx.getStart().getLine();
        return new CssRuleSetStatementNode(rs, line);
    }

    @Override
    public ASTNode visitKeyframesStat(CssParser.KeyframesStatContext ctx) {
        CssKeyframesRuleNode kf = (CssKeyframesRuleNode) visit(ctx.keyframesRule());
        int line = ctx.getStart().getLine();
        return new CssKeyframesStatementNode(kf, line);
    }

    // ------------------------------
    // At-rules
    // ------------------------------
    @Override
    public ASTNode visitAtRuleBlockStat(CssParser.AtRuleBlockStatContext ctx) {
        String atKw = ctx.AT_KEYWORD().getText(); // e.g. "@media"
        CssSelectorListNode selList = null;
        if (ctx.selectorList() != null) {
            selList = (CssSelectorListNode) visit(ctx.selectorList());
        }
        CssBlockNode block = (CssBlockNode) visit(ctx.block());
        int line = ctx.getStart().getLine();
        return new CssAtRuleBlockNode(atKw, selList, block, line);
    }

    @Override
    public ASTNode visitAtRuleSemiStat(CssParser.AtRuleSemiStatContext ctx) {
        String atKw = ctx.AT_KEYWORD().getText();
        CssSelectorListNode selList = null;
        if (ctx.selectorList() != null) {
            selList = (CssSelectorListNode) visit(ctx.selectorList());
        }
        int line = ctx.getStart().getLine();
        return new CssAtRuleSemiNode(atKw, selList, line);
    }

    // ------------------------------
    // Keyframes
    // ------------------------------
    @Override
    public ASTNode visitKeyframePercentage(CssParser.KeyframePercentageContext ctx) {
        String pct = ctx.PERCENTAGE().getText(); // e.g. "50%"
        int line = ctx.getStart().getLine();
        return new CssKeyframePercentageNode(pct, line);
    }

    @Override
    public ASTNode visitKeyframeFromTo(CssParser.KeyframeFromToContext ctx) {
        String ident = ctx.IDENTIFIER().getText(); // "from" or "to"
        int line = ctx.getStart().getLine();
        return new CssKeyframeFromToNode(ident, line);
    }

    @Override
    public ASTNode visitKeyframesRuleStat(CssParser.KeyframesRuleStatContext ctx) {
        String atKw = ctx.AT_KEYWORD().getText(); // "@keyframes" (or vendor)
        String name = ctx.IDENTIFIER().getText();
        List<CssKeyframeEntryNode> entries = new ArrayList<CssKeyframeEntryNode>();
        for (CssParser.KeyframeEntryContext ec : ctx.keyframeEntry()) {
            entries.add((CssKeyframeEntryNode) visit(ec));
        }
        int line = ctx.getStart().getLine();
        return new CssKeyframesRuleNode(atKw, name, entries, line);
    }

    @Override
    public ASTNode visitKeyframeEntryStat(CssParser.KeyframeEntryStatContext ctx) {
        CssKeyframeSelectorNode sel = (CssKeyframeSelectorNode) visit(ctx.keyframeSelector());
        List<CssDeclarationNode> decls = new ArrayList<CssDeclarationNode>();
        for (CssParser.DeclarationContext dc : ctx.declaration()) {
            decls.add((CssDeclarationNode) visit(dc));
        }
        int line = ctx.getStart().getLine();
        return new CssKeyframeEntryNode(sel, decls, line);
    }

    // ------------------------------
    // Blocks
    // ------------------------------
    @Override
    public ASTNode visitBlockRule(CssParser.BlockRuleContext ctx) {
        List<CssBlockContentNode> contents = new ArrayList<CssBlockContentNode>();
        for (CssParser.BlockContentContext bc : ctx.blockContent()) {
            ASTNode n = visit(bc);
            if (n instanceof CssBlockContentNode) contents.add((CssBlockContentNode) n);
        }
        int line = ctx.getStart().getLine();
        return new CssBlockNode(contents, line);
    }

    @Override
    public ASTNode visitBlockStatement(CssParser.BlockStatementContext ctx) {
        CssStatementNode st = (CssStatementNode) visit(ctx.statement());
        int line = ctx.getStart().getLine();
        return new CssBlockStatementNode(st, line);
    }

    @Override
    public ASTNode visitBlockDeclaration(CssParser.BlockDeclarationContext ctx) {
        CssDeclarationNode decl = (CssDeclarationNode) visit(ctx.declaration());
        int line = ctx.getStart().getLine();
        return new CssBlockDeclarationNode(decl, line);
    }

    // ------------------------------
    // Rule sets & selectors
    // ------------------------------
    @Override
    public ASTNode visitRuleSetRule(CssParser.RuleSetRuleContext ctx) {
        CssSelectorListNode sl = (CssSelectorListNode) visit(ctx.selectorList());
        CssBlockNode block = (CssBlockNode) visit(ctx.block());
        int line = ctx.getStart().getLine();
        return new CssRuleSetNode(sl, block, line);
    }

    @Override
    public ASTNode visitSelectorListRule(CssParser.SelectorListRuleContext ctx) {
        List<CssSelectorNode> list = new ArrayList<CssSelectorNode>();
        for (CssParser.SelectorContext sc : ctx.selector()) {
            list.add((CssSelectorNode) visit(sc));
        }
        int line = ctx.getStart().getLine();
        return new CssSelectorListNode(list, line);
    }

    @Override
    public ASTNode visitSelectorRule(CssParser.SelectorRuleContext ctx) {
        CssSimpleSelectorNode first = (CssSimpleSelectorNode) visit(ctx.simpleSelector(0));
        List<CssSelectorNode.CssSelectorTailItem> tails = new ArrayList<CssSelectorNode.CssSelectorTailItem>();
        // pairs of (combinator, simpleSelector)
        int pairCount = ctx.combinator().size();
        for (int i = 0; i < pairCount; i++) {
            CssCombinatorNode comb = (CssCombinatorNode) visit(ctx.combinator(i));
            CssSimpleSelectorNode nextSel = (CssSimpleSelectorNode) visit(ctx.simpleSelector(i + 1));
            tails.add(new CssSelectorNode.CssSelectorTailItem(comb, nextSel));
        }
        int line = ctx.getStart().getLine();
        return new CssSelectorNode(first, tails, line);
    }

    @Override
    public ASTNode visitSimpleSelectorRule(CssParser.SimpleSelectorRuleContext ctx) {
        CssTypeSelectorNode type = null;
        if (ctx.typeSelector() != null) {
            ASTNode t = visit(ctx.typeSelector());
            if (t instanceof CssTypeSelectorNode) type = (CssTypeSelectorNode) t;
        }
        List<CssSimpleSelectorPartNode> parts = new ArrayList<CssSimpleSelectorPartNode>();
        for (CssParser.SimpleSelectorPartContext pc : ctx.simpleSelectorPart()) {
            ASTNode n = visit(pc);
            if (n instanceof CssSimpleSelectorPartNode) parts.add((CssSimpleSelectorPartNode) n);
        }
        int line = ctx.getStart().getLine();
        return new CssSimpleSelectorNode(type, parts, line);
    }

    @Override
    public ASTNode visitClassPart(CssParser.ClassPartContext ctx) {
        return visit(ctx.classSelector());
    }

    @Override
    public ASTNode visitIdPart(CssParser.IdPartContext ctx) {
        return visit(ctx.idSelector());
    }

    @Override
    public ASTNode visitAttribPart(CssParser.AttribPartContext ctx) {
        return visit(ctx.attrib());
    }

    @Override
    public ASTNode visitPseudoPart(CssParser.PseudoPartContext ctx) {
        return visit(ctx.pseudo());
    }

    @Override
    public ASTNode visitTypeIdent(CssParser.TypeIdentContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssTypeIdentNode(ident, line);
    }

    @Override
    public ASTNode visitTypeStar(CssParser.TypeStarContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssTypeStarNode(line);
    }

    @Override
    public ASTNode visitClassSelectorRule(CssParser.ClassSelectorRuleContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssClassSelectorNode(ident, line);
    }

    @Override
    public ASTNode visitIdSelectorRule(CssParser.IdSelectorRuleContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssIdSelectorNode(ident, line);
    }

    // ------------------------------
    // Attributes
    // ------------------------------
    @Override
    public ASTNode visitAttribOnly(CssParser.AttribOnlyContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssAttribOnlyNode(ident, line);
    }

    @Override
    public ASTNode visitAttribIdent(CssParser.AttribIdentContext ctx) {
        String left = ctx.IDENTIFIER(0).getText();
        String right = ctx.IDENTIFIER(1).getText();
        int line = ctx.getStart().getLine();
        return new CssAttribIdentNode(left, right, line);
    }

    @Override
    public ASTNode visitAttribString(CssParser.AttribStringContext ctx) {
        String left = ctx.IDENTIFIER().getText();
        String strTok = ctx.STRING().getText();
        String raw = stripQuotes(strTok);
        int line = ctx.getStart().getLine();
        return new CssAttribStringNode(left, raw, line);
    }

    // ------------------------------
    // Pseudos
    // ------------------------------
    @Override
    public ASTNode visitPseudoFuncOrIdent(CssParser.PseudoFuncOrIdentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        CssValueExprNode arg = null;
        if (ctx.pseudoFunction() != null) {
            // We’ll use only the first value expr if multiple are present (see note at top).
            CssPseudoFunctionNode fn = (CssPseudoFunctionNode) visit(ctx.pseudoFunction());
            List<CssValueExprNode> vals = fn.getValues();
            if (!vals.isEmpty()) arg = vals.get(0);
        }
        int line = ctx.getStart().getLine();
        return new CssPseudoFuncOrIdentNode(name, arg, line);
    }

    @Override
    public ASTNode visitPseudoElement(CssParser.PseudoElementContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssPseudoElementNode(name, line);
    }

    @Override
    public ASTNode visitPseudoFunctionRule(CssParser.PseudoFunctionRuleContext ctx) {
        List<CssValueExprNode> values = new ArrayList<CssValueExprNode>();
        for (CssParser.ValueContext vc : ctx.value()) {
            values.add((CssValueExprNode) visit(vc));
        }
        int line = ctx.getStart().getLine();
        return new CssPseudoFunctionNode(values, line);
    }

    // ------------------------------
    // Combinators
    // ------------------------------
    @Override
    public ASTNode visitCombinatorPlus(CssParser.CombinatorPlusContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssCombinatorNode(CssCombinatorNode.Type.PLUS, line);
    }

    @Override
    public ASTNode visitCombinatorGreater(CssParser.CombinatorGreaterContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssCombinatorNode(CssCombinatorNode.Type.GREATER, line);
    }

    @Override
    public ASTNode visitCombinatorTilde(CssParser.CombinatorTildeContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssCombinatorNode(CssCombinatorNode.Type.TILDE, line);
    }

    // ------------------------------
    // Declarations
    // ------------------------------
    @Override
    public ASTNode visitDeclarationRule(CssParser.DeclarationRuleContext ctx) {
        CssPropertyNode prop = (CssPropertyNode) visit(ctx.property());
        CssExprNode expr = (CssExprNode) visit(ctx.expr());
        CssPrioNode prio = null;
        if (ctx.prio() != null) prio = (CssPrioNode) visit(ctx.prio());
        int line = ctx.getStart().getLine();
        return new CssDeclarationNode(prop, expr, prio, line);
    }

    @Override
    public ASTNode visitPropertyIdent(CssParser.PropertyIdentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssPropertyIdentNode(name, line);
    }

    @Override
    public ASTNode visitPropertyCssVar(CssParser.PropertyCssVarContext ctx) {
        // CSS_VAR_DEF token text like "--my-var"
        String raw = ctx.CSS_VAR_DEF().getText();
        String name = raw.startsWith("--") ? raw.substring(2) : raw;
        int line = ctx.getStart().getLine();
        return new CssPropertyCssVarNode(name, line);
    }

    @Override
    public ASTNode visitPrioRule(CssParser.PrioRuleContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssPrioNode(line);
    }

    // ------------------------------
    // Expressions / Terms
    // ------------------------------
    @Override
    public ASTNode visitExprRule(CssParser.ExprRuleContext ctx) {
        List<CssTermNode> terms = new ArrayList<CssTermNode>();
        for (CssParser.TermContext tc : ctx.term()) {
            terms.add((CssTermNode) visit(tc));
        }
        int line = ctx.getStart().getLine();
        return new CssExprNode(terms, line);
    }

    @Override
    public ASTNode visitNumberTerm(CssParser.NumberTermContext ctx) {
        String text = ctx.NUMBER().getText();
        int line = ctx.getStart().getLine();
        return new CssNumberTermNode(text, line);
    }

    @Override
    public ASTNode visitNegNumberTerm(CssParser.NegNumberTermContext ctx) {
        String text = ctx.NEG_NUMBER().getText(); // includes '-'
        int line = ctx.getStart().getLine();
        return new CssNegNumberTermNode(text, line);
    }

    @Override
    public ASTNode visitDimensionTerm(CssParser.DimensionTermContext ctx) {
        String text = ctx.DIMENSION().getText(); // e.g. "12px"
        String[] split = splitNumberUnit(text, false);
        String num = split[0];
        String unit = split[1];
        int line = ctx.getStart().getLine();
        return new CssDimensionTermNode(num, unit, line);
    }

    @Override
    public ASTNode visitNegDimensionTerm(CssParser.NegDimensionTermContext ctx) {
        String text = ctx.NEG_DIMENSION().getText(); // e.g. "-12px"
        String t = text.startsWith("-") ? text.substring(1) : text;
        String[] split = splitNumberUnit(t, true); // prepend '-' to number
        String numWithSign = split[0]; // already negative
        String unit = split[1];
        int line = ctx.getStart().getLine();
        // Our NegDimension node expects number/unit without another minus handling
        return new CssNegDimensionTermNode(stripPrefix(numWithSign, "-"), unit, line);
    }

    @Override
    public ASTNode visitPercentageTerm(CssParser.PercentageTermContext ctx) {
        String text = ctx.PERCENTAGE().getText(); // "10%"
        String num = text.substring(0, text.length() - 1);
        int line = ctx.getStart().getLine();
        return new CssPercentageTermNode(num, line);
    }

    @Override
    public ASTNode visitNegPercentageTerm(CssParser.NegPercentageTermContext ctx) {
        String text = ctx.NEG_PERCENTAGE().getText(); // "-10%"
        String digits = text.substring(1, text.length() - 1);
        int line = ctx.getStart().getLine();
        return new CssNegPercentageTermNode(digits, line);
    }

    @Override
    public ASTNode visitColorTerm(CssParser.ColorTermContext ctx) {
        String hex = ctx.HASH_COLOR().getText(); // includes '#'
        int line = ctx.getStart().getLine();
        return new CssColorTermNode(hex, line);
    }

    @Override
    public ASTNode visitStringTerm(CssParser.StringTermContext ctx) {
        String tok = ctx.STRING().getText();
        char quote = detectQuote(tok);
        String raw = stripQuotes(tok);
        int line = ctx.getStart().getLine();
        return new CssStringTermNode(raw, quote, line);
    }

    @Override
    public ASTNode visitUrlTerm(CssParser.UrlTermContext ctx) {
        String tok = ctx.URL().getText(); // "url(...)" possibly with inner chars
        String inside = tok;
        if (tok.startsWith("url(") && tok.endsWith(")")) {
            inside = tok.substring(4, tok.length() - 1);
        }
        int line = ctx.getStart().getLine();
        return new CssUrlTermNode(inside, line);
    }

    @Override
    public ASTNode visitIdentTerm(CssParser.IdentTermContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new CssIdentTermNode(ident, line);
    }

    @Override
    public ASTNode visitCssVarTerm(CssParser.CssVarTermContext ctx) {
        // CSS_VAR token: "var(--name)"
        String tok = ctx.CSS_VAR().getText();
        String name = tok;
        // Extract between "var(--" and ")"
        if (tok.startsWith("var(--") && tok.endsWith(")")) {
            name = tok.substring("var(--".length(), tok.length() - 1);
        }
        int line = ctx.getStart().getLine();
        return new CssCssVarTermNode(name, line);
    }

    @Override
    public ASTNode visitEaseInOutTerm(CssParser.EaseInOutTermContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssEaseInOutTermNode(line);
    }

    @Override
    public ASTNode visitLinearTerm(CssParser.LinearTermContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssLinearTermNode(line);
    }

    @Override
    public ASTNode visitEaseTerm(CssParser.EaseTermContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssEaseTermNode(line);
    }

    @Override
    public ASTNode visitEaseInTerm(CssParser.EaseInTermContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssEaseInTermNode(line);
    }

    @Override
    public ASTNode visitEaseOutTerm(CssParser.EaseOutTermContext ctx) {
        int line = ctx.getStart().getLine();
        return new CssEaseOutTermNode(line);
    }

    @Override
    public ASTNode visitFunctionTerm(CssParser.FunctionTermContext ctx) {
        // FUNCTION token text looks like "name(" — strip trailing '('
        String fnTok = ctx.FUNCTION().getText();
        String name = fnTok.endsWith("(") ? fnTok.substring(0, fnTok.length() - 1) : fnTok;
        List<CssExprNode> args = new ArrayList<CssExprNode>();
        for (CssParser.ExprContext ec : ctx.expr()) {
            args.add((CssExprNode) visit(ec));
        }
        int line = ctx.getStart().getLine();
        return new CssFunctionTermNode(name, args, line);
    }

    @Override
    public ASTNode visitUnicodeRangeTerm(CssParser.UnicodeRangeTermContext ctx) {
        String text = ctx.UNICODE_RANGE().getText(); // e.g. "U+00A0-00FF"
        int line = ctx.getStart().getLine();
        return new CssUnicodeRangeTermNode(text, line);
    }

    // ------------------------------
    // Value for pseudo-classes
    // ------------------------------
    @Override
    public ASTNode visitValueExpr(CssParser.ValueExprContext ctx) {
        CssExprNode expr = (CssExprNode) visit(ctx.expr());
        int line = ctx.getStart().getLine();
        return new CssValueExprNode(expr, line);
    }
}
