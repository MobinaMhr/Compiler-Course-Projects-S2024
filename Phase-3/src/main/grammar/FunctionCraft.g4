grammar FunctionCraft;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.value.primitive.*;
}


program returns [Program flProgram]:
    {
        $flProgram = new Program();
        $flProgram.setLine(1);
    }
    (
        f = functionDeclaration{$flProgram.addFunctionDeclaration($f.functionDeclarationRet);}
        | p = patternMatching{$flProgram.addPatternDeclaration($p.patternRet);}
    )*
    m = main{$flProgram.setMain($m.mainRet);};

functionDeclaration returns [FunctionDeclaration functionDeclarationRet]:
    {
        $functionDeclarationRet = new FunctionDeclaration();
    }
    def = DEF {$functionDeclarationRet.setLine($def.line);} id = IDENTIFIER {
        Identifier id_ = new Identifier($id.text);
        id_.setLine($id.line);
        $functionDeclarationRet.setFunctionName(id_);
        $functionDeclarationRet.setLine($def.line);
    }
    f = functionArgumentsDeclaration {$functionDeclarationRet.setArgs($f.argRet);}
    b = body {$functionDeclarationRet.setBody($b.bodyRet);}
    END
    ;

functionArgumentsDeclaration returns [ArrayList<VarDeclaration> argRet]:
    {
        $argRet = new ArrayList<VarDeclaration>();
    }
    LPAR
    (id1 = IDENTIFIER
    {
        Identifier id_ = new Identifier($id1.text);
        id_.setLine($id1.line);
        VarDeclaration newVarDec = new VarDeclaration(id_);
        newVarDec.setLine($id1.line);
        $argRet.add(newVarDec);
    }
    (COMMA id2 = IDENTIFIER
        {
            Identifier id_2 = new Identifier($id2.text);
            id_2.setLine($id2.line);
            VarDeclaration newVarDec2 = new VarDeclaration(id_2);
            newVarDec2.setLine($id2.line);
            $argRet.add(newVarDec2);
        }
    )*
    (
    COMMA LBRACK id3 = IDENTIFIER
     {
        Identifier id_3 = new Identifier($id3.text);
        id_3.setLine($id3.line);
        VarDeclaration newVarDec3 = new VarDeclaration(id_3);
        newVarDec3.setLine($id3.line);
     }
     ASSIGN e1 = expression
      {
        newVarDec3.setDefaultVal($e1.expRet);
        $argRet.add(newVarDec3);
      }
      (COMMA id4 = IDENTIFIER
       {
            Identifier id_4 = new Identifier($id4.text);
            id_4.setLine($id4.line);
            VarDeclaration newVarDec4 = new VarDeclaration(id_4);
            newVarDec4.setLine($id4.line);
       }
       ASSIGN e2 = expression
       {
            newVarDec4.setDefaultVal($e2.expRet);
            $argRet.add(newVarDec4);
       }
       )* RBRACK
    )?
    )? RPAR;

patternMatching returns [PatternDeclaration patternRet]:
    pat = PATTERN
    {
        int patternLine = $pat.line;
    }
    patternName = IDENTIFIER
    {
        Identifier patternNameId = new Identifier($patternName.text);
        patternNameId.setLine($patternName.line);
    }
    LPAR targetVar = IDENTIFIER
    {
        Identifier targetVariable = new Identifier($targetVar.text);
        targetVariable.setLine($targetVar.line);
        $patternRet = new PatternDeclaration(patternNameId, targetVariable);
        $patternRet.setLine(patternLine);
    }
    RPAR
    (PATTERN_MATCHING_SEPARATOR c = condition
     {
        $patternRet.setConditions($c.conditionRet);
     }
     ASSIGN e = expression
     {
        $patternRet.addReturnExp($e.expRet);
     }
     )*
    SEMICOLLON;

main returns [MainDeclaration mainRet]:
    {
        $mainRet = new MainDeclaration();
    }
    DEF m = MAIN
    {
        $mainRet.setLine($m.line);
    }
    LPAR RPAR
    b = body
    {$mainRet.setBody($b.bodyRet);}
    END;

