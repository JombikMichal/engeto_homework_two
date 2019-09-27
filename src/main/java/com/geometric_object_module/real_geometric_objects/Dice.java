package com.geometric_object_module.real_geometric_objects;

import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.ThreeDimensionObjects;
import com.geometric_object_module.display.DisplayAble;
import com.geometric_object_module.display.DisplayThreeDimens;

public class Dice extends ThreeDimensionObjects {

    private final double sideA;
    private final double height;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private DisplayAble displayAble;

    public Dice(String type, double sideA) {
        super(type);
        this.sideA = sideA;
        this.height = sideA;
        validate();
        this.displayAble = new DisplayThreeDimens(this);
    }

    private void validate() throws IllegalArgumentException{
        if(this.sideA <= 0){
            throw new IllegalArgumentException("You set wrong input parameter because side is less than zero or equals zero");
        }
    }

    @Override
    public void display() {
        this.displayAble.display();
    }

    @Override
    public double calculateVolume() {
        return calculatorHolder.calculate(new Operands(new Squere("Squere",this.sideA).calculateContent(),this.height),'*');
    }

    @Override
    public double calculateSurface() {
        return calculatorHolder.calculate(new Operands(new Squere("Squere",this.sideA).calculateContent(),6),'*');
    }
}
