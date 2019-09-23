package com.calculator_module.operations;

public class Power implements Operation {
    @Override
    public double calculate(double base, double exponent) {
        if(exponent >= 1){
            return base*calculate(base,exponent-1);
        }return 1;
    }
}
