package com.bmi_module;

import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;

public class BMI {
    private final double weight;
    private final double height;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
  
    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    private double calculateBMI() {
        return calculatorHolder.calculate(new Operands(weight, calculatorHolder.calculate(new Operands(height,2),'^')),'/');
    }

    public String getBMI(){
        double bmi = calculateBMI();
        if (bmi < 18.5){
            return "Podvýživa";
        }else if (bmi >= 18.5 && bmi < 25){
            return "Zdravá váha";
        }else if (bmi <= 25 && bmi < 30){
            return "Mírná nadváha";
        }else if (bmi <= 30 && bmi < 40){
            return "Obezita";
        }else if (bmi >= 40){
            return "Těžká obezita";
        }else {
            return null;
        }
    }
}
