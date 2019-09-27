package com.geometric_object_module.real_geometric_objects;

import com.Helper;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.display.DisplayAble;
import com.geometric_object_module.display.DisplayTwoDimens;
import com.project_exceptions.InputIsZero;

public class Circle extends TwoDimensionObjects {

    private final double radius;
    private CalculatorHolder calculatorHolder;
    private DisplayAble displayAble;
    private Helper helper = new Helper();

    public Circle(String type, double radius) {
        super(type);
        this.radius = radius;
        this.calculatorHolder = new CalculatorHolder();
        validate();
        this.displayAble = new DisplayTwoDimens(this);
    }

    private void validate() throws IllegalArgumentException{
        double sides[] = {this.radius};
        if (this.helper.validate(sides)){
            throw new InputIsZero();
        }
    }

    @Override
    public void display() {
        this.displayAble.display();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double calculateContent() {
        //PI*r2
        return calculatorHolder.calculate(new Operands(Math.PI, calculatorHolder.calculate(new Operands(this.radius,2),'^')),'*');
    }

    @Override
    public double calculateCircuit() {
        //2*PI*r
        return calculatorHolder.calculate(new Operands(Math.PI, calculatorHolder.calculate(new Operands(this.radius,2),'*')),'*');

    }
}
