parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program : statement* EOF;

statement
    : exportStatement           #ExportStat         //✅
    | importStatement           #ImpState           //✅
    | variableDeclaration       #VarDecl            //✅
    | constantDeclaration       #ConstDecl          //✅
    | functionDeclaration       #FuncDecl           //✅
    | classDefinition           #ClassDef           //✅
    | interfaceDefinition       #IfaceDef           //⚠6
    | componentDefinition       #CompDef            //⚠7
    | enumDefinition            #EnumDef            //✅
    | tryCatchStatement         #TryCatchState      //⚠5
    | conditionalStatement      #ConditionState     //⚠4
    | whileStatement            #WhileState         //⚠3
    | breakStatement            #BreakState         //✅
    | continueStatement         #ContState          //✅
    | returnStatement           #ReturnState        //✅
    | assignmentStatement       #AssignState        //⚠1
    | expressionStatement       #ExprState          //✅
    | localVariableDeclaration  #LocalVarDecl       //⚠2
    | localConstantDeclaration  #LocalConstDecl     //⚠2
    ;

expressionStatement : expression SEMI?;
returnStatement : RETURN expression? SEMI?;
// export
exportStatement
    : defaultExport #DefaultExp
    | namedExport #NamedExp;
namedExport: EXPORT LBRACE IDENTIFIER (COMMA IDENTIFIER)* RBRACE SEMI?;
defaultExport: EXPORT DEFAULT IDENTIFIER SEMI?;
// import
importStatement
    : defaultImport     #DefaultImp
    | namedImport       #NamedImp
    | sideEffectImport  #ImpSide
;
defaultImport:IMPORT IDENTIFIER FROM STRING SEMI?;
namedImport:IMPORT LBRACE IDENTIFIER (COMMA IDENTIFIER)* RBRACE FROM STRING SEMI?;
sideEffectImport:IMPORT STRING SEMI?;
// var
variableDeclaration : (LET | VAR) IDENTIFIER COLON type (ASSIGN expression)? SEMI?;
constantDeclaration : CONST IDENTIFIER COLON type ASSIGN expression SEMI?;
localVariableDeclaration : (LET | VAR) IDENTIFIER COLON type (ASSIGN expression)? SEMI?;
localConstantDeclaration : CONST IDENTIFIER COLON type ASSIGN expression SEMI?;

assignmentStatement : assignmentTo (DOT assignmentTo)* ASSIGN expression SEMI?;
assignmentTo
    : IDENTIFIER                                #IdNotation
    | IDENTIFIER LBRACK expression RBRACK       #ArrNotaion
    | THIS DOT IDENTIFIER                       #DotNotation;

functionDeclaration
    :FUNCTION IDENTIFIER parameterList (COLON type)? block SEMI? #NormalFuncDecl
    |(LET | VAR | CONST)? IDENTIFIER ASSIGN arrowFunction        #ArrowFuncDecl;
parameterList : LPAREN (expressionParameter (COMMA expressionParameter)*)? RPAREN;
expressionParameter : IDENTIFIER COLON type;
parameter : (accessModifier)? IDENTIFIER COLON type;
accessModifier : PUBLIC | PRIVATE | PROTECTED | READONLY;

block : LBRACE statement* RBRACE;

classDefinition : CLASS IDENTIFIER extendsStatement? implementsStatement* LBRACE classBody RBRACE;
extendsStatement : EXTENDS IDENTIFIER;
implementsStatement : IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*;
classBody : (decorator* (constructorDefinition | classVariableDeclaration | constantDeclaration | methodDefinition | enumDefinition))*;
classVariableDeclaration : accessModifier? IDENTIFIER COLON type (ASSIGN expression)? SEMI?;
constructorDefinition : CONSTRUCTOR parameterList block;
methodDefinition : IDENTIFIER parameterList (COLON type)? block;

interfaceDefinition : INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE;
interfaceBody : interfaceMember*;
interfaceMember : IDENTIFIER COLON type SEMI?;

