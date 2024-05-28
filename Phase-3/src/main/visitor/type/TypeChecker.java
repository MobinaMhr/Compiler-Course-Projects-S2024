package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;
//TODO:: mind the difference between type equality and sameType and handle in code
public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    private HashSet<Type> returnTypes = new HashSet<>();
    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null; // Should it change?
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        this.returnTypes = new HashSet<>();
        SymbolTable.push(new SymbolTable());
        String functionName = "";
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            functionName = functionItem.getName();
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();

            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                Type argType = new NoType();
                if (i < currentArgTypes.size()) {
                    argType = currentArgTypes.get(i);
                } else if (i < functionDeclaration.getArgs().size()) {
                    argType = functionDeclaration.getArgs().get(i).getDefaultVal().accept(this);
                }
                argItem.setType(argType);
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}

        for(Statement statement : functionDeclaration.getBody()) {
            statement.accept(this);
        }
        SymbolTable.pop();

        Iterator<Type> it = this.returnTypes.iterator();
        Type retType = new NoType();
        if (this.returnTypes.isEmpty()) {
            return retType;
        }
        if (this.returnTypes.size() == 1) {
            retType = it.next();
            return retType;
        }
        it.next();
        while (it.hasNext()) {
            it.next();
            typeErrors.add(new FunctionIncompatibleReturnTypes(
                    functionDeclaration.getLine(),
                    functionName)
            );
        }
        return new NoType();
        //DONE:Return the infered type of the function
    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        Type retType = new NoType();
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();      // What is this ? should be after every typeError?
                    return new NoType();    // What is this ? should be after every typeError?
                }
            }
        //  DONE:1-figure out whether return expression of different cases in pattern are of the same type/
            for (Expression retExpression : patternDeclaration.getReturnExp()) {
                Type currentRetType = retExpression.accept(this);
                if (retType instanceof NoType) {
                    retType = currentRetType;
                } else if (!retType.equals(currentRetType)) {
                    typeErrors.add(new PatternIncompatibleReturnTypes(retExpression.getLine(),
                            patternDeclaration.getPatternName().toString()));
                }
            }
        }catch (ItemNotFound ignored){}

        SymbolTable.pop();
        return retType;
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        for (Statement stmt : mainDeclaration.getBody()) {
            stmt.accept(this);
        }
        return null;
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            if (!(accessExpression.getAccessedExpression() instanceof Identifier)) {
                typeErrors.add(new IsNotCallable(accessExpression.getLine()));
                System.out.println("The Accessed Expr is not an instance of Id, so handle it");
                return new NoType();
            }

            String functionName = ((Identifier) accessExpression.getAccessedExpression()).getName();
            try {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        functionName);
                if (varItem.getType() instanceof FptrType fptrType) {
                    functionName = fptrType.getFunctionName();
                } else { System.out.println("I don't know what the hell is happening give me the test.");}
            } catch (ItemNotFound ignored) {}

            try {
                FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        functionName);
                functionItem.clearArgumentTypeList();
                ArrayList<Type> argumentTypes = new ArrayList<>();
                for (Expression argExpr : accessExpression.getArguments()) {
                    argumentTypes.add(argExpr.accept(this));
                }
                functionItem.setArgumentTypes(argumentTypes);
                return functionItem.getFunctionDeclaration().accept(this);
            } catch (ItemNotFound ignored) {}
        }
        else{
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            for (Expression indexExpr : accessExpression.getDimentionalAccess()) {
                Type indexExprType = indexExpr.accept(this);
                if (!(indexExprType instanceof IntType)) {
                    typeErrors.add(new AccessIndexIsNotInt(indexExpr.getLine()));
                }
            }
            if (accessedType instanceof ListType listType) {
                return listType.getType();
            }
            return new StringType();
        }
        return null;
    }
    @Override
    public Type visit(ReturnStatement returnStatement){
        Expression retExpr = returnStatement.getReturnExp();
        Type returnedType = new NoType();
        if (retExpr != null) {
            returnedType = retExpr.accept(this);
        }
        this.returnTypes.add(returnedType);
        return returnedType;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts()) {
            statement.accept(this);
        }

        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(IfStatement ifStatement) {
        HashSet<Type> retTypeSet = new HashSet<>();
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions()) {
            if(!(expression.accept(this) instanceof BoolType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
        }
        Type retType = new NoType();
        for(Statement statement : ifStatement.getThenBody()) {
            retType = statement.accept(this);
            if (retType != null && !(retType instanceof NoType)) {
                retTypeSet.add(retType);
            }
        }
        for(Statement statement : ifStatement.getElseBody()) {
            retType = statement.accept(this);
            if (retType != null && !(retType instanceof NoType)) {
                retTypeSet.add(retType);
            }
        }
        SymbolTable.pop();
        return (retTypeSet.isEmpty()) ?
                new NoType() : (retTypeSet.size() == 1) ?
                retTypeSet.stream().findFirst().get() : null;
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        Expression assignExpr = assignStatement.getAssignExpression();
        Type assignExprType = assignExpr.accept(this);

        if(assignStatement.isAccessList()) {
            // DONE:assignment to list  anId[3] += "another element";
            try {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        assignStatement.getAssignedId().getName());
                Type assignedIdType = varItem.getType();

                if (assignedIdType instanceof ListType listType &&
                        (!(listType.getType().sameType(assignExprType)))) {
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                    return new NoType();
                }

                Type indexType = assignStatement.getAccessListExpression().accept(this);
                if (!(indexType instanceof IntType)) {
                    typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
                    return new NoType();
                }
            } catch (ItemNotFound ignored) {}
        }
        else {
            // DONE:maybe new type for a variable   anId += "another element";
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            newVarItem.setType(assignExprType);
            try {
                SymbolTable.top.delete(newVarItem);
            } catch (ItemNotFound ignored) {}
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists ignored){}
        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
        return null;
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
        return null;
    }
    @Override
    public Type visit(PushStatement pushStatement){
        Expression pushInitial = pushStatement.getInitial();
        Type pushInitialType = pushInitial.accept(this);

        Expression toBeAddedToInitial = pushStatement.getToBeAdded();
        Type toBeAddedType = toBeAddedToInitial.accept(this);

        if (pushInitialType instanceof ListType listType) {
            if (listType.getType() instanceof NoType) {
                listType.setType(toBeAddedType);
            }
            else if (!(listType.getType().equals(toBeAddedType))) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            }
        }
        else if (pushInitialType instanceof StringType) {
            if (!(toBeAddedType instanceof StringType)) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            }
        }
        else {
            typeErrors.add(new IsNotPushedable(pushInitial.getLine()));
        }

        return new NoType();
    }

    @Override
    public Type visit(PutStatement putStatement){
        Expression putExpr = putStatement.getExpression();
        // Did we check putExpr != null ??
        if (((putExpr.accept(this)) instanceof FptrType)) {
            typeErrors.add(new IsNotPrintable(putExpr.getLine()));
        }
        return null;
    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        Type elementType = new NoType();
        for (var expression : listValue.getElements()) {
            Type currentType = expression.accept(this);
            if (elementType instanceof NoType) {
                elementType = currentType;
            } else if (!elementType.equals(currentType)) {
                typeErrors.add(new ListElementsTypesMisMatch(expression.getLine()));
                return new ListType(new NoType());
            }
        }
        return new ListType(elementType);
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression){
        Expression firstOperand = binaryExpression.getFirstOperand();
        Type firstOperandType = firstOperand.accept(this);

        Expression secondOperand = binaryExpression.getSecondOperand();
        Type secondOperandType = secondOperand.accept(this);

        if (!firstOperandType.sameType(secondOperandType)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getFirstOperand().getLine(),
                    binaryExpression.getOperator()));
            return new NoType();
        }

        if (binaryExpression.getOperator().equals(BinaryOperator.EQUAL)) {
            return new BoolType();
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.NOT_EQUAL)) {
            return new BoolType();
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.GREATER_THAN)) {
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return new BoolType();
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.LESS_THAN)) {
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return new BoolType();
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.LESS_EQUAL_THAN)) {
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return new BoolType();
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.GREATER_EQUAL_THAN)) {
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return new BoolType();
        }

        if (binaryExpression.getOperator().equals(BinaryOperator.PLUS)) {
            if (firstOperandType.equals(new StringType()) || secondOperandType.equals(new StringType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return firstOperandType;
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.MINUS)) {
            if (firstOperandType.equals(new StringType()) || secondOperandType.equals(new StringType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return firstOperandType;
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.MULT)) {
            if (firstOperandType.equals(new StringType()) || secondOperandType.equals(new StringType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return firstOperandType;
        }
        if (binaryExpression.getOperator().equals(BinaryOperator.DIVIDE)) {
            if (firstOperandType.equals(new StringType()) || secondOperandType.equals(new StringType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            if (firstOperandType.equals(new BoolType()) || secondOperandType.equals(new BoolType())) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getFirstOperand().getLine(),
                        binaryExpression.getOperator().toString()));
                return new NoType();
            }
            return firstOperandType;
        }
        return new NoType();
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        Expression unaryExpr = unaryExpression.getExpression();
        Type unaryExprType = unaryExpr.accept(this);

        if (unaryExpression.getOperator().equals(UnaryOperator.NOT)) {
            if (unaryExprType.sameType(new FloatType())
                || unaryExprType.sameType(new IntType())
                || unaryExprType.sameType(new StringType())
                || unaryExprType instanceof FptrType) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getExpression().getLine(),
                        unaryExpression.getOperator().toString()));
                return new NoType();
            }
            return unaryExprType;
        }
        if (unaryExpression.getOperator().equals(UnaryOperator.MINUS)) {
            if (unaryExprType.sameType(new BoolType())
                || unaryExprType.sameType(new StringType())
                || unaryExprType instanceof FptrType) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getExpression().getLine(),
                        unaryExpression.getOperator().toString()));
                return new NoType();
            }
            return unaryExprType;
        }
        if (unaryExpression.getOperator().equals(UnaryOperator.INC)) {
            if (unaryExprType.sameType(new BoolType())
                || unaryExprType.sameType(new StringType())
                || unaryExprType instanceof FptrType) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getExpression().getLine(),
                        unaryExpression.getOperator().toString()));
                return new NoType();
            }

            return unaryExprType;
        }
        if (unaryExpression.getOperator().equals(UnaryOperator.DEC)) {
            if (unaryExprType.sameType(new BoolType())
                || unaryExprType.sameType(new StringType())
                || unaryExprType instanceof FptrType) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getExpression().getLine(),
                        unaryExpression.getOperator().toString()));
                return new NoType();
            }
            return unaryExprType;
        }
        return new NoType();
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        if (!(chopStatement.getChopExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chopStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        try {
            VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                    identifier.getName());
            return varItem.getType();
        } catch (ItemNotFound ignored) {}
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    identifier.getName());
            return functionItem.getFunctionDeclaration().accept(this);
        } catch (ItemNotFound ignored) {}
        try {
            VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                    identifier.getName());
            return varItem.getType();
        } catch (ItemNotFound ignored) {
            try {
                FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        identifier.getName());
                return functionItem.getFunctionDeclaration().accept(this);
            } catch (ItemNotFound ignored2) {}
        }
        return null;
    }
    @Override
    public Type visit(LenStatement lenStatement){
        Type lenExprType = lenStatement.getExpression().accept(this);
        if(!(lenExprType instanceof StringType) && !(lenExprType instanceof ListType)){
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getExpression().getLine()));
            return new NoType();
        }
        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        ArrayList<Expression> rangeExpressions = rangeExpression.getRangeExpressions();
        RangeType rangeType = rangeExpression.getRangeType();
