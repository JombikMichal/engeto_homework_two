package com.geometric_object_module.real_geometric_objects;

import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.drawing.Draw;
import com.geometric_object_module.drawing.DrawRectangle;

public class Rectangle extends TwoDimensionObjects {

    private final double sideA;
    private final double sideB;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private String type;

    public Rectangle(String type, double sideA, double sideB) {
        super(type);
        this.type = type;
        this.sideA = sideA;
        this.sideB = sideB;
        validate();
    }

    @Override
    public String getType() {
        return type;
    }

    public void display(){
        Draw draw = new DrawRectangle(this);
        draw.paint(null);
    }

    private void validate() throws IllegalArgumentException{
        if (sideA == sideB){
            throw new IllegalArgumentException("side A is equal side B! This is no rectangle but this is squere!");
        }else if (sideA == 0 || sideB == 0){
            throw new IllegalArgumentException("You set wrong input parameters because one of the sides is less than zero or equals zero");
        }
    }

    @Override
    public double calculateContent(){
        return calculatorHolder.calculate(new Operands(this.sideA,this.sideB),'*');
    }

    @Override
    public double calculateCircuit(){
        return calculatorHolder.calculate(new Operands(calculatorHolder.calculate(new Operands(this.sideA,2),'*'),calculatorHolder.calculate(new Operands(this.sideB,2),'*')),'+');
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
