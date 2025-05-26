// === Lexer Grammar ===
lexer grammar AngularLexer;

// === Keywords ===
IF         : 'if';
ELSE       : 'else';
FOR        : 'for';
WHILE      : 'while';
RETURN     : 'return';
BREAK      : 'break';
CONTINUE   : 'continue';
IMPORT     : 'import';
FROM       : 'from';
EXPORT     : 'export';
DEFAULT    : 'default';
CLASS      : 'class';
EXTENDS    : 'extends';
IMPLEMENTS : 'implements';
INTERFACE  : 'interface';
FUNCTION   : 'function';
TRY        : 'try';
CATCH      : 'catch';
FINALLY    : 'finally';
CONSTRUCTOR: 'constructor';
CONST      : 'const';
LET        : 'let';
VAR        : 'var';
ENUM       : 'enum';
NEW        : 'new';
THIS       : 'this';
ASYNC      : 'async';
AWAIT      : 'await';
PROMISE    : 'Promise';
OBSERVABLE : 'Observable';

// === Access Modifiers ===
PUBLIC     : 'public';
PRIVATE    : 'private';
PROTECTED  : 'protected';
READONLY   : 'readonly';

// === Types ===
TYPE_NUMBER   : 'number';
TYPE_STRING   : 'string';
TYPE_BOOLEAN  : 'boolean';
TYPE_ANY      : 'any';
TYPE_UNKNOWN  : 'unknown';
TYPE_VOID     : 'void';
TYPE_ARRAY    : 'Array';
TYPE_OBJECT   : 'Object';
NULL          : 'null';

// === Angular Decorators ===
COMPONENT_DECORATOR : '@Component';
SERVICE_DECORATOR   : '@Injectable';

// === Angular Component Keys ===
SELECTOR      : 'selector';
TEMPLATE_URL  : 'templateUrl';
STYLE_URLS    : 'styleUrls';
STYLES        : 'styles';
TEMPLATE      : 'template';

// === Symbols ===
LBRACE  : '{';
RBRACE  : '}';
LBRACK  : '[';
RBRACK  : ']';
LPAREN  : '(';
RPAREN  : ')';
SEMI    : ';';
COLON   : ':';
COMMA   : ',';
DOT     : '.';
ASSIGN  : '=';
ARROW   : '=>';
QUESTION_MARK : '?';
AT      : '@';

// === Operators ===
PLUS     : '+';
MINUS    : '-';
MULTIPLY : '*';
DIVIDE   : '/';
MODULUS  : '%';
AND      : '&&';
OR       : '||';
NOT      : '!';
EQ       : '==';
NEQ      : '!=';
STRICT_EQ  : '===';
STRICT_NEQ : '!==';
LT       : '<';
GT       : '>';
LTE      : '<=';
GTE      : '>=';
NULLISH_COALESCING : '??';
BITWISE_AND : '&';
BITWISE_XOR : '^';
INCREMENT   : '++';
DECREMENT   : '--';
PIPE_OPERATOR : '|';

// === Angular Specific ===
ANGULAR_EXPR_START : '{{';
ANGULAR_EXPR_END   : '}}';

// === Literals ===
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;
BOOLEAN : 'true' | 'false';
BACKTICK_STRING : '`' ( ~[`\\] | '\\' . )* '`';
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ;

// === Comments & Whitespace ===
LINE_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN);
BLOCK_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
WS : [ \t\r\n]+ -> skip;

// === Error Token ===
UNEXPECTED_CHARACTER : . { System.err.println("Unexpected character: " + getText()); };