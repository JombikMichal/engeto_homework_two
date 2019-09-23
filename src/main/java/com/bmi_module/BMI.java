package com.bmi_module;

import com.bmi_module.display.*;
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

    public DisplayBMIResult getBMI(){
        double bmi = calculateBMI();
        if (bmi > 0 && bmi < 18.5d){
            return new Malnutrition();
        }else if (bmi >= 18.5d && bmi < 25d){
            return new SlightOverweight();
        }else if (bmi >= 25d && bmi < 30d){
            return new HealthyWeight();
        }else if (bmi >= 30d && bmi < 40d){
            return new Obesity();
        }else if (bmi >= 40d){
            return new HealthyWeight();
        }else {
            throw new ArithmeticException("You set bad parameters because your BMI is less than zero or equals zero!!!");
        }
    }
}
