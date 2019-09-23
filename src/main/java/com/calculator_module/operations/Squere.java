package com.calculator_module.operations;

public class Squere  implements Operation{
    @Override
    public double calculate(double base, double right) {
        return Math.sqrt(base);
    }
}
