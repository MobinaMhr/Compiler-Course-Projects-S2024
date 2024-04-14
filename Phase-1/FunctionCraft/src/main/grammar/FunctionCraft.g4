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
NEW_LINE: '\n';

INT_VAL:     [1-9][0-9]*;
STR_VAL:    '"' [a-zA-Z0-9_]+ '"';// "_abc" is supported what about "%abc"
CHAR_VAL:   '\'' [a-zA-z0-9_] '\''; //'a' '0'
// null value?
FLOAT_VAL:   INT_VAL '.' [0-9]+ | '0.' [0-9]*;



// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO

program
    :
    (function | comment)*
    main
    comment*
    ;

function_body
    :
    (statement | comment)*
    ;

function
    :
    DEF
    name = ID { System.out.println("FuncDec: " + $name.text); }
    LPAR function_parameter RPAR
    function_body
    return_statement?
    END
    ;

return_statement
    :
    RETURN { System.out.println("RETURN"); }
    (expression SEMICOLON)?
    ;

main // Main doen't contain return statement.
    :
    DEF
    MAIN { System.out.println("MAIN"); }
    LPAR RPAR
    function_body
    END
    ;

comment
    : SINGLE_LINE_COMMENT
    | MULTI_LINE_COMMENT
    ;

assignment:
    name = ID { System.out.println("Assignment: " + $name.text); }
    ASSIGN
    expression
;

required_parameter
    : ID COMMA required_parameter
    | ID
    ;

optional_parameter
    : assignment
    | assignment COMMA optional_parameter
    ;

function_parameter
    : required_parameter COMMA LBRACKET optional_parameter RBRACKET
    | required_parameter
    | LBRACKET optional_parameter RBRACKET
    ;

function_argument
    : expression COMMA function_argument
    | expression
    ;

pattern_clause
    :
    TAB
    VERTICAL_BAR
    LPAR condition RPAR
    ASSIGN expression
    ;

pattern_matching:
    PATTERN
    name = ID { System.out.println("PatternDec: " + $name.text); }
    LPAR ID RPAR
    pattern_clause+
    SEMICOLON
    ;

break_statement
    : BREAK
    | BREAK_IF LPAR condition RPAR
    ;

next_statement
    : NEXT
    | NEXT_IF LPAR condition RPAR
    ;

loop_body
    : statement
    | comment
    | break_statement { System.out.println("Control: BREAK"); }
    | next_statement { System.out.println("Control: NEXT"); }
    ;

loop_do
    :
    LOOP_DO { System.out.println("Loop: DO"); }
    loop_body*
    END
    ;

for_in
    :
    FOR { System.out.println("Loop: FOR"); }
    ID IN range
    loop_body*
    END
    ;

 // Can have return value
if_statement
    :
    IF
    LPAR condition RPAR
    statement { System.out.println("Decision: IF"); }
    ;

 // Can have return value
else_if_statement
    :
    ELSEIF
    LPAR condition RPAR
    statement { System.out.println("Decision: ELSE IF"); }
    ;

 // Can have return value
else_statement
    :
    ELSE
    statement { System.out.println("Decision: ELSE"); }
    ;

conditional_expression
    :
    if_statement
    else_if_statement*
    else_statement?
    END
    ;

//    (function_call | ID | STR_VAL | list) //|l[i][0]
puts
    :
    PUTS { System.out.println("Built-In: PUTS"); }
    LPAR expression RPAR // Should it be function_argument?
    ;

len
    :
    LEN { System.out.println("Built-In: LEN"); }
    LPAR (list | STR_VAL | ID) RPAR // Use function_argument, so you can use the return value:>
    ;

// can i use COMMA expression, so in type checking it checks other conditions
// element to list | character to string
push
    :
    PUSH { System.out.println("Built-In: PUSH"); }
    LPAR
    (list | ID | STR_VAL) COMMA expression // in type checking it checks other
