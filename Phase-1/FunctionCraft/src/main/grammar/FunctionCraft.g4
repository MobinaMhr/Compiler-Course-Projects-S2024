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
    LPAR function_parameter? RPAR
    body
    END
    ;

return_statement
    :
    RETURN { System.out.println("RETURN"); }
    expression?
    SEMICOLON
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
    PATTERN_INDENT
    condition_clause
    ASSIGN expression
    ;

pattern_matching:
    PATTERN
    name = ID { System.out.println("PatternDec: " + $name.text); }
    LPAR args RPAR
    pattern_clause+
    SEMICOLON
    ;

break_statement
    : BREAK { System.out.println("Control: BREAK"); }
    | BREAK_IF { System.out.println("Control: BREAK"); } condition_clause
    ;

next_statement
    : NEXT { System.out.println("Control: NEXT"); }
    | NEXT_IF { System.out.println("Control: NEXT"); } condition_clause
    ;

loop_body
    :
    (
        statement_in_loop
        | comment
        | break_statement SEMICOLON
        | next_statement SEMICOLON

    )*
    return_statement?
    ;

loop_do
    :
    LOOP_DO { System.out.println("Loop: DO"); }
    loop_body
    END
    ;

for_in
    :
    FOR { System.out.println("Loop: FOR"); }
    ID IN range
    loop_body
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

if_statement_in_loop
    :
    IF
    { System.out.println("Decision: IF"); }
    condition_clause
    loop_body
    ;

else_if_statement_in_loop
    :
    ELSEIF
    { System.out.println("Decision: ELSE IF"); }
    condition_clause
    loop_body
    ;

else_statement_in_loop
    :
    ELSE
    { System.out.println("Decision: ELSE"); }
    loop_body
    ;

conditional_expression_in_loop
    :
    if_statement_in_loop
    else_if_statement_in_loop*
    else_statement_in_loop?
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
    LPAR factor RPAR
    ;

push
    :
    PUSH { System.out.println("Built-In: PUSH"); }
    LPAR
    (list_literal | ID | STR_VAL) COMMA expression
    RPAR
    ;

chop
    :
    CHOP { System.out.println("Built-In: CHOP"); }
    LPAR factor RPAR
    ;

chomp
    :
    CHOMP { System.out.println("Built-In: CHOMP"); }
    LPAR factor RPAR
    ;

function_ptr:
    METHOD
    LPAR
    COLON
    name = ID
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
    | factor
    ;

numeric_literal
    : num = INT_VAL | FLOAT_VAL
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
    : list_literal // [1, 3, 5]
    | function_ptr // method(:fooFunction)
    | { System.out.println("Structure: LAMBDA"); } lambda_function //////////////////// Give Test Case
    // ATOMIC VALUES
    | numeric_literal  // int float
    | string_literal // "hi there"
    | bool_literal // True False
    ;

lambda_function:
    ARROW
    LPAR function_parameter RPAR
    LBRACE
    body
    RBRACE
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
    expression
    { System.out.println("Assignment: " + $name.text); }
    ;

function_call
    : built_in_function
    | { System.out.println("FunctionCall"); } ID LPAR args? RPAR function_call_suffix
    | { System.out.println("FunctionCall"); } ID LPAR args? RPAR
    | { System.out.println("FunctionCall"); } lambda_function (LPAR args? RPAR) function_call_suffix
    | { System.out.println("FunctionCall"); } lambda_function (LPAR args? RPAR)
    | { System.out.println("FunctionCall"); } function_ptr (LPAR args? RPAR) function_call_suffix
    | { System.out.println("FunctionCall"); } function_ptr (LPAR args? RPAR)
    | { System.out.println("Built-In: MATCH"); } ID DOT MATCH LPAR args RPAR function_call_suffix
    | { System.out.println("Built-In: MATCH"); } ID DOT MATCH LPAR args RPAR
    ;

function_call_suffix
    : { System.out.println("FunctionCall"); } LPAR args? RPAR function_call_suffix
    | { System.out.println("FunctionCall"); } LPAR args? RPAR
    ;

