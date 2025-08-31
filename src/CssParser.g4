parser grammar CssParser;

options { tokenVocab=CssLexer; }

// -------------------------------
// Top-level
// -------------------------------
cssFile
    : statement* EOF                              #CssFileStat
    ;

// -------------------------------
// Statements
// -------------------------------
statement
    : atRule             #AtRuleStat
    | ruleSet            #RuleSetStat
    | keyframesRule      #KeyframesStat
    ;

// -------------------------------
// At-Rules
// -------------------------------
atRule
    : AT_KEYWORD selectorList? block             #AtRuleBlockStat
    | AT_KEYWORD selectorList? SEMICOLON        #AtRuleSemiStat
    ;

// -------------------------------
// Keyframes
// -------------------------------
keyframeSelector
    : PERCENTAGE        #KeyframePercentage
    | IDENTIFIER        #KeyframeFromTo     // "from"/"to"
    ;

keyframesRule
    : AT_KEYWORD IDENTIFIER LBRACE keyframeEntry+ RBRACE  #KeyframesRuleStat
    ;

keyframeEntry
    : keyframeSelector LBRACE declaration* RBRACE        #KeyframeEntryStat
    ;

// -------------------------------
// Blocks
// -------------------------------
block
    : LBRACE blockContent* RBRACE   #BlockRule
    ;

blockContent
    : statement          #BlockStatement
    | declaration        #BlockDeclaration
    ;

// -------------------------------
// Rule sets
// -------------------------------
ruleSet
    : selectorList block        #RuleSetRule
    ;

selectorList
    : selector (COMMA selector)*   #SelectorListRule
    ;

selector
    : simpleSelector (combinator simpleSelector)*  #SelectorRule
    ;

simpleSelector
    : typeSelector? simpleSelectorPart*   #SimpleSelectorRule
    ;

// Split parts for labeling
simpleSelectorPart
    : classSelector   #ClassPart
    | idSelector      #IdPart
    | attrib          #AttribPart
    | pseudo          #PseudoPart
    ;

typeSelector
    : IDENTIFIER         #TypeIdent
    | STAR               #TypeStar
    ;

classSelector
    : DOT IDENTIFIER      #ClassSelectorRule
    ;

idSelector
    : HASH IDENTIFIER     #IdSelectorRule
    ;

// -------------------------------
// Attributes
// -------------------------------
attrib
    : LBRACK IDENTIFIER RBRACK                       #AttribOnly
    | LBRACK IDENTIFIER EQ IDENTIFIER RBRACK        #AttribIdent
    | LBRACK IDENTIFIER EQ STRING RBRACK            #AttribString
    ;

// -------------------------------
// Pseudo-classes
// -------------------------------
pseudo
    : COLON IDENTIFIER pseudoFunction?   #PseudoFuncOrIdent
    | COLON COLON IDENTIFIER             #PseudoElement
    ;

// Optional pseudo function
pseudoFunction
    : LPAREN value (COMMA value)* RPAREN   #PseudoFunctionRule
    ;

// -------------------------------
// Combinators
// -------------------------------
combinator
    : PLUS      #CombinatorPlus
    | GREATER   #CombinatorGreater
    | TILDE     #CombinatorTilde
    ;

// -------------------------------
// Declarations
// -------------------------------
declaration
    : property COLON expr prio? SEMICOLON?   #DeclarationRule
    ;

property
    : IDENTIFIER      #PropertyIdent
    | CSS_VAR_DEF     #PropertyCssVar
    ;

prio
    : BANG IMPORTANT   #PrioRule
    ;

// -------------------------------
// Expressions / Terms
// -------------------------------
expr
    : term+   #ExprRule
    ;

term
    : NUMBER                    #NumberTerm
    | NEG_NUMBER                #NegNumberTerm
    | DIMENSION                 #DimensionTerm
    | NEG_DIMENSION             #NegDimensionTerm
    | PERCENTAGE                #PercentageTerm
    | NEG_PERCENTAGE            #NegPercentageTerm
    | HASH_COLOR                #ColorTerm
    | STRING                    #StringTerm
    | URL                       #UrlTerm
    | IDENTIFIER                #IdentTerm
    | CSS_VAR                    #CssVarTerm
    | EASE_IN_OUT               #EaseInOutTerm
    | LINEAR                    #LinearTerm
    | EASE                      #EaseTerm
    | EASE_IN                   #EaseInTerm
    | EASE_OUT                  #EaseOutTerm
    | FUNCTION expr (COMMA expr)* RPAREN   #FunctionTerm
    | UNICODE_RANGE             #UnicodeRangeTerm
    ;

// -------------------------------
// Values for pseudo-classes
// -------------------------------
value
    : expr   #ValueExpr
    ;
