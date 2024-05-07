package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.util.ArrayList;

import static main.ast.nodes.statement.AssignOperator.ASSIGN;


public class NameAnalyzer extends Visitor<Void> {
    private final String FUNCTION_START_KEY = "Function:";
    private final String PATTERN_START_KEY = "Pattern:";
    private final String VAR_START_KEY = "VAR:";

    public ArrayList<CompileError> nameErrors = new ArrayList<>();
    private boolean checkArgMatch(ArrayList<VarDeclaration> args, int funcArgCount) {
        int requiredArgCount = 0;
        int argCount = 0;
        for (VarDeclaration varDec : args) {
            if (varDec.getDefaultVal() == null) {
                requiredArgCount += 1;
                argCount += 1;
            } else if (varDec.getDefaultVal() != null) {
                argCount += 1;
            }
        }
        return funcArgCount >= requiredArgCount && funcArgCount <= argCount;
    }
    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        //addFunctions
        int duplicateFunctionId = 0;
        ArrayList<FunctionItem> functionItems = new ArrayList<>();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
                functionItems.add(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
                duplicateFunctionId += 1;
                String freshName = functionItem.getName() + "#" + duplicateFunctionId;
                Identifier newId = functionDeclaration.getFunctionName();
                newId.setName(freshName);
                functionDeclaration.setFunctionName(newId);
                FunctionItem newItem = new FunctionItem(functionDeclaration);
                functionItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) { }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + duplicatePatternId;
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) { }
            }
        }


        //visitFunctions
        int visitingFunctionIndex = 0;
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = functionItems.get(visitingFunctionIndex);
            SymbolTable functionSymbolTable = new SymbolTable();
            functionItem.setFunctionSymbolTable(functionSymbolTable);
            SymbolTable.push(functionSymbolTable);
            functionDeclaration.accept(this);
            SymbolTable.pop();
            visitingFunctionIndex += 1;
        }


        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }

        //visitMain
        program.getMain().accept(this);
        return null;
    }
    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        for (VarDeclaration varDec : functionDeclaration.getArgs()) {
            if (varDec.getName().getName().equals(functionDeclaration.getFunctionName().getName())) {
                nameErrors.add(new IdenticalArgFunctionName(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
            }
            varDec.accept(this);
        }

        for (var stmt : functionDeclaration.getBody()) {
            stmt.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(PatternDeclaration patternDeclaration){
        Identifier targetVarId = patternDeclaration.getTargetVariable();
        if (targetVarId.getName().equals(patternDeclaration.getPatternName().getName())) {
            nameErrors.add(new IdenticalArgPatternName(patternDeclaration.getLine(),
                    patternDeclaration.getPatternName().getName()));
        }
        VarItem varItem = new VarItem(targetVarId);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) { }
        targetVarId.accept(this);

        for (var condition : patternDeclaration.getConditions()) {
            condition.accept(this);
        }

        for (var retExpr : patternDeclaration.getReturnExp()) {
            retExpr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(VarDeclaration varDeclaration){
        var varItem = new VarItem(varDeclaration.getName());
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new DuplicateArg(varDeclaration.getLine(),
                    varDeclaration.getName().getName()));
        }
        return null;
    }
    @Override
    public Void visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall() &&
                accessExpression.getAccessedExpression() instanceof Identifier functionNameId) {
            try {
                SymbolTableItem item = SymbolTable.root.getItem(FUNCTION_START_KEY + functionNameId.getName());

                FunctionItem functionItem = (FunctionItem) item;

                FunctionDeclaration funcDec = functionItem.getFunctionDeclaration();

                if (!checkArgMatch(funcDec.getArgs(), accessExpression.getArguments().size())) {
                    nameErrors.add(new ArgMisMatch(accessExpression.getLine(),
                            functionNameId.getName()));
                }
            } catch (ItemNotFound e) {
                nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(),
                        functionNameId.getName()));
            }
        }
        else if (accessExpression.isFunctionCall() &&
                accessExpression.getAccessedExpression() instanceof LambdaExpression lambdaExpression) {
            if (!checkArgMatch(lambdaExpression.getDeclarationArgs(), accessExpression.getArguments().size())) {
                nameErrors.add(new ArgMisMatch(accessExpression.getLine(),
                        lambdaExpression.toString()));
            }
            SymbolTable lambdaFunctionSymbolTable = SymbolTable.top.createSnapshot();
            SymbolTable.push(lambdaFunctionSymbolTable);
            // -> (a, c, d, [b = 5]) { return a + b + d + c + r; }(3, 4, 2);
            for (var arg : lambdaExpression.getDeclarationArgs()) {
                if (arg == null) {
                    continue;
                }
                var varItem = new VarItem(arg.getName());
                try {
                    SymbolTable.top.put(varItem);
                } catch (ItemAlreadyExists ignored) { }
            }
            for (var stmt : lambdaExpression.getBody()) {
                if (stmt != null) {
                    stmt.accept(this);
                }
            }
            SymbolTable.pop();
        }
        else if (!accessExpression.isFunctionCall() &&
                accessExpression.getAccessedExpression() instanceof Identifier list) {
            list.accept(this);
        }

        for (var expr : accessExpression.getArguments()) {
            expr.accept(this);
        }
        for (var expr : accessExpression.getDimentionalAccess()) {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ListValue listValue) {
        for (var element : listValue.getElements()) {
            if (element != null) {
                element.accept(this);
            }
        }
        return null;
    }
    @Override
    public Void visit(Identifier identifier) {
        try {
            SymbolTable.top.getItem(VAR_START_KEY + identifier.getName());
        } catch (ItemNotFound e) {
            nameErrors.add(new VariableNotDeclared(identifier.getLine(),
                    identifier.getName()));
        }
        return null;
    }
    @Override
    public Void visit(MainDeclaration mainDeclaration){
        for (var stmt : mainDeclaration.getBody()) {
            stmt.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(UnaryExpression unaryExpression) {
        var expr = unaryExpression.getExpression();
        if (expr != null) {
            expr.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ExpressionStatement expressionStatement){
        var expr = expressionStatement.getExpression();
        if (expr != null) {
            expr.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
        Identifier patternId = matchPatternStatement.getPatternId();

        try {
            SymbolTable.root.getItem(PATTERN_START_KEY + patternId.getName());
        } catch (ItemNotFound e) {
            nameErrors.add(new PatternNotDeclared(patternId.getLine(),
                    patternId.getName()));
        }

        var expr = matchPatternStatement.getMatchArgument();
        expr.accept(this);
        return null;
    }
    @Override
    public Void visit(LambdaExpression lambdaExpression) {
        //-> (k, l) { return a + b; };
        SymbolTable lambdaSymbolTable = SymbolTable.top.createSnapshot();
        SymbolTable.push(lambdaSymbolTable);
        for (VarDeclaration varDec : lambdaExpression.getDeclarationArgs()) {
            varDec.accept(this);
        }
        for (var stmt : lambdaExpression.getBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(AppendExpression appendExpression) {
        var appendeeExpr = appendExpression.getAppendee();
        appendeeExpr.accept(this);

        for (var expr : appendExpression.getAppendeds()) {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(BinaryExpression binaryExpression){
        var operand1 = binaryExpression.getFirstOperand();
        if (operand1 != null) {
            operand1.accept(this);
        }

        var operand2 = binaryExpression.getSecondOperand();
        if (operand2 != null) {
            operand2.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ReturnStatement returnStatement){
        var retExpr = returnStatement.getReturnExp();

        if (retExpr != null) {
            retExpr.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(IfStatement ifStatement){
        for (var expr : ifStatement.getConditions()) {
            expr.accept(this);
        }

        SymbolTable thenStmtSymbolTable = SymbolTable.top.createSnapshot();
        SymbolTable.push(thenStmtSymbolTable);
        for (var stmt : ifStatement.getThenBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();

        SymbolTable elseStmtSymbolTable = SymbolTable.top.createSnapshot();
        SymbolTable.push(elseStmtSymbolTable);
        for (var stmt : ifStatement.getElseBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();

        return null;
    }
    @Override
    public Void visit(PutStatement putStatement) {
        var expr = putStatement.getExpression();
        if (expr == null) {
            nameErrors.add(new ArgMisMatch(putStatement.getLine(),
                    putStatement.toString()));
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(LenStatement lenStatement){
        var expr = lenStatement.getExpression();
        if (expr == null) {
            nameErrors.add(new ArgMisMatch(lenStatement.getLine(),
                    lenStatement.toString()));
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(PushStatement pushStatement) {
        var initExpr = pushStatement.getInitial();
        if (initExpr == null) {
            nameErrors.add(new ArgMisMatch(pushStatement.getLine(), pushStatement.toString()));
        } else {
            initExpr.accept(this);
        }


        var toBeAddedExpr = pushStatement.getToBeAdded();
        if (toBeAddedExpr == null) {
            nameErrors.add(new ArgMisMatch(pushStatement.getLine(), pushStatement.toString()));
        } else {
            toBeAddedExpr.accept(this);
        }


        return null;
    }
    @Override
    public Void visit(LoopDoStatement loopDoStatement){
        SymbolTable loopDoSymbolTable = SymbolTable.top.createSnapshot();
        SymbolTable.push(loopDoSymbolTable);

        for (var expr : loopDoStatement.getLoopConditions()) {
            expr.accept(this);
        }

        for (var stmt : loopDoStatement.getLoopBodyStmts()) {
            stmt.accept(this);
        }

        ReturnStatement retStmt = loopDoStatement.getLoopRetStmt();
        if (retStmt != null) {
            retStmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(ForStatement forStatement) {
        for (var expr : forStatement.getRangeExpressions()) {
            expr.accept(this);
        }

        SymbolTable forStmtSymbolTable = SymbolTable.top.createSnapshot();
        SymbolTable.push(forStmtSymbolTable);

        VarItem varItem = new VarItem(forStatement.getIteratorId());
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) { }

        for (var expr : forStatement.getLoopBodyExpressions()) {
            expr.accept(this);
        }

        for (var stmt : forStatement.getLoopBody()) {
            stmt.accept(this);
        }

        ReturnStatement retStmt = forStatement.getReturnStatement();
        if (retStmt != null) {
            retStmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(ChopStatement chopStatement) {
        var expr = chopStatement.getChopExpression();
        if (expr == null) {
            nameErrors.add(new ArgMisMatch(chopStatement.getLine(),
                    chopStatement.toString()));
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ChompStatement chompStatement){
        var expr = chompStatement.getChompExpression();
        if (expr == null) {
            nameErrors.add(new ArgMisMatch(chompStatement.getLine(),
                    chompStatement.toString()));
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(FunctionPointer functionPointer) {
        try {
            SymbolTable.root.getItem(FUNCTION_START_KEY + functionPointer.getId().getName());
        } catch (ItemNotFound e) {
            nameErrors.add(new FunctionNotDeclared(functionPointer.getLine(),
                    functionPointer.getId().getName()));
        }
        return null;
    }
    @Override
    public Void visit(AssignStatement assignStatement) {
        Identifier assignId = assignStatement.getAssignedId();
        VarItem varItem = new VarItem(assignId);
        if (assignStatement.getAssignOperator() == ASSIGN) {
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExists ignored) {}
            assignId.accept(this);
        } else {
            assignId.accept(this);
        }

        if (assignStatement.isAccessList() &&
                assignStatement.getAccessListExpression() != null) {
            assignStatement.getAccessListExpression().accept(this);
        }
        if (assignStatement.getAssignExpression() != null) {
            assignStatement.getAssignExpression().accept(this);
        }
        return null;
    }
}