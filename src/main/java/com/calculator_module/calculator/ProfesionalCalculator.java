package com.calculator_module.calculator;

import com.calculator_module.operations.Operation;

import java.util.Map;

public class ProfesionalCalculator extends AbstractCalculator {
    public ProfesionalCalculator(String name, Map<Character, Operation> operationMap) {
        super(name, operationMap);
    }
}
