lexer grammar CssLexer;

// Skip whitespace and comments
WS      : [ \t\r\n\f]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

// Symbols
BANG      : '!' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
COLON     : ':' ;
SEMICOLON : ';' ;
COMMA     : ',' ;
DOT       : '.' ;
HASH      : '#' ;
STAR      : '*' ;
LPAREN    : '(' ;
RPAREN    : ')' ;
LBRACK    : '[' ;
RBRACK    : ']' ;
PLUS      : '+' ;
GREATER   : '>' ;
TILDE     : '~' ;
EQ        : '=' ;
SLASH     : '/' ;

// At-keywords
AT_KEYWORD : '@' IDENTIFIER ;

// Identifiers
IDENTIFIER : '-'? [a-zA-Z_] [a-zA-Z0-9_-]* ;

// Numbers
NUMBER      : [0-9]+ ('.' [0-9]+)? ;
NEG_NUMBER  : '-' NUMBER ;

// Dimensions
DIMENSION    : NUMBER IDENTIFIER ;
NEG_DIMENSION: '-' NUMBER IDENTIFIER ;

// Percentages
PERCENTAGE     : NUMBER '%' ;
NEG_PERCENTAGE : '-' NUMBER '%' ;

// Colors
HASH_COLOR
    : '#' ( HEXDIGIT HEXDIGIT HEXDIGIT
           | HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
           | HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
           | HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT )
    ;
fragment HEXDIGIT : [0-9a-fA-F] ;

// Strings
STRING : '"' (~["\\\r\n] | '\\' .)* '"'
       | '\'' (~['\\\r\n] | '\\' .)* '\'' ;

// URLs
URL : 'url(' (~[) \r\n])* ')' ;

// Unicode ranges
UNICODE_RANGE : 'U+' [0-9A-F?]+ ( '-' [0-9A-F?]+ )? ;

// CSS variables
CSS_VAR : 'var(' '--' IDENTIFIER ')' ;
CSS_VAR_DEF : '--' IDENTIFIER ;

// Functions
FUNCTION : IDENTIFIER '(' ;

// Easing functions
EASE_IN_OUT : 'ease-in-out' ;
LINEAR      : 'linear' ;
EASE        : 'ease' ;
EASE_IN     : 'ease-in' ;
EASE_OUT    : 'ease-out' ;

// Important keyword
IMPORTANT : 'important' ;
