package com.calculator_module.calculator;

import com.calculator_module.operations.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<Character, Operation> operationMap) {
        super(name, operationMap);
    }
}
