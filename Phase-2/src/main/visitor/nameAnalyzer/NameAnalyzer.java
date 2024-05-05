package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
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
    private final String FUNCTION_START_KEY = "Function:";
    private final String PATTERN_START_KEY = "Pattern:";
    private final String VAR_START_KEY = "VAR:";

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
        } catch (ItemAlreadyExists e) {
//            nameErrors.add(new )
        }
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
        Identifier id = (Identifier) accessExpression.getAccessedExpression();
        String name = id.getName();
        if (accessExpression.isFunctionCall() &&
                accessExpression.getAccessedExpression() instanceof Identifier functionNameId) {
            try {
                SymbolTableItem item = SymbolTable.root.getItem(FUNCTION_START_KEY + functionNameId.getName());

                FunctionItem functionItem = (FunctionItem) item;

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

//                for (var stmt : funcDec.getBody()) {
//                    stmt.accept(this);
//                }

            } catch (ItemNotFound e) {
                nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(),
                        functionNameId.getName()));
            }
            // Call the function
        }
        else if (accessExpression.isFunctionCall() &&
                accessExpression.getAccessedExpression() instanceof LambdaExpression lambdaExpression) {

            int requiredArgCount = 0;
            int argCount = 0;
            for (VarDeclaration varDec : lambdaExpression.getDeclarationArgs()) {
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

//            for (var stmt : lambdaExpression.getBody()) {
//                stmt.accept(this);
//            }
        }
        else if (!accessExpression.isFunctionCall()) { // list access
            try {
                SymbolTable.top.getItem(VAR_START_KEY + name);
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(accessExpression.getLine(), name));
            }
        }

        for (var expr : accessExpression.getArguments()) {
            expr.accept(this);
        }
        for (var expr : accessExpression.getDimentionalAccess()) {
            expr.accept(this);
        }

        return null;
    }
    ////////////////////////////////////////////////////////////////
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
        expr.accept(this);
        return null;
    }
    @Override
    public Void visit(ExpressionStatement expressionStatement){
        var expr = expressionStatement.getExpression();
        expr.accept(this);
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
    public Void visit(LambdaExpression lambdaExpression){
        for (VarDeclaration varDec : lambdaExpression.getDeclarationArgs()) {
            varDec.accept(this);
        }

        for (var stmt : lambdaExpression.getBody()) {
            stmt.accept(this);
        }

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
        operand1.accept(this);

        var operand2 = binaryExpression.getSecondOperand();
        operand2.accept(this);

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

        for (var stmt : ifStatement.getThenBody()) {
            stmt.accept(this);
        }

        for (var stmt : ifStatement.getElseBody()) {
            stmt.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(PutStatement putStatement) {
        var expr = putStatement.getExpression();
        expr.accept(this);

        return null;
    }
    @Override
    public Void visit(LenStatement lenStatement){
        var expr = lenStatement.getExpression();
        expr.accept(this);

        return null;
    }
    @Override
    public Void visit(PushStatement pushStatement) {
        var initExpr = pushStatement.getInitial();
        initExpr.accept(this);

        var toBeAddedExpr = pushStatement.getToBeAdded();
        toBeAddedExpr.accept(this);

        return null;
    }
    @Override
    public Void visit(LoopDoStatement loopDoStatement){
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
        return null;
    }
    @Override
    public Void visit(ForStatement forStatement) {
        Identifier id = forStatement.getIteratorId();
        id.accept(this);

        for (var expr : forStatement.getRangeExpressions()) {
            expr.accept(this);
        }

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

        return null;
    }
    @Override
    public Void visit(ChopStatement chopStatement) {
        var expr = chopStatement.getChopExpression();
        expr.accept(this);

        return null;
    }
    @Override
    public Void visit(ChompStatement chompStatement){
        var expr = chompStatement.getChompExpression();
        expr.accept(this);

        return null;
    }
    @Override
    public Void visit(AssignStatement assignStatement) {
        Identifier assignId = assignStatement.getAssignedId();
        VarItem varItem = new VarItem(assignId);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) {} // Do nothing
        assignId.accept(this);

        var expr = assignStatement.getAssignExpression();
//        // if instance of identifier
//        try {
//            SymbolTable item = SymbolTable.root.getItem(FUNCTION_START_KEY + "");
//
//        } catch (ItemNotFound e) {
//            nameErrors.add(new FunctionNotDeclared());
//        }
        expr.accept(this);

        return null;
    }
}
//private boolean accessList;
//private Identifier assignedId;
//private Expression assignExpression;
//private Expression accessListExpression;
////assignment can be done on an element of a list.the expression inside [] is the above attribute
////this case is determined by the attribute accessList
//private AssignOperator assignOperator;
///.....
//public boolean isAccessList() {//    return accessList;
//public Expression getAccessListExpression() {//    return accessListExpression;



























//public Void visit(ListValue listValue){return null;}
//public Void visit(BoolValue boolValue){return null;}
//public Void visit(IntValue intValue){return null;}
//public Void visit(StringValue stringValue){return null;}
//public Void visit(FloatValue floatValue){return null;}




//public Void visit(FunctionPointer functionPointer){
