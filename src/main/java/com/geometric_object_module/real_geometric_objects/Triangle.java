package com.geometric_object_module.real_geometric_objects;

import com.Helper;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;

import java.util.Arrays;

public class Triangle extends TwoDimensionObjects {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Helper helper = new Helper();

    public Triangle(String type, double sideA, double sideB, double sideC) {
        super(type);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        validate();
    }

    private void validate() throws IllegalArgumentException{
        double[] sides = {sideA,sideB,sideC};
        Arrays.sort(sides);
        if( calculatorHolder.calculate(new Operands(this.sideA,this.sideB),'+') < this.sideC){
            throw new IllegalArgumentException("This object is not triangle because sum of two smaller sides is less than the biggest side!");
        }
    }

    @Override
    public double calculateContent() {
        // S = a.Va/2 || S = √S * (S - a) * (S - b) * (S - c) where S = O /2
        double S = calculatorHolder.calculate(new Operands(calculateCircuit(),2),'/');
        double a = calculatorHolder.calculate(new Operands(S,calculatorHolder.calculate(new Operands(S,this.sideA),'-')),'*');
        double b = calculatorHolder.calculate(new Operands(a,calculatorHolder.calculate(new Operands(S,this.sideB),'-')),'*');
        double c = calculatorHolder.calculate(new Operands(b,calculatorHolder.calculate(new Operands(S,this.sideC),'-')),'*');
        return helper.round2(calculatorHolder.calculate(new Operands(c,2),'√'));

    }

    @Override
    public double calculateCircuit() {
        return calculatorHolder.calculate(new Operands(calculatorHolder.calculate(new Operands(this.sideA,this.sideB),'+'),this.sideC),'+');
    }
}