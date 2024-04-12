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

CONCAT: '<<';

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
PUTS: 'puts'; // ISNOT USED
PUSH: 'push'; // ISNOT USED
LEN: 'Len'; // ISNOT USED
MAIN: 'main';
CHOP: 'chop'; // ISNOT USED
CHOMP: 'chomp'; // ISNOT USED

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
ID: [a-zA-Z][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '=begin' .*? '=end' -> skip;
WS:         [ \t\r\n]+ -> skip; // ISNOT USED

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

function_body:
    (statement | comment)*
    (RETURN (expression SEMICOLON)?)?
    ;

statement:
    function_call SEMICOLON
    // The problem is where ID = lambda_function!
    | expression SEMICOLON // handles fib5 = fib.match(5);
    | assignment SEMICOLON
    | loop_do
    | for_in
    | conditional_expression
    | pattern_matching
    ;

comment:
    SINGLE_LINE_COMMENT
    | MULTI_LINE_COMMENT
    ;

add_to_list:
    ID CONCAT expression (CONCAT expression)* // list_temp << 2 << 3
    ;

list_literal:
    LBRACKET
    (literal (COMMA literal)*)?
    RBRACKET // [1, 2, 3]
    | ID
    (
        LBRACKET
        (ID | INT_VAL)
        RBRACKET
    )* // list_temp[0][1]
    ;

string_literal: /// I'm not happy with the idea of addig ID in string_literal:(
    (STR_VAL | ID)
    (CONCAT string_literal)*
    ;

literal:
    INT_VAL
    | string_literal
    | FLOAT_VAL
    | BOOLEAN_VAL
    | list_literal
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

assignment_operator:
    ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | MULT_ASSIGN
    | DIV_ASSIGN
    | MOD_ASSIGN
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
    | lambda_function LPAR function_argument? RPAR
    | ID DOT function_call
    ;

arithmetic_expression:
    expression
    arithmetic_operator
    expression
    (
        arithmetic_operator
        expression
    )*
    | (DECREMENT | INCREMENT | MINUS) expression
    | expression (DECREMENT | INCREMENT)
    ;

assignment_expression:
    expression
    assignment_operator
    expression
    (
        assignment_operator
        expression
    )*
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
    | NOT expression
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
    | assignment_expression
    | relational_expression
    | logical_expression
    | add_to_list // I'm not happy with naming and placement of rule!
    ;

pattern_clause:
    TAB
    VERTICAL_BAR
    LPAR
    condition
    RPAR
    ASSIGN
    expression
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

