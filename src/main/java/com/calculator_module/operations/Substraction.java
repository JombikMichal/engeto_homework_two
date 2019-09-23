package com.calculator_module.operations;

public class Substraction implements Operation {
    @Override
    public double calculate(double left, double right) {
        return left - right;
    }
}
