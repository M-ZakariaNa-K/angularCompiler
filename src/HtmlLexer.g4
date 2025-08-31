lexer grammar HtmlLexer;

// -----------------------------
// Default mode: outside of tags
// -----------------------------

DOCTYPE : '<!' 'DOCTYPE' .*? '>' ;
COMMENT : '<!--' .*? '-->' ;
CDATA   : '<![CDATA[' .*? ']]>' ;

// Opening sequences: enter TAG mode
OPEN_END : '</' -> pushMode(TAG);
OPEN     : '<'  -> pushMode(TAG);

TEXT : ~[<\r\n]+ ;

INTERPOLATION
    : '{{' .*? '}}' ;

WS : [ \t\r\n]+ -> skip ;

// -----------------------------
// TAG mode: inside a tag
// -----------------------------
mode TAG;

SLASH_CLOSE : '/>' -> popMode ;

GT : '>' -> popMode ;

EQUALS : '=' ;

DQ_STRING : '"' (~["\r\n])* '"' ;
SQ_STRING : '\'' (~['\r\n])* '\'' ;

// Void elements
VOID_TAG
    : 'area' | 'base' | 'br' | 'col' | 'embed'
    | 'hr' | 'img' | 'input' | 'link' | 'meta'
    | 'param' | 'source' | 'track' | 'wbr'
    ;

NAME : [a-zA-Z_:] [a-zA-Z0-9_:.\-]* ;

SLASH : '/' ;

TAG_WS : [ \t\r\n]+ -> skip ;
