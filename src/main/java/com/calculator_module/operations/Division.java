package com.calculator_module.operations;

public class Division  implements Operation{
    double result;
    @Override
    public double calculate(double left, double right) {
        if(right == 0){
            throw new IllegalArgumentException("Right is 0");
        }
        return left / right;

//        try {
//             result = left / right;
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        return result;
    }
}
