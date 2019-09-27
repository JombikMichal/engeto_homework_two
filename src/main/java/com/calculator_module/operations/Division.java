package com.calculator_module.operations;

public class Division  implements Operation{
    double result;
    @Override
    public double calculate(double left, double right) {
        try {
             result = left / right;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}