componentDefinition
    : COMPONENT_DECORATOR LPAREN componentConfig RPAREN EXPORT? CLASS IDENTIFIER extendsStatement? implementsStatement* LBRACE classBody RBRACE
    ;

componentConfig
    : LBRACE componentProperties* RBRACE
    ;

componentProperties
    : SELECTOR COLON STRING COMMA?                                                                              #SProp
    | TEMPLATE_URL COLON STRING COMMA?                                                                          #TUrlProp
    | STYLE_URLS COLON LBRACK STRING (COMMA STRING)* RBRACK COMMA?                                              #SUrlProp
    | TEMPLATE COLON (STRING | BACKTICK_STRING) COMMA?                                                          #TProp
    | STYLES COLON LBRACK (STRING | BACKTICK_STRING) (COMMA (STRING | BACKTICK_STRING))* RBRACK COMMA?          #SProp
    ;

enumDefinition : ENUM IDENTIFIER LBRACE enumValues? RBRACE SEMI?;
enumValues : enumValue (COMMA enumValue)*;
enumValue : IDENTIFIER (ASSIGN literal)?;

tryCatchStatement : TRY block CATCH LPAREN IDENTIFIER RPAREN block (FINALLY block)?;

conditionalStatement : ifStatement (ELSE ifStatement)* (elseStatement)?;
ifStatement : IF LPAREN expression RPAREN (block | statement);
elseStatement : ELSE (block | statement);

whileStatement : WHILE LPAREN expression RPAREN (block | statement) SEMI?;
breakStatement : BREAK SEMI?;
continueStatement : CONTINUE SEMI?;
//✅ start
type
    : normalType    #NorTpe
    | arrayType     #ArrTpe
    ;

normalType
    : TYPE_NUMBER | TYPE_STRING | TYPE_BOOLEAN | TYPE_ANY | TYPE_UNKNOWN | TYPE_VOID | TYPE_ARRAY | TYPE_OBJECT | IDENTIFIER;

arrayType : normalType LBRACK RBRACK;

expression
    : nullishCoalescingExpression
    ;

nullishCoalescingExpression
    : logicalOrExpression (NULLISH_COALESCING logicalOrExpression)?
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression ((EQ | NEQ | STRICT_EQ | STRICT_NEQ) relationalExpression)*
    ;

relationalExpression
    : additiveExpression ((LT | LTE | GT | GTE) additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULTIPLY | DIVIDE | MODULUS) unaryExpression)*
    ;

unaryExpression
    : (NOT | MINUS | PLUS | INCREMENT | DECREMENT)? primaryExpression
    ;

basePrimary
    : THIS                          #ThisExpr
    | literal                       #Lit
    | IDENTIFIER                    #Id
    | LPAREN expression RPAREN      #Expr
    | array                         #Arr
    | object                        #Obj
    | arrowFunction                 #ArrowFunc
    | templateInterpolation         #TemplateInterp
    ;

primaryExpression
    : basePrimary postfixOp*
    ;

postfixOp
    : propertyAccessSuffix       #PropAccess
    | functionCallSuffix         #FuncCall
    | pipeExpressionSuffix       #PipeExpr
    ;

propertyAccessSuffix
    : DOT IDENTIFIER             #DotAccess
    | LBRACK expression RBRACK   #ArrAccess
    ;

functionCallSuffix
    : LPAREN (expression (COMMA expression)*)? RPAREN
    ;

pipeExpressionSuffix
    : PIPE_OPERATOR IDENTIFIER (COLON expression)*
    ;

arrowFunction
    : LPAREN (parameter (COMMA parameter)*)? RPAREN (COLON type)? ARROW (expression | block)
    ;

templateInterpolation : ANGULAR_EXPR_START expression ANGULAR_EXPR_END;

literal : NUMBER | STRING | BOOLEAN | NULL;

array : LBRACK (expression (COMMA expression)*)? RBRACK;
object : LBRACE (IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)*)? RBRACE;
//✅ end

decorator : AT IDENTIFIER;