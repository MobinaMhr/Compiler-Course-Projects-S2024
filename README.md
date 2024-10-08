# Compiler-Course-Projects-S2024
Introduction to Compiler and Programming Languages Design course projects in the spring semester of the University of Tehran under the supervision of Dr.Tavassoli.

- ## [Documentation](https://github.com/MobinaMhr/Compiler-Course-Projects-S2024/tree/main/Phase-1). FunctionCraft

FunctionCraft is a functional programming language designed for the Introduction to Compiler and Programming Language Design course projects.

### General Structure
Files have a .fl suffix.
Each file contains two parts :
- Declaration of some functions  
- Declaration of main (the entry point of written programs)
There is no global variable in this language.
This code is one sample program written in this language : 
```
    def get_size(i)
        return len(g()[i]);
    end

    def g()
        return [[1, 2]];
    end

    def main()
        puts(get_size(0));
    end
```

- **General Grammar Rules**
  - There is a semicolon at the end of each line of code.
  - Empty lines have no impact on the execution or output of the program.
  The main function comes at the end of the written program.
  - after the return statement in each scope, there cannot be another statement.
  - Sequence of function declarations does not affect program execution and function calls.

- **Comment Rules**
  - single-line comments start with `#`.
  - multi-line comments start with `=begin` and ends with `=end`.
```
    =begin
    The code defines a function called main
    that prints "salam" to the console.
    It contains comments marked with #,
    which are explanations
    ignored by the compiler
    =end

    def main()
        puts("salam"); # This is comment
        # This is comment
    end
```

- **Variable and Function Naming Rules**
Variable and function names should contain only small words (a...z), capital words (A...Z), numbers (0...9), and underscore.
Variable and function names should not start with numbers.
Keywords should not be used as variable and function names.
All keywords in FunctionCraft are listed as follows: 

| def | end | main | return |
|----------|----------|----------|----------|
| if | else | elseif | ture |
| false | chop | chomp | push | 
| puts | method | len | pattern |
| match | next | break | loop |
| do | for | in | |

### Function Declaration
- Each function declaration starts with `def`, followed by the function name, and after that, parentheses. If the function has some parameters, it will be in those parentheses. If there is more than one parameter, they will be separated with some commas. 
- The main function has no parameters
- lambda functions are defined without any name. This type of function can be called only in the function in which they were defined.
```
    -> (param1, param2, ...) { function_body }
```
- Lambda functions can be called after being defined. 
```
    -> (arg1, arg2) { return arg1 + arg2; } (1, 2);
```
- Function can return a pointer to a lambda function.
```
    def foo()
        return -> (arg1, arg2) { return arg1 + arg2; };
    end
```
- a function can return no value.

### Function Call
- All functions are called with parentheses. 
- There is a comma between arguments. 
- list arguments are passed by reference, but other types are passed by values.

### Data Types
All primitive data types in FunctionCraft are listed as follows: 
- integer (`int`)
- floating-point number (`float`)
- string (`string`)
- boolean value (`bool`)
- list (`list`)
- function pointer (`fptr`)
String values should be written between two double quotations. ``` "String" ```
All list elements have identical data types.
Two-dimensional lists and multi-dimensional lists are allowed in this programming language.
List elements are accessed with indexes.
Function pointers are created with `method` word. ``` method(: function_name) ```
Function pointer calls are just like normal function calls.

### Parameters
There could be default values set to function parameters. Giving value to arguments with default values is optional. 
```
    def f2 (a, [b = 10, c = 20])
        return a + b + c;
    end
```

### Operators
- **Computational Operators**
  Just numbers can be used as operands. These operators are listed as follows(A = 100, B = 10) : 

| Sample | Description | Participation | Operand |
|----------|----------|----------|----------|
| A + B = 110 | Addition | Left | + |
| A - B = 90 | Subtraction | Left | - |
| A * B = 1000 | Multiplication | Left | * |
| A / B = 10 | Division | Left | / |
| -A = -100 | Monofunctional Negative | Right | - |
| A-- | Postfix operand | Left | -- |
| A++ | Postfix operand | Left | ++ |

- **Comparative Operators**
 These operators compare two values with each other, and the result of this comparison is a boolean type. The operands of `<`, `>`, `<=`, `>=` should be `int` or `float` type. These operators are listed as follows : 