functionArguments returns [ArrayList<Expression> funcArgsRet]:
    {
        $funcArgsRet = new ArrayList<Expression>();
    }
    (e1 = expression
    {
       $funcArgsRet.add($e1.expRet);
    }
    (COMMA e2 = expression
    {
       $funcArgsRet.add($e2.expRet);
    }
    )* )?;


returnStatement returns [ReturnStatement returnStmtRet]:
    {
        $returnStmtRet = new ReturnStatement();
    }
    r = RETURN (e = expression{
        $returnStmtRet.setReturnExp($e.expRet);
    })? {$returnStmtRet.setLine($r.line);} SEMICOLLON;

ifStatement returns[IfStatement ifRet]:
    {
        $ifRet = new IfStatement();
        ArrayList<Statement> tempThenStmts = new ArrayList<>();
        ArrayList<Statement> tempElseStmts = new ArrayList<>();
    }
    i = IF
    {
        $ifRet.setLine($i.line);
    }
    (c1 = condition {$ifRet.addCondition($c1.conditionRet);} | LPAR c2 = condition RPAR {$ifRet.addCondition($c2.conditionRet);})

    b = loopBody
    {
        $ifRet.setThenBody($b.loopStmtsRet);
    }
    (ELSE b2 = loopBody
     {
        $ifRet.setElseBody($b2.loopStmtsRet);
     }
    )?
     END;

condition returns [ArrayList<Expression> conditionRet]:
    {
        $conditionRet = new ArrayList<Expression>();
    }
    (LPAR e = expression
     {$conditionRet.add($e.expRet);}
     RPAR ((AND | OR) (LPAR)? c = condition
     {
        $conditionRet.addAll($c.conditionRet);
     }
     (RPAR)?)*)*;

putsStatement returns [PutStatement putRet]:
    p = PUTS LPAR e = expression
    {
        $putRet = new PutStatement($e.expRet);
        $putRet.setLine($p.line);
    }
    RPAR SEMICOLLON;

lenStatement returns [LenStatement lenRet]:
    l = LEN LPAR e = expression
    {
        $lenRet = new LenStatement($e.expRet);
        $lenRet.setLine($l.line);
    }
    RPAR;

pushStatement returns [PushStatement pushRet]:
    p = PUSH LPAR e1 = expression COMMA e2 = expression RPAR SEMICOLLON
    {
        $pushRet = new PushStatement($e1.expRet, $e2.expRet);
        $pushRet.setLine($p.line);
    }
    ;

loopDoStatement returns [LoopDoStatement loopDoRet]:
    l1 = LOOP DO
    l2 = loopBody
    {
        $loopDoRet = new LoopDoStatement($l2.loopStmtsRet);
        $loopDoRet.setLine($l1.line);
    }
    END;

loopBody returns [ArrayList<Statement> loopStmtsRet]:
    {
        $loopStmtsRet = new ArrayList<Statement>();
    }
    (s = statement {$loopStmtsRet.add($s.stmtRet);}
    | BREAK
     {
        BreakStatement b = new BreakStatement();
     }
    (IF c1 = condition{
        b.setConditions($c1.conditionRet);
    })? {$loopStmtsRet.add(b);} SEMICOLLON
    | NEXT
    {
        NextStatement n = new NextStatement();
    }
    (IF c2 = condition
    {
        n.setConditions($c2.conditionRet);
    }
    )? {$loopStmtsRet.add(n);} SEMICOLLON
    )*
    (
    r = returnStatement {$loopStmtsRet.add($r.returnStmtRet);}
    )?;

forStatement returns [ForStatement forStRet]:
    f = FOR id = IDENTIFIER IN r = range
    l = loopBody
    END
    {
        $forStRet = new ForStatement(new Identifier($id.text), $r.rangeRet, $l.loopStmtsRet);
        $forStRet.setLine($f.line);
    }
    ;

