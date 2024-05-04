package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
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

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();
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
                } catch (ItemAlreadyExists ignored) {
                }
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
                } catch (ItemAlreadyExists ignored) {
                }
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
    public Void visit(FunctionDeclaration functionDeclaration){
        var functionItem = new FunctionItem(functionDeclaration);
        var functionSymbolTable = new SymbolTable();

        functionItem.setFunctionSymbolTable(functionSymbolTable);

        SymbolTable.push(functionSymbolTable);

        for (VarDeclaration varDec : functionDeclaration.getArgs()) {
            VarItem varItem = new VarItem(varDec.getName());
            try {
                SymbolTable.top.put(varItem);
                varDec.accept(this);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new IdenticalArgFunctionName(varDec.getLine(),
                        varDec.getName().getName()));
            }
        }

        for (var stmt : functionDeclaration.getBody()) {
            if (stmt instanceof ForStatement
                    || stmt instanceof LoopDoStatement
                    || stmt instanceof AssignStatement
                    || stmt instanceof IfStatement
                    || stmt instanceof ExpressionStatement
                    || stmt instanceof PushStatement
                    || stmt instanceof ReturnStatement
                    || stmt instanceof PutStatement
//                    || stmt instanceof MatchPatternStatement
//                    || stmt instanceof ChopStatement
//                    || stmt instanceof ChompStatement
//                    || stmt instanceof Identifier
//                    || stmt instanceof LenStatement
            ) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(PatternDeclaration patternDeclaration){
        var patternItem = new PatternItem(patternDeclaration);
        var patternSymbolTable = new SymbolTable();

        patternItem.setPatternSymbolTable(patternSymbolTable);

        Identifier targetVar = patternDeclaration.getTargetVariable();
        VarItem varItem = new VarItem(targetVar);
        try {
            SymbolTable.top.put(varItem);
            targetVar.accept(this);
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new IdenticalArgPatternName(targetVar.getLine(),
                    targetVar.getName()));
        }

        SymbolTable.push(patternSymbolTable);

        for (var condition : patternDeclaration.getConditions()) {
            if (condition instanceof AccessExpression
                    || condition instanceof AppendExpression
                    || condition instanceof BinaryExpression
                    || condition instanceof ChompStatement
                    || condition instanceof ChopStatement
                    || condition instanceof Identifier
                    || condition instanceof LambdaExpression
                    || condition instanceof LenStatement
                    || condition instanceof MatchPatternStatement
                    || condition instanceof UnaryExpression) {
                condition.accept(this);
            }
        }
        for (var retExpr : patternDeclaration.getReturnExp()) {
            if (retExpr instanceof AccessExpression
                    || retExpr instanceof AppendExpression
                    || retExpr instanceof BinaryExpression
                    || retExpr instanceof ChompStatement
                    || retExpr instanceof ChopStatement
                    || retExpr instanceof Identifier
                    || retExpr instanceof LambdaExpression
                    || retExpr instanceof LenStatement
                    || retExpr instanceof MatchPatternStatement
                    || retExpr instanceof UnaryExpression) {
                retExpr.accept(this);
            }
        }

        SymbolTable.pop();

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
        Identifier id = (Identifier) accessExpression.getAccessedExpression();
        String name = id.getName();

        if (accessExpression.isFunctionCall()) {
            try {
                SymbolTableItem symbolTableItem = SymbolTable.root.getItem(name);
                FunctionItem functionItem = (FunctionItem) symbolTableItem;

                FunctionDeclaration funcDec = functionItem.getFunctionDeclaration();

                int requiredArgCount = 0;
                int argCount = 0;
                for (VarDeclaration varDec : funcDec.getArgs()) {
                    if (varDec.getDefaultVal() == null) {
                        requiredArgCount += 1;
                        argCount += 1;
                    } else if (varDec.getDefaultVal() != null) {
                        argCount += 1;
                    }
                }

                int funcArgCount = accessExpression.getArguments().size();
                if (funcArgCount < requiredArgCount || funcArgCount > argCount) {
                    nameErrors.add(new ArgMisMatch(accessExpression.getLine(), name));
                }

                for (var expr : accessExpression.getArguments()) {
                    expr.accept(this);
                }
            } catch (ItemNotFound e) {
                nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(), name));
            }

        }
        if (!accessExpression.isFunctionCall()){ // list access
            try {
                SymbolTable.top.getItem(name);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(accessExpression.getLine(), name));
            }
        }

        for (var expr : accessExpression.getDimentionalAccess()) {
            expr.accept(this);
        }

        return null;
    }