//    (list COMMA expression) // Use function_argument, so you can use the return value:>
//    | (STR_VAL | ID ) COMMA (CHAR_VAL | ID)
    RPAR
    ;

match
    :
    MATCH { System.out.println("Built-In: MATCH"); }
    LPAR
    function_argument
    RPAR
    ;

chop
    :
    CHOP { System.out.println("Built-In: CHOP"); }
    LPAR (STR_VAL | ID) RPAR // Use function_argument, so you can use the return value:>
    ;

chomp
    :
    CHOMP { System.out.println("Built-In: CHOMP"); }
    LPAR (STR_VAL | ID) RPAR
    ;

function_ptr:
    METHOD
    LPAR
    COLON
    name = ID // Should we log sth in function_ptr???
    RPAR
    ;

range_operator
    :
    DOT
    DOT
    ;

range:
    LPAR
    (ID | INT_VAL)
    range_operator
    (ID | INT_VAL)
    RPAR
    ;

numeric_literal
    : (MINUS | PLUS)? INT_VAL
    | (MINUS | PLUS)? FLOAT_VAL
    ;

string_literal
    : STR_VAL
    ;

bool_literal
    : TRUE
    | FALSE
    ;

list_literal
    :
    LBRACKET
    function_argument?
    RBRACKET
    ;

index
    :
    LBRACKET
    (ID | INT_VAL)
    RBRACKET
    ;

get_list_element
    :
    ID
    index+
    ;

literal
    // ATOMIC VALUES
    : numeric_literal // int float
    | string_literal // "hi there"
    | bool_literal // True False
    // CHAR_LITERAL

    // COMPOUND VALUES
    | list_literal // [1, 3, 5]
    | function_ptr // method(:fooFunction)
    | get_list_element // arr[0]
    | function_call // foo(5)
    ;

element
    : expression COMMA element
    | expression
    ;

list_initialization
    :
    LBRACKET
    element?
    RBRACKET
    ;

var_initialization
    :
    element
    ;

lambda_function:
    ARROW
    LPAR function_parameter RPAR
    LBRACE
    function_body
    return_statement?
    RBRACE
    { System.out.println("Structure: LAMBDA"); }
    ;


///////////////////////////////////////////////////////////////////

explicit_initialization
    :
    ID
    ASSIGN
    (list_initialization | var_initialization)
    ;

expression:
    LPAR expression RPAR // I added this to make sure expression works with paranteces
    | other_expression
    ;

other_expression
    : LPAR expression RPAR
    | list_literal
    | ID
    | literal
    | lambda_function // to return.
    ;

statement
    // ID = lambda_function! TYPE CHECKING!
    : expression SEMICOLON // handles foo(5);
    | assignment SEMICOLON // handles fib5 = fib.match(5);
    | loop_do
    | for_in
    | conditional_expression
    | pattern_matching
    ;

///////////

relational_operator
    : GEQ
    | LEQ
    | GTR
    | LES
    | EQL
    | NEQ
    | IS_NOT
    ;

assignment_operator
//    : ASSIGN // Don't add this to the rule, it is related to (assignment SEMICOLON) rule of statement.
    : PLUS_ASSIGN
    | MINUS_ASSIGN
    | MULT_ASSIGN
    | DIV_ASSIGN
    | MOD_ASSIGN
    ;

arithmetic_operator
    : PLUS
    | MINUS
    | MULT
    | DIV
    ;

logical_operator
    : AND
    | OR
    ;

// { System.out.println("Function Call"); }
function_call // Write rule better.
    : ID LPAR function_argument? RPAR
    | lambda_function (LPAR function_argument? RPAR)? // lambda function call
    | ID DOT function_call // pattern_call
    | function_call LPAR function_argument? RPAR
    ;

// condition is called with format: LPAR condition RPAR everywhere
condition:
    expression // Should it support only boolean values? (ID)
    | LPAR condition RPAR (logical_operator LPAR condition RPAR)*
    ;

