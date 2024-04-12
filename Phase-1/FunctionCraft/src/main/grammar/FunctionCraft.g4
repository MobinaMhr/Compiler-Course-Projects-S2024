grammar FunctionCraft;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.

// TODO

// Keywords: Control Structures
DEF: 'def';
END: 'end';
RETURN: 'return';

// Keywords: Boolean Values
TRUE: 'true';
FALSE: 'false';

// Keywords: Method Definition
METHOD: 'method';

// Primitive Data Types
INT:            'int';
FLOAT:          'float';
STR:            'string';
BOOLEAN:        'bool';
LIST:           'list';
FUNCTION_PTR:   'fptr';

// 7-1)
// Arithmetic Operators
PLUS:  '+';
MINUS: '-';
MULT:  '*';
DIV:   '/';
DECREMENT:   '--';
INCREMENT:   '++';

// Bitwise Shift
RSH:        '>>';
LSH:        '<<';

// 7-2)
// Relational Operators
GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';
IS_NOT: 'is not';

// 7-3)
// Logical Operators
AND: '&&';
OR:  '||';
NOT: '!';

// 7-5)
// Assignment Operators
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

// 8)
// Conditional Statements
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';

// 10)
// Built in Functions
PUTS: 'puts';
PUSH: 'push';
LEN: 'Len';
MAIN: 'main';
CHOP: 'chop';
CHOMP: 'chomp';

// 11)
// Loops
LOOP_DO: 'loop do';
FOR: 'for';
IN: 'in';
BREAK: 'break';
BREAK_IF: 'break if';
NEXT: 'next';
NEXT_IF: 'next if';

// 12)
// Pattern Matching Structure
PATTERN: 'pattern';
TAB: [\t];//tab!
VERTICAL_BAR: '|';

// Symbols
LBRACE:    '{';
RBRACE:    '}';
LBRACKET: '[';
RBRACKET: ']';
LPAR: '(';
RPAR: ')';
DOT:       '.';
COMMA:     ',';
COLON:     ':';
SEMICOLON: ';';

ARROW: '->';
STAR: '*';
ID: [a-zA-Z][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '=begin' .*? '=end' -> skip;
WS:         [ \t\r\n]+ -> skip;

INT_VAL:     [1-9]+;
STR_VAL:    '"' [a-zA-Z0-9_]+ '"';// "_abc" is supported what about "%abc"
FLOAT_VAL:   INT_VAL '.' [0-9]+ | '0.' [0-9]*;
BOOLEAN_VAL: TRUE | FALSE;



// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO

functionCraft:
    (function | comment)*
    main
    comment*
    ;

function:
    DEF
    name = ID
    LPAR
    function_parameter
    RPAR
    function_body
    END
    ;

function_ptr:
    METHOD
    LPAR
    COLON
    name = ID
    RPAR
    ;

lambda_function:
    ARROW
    LPAR
    function_parameter
    RPAR
    LBRACE
    function_body
    RBRACE
    ;

main:
    DEF
    MAIN { System.out.println("MainBody"); }
    LPAR
    RPAR
    function_body
    END
    ;

//return_value:
//    expression
//    ;

function_body:
    (statement | comment)*
//    (RETURN (return_value SEMICOLON)?)?
    (RETURN (expression SEMICOLON)?)?
    ;

statement:
    function_call SEMICOLON
    | expression SEMICOLON
    | loop_do
    | for_in
    | conditional_expression
    | pattern_matching
    ;

comment:
    SINGLE_LINE_COMMENT
    | MULTI_LINE_COMMENT
    ;

list:
    LBRACKET
    (literal (COMMA literal)*)?
    RBRACKET
    | ID
    (
        LBRACKET
        (ID | INT_VAL)
        RBRACKET
    )*
    ;

literal:
    INT_VAL
    | STR_VAL
    | FLOAT_VAL
    | BOOLEAN_VAL
    | list
    | function_ptr
    ;

relational_operator:
    GEQ
    | LEQ
    | GTR
    | LES
    | EQL
    | NEQ
    | IS_NOT
    ;

bitwise_shift_operator:
    RSH
    | LSH
    ;

arithmetic_operator:
    PLUS
    | MINUS
    | MULT
    | DIV
    ;

logical_operator:
    AND
    | OR
    ;

assignment:
    ID ASSIGN expression
;

function_parameter:
    (ID (COMMA ID)*)?
    (
        (ID COMMA)?
        LBRACKET
        assignment
        (COMMA assignment)*
        RBRACKET
    )?
    ;

function_argument:
    expression
    (COMMA expression)*
    ;

function_call:
    ID LPAR function_argument? RPAR
    | LPAR STAR ID RPAR LPAR function_argument RPAR
    | lambda_function LPAR function_argument? RPAR
    ;

arithmetic_expression:
    expression
    (
        arithmetic_operator
        | bitwise_shift_operator
    )
    expression
    (
        (arithmetic_operator | bitwise_shift_operator)
        expression
    )*
    | (DECREMENT | INCREMENT | MINUS) expression
    | expression (DECREMENT | INCREMENT)
    ;

relational_expression:
    expression
    relational_operator
    expression
    (
        relational_operator
        expression
    )*
    ;

logical_expression:
    expression
    logical_operator
    expression
    (
        logical_operator
        expression
    )*
    ;

conditional_expression:
    IF LPAR condition RPAR statement
    (
        (ELSEIF LPAR condition RPAR statement)*
        ELSE statement
    )?
    END
    ;

expression:
    LPAR expression RPAR // I added this to make sure expression works with paranteces
    | ID
    | literal
    | function_call
    | arithmetic_expression
    | relational_expression
    | logical_expression
    ;

pattern_clause:
    TAB
    VERTICAL_BAR
    LPAR
    condition
    RPAR
    ASSIGN
    expression
//    return_value
    ;

pattern_matching:
    PATTERN
    name = ID
    LPAR
    ID
    RPAR
    pattern_clause+
    SEMICOLON
    ;

loop_do:
    LOOP_DO
    (
        statement
        | comment
        | BREAK
        | BREAK_IF LPAR condition RPAR
        | NEXT
        | NEXT_IF LPAR condition RPAR
    )*
    END
    ;

for_in:
    FOR
    ID
    IN
    range
    (
        statement
        | comment
        | BREAK
        | BREAK_IF LPAR condition RPAR
        | NEXT
        | NEXT_IF LPAR condition RPAR
    )*
    END
    ;

// condition is called with format: LPAR condition RPAR everywhere
condition:
    expression // Should it support only boolean values? (ID)
    | LPAR condition RPAR (logical_operator LPAR condition RPAR)*
    ;

range:
    LPAR
    ID
    '..'
    ID
    RPAR
    ;