range returns [RangeExpression rangeRet]:
    {
        ArrayList<Expression> exps = new ArrayList<Expression>();
        RangeType rangeType;
        int line = 0;
    }
    (
    (LPAR e1 = expression
    DOUBLEDOT e2 = expression
    {
        exps.add($e1.expRet);
        exps.add($e2.expRet);
        rangeType = RangeType.DOUBLE_DOT;
        line = $DOUBLEDOT.line;
    }
    RPAR)
    |
    {
        rangeType = RangeType.LIST;
    }
     (LBRACK (e3 = expression
    {
        exps.add($e3.expRet);
        line = $LBRACK.line;
    }
    (COMMA e4 = expression
    {
        exps.add($e4.expRet);
    }
    )*) RBRACK)
    |
     id = IDENTIFIER
    {
        Identifier id_ = new Identifier($id.text);
        id_.setLine($id.line);
        exps.add(id_);
        rangeType = RangeType.IDENTIFIER;
        line = $id.line;
    }
    )
    {
        $rangeRet = new RangeExpression(rangeType, exps);
        $rangeRet.setLine(line);
    }
    ;


matchPatternStatement returns [MatchPatternStatement matchPatRet]:
    id = IDENTIFIER DOT m = MATCH LPAR e = expression RPAR
    {
        Identifier id_ = new Identifier($id.text);
        id_.setLine($id.line);
        $matchPatRet = new MatchPatternStatement(id_, $e.expRet);
        $matchPatRet.setLine($m.line);
    }
    ;

chopStatement returns [ChopStatement chopRet]:

    c = CHOP LPAR e = expression RPAR
    {
        $chopRet = new ChopStatement($e.expRet);
        $chopRet.setLine($c.line);
    }
    ;
chompStatement returns [ChompStatement chompRet]:
    c = CHOMP LPAR e = expression RPAR
    {
        $chompRet = new ChompStatement($e.expRet);
        $chompRet.setLine($c.line);
    }
    ;

assignment returns [AssignStatement assignRet]:
    {
        boolean access = false;
        int line;
        AssignOperator op;
    }
    id = IDENTIFIER (a = accessList {access = true;})?
    (as = ASSIGN {op = AssignOperator.ASSIGN;line = $as.line;}
    | pl = PLUS_ASSIGN {op = AssignOperator.PLUS_ASSIGN;line = $pl.line;}
    | mi = MINUS_ASSIGN {op = AssignOperator.MINUS_ASSIGN;line = $mi.line;}
    | di = DIVIDE_ASSIGN {op = AssignOperator.DIVIDE_ASSIGN;line = $di.line;}
    | mu = MULT_ASSIGN {op = AssignOperator.MULT_ASSIGN;line = $mu.line;}
    | mo = MOD_ASSIGN {op = AssignOperator.MOD_ASSIGN;line = $mo.line;})
     e = expression SEMICOLLON
     {
          Identifier id_ = new Identifier($id.text);
          id_.setLine($id.line);
          $assignRet = new AssignStatement(access, id_, $e.expRet, op);
          if(access){
            $assignRet.setAccessListExpression($a.accessListExp);
          }
          $assignRet.setLine(line);
     };

accessList returns [Expression accessListExp]:
    LBRACK e = expression {$accessListExp = $e.expRet;} RBRACK;

statement returns [Statement stmtRet]:
    i = ifStatement {$stmtRet = $i.ifRet;}
    | loop = loopDoStatement {$stmtRet = $loop.loopDoRet;}
    | f = forStatement {$stmtRet = $f.forStRet;}
    | puts = putsStatement {$stmtRet = $puts.putRet;}
    | push = pushStatement {$stmtRet = $push.pushRet;}
    | e = expression {$stmtRet = new ExpressionStatement($e.expRet);}
     {
        ExpressionStatement expStmt = new ExpressionStatement($e.expRet);
        $stmtRet = expStmt;
        $stmtRet.setLine($e.expRet.getLine());
     }
     SEMICOLLON
    | as = assignment {$stmtRet = $as.assignRet;}
    ;


body returns [ArrayList<Statement> bodyRet]:
    {
        $bodyRet = new ArrayList<Statement>();
    }
    (s = statement {$bodyRet.add($s.stmtRet);})*
    (
    r = returnStatement {$bodyRet.add($r.returnStmtRet);}
    )?;


