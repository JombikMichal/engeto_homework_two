package com.bmi_module;

import com.Helper;
import com.bmi_module.display.*;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;


public class BMI {
    private final double weight;
    private final double height;
    private double bodyMassIndex;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Helper helper = new Helper();

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        calculateBMI();
    }

    private void calculateBMI() {
       this.bodyMassIndex = helper.round2(calculatorHolder.calculate(new Operands(weight, calculatorHolder.calculate(new Operands(height,2),'^')),'/'));
    }


    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public DisplayBMIResult getBMI(){
        if (this.bodyMassIndex > 0 && this.bodyMassIndex < 18.5d){
            return new Malnutrition();
        }else if (this.bodyMassIndex >= 18.5d && this.bodyMassIndex < 25d){
            return new SlightOverweight();
        }else if (this.bodyMassIndex >= 25d && this.bodyMassIndex < 30d){
            return new HealthyWeight();
        }else if (this.bodyMassIndex >= 30d && this.bodyMassIndex < 40d){
            return new Obesity();
        }else if (this.bodyMassIndex >= 40d){
            return new HeavyObesity();
        }else {
            throw new ArithmeticException("You set wrong parameters because your BMI is less than zero or equals zero!!!");
        }
    }
}