////////////////////////////////////////////////////////////////
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
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem((id).getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(expr.getLine(), id.getName()));
            }
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ExpressionStatement expressionStatement){
        var expr = expressionStatement.getExpression();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem((id).getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(expr.getLine(), id.getName()));
            }
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
        var patternId = matchPatternStatement.getPatternId();
        try {
            SymbolTable.root.getItem(patternId.getName());
            patternId.accept(this);
        } catch (ItemNotFound e) {
            nameErrors.add(new PatternNotDeclared(patternId.getLine(),
                    patternId.getName()));
        }

        var expr = matchPatternStatement.getMatchArgument();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem((id).getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(expr.getLine(),
                        id.getName()));
            }
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(LambdaExpression lambdaExpression){
        // Handle count of args.
        for (VarDeclaration varDec : lambdaExpression.getDeclarationArgs()) {
            varDec.accept(this);
        }

        for (var stmt : lambdaExpression.getBody()) {
            stmt.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(AppendExpression appendExpression){
        var appendeeExpr = appendExpression.getAppendee();
        if (appendeeExpr instanceof Identifier id1) {
            try {
                SymbolTable.top.getItem(id1.getName());
                appendeeExpr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add((new VariableNotDeclared(appendeeExpr.getLine(),
                        id1.getName())));
            }
        } else {
            appendeeExpr.accept(this);
        }

        for (var expr : appendExpression.getAppendeds()) {
            if (expr instanceof Identifier id2) {
                try {
                    SymbolTable.top.getItem(id2.getName());
                } catch (ItemNotFound e) {
                    nameErrors.add((new VariableNotDeclared(expr.getLine(),
                            id2.getName())));
                }
            }
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(BinaryExpression binaryExpression){
        var operand1 = binaryExpression.getFirstOperand();
        if (operand1 instanceof Identifier id1) {
            try {
                SymbolTable.top.getItem(id1.getName());
                operand1.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add((new VariableNotDeclared(operand1.getLine(),
                        id1.getName())));
            }
        } else {
            operand1.accept(this);
        }

        var operand2 = binaryExpression.getSecondOperand();
        if (operand2 instanceof Identifier id2) {
            try {
                SymbolTable.top.getItem(id2.getName());
                operand2.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add((new VariableNotDeclared(operand2.getLine(),
                        id2.getName())));
            }
        } else {
            operand2.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ReturnStatement returnStatement){
        var retExpr = returnStatement.getReturnExp();
        if (retExpr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                retExpr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add((new VariableNotDeclared(retExpr.getLine(),
                        id.getName())));
            }
        } else {
            retExpr.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(IfStatement ifStatement){
        for (var expr : ifStatement.getConditions()) {
            if (expr instanceof Identifier id) {
                try {
                    SymbolTable.top.getItem(id.getName());
                    expr.accept(this);
                } catch (ItemNotFound e) {
                    nameErrors.add(new VariableNotDeclared(expr.getLine(), id.getName()));
                }
            } else {
                expr.accept(this);
            }
        }

        // TODO add scope symbolTable
        for (var stmt : ifStatement.getThenBody()) {
            stmt.accept(this);
        }

        // TODO add scope symbolTable
        for (var stmt : ifStatement.getElseBody()) {
            stmt.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(PutStatement putStatement){
        var expr = putStatement.getExpression();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(expr.getLine(), id.getName()));
            }
        } else {
            expr.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(LenStatement lenStatement){
        var expr = lenStatement.getExpression();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(expr.getLine(), id.getName()));
            }
        } else {
            expr.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(PushStatement pushStatement){
        var initExpr = pushStatement.getInitial();
        if (initExpr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                initExpr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(initExpr.getLine(),
                        id.getName()));
            }
        } else {
            initExpr.accept(this);
        }

        var toBeAddedExpr = pushStatement.getToBeAdded();
        if (toBeAddedExpr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                toBeAddedExpr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(toBeAddedExpr.getLine(),
                        id.getName()));
            }
        } else {
            toBeAddedExpr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(LoopDoStatement loopDoStatement){
        for (var expr : loopDoStatement.getLoopConditions()) {
            if (expr instanceof Identifier id) {
                try {
                    SymbolTable.top.getItem(id.getName());
                    expr.accept(this);
                } catch (ItemNotFound e) {
                    nameErrors.add(new VariableNotDeclared(expr.getLine(),
                            id.getName()));
                }
            } else {
                expr.accept(this);
            }
        }

        for (var stmt : loopDoStatement.getLoopBodyStmts()) {
            stmt.accept(this);
        }

        ReturnStatement retStmt = loopDoStatement.getLoopRetStmt();
        if (retStmt != null) {
            retStmt.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ForStatement forStatement){
        Identifier id = forStatement.getIteratorId();
        id.accept(this);

        for (var expr : forStatement.getRangeExpressions()) {
            if (expr instanceof Identifier rangeId) {
                try {
                    SymbolTable.top.getItem(rangeId.getName());
                    expr.accept(this);
                } catch (ItemNotFound e) {
                    nameErrors.add(new VariableNotDeclared(rangeId.getLine(),
                            rangeId.getName()));
                }
            } else {
                expr.accept(this);
            }
        }

        for (var expr : forStatement.getLoopBodyExpressions()) {
            if (expr instanceof Identifier bodyExpr) {
                try {
                    SymbolTable.top.getItem(bodyExpr.getName());
                    expr.accept(this);
                } catch (ItemNotFound e) {
                    nameErrors.add(new VariableNotDeclared(bodyExpr.getLine(),
                            bodyExpr.getName()));
                }
            } else {
                expr.accept(this);
            }
        }

        for (var stmt : forStatement.getLoopBody()) {
            stmt.accept(this);
        }

        ReturnStatement retStmt = forStatement.getReturnStatement();
        if (retStmt != null) {
            retStmt.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ChopStatement chopStatement){
        var expr = chopStatement.getChopExpression();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(id.getLine(),
                        id.getName()));
            }
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(ChompStatement chompStatement){
        var expr = chompStatement.getChompExpression();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(id.getLine(),
                        id.getName()));
            }
        } else {
            expr.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(AssignStatement assignStatement) {
        var expr = assignStatement.getAssignExpression();
        if (expr instanceof Identifier id) {
            try {
                SymbolTable.top.getItem(id.getName());
                expr.accept(this);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(id.getLine(),
                        id.getName()));
            }
        } else {
            expr.accept(this);
        }

        return null;
    }
}





























//public Void visit(ListValue listValue){return null;}
//public Void visit(BoolValue boolValue){return null;}
//public Void visit(IntValue intValue){return null;}
//public Void visit(StringValue stringValue){return null;}
//public Void visit(FloatValue floatValue){return null;}




//public Void visit(FunctionPointer functionPointer){
//public Void visit(Identifier identifier) {