expression returns [Expression expRet]:
    e1 = expression a = APPEND e2 = eqaulityExpression
    {
        if(!($e1.expRet instanceof AppendExpression)){
            $expRet = new AppendExpression($e1.expRet);
            $expRet.setLine($a.line);
        }
        else{
            AppendExpression appendExp = (AppendExpression) $e1.expRet;
            appendExp.addAppendedExpression($e2.expRet);
            $expRet = appendExp;
        }
    }
    | e3 = eqaulityExpression {$expRet = $e3.expRet;};


eqaulityExpression returns[Expression expRet]:
    e1 = relationalExpression
    {
        BinaryOperator op;
        int line;
    }
    (op1 = EQUAL {op = BinaryOperator.EQUAL;line = $op1.line;}
    | op2 = NOT_EQUAL {op = BinaryOperator.NOT_EQUAL;line = $op2.line;}
    ) r1 = relationalExpression {$expRet = new BinaryExpression($e1.expRet, $r1.expRet, op);$expRet.setLine(line);}
    | r2 = relationalExpression {$expRet = $r2.expRet;};

relationalExpression returns [Expression expRet]:
    r1 = relationalExpression
    {
        BinaryOperator op;
        int line;
    }
    (gt = GREATER_THAN {op = BinaryOperator.GREATER_THAN;line = $gt.line;}
    | lt = LESS_THAN {op = BinaryOperator.LESS_THAN;line = $lt.line;}
    | let = LESS_EQUAL_THAN {op = BinaryOperator.LESS_EQUAL_THAN;line = $let.line;}
    | get = GREATER_EQUAL_THAN {op = BinaryOperator.GREATER_EQUAL_THAN;line = $get.line;}
    ) a1 = additiveExpression {$expRet = new BinaryExpression($r1.expRet, $a1.expRet, op);$expRet.setLine(line);}
    | a2 = additiveExpression {$expRet = $a2.expRet;};


additiveExpression returns [Expression expRet]:
    a1 = additiveExpression
    {
            BinaryOperator op;
            int line;
    }
    (p = PLUS {op = BinaryOperator.PLUS;line = $p.line;}
    | m = MINUS {op = BinaryOperator.MINUS;line = $m.line;}
    ) m1 = multiplicativeExpression {$expRet = new BinaryExpression($a1.expRet, $m1.expRet, op);$expRet.setLine(line);}
    | m2 = multiplicativeExpression
    {
        $expRet = $m2.expRet;
    }
    ;


multiplicativeExpression returns [Expression expRet]:
    m1 = multiplicativeExpression
    {
            BinaryOperator op;
            int line;
    }
    (m = MULT {op = BinaryOperator.MULT;line = $m.line;}
    |d = DIVIDE {op = BinaryOperator.DIVIDE;line = $d.line;}
    ) p1 = preUnaryExpression {$expRet = new BinaryExpression($m1.expRet, $p1.expRet, op);$expRet.setLine(line);}
    | p2 = preUnaryExpression {$expRet = $p2.expRet;};


preUnaryExpression returns [Expression expRet]:
    {
        UnaryOperator op;
        int line;
    }
    (n = NOT {op = UnaryOperator.NOT;line = $n.line;}
    |m = MINUS {op = UnaryOperator.MINUS;line = $m.line;}
    |i = INCREMENT {op = UnaryOperator.INC;line = $i.line;}
    |d = DECREMENT {op = UnaryOperator.DEC;line = $d.line;}
    ) a1 = accessExpression {$expRet = new UnaryExpression($a1.expRet, op);$expRet.setLine(line);}
    | a2 = accessExpression {$expRet = $a2.expRet;};


accessExpression returns [Expression expRet]:
    {
        boolean isAccessExpression = false;
        boolean isMultiDimentional = false;
        boolean isFunctionCall = false;
        ArrayList<Expression> args = new ArrayList<Expression>();
        ArrayList<Expression> dimentions = new ArrayList<Expression>();
    }
    o = otherExpression
    (LPAR f = functionArguments //arrayList of expression
    {
        isAccessExpression = true;
        isFunctionCall =true;
        args.addAll($f.funcArgsRet);
    }
    RPAR)*
    (a = accessList //single expression
    {
        isMultiDimentional = true;
        isAccessExpression = true;
        dimentions.add($a.accessListExp);
    }
    )*
    {
        if(!isAccessExpression){
            $expRet = $o.expRet;
        }
        else{
            AccessExpression accessExp = new AccessExpression($o.expRet, args);
            accessExp.setIsFunctionCall(isFunctionCall);
            if(isMultiDimentional){

                accessExp.setDimentionalAccess(dimentions);
            }
            $expRet = accessExp;
            $expRet.setLine($o.expRet.getLine());

        }
    }
    ;

