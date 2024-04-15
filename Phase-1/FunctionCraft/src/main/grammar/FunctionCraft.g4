grammar FunctionCraft;

program
    :
    (function | comment | pattern_matching)*
    main
    comment*
    ;

body
    :
    (statement | comment)*
    return_statement?
    ;

function
    :
    DEF
    name = ID { System.out.println("FuncDec: " + $name.text); }
    LPAR function_parameter RPAR
    body
    END
    ;

return_statement
    :
    RETURN { System.out.println("RETURN"); }
    (expression SEMICOLON)?
    ;

main
    :
    DEF
    MAIN { System.out.println("MAIN"); }
    LPAR RPAR
    body
    END
    ;

comment
    : SINGLE_LINE_COMMENT
    | MULTI_LINE_COMMENT
    ;

required_parameter
    : ID COMMA required_parameter
    | ID
    ;



optional_parameter
    : ID assignment_op expression
    | ID assignment_op expression COMMA optional_parameter
    ;

function_parameter
    : required_parameter COMMA LBRACKET optional_parameter RBRACKET
    | required_parameter
    | LBRACKET optional_parameter RBRACKET
    ;

pattern_clause
    :
    { System.out.println("HERE in pattern clause"); }
//    {}
//    NEWLINE { System.out.println("new line is called"); }
    PATTERN_INDENT { System.out.println("pattern indent is called"); }
    condition_clause
    ASSIGN expression
    ;

pattern_matching:
    PATTERN
    name = ID { System.out.println("PatternDec: " + $name.text); }
    LPAR args RPAR
     { System.out.println("Before pattern_clause"); }
    pattern_clause+
     { System.out.println("After pattern_clause"); }
    SEMICOLON
    ;

break_statement
    : BREAK
    | BREAK_IF condition_clause
    ;

next_statement
    : NEXT
    | NEXT_IF condition_clause
    ;

loop_body
    : statement
    | comment
    | break_statement SEMICOLON { System.out.println("Control: BREAK"); }
    | next_statement SEMICOLON{ System.out.println("Control: NEXT"); }
    ;

loop_do
    :
    LOOP_DO { System.out.println("Loop: DO"); }
    loop_body*
    return_statement?
    END
    ;

for_in
    :
    FOR { System.out.println("Loop: FOR"); }
    ID IN range
    loop_body*
    return_statement?
    END
    ;

if_statement
    :
    IF
    { System.out.println("Decision: IF"); }
    condition_clause
    body
    ;

else_if_statement
    :
    ELSEIF
    { System.out.println("Decision: ELSE IF"); }
    condition_clause
    body
    ;

else_statement
    :
    ELSE
    { System.out.println("Decision: ELSE"); }
    body
    ;

conditional_expression
    :
    if_statement
    else_if_statement*
    else_statement?
    END
    ;

puts
    :
    PUTS { System.out.println("Built-In: PUTS"); }
    LPAR expression RPAR
    ;

len
    :
    LEN { System.out.println("Built-In: LEN"); }
    LPAR literal RPAR // literal
    ;

push
    :
    PUSH { System.out.println("Built-In: PUSH"); }
    LPAR
    (list_literal | ID | STR_VAL) COMMA expression
    RPAR
    ;

//{ System.out.println("Built-In: MATCH"); }

chop
    :
    CHOP { System.out.println("Built-In: CHOP"); }
    LPAR literal RPAR
    ;

chomp
    :
    CHOMP { System.out.println("Built-In: CHOMP"); }
    LPAR literal RPAR
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
    : num = (MINUS | PLUS)? (INT_VAL | FLOAT_VAL)
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
    args?
    RBRACKET
    ;

literal
    // COMPOUND VALUES
    : list_literal //{ System.out.println("list_literal"); } // [1, 3, 5]
    | function_ptr //{ System.out.println("function_ptr"); } // method(:fooFunction)
    | function_call  // foo(5)


    // ATOMIC VALUES
    | numeric_literal  // int float
    | string_literal//  { System.out.println("string_literal"); } // "hi there"
    | bool_literal //{ System.out.println("bool_literal"); } // True False
    // CHAR_LITERAL
    ;

lambda_function:
    ARROW
    LPAR function_parameter RPAR
    LBRACE
    body
    RBRACE
    { System.out.println("Structure: LAMBDA"); }
    ;