| Sample | Description | Participation | Operand |
|----------|----------|----------|----------|
| A < B = false | Less Than | Left | <= or < |
| A > B = true | Greater Than | Left | >= or > |

- **Logical Operators**


- **Append Operator**
- **Assignment Operators**
- **Precedence of Operators**

### Function Pointer
Function pointers are defined using the `method` keyword. Here is an example of a function pointer definition:
```
def f(x)
    return x + 1;
end

def main()
    f_ptr = method(:f);
    a = f_ptr(5);
    puts(a);
end
```

<!-- ### Conditional Statements

### Scoping Rules -->

### Default Functions

#### puts
The `puts` function is used to print the value of a variable. Here is an example of using the `puts` function:
```
def main()
    a = 5;
    puts(a);
end
```

#### push
The `push` function is used to append an element to a list or string. Here is an example of using the `push` function:
```
def main()
    a = [1,2,3];
    push(a, 4);
    puts(a);
end
```

#### len
The `len` function is used to get the length of a list or a string. Here is an example of using the `len` function:
```
def main()
    a = [1,2,3];
    b = len(a);
    puts(b);
end
```

#### chop
The `chop` function is used to remove the last element of a string. Here is an example of using the `chop` function:
```
def main()
    a = "Hello";
    chop(a);
    puts(a);
end
```

#### chomp
The `chomp` function is used to remove the newline characters from the string. Here is an example of using the `chomp` function:
```
def main()
    a = "Hello\n";
    chomp(a);
    puts(a);
end
```

### Loops
In this programming language, the `do loop` structure is defined. It does not have any conditions, and its scope ends with the `end` keyword.
```
 loop do
 puts("start");
 ...
 puts("end");
 end
```
- another defined loop structure is `for ... in ...` whose scope ends with the `end` keyword. It is used for `list` and `range` structures. An example of `range` syntax : `(start .. end)`
The `start` and `end` are integer numbers (`int`). The low bound is inclusive, and the high bound is exclusive. 
- `break`, `break if`, `next`, and `next if` structures can appear in `loop do` and `for`.
- The program returns from the current loop by using the `break if` structure if the condition is satisfied and by using the `break` structure with no conditions.
The program executes the next iteration of the loop by using the `next if` structure if the condition is satisfied and by using the `next` structure without condition ons.
```
 list = [1, 2, 3, 4, 5, 6, 7, 8, 9];
 for num in list
 end

 start = 0;
 finish = 9;
 for num in (start..finish)
 next if (num / 2 == 1);
 puts(num);
 end
```

### Pattern Matching Structure
- Similar to the `Switch case` structure, it gets one or more inputs and, based on them, returns one output.
- There should be a conditional statement after each `|` character. After the `=` character, one value appears. If the condition is satisfied, the value is returned.
- There should be an indentation (one `tab` character or four `space` characters) before each condition.
```
    pattern fib(n)
        | (n == 0) = 1
        | (n == 1) = 1
        | (n > 2) = fib(n-1) + fib(n-2)
    ;
    def main
        fib_5 = fib.match(5);
    end
```
- to call a declared pattern, we use `fib_5 = fib.match(5);` syntax.

- ## [Phase-1](https://github.com/MobinaMhr/Compiler-Course-Projects-S2024/tree/main/Phase-1). Lexical and Syntax Analysis

In this phase, we utilized ANTLR4 to perform lexical and syntax analysis for the FunctionCraft language. The result of this process is a parse tree representing the input program.

- ## [Phase-2](https://github.com/MobinaMhr/Compiler-Course-Projects-S2024/tree/main/Phase-2). Name Analysis

In this phase, we generated the abstract syntax tree (AST) from the input program and conducted name analysis for the FunctionCraft language. The outcome of this phase includes any compile-time errors associated with the name analysis.

- ## [Phase-3](https://github.com/MobinaMhr/Compiler-Course-Projects-S2024/tree/main/Phase-3). Type Analysis

In this phase, we conducted type analysis for the FunctionCraft language. This phase produces compile-time errors related to type analysis.

- ## [Phase-4](https://github.com/MobinaMhr/Compiler-Course-Projects-S2024/tree/main/Phase-4). Code Generation

In this phase, we employed the Jasmin library to generate Java bytecode for the FunctionCraft language. The output of this phase is Java bytecode for the input program, which can be executed on the JVM.