factor
    : LPAR expression RPAR factor_suffix
    | LPAR expression RPAR
    | NOT LPAR factor RPAR factor_suffix
    | NOT LPAR factor RPAR
    | MINUS factor factor_suffix
    | MINUS factor
    | function_call factor_suffix
    | function_call
    | ID factor_suffix
    | ID
    | literal factor_suffix
    | literal
    ;

factor_suffix
    : LBRACKET expression RBRACKET factor_suffix
    | LBRACKET expression RBRACKET
    | INCREMENT { System.out.println("Operator: ++"); } factor_suffix
    | INCREMENT { System.out.println("Operator: ++"); }
    | DECREMENT { System.out.println("Operator: --"); } factor_suffix
    | DECREMENT { System.out.println("Operator: --"); }
    ;

arithmetic_term
    : factor MULT { System.out.println("Operator: *"); } arithmetic_term
    | factor DIV  { System.out.println("Operator: /"); } arithmetic_term
    | factor MOD  { System.out.println("Operator: %"); } arithmetic_term
    | factor
    ;

arithmetic_sum
    : arithmetic_term
    ((PLUS arithmetic_term { System.out.println("Operator: +"); }) | (MINUS arithmetic_term { System.out.println("Operator: -"); }))*
    ;

arithmetic_expr
    : arithmetic_sum
    ;

relational_op
    : GEQ
    | LEQ
    | GTR
    | LES
    ;

compare_expr
    : arithmetic_expr
    (op = relational_op
    arithmetic_expr
    { System.out.println("FuncDec: " + $op.text); })*
    ;

equality_expr
    : compare_expr ((EQL compare_expr { System.out.println("Operator: =="); }) | (NEQ compare_expr { System.out.println("Operator: !="); }))*
    ;

logical_expr
    : (LPAR expression RPAR) AND (LPAR expression RPAR) { System.out.println("Operator: &&"); }
    | (LPAR expression RPAR) OR (LPAR expression RPAR) { System.out.println("Operator: ||"); }
    | equality_expr
    ;

append_expr
    : logical_expr ( CONCAT logical_expr { System.out.println("Operator: <<"); } )*
    ;

expression
    : append_expr
;

statement
    : expression SEMICOLON // handles foo(5);
    | assignment SEMICOLON // handles fib5 = fib.match(5);
    | loop_do
    | for_in
    | conditional_expression
    ;

statement_in_loop
    : expression SEMICOLON // handles foo(5);
    | assignment SEMICOLON // handles fib5 = fib.match(5);
    | loop_do
    | for_in
    | conditional_expression_in_loop
    ;

built_in_function
    : puts
    | len
    | push
    | chop
    | chomp
    ;



ARROW: '->';
DECREMENT:   '--';
INCREMENT:   '++';
CONCAT: '<<';

// Keywords: Control Structures
DEF: 'def';
END: 'end';
RETURN: 'return';

// Keywords: Boolean Values
TRUE: 'true';
FALSE: 'false';

// Keywords: Method Definition
METHOD: 'method';

// Arithmetic Operators
PLUS:  '+';
MINUS: '-';
MULT:  '*';
DIV:   '/';
MOD:    '%';

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
PUTS: 'puts';
PUSH: 'push';
LEN: 'Len';
MAIN: 'main';
CHOP: 'chop';
CHOMP: 'chomp';
MATCH: 'match';

// Loops
LOOP_DO: 'loop do';
FOR: 'for';
IN: 'in';
BREAK: 'break';
BREAK_IF: 'break if';
NEXT: 'next';
NEXT_IF: 'next if';

// Pattern Matching Structure
PATTERN: 'pattern';
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
//CHAR_VAL:   '\'' ('\\' ["\\] | ~["\\\r\n]) '\''; //'a' '0'
FLOAT_VAL:   INT_VAL '.' [0-9]+;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '=begin' .*? '=end' -> skip;
WS:         [ \r\n]+ -> skip;