condition_clause
    :
    LPAR
    expression
    RPAR
    ;

args
    : expression COMMA args
    | expression
    ;

assignment_op
    : ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | MULT_ASSIGN
    | DIV_ASSIGN
    | MOD_ASSIGN
    ;

assignment
    :
    name = ID
    assignment_op
    expression { System.out.println("Assignment: " + $name.text); }
    ;

factor
    : LPAR expression RPAR
    | factor LBRACKET expression RBRACKET
    | factor (INCREMENT | DECREMENT)
    | NOT factor
    | MINUS factor
    | ID
    | literal
    | lambda_function // to return.
    ;

arithmetic_term
    : factor MULT arithmetic_term { System.out.println("Operator: *"); }
    | factor DIV arithmetic_term { System.out.println("Operator: /"); }
    | factor MOD arithmetic_term { System.out.println("Operator: %"); }
    | factor
    ;

arithmetic_expr
    : arithmetic_term PLUS arithmetic_expr { System.out.println("Operator: +"); }
    | arithmetic_term MINUS arithmetic_expr { System.out.println("Operator: -"); }
    | arithmetic_term
    ;

relational_op
    : GEQ { System.out.println("Operator: >="); }
    | LEQ { System.out.println("Operator: <="); }
    | GTR { System.out.println("Operator: >"); }
    | LES { System.out.println("Operator: <"); }
    ;

compare_expr
    : arithmetic_expr relational_op compare_expr
    | arithmetic_expr
    ;

equality_expr
    : compare_expr EQL equality_expr { System.out.println("Operator: =="); }
    | compare_expr NEQ equality_expr { System.out.println("Operator: !="); }
    | compare_expr
    ;

logical_product_expr
    : equality_expr AND logical_product_expr { System.out.println("Operator: &&"); }
    | equality_expr
    ;

logical_expr
    : equality_expr OR logical_product_expr { System.out.println("Operator: ||"); }
    | logical_product_expr
    ;

append_expr
    : logical_expr CONCAT append_expr { System.out.println("Operator: <<"); }
    | logical_expr
    ;

expression
    : append_expr
    ;

statement
    // ID = lambda_function! TYPE CHECKING!
    : expression SEMICOLON // handles foo(5);
    | assignment SEMICOLON // handles fib5 = fib.match(5);
    | loop_do
    | for_in
    | conditional_expression
//    | pattern_matching
    ;

// { System.out.println("Function Call"); }
function_call // Write rule better.
    : puts | len | push | chop | chomp
    | { System.out.println("function_call"); } ID LPAR args? RPAR
    | lambda_function (LPAR args? RPAR)? // lambda function call
    | ID DOT function_call // pattern_call
    | { System.out.println("function_call"); } RPAR function_call LPAR args? RPAR
    ;


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
//FUNCTION_PTR:   'fptr';

// Arithmetic Operators
PLUS:  '+';
MINUS: '-';
MULT:  '*';
DIV:   '/';
MOD:    '%';
DECREMENT:   '--';
INCREMENT:   '++';

CONCAT: '<<';

// Relational Operators
GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';

// Logical Operators
AND: '&&';
OR:  '||';
NOT: '!';

// Assignment Operators
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

// Conditional Statements
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';

// Built in Functions
PUTS: 'puts'; // ISNOT USED
PUSH: 'push'; // ISNOT USED
LEN: 'Len'; // ISNOT USED
MAIN: 'main';
CHOP: 'chop'; // ISNOT USED
CHOMP: 'chomp'; // ISNOT USED

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
//TAB: [\t] -> more, type(HIDDEN);
//NEWLINE: '\n' | '\r';
PATTERN_INDENT: ('\r'?'\n')('\t|' | '    |');

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

INT_VAL:     ([0] | [1-9][0-9]*);
STR_VAL:   '"' ('\\' ["\\] | ~["\\\r\n])* '"';
CHAR_VAL:   '\'' ('\\' ["\\] | ~["\\\r\n]) '\''; //'a' '0'
// null value?
FLOAT_VAL:   INT_VAL '.' [0-9]+;


ARROW: '->';
ID: [a-zA-Z][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '=begin' .*? '=end' -> skip;
//WS:         [ \t\r\n]+ -> skip;
WS:         [ \r\n]+ -> skip;