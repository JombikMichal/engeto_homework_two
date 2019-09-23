package com.calculator_module.calculator;

import com.calculator_module.operands.Operands;
import com.calculator_module.operations.*;

import java.util.HashMap;

public class CalculatorHolder {
    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;
    private ProfesionalCalculator profesionalCalculator;

    public CalculatorHolder(){
        initializeCalculators();
    }

    private void initializeCalculators(){
        this.basicCalculator = new BasicCalculator(
                "BasicCalculator",
                new HashMap<>(){{
                    put('+', new Addition());
                    put('-', new Substraction());
                }}
        );
        this.advancedCalculator = new AdvancedCalculator(
                "AdvancedCalculator",
                new HashMap<>(){{
                    put('*', new Multiplication());
                    put('/', new Division() );
                }}
        );
        this.profesionalCalculator = new ProfesionalCalculator(
                "ProfessionalCalculator",
                new HashMap<>(){{
                    put('^', new Power());
                    put('√', new Squere());
                }}
        );
    }

    public double calculate(Operands operands, Character operator){
        return getSuitableCalculator(operator).calculate(operands,operator);
    }

    private AbstractCalculator getSuitableCalculator(Character operator){
        switch (operator){
            case '+':
            case '-':
                return basicCalculator;
            case '*':
            case '/':
                return advancedCalculator;
            case '^':
            case '√':
                return profesionalCalculator;
            default:
                throw  new IllegalArgumentException("Unsupported operation");
        }
    }
}