//      DONE --> mind that the lists are declared explicitly in the grammar in this node, so handle the errors
        if(rangeType.equals(RangeType.LIST)) {
            Type listElementType = new NoType();
            for (Expression expr : rangeExpressions) {
                Type exprType = expr.accept(this);

                if (listElementType instanceof NoType) {
                    listElementType = exprType;
                }
                else if (!(listElementType.sameType(exprType))) {
                    typeErrors.add(new ListElementsTypesMisMatch(expr.getLine()));
                }
            }
            if (!(listElementType instanceof IntType)) {
                typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
            }
            return new ListType(listElementType);
        }
        if(rangeType.equals(RangeType.DOUBLE_DOT)) {
            Type beginExprType = rangeExpressions.get(0).accept(this);
            Type endExprType = rangeExpressions.get(1).accept(this);

            if (!(beginExprType.equals(new IntType()) && endExprType.equals(new IntType()))) {
                typeErrors.add(new RangeValuesMisMatch(rangeExpressions.getFirst().getLine()));
            }

        }
        if(rangeType.equals(RangeType.IDENTIFIER)) {
            Identifier rangeId = (Identifier) rangeExpressions.getFirst();
            try {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        rangeId.getName());
                // Is this sufficient? Or we should add other types?
                if (!(varItem.getType() instanceof ListType)) {
                    typeErrors.add(new IsNotIterable(rangeId.getLine()));
                }
            } catch (ItemNotFound ignored) {}
        }

        return new NoType();
    }
}