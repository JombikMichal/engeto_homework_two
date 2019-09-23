package com.calculator_module.calculator;

import com.calculator_module.operands.Operands;
import com.calculator_module.operations.Operation;

import java.util.Map;

abstract class AbstractCalculator {
    private String name;
    private Map<Character, Operation> operationMap;

    AbstractCalculator(String name, Map<Character,Operation> operationMap){
        this.name = name;
        this.operationMap = operationMap;
    }

    double calculate(Operands operands, Character operator){

        if(operationMap.containsKey(operator)){
            return calculateResult(operands,operationMap.get(operator));
        }else{
            throw new IllegalArgumentException("This calculator does not support operator " + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation){
        return operation.calculate(operands.getLeft(),operands.getRight());
    }
}
