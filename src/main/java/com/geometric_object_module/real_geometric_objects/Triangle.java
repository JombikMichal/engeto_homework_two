package com.geometric_object_module.real_geometric_objects;

import com.Helper;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;
import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.Arrays;

public class Triangle extends TwoDimensionObjects {

    private String type;
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Helper helper = new Helper();
    private double[] sortedSides;

    public Triangle(String type, double sideA, double sideB, double sideC) {
        super(type);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        initialize();
    }

    private void initialize(){
        sortSides();
        validate();
        setType();
    }

    private void sortSides(){
        double[] sides = {sideA,sideB,sideC};
        Arrays.sort(sides);
        this.sortedSides =  sides;
    }

    private void validate() throws IllegalArgumentException{
        if( calculatorHolder.calculate(new Operands(this.sortedSides[0],this.sortedSides[1]),'+') < this.sideC){
            throw new IllegalArgumentException("This object is not triangle because sum of two smaller sides is less than the biggest side!");
        }else if (sideA == 0 || sideB == 0 || sideC == 0){
            throw new IllegalArgumentException("You set wrong input parameters because one of the sides is less than zero or equals zero");
        }
    }


    @Override
    public String getType() {
        return type;
    }

    private void setType() throws IllegalArgumentException{
        if (this.sortedSides[0] == this.sortedSides[1] && this.sortedSides[1] == this.sortedSides[2]){
            this.type = "Equilateral triangle";
        }else if (this.sortedSides[0] == this.sortedSides[1] || this.sortedSides[1] == this.sortedSides[2]){
            this.type = "Isosceles triangle";
        }else if (this.sortedSides[0] != this.sortedSides[1] && this.sortedSides[1] != this.sortedSides[2]){
            this.type = "General triangle";
        }else {
            throw new IllegalArgumentException("This is no triangle! This is some bullshit");
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
