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
    private Stack<HashSet<Type>> returnTypesStack = new Stack<>();
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

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        this.returnTypesStack.push(returnTypes);
        this.returnTypes = new HashSet<>();
        SymbolTable.push(new SymbolTable());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(
                    FunctionItem.START_KEY + functionDeclaration.getFunctionName().getName());
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

            for(Statement stmt : functionDeclaration.getBody()) {
                stmt.accept(this);
            }
            HashSet<Type> returnTypesOfThisFunction = this.returnTypes;
            this.returnTypes = returnTypesStack.pop();
            SymbolTable.pop();

            if (returnTypesOfThisFunction.isEmpty()) {
                return new NoType();
            }
            if (returnTypesOfThisFunction.size() == 1) {
                return returnTypesOfThisFunction.iterator().next();
            }

            typeErrors.add(new FunctionIncompatibleReturnTypes(
                    functionDeclaration.getLine(),
                    functionItem.getName())
            );
            return new NoType();
        }catch (ItemNotFound ignored){}

        return new NoType();
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
                    SymbolTable.pop();
                    return new NoType();
                }
            }

            HashSet<Type> typeSet = new HashSet<>();
            for (Expression retExpression : patternDeclaration.getReturnExp()) {
                Type exprType = retExpression.accept(this);
                if (exprType == null) {
                    continue;
                }
                typeSet.add(exprType);
            }
            if (typeSet.size() == 1) {
                retType = typeSet.iterator().next();
            }
            if (typeSet.size() > 1) {
                typeErrors.add(new PatternIncompatibleReturnTypes(
                        patternDeclaration.getLine(),
                        patternItem.getName())
                );
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
        Expression accessedExpr = accessExpression.getAccessedExpression();
        Type accessedExprType = new NoType();
        if(accessExpression.isFunctionCall()){
            String functionName;
            functionName = ((Identifier) accessExpression.getAccessedExpression()).getName();
            try {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        functionName);
                if (varItem.getType() instanceof FptrType fptrType) {
                    functionName = fptrType.getFunctionName();
                }
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
                accessedExprType = functionItem.getFunctionDeclaration().accept(this);
            } catch (ItemNotFound ignored) {}
        }
        if (accessExpression.isFunctionCall() &&
                accessExpression.getDimentionalAccess().isEmpty()) {
            return accessedExprType;
        }
        Type accessedType = accessExpression.getAccessedExpression().accept(this);
        for (var indexExpr : accessExpression.getDimentionalAccess()) {
            Type indexExprType = indexExpr.accept(this);
            if (!(indexExprType instanceof IntType)) {
                typeErrors.add(new AccessIndexIsNotInt(indexExpr.getLine()));
            }
        }
        if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType)){
            typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
            return new NoType();
        }
        if (accessedType instanceof ListType listType) {
            return listType.getType();
        }
        return new StringType();
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
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        Type iteratorType = forStatement.getRangeExpression().accept(this);
        if (iteratorType instanceof ListType listType) {
            iteratorType = listType.getType();
        }
        varItem.setType(iteratorType);

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
        // anId[3] += "";
        // anId += "";
        if(assignStatement.isAccessList()) {
            try {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        assignStatement.getAssignedId().getName());
                Type assignedIdType = varItem.getType();

                if (!(assignedIdType instanceof ListType) &&
                        !(assignedIdType instanceof StringType)) {
                    typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                    return new NoType();
                }
                if (assignedIdType instanceof ListType listType &&
                        (!(listType.getType() instanceof NoType)) &&
                        (!(listType.getType().sameType(assignExprType)))) {
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                    return new NoType();
                }
                if (assignedIdType instanceof StringType && !(assignExprType instanceof StringType)) {
//                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine())); (TODO)
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
        for(Expression expression : nextStatement.getConditions()) {
            if(!((expression.accept(this)) instanceof BoolType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
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
        HashSet<Type> typeSet = new HashSet<>();
        for (var expr : listValue.getElements()) {
            Type exprType = expr.accept(this);
            if (exprType != null) {
                typeSet.add(exprType);
            }
        }
        if (typeSet.isEmpty()) {
            return new ListType(new NoType());
        }
        if (typeSet.size() == 1) {
            return new ListType(typeSet.iterator().next());
        }
        typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
        return new ListType(typeSet.iterator().next());
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override //AppendTypesMisMatch - IsNotAppendable
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if (!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)) {
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        System.out.println("/"+appendExpression.getAppendeds());

        HashSet<Type> typeSet = new HashSet<>();
        for (var appendedExpr : appendExpression.getAppendeds()) {
            Type appendedExprType = appendedExpr.accept(this);
            System.out.println("/"+appendedExprType);
            if (appendedExprType == null) {
                continue;
            }
            typeSet.add(appendedExprType);
        }

        if (typeSet.isEmpty()) {
            return appendeeType;
        }
        System.out.println("/");
        if (typeSet.size() > 1) {
            typeErrors.add(new AppendTypesMisMatch(appendExpression.getLine()));
            return appendeeType;
        }
        System.out.println("/");
        Type appendedType = typeSet.iterator().next();
        if (appendeeType instanceof ListType listType) {
            Type listElementType = listType.getType();
            if (!(listElementType.sameType(appendedType))) {
                typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            }
        }
        else {
            if (!(appendedType instanceof StringType)) {
                typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            }
        }
        System.out.println("/");
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
            // TODO set the vals.
            return functionItem.getFunctionDeclaration().accept(this);
        } catch (ItemNotFound ignored) {}
        // IS this redundant? TODO
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
            Type patternReturnType = patternItem.getPatternDeclaration().accept(this);
            return patternReturnType;
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        ArrayList<Expression> rangeExpressions = rangeExpression.getRangeExpressions();
        RangeType rangeType = rangeExpression.getRangeType();
        if(rangeType.equals(RangeType.LIST)) {
            HashSet<Type> typeSet = new HashSet<>();
            for (Expression expr : rangeExpressions) {
                Type exprType = expr.accept(this);
                if (exprType != null) {
                    typeSet.add(exprType);
                }
            }

            if (typeSet.isEmpty()) {
                return new NoType();
            }
            if (typeSet.size() == 1) {
                return typeSet.iterator().next();
            }
            typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
            return new NoType();
        }
        if(rangeType.equals(RangeType.DOUBLE_DOT)) {
            Type beginExprType = rangeExpressions.get(0).accept(this);
            Type endExprType = rangeExpressions.get(1).accept(this);

            if (!(beginExprType.equals(new IntType()) && endExprType.equals(new IntType()))) {
                typeErrors.add(new RangeValuesMisMatch(rangeExpressions.getFirst().getLine()));
            }
            return new IntType();
        }
        if(rangeType.equals(RangeType.IDENTIFIER)) {
            Type type = new NoType();
            Identifier rangeId = (Identifier) rangeExpressions.getFirst();
            try {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        rangeId.getName());
                if (!(varItem.getType() instanceof ListType)) {
                    typeErrors.add(new IsNotIterable(rangeId.getLine()));
                }
                type = varItem.getType();
            } catch (ItemNotFound ignored) {}
            return type;
        }
        return new NoType();
    }
}