otherExpression returns [Expression expRet]:
    v = values {$expRet = $v.valRet;}
    | id = IDENTIFIER
    {
        $expRet = new Identifier($id.text);
        $expRet.setLine($id.line);
    }
    | lambda = lambdaFunction {$expRet = $lambda.lambdaRet;}
    | chop = chopStatement {$expRet = $chop.chopRet;}
    | chomp = chompStatement {$expRet = $chomp.chompRet;}
    | match = matchPatternStatement {$expRet = $match.matchPatRet;}
    | len_ = lenStatement {$expRet = $len_.lenRet;}
    | LPAR (e = expression {$expRet = $e.expRet;})? RPAR;




lambdaFunction returns [Expression lambdaRet]:
    a = ARROW  fd = functionArgumentsDeclaration
     LBRACE b = body RBRACE
     {
        $lambdaRet = new LambdaExpression($fd.argRet, $b.bodyRet);
        $lambdaRet.setLine($a.line);
     }
    ;

values returns [Value valRet]:
    b = boolValue {$valRet = $b.boolValRet;}
    | s = STRING_VALUE {$valRet = new StringValue($s.text); $valRet.setLine($s.line);}
    | i = INT_VALUE {$valRet = new IntValue($i.int);$valRet.setLine($i.line);}
    | float_ = FLOAT_VALUE {$valRet = new FloatValue(Float.parseFloat($float_.text));$valRet.setLine($float_.line);}
    | l = listValue {$valRet = $l.listValRet;}
    | f = functionPointer {$valRet = $f.fpRet;};

listValue returns [ListValue listValRet]:
    l = LBRACK f = functionArguments
    RBRACK
    {
        $listValRet = new ListValue($f.funcArgsRet);
        $listValRet.setLine($l.line);
    }
    ;

boolValue returns [BoolValue boolValRet]:
    t = TRUE {$boolValRet = new BoolValue(true); $boolValRet.setLine($t.line);}
    | f = FALSE {$boolValRet = new BoolValue(false); $boolValRet.setLine($f.line);}
    ;

functionPointer returns [FunctionPointer fpRet]:
    m = METHOD LPAR COLON id = IDENTIFIER RPAR
    {
        Identifier id_ = new Identifier($id.text);
        id_.setLine($id.line);
        $fpRet = new FunctionPointer(id_);
        $fpRet.setLine($m.line);
    }
    ;


DEF: 'def';
END: 'end';
MAIN: 'main';

PUTS: 'puts';
PUSH: 'push';
LEN: 'len';
RETURN: 'return';

IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';

METHOD: 'method';

PATTERN: 'pattern';
MATCH: 'match';
LOOP: 'loop';
FOR: 'for';
IN: 'in';
DO: 'do';

CHOP: 'chop';
CHOMP: 'chomp';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';

EQUAL: '==';
NOT_EQUAL: '!=';
LESS_EQUAL_THAN: '<=';
GREATER_EQUAL_THAN: '>=';
GREATER_THAN: '>';
LESS_THAN: '<';

AND: '&&';
OR: '||';
NOT: '!';
INCREMENT: '++';
DECREMENT: '--';

PATTERN_MATCHING_SEPARATOR: '    |';
SEPARATOR: '|';
APPEND: '<<';

TRUE: 'true';
FALSE: 'false';

BREAK: 'break';
NEXT: 'next';

ARROW: '->';

PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIVIDE_ASSIGN: '/=';
MOD_ASSIGN: '%=';
ASSIGN: '=';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
DOUBLEDOT: '..';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
FLOAT_VALUE: [0-9]* '.' [0-9]+;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('#' ~( '\r' | '\n')* | ('=begin' .*? '=end')) -> skip;
WS: ([ \t\n\r]) -> skip;