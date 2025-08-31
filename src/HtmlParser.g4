parser grammar HtmlParser;

options { tokenVocab=HtmlLexer; }

htmlDocument
    : content* EOF
    ;

// Top-level content
content
    : element
    | COMMENT
    | DOCTYPE
    | CDATA
    | TEXT
    | INTERPOLATION
    ;

// Elements: normal, self-closing, or void
element
    : OPEN tagOpen GT content* OPEN_END tagClose GT      # normalElement
    | OPEN VOID_TAG attribute* GT                        # voidElementNode
    | OPEN tagOpen SLASH_CLOSE                           # selfClosingElement
    ;

tagOpen
    : NAME attribute*
    ;

tagClose
    : NAME
    ;

attribute
    : NAME (EQUALS attrValue)?
    ;

attrValue
    : DQ_STRING
    | SQ_STRING
    ;
