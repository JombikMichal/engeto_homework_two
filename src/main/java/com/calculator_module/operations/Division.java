package com.calculator_module.operations;

public class Division  implements Operation{
    @Override
    public double calculate(double left, double right) {
        if (Double.isInfinite(left / right)) {
            throw new ArithmeticException("You can not divide by zero!");
        }
        return left / right;

    }
}
