package com.geometric_object_module.real_geometric_objects;

import com.Helper;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.display.DisplayAble;
import com.geometric_object_module.display.DisplayTwoDimens;
import com.geometric_object_module.drawing.Draw;
import com.geometric_object_module.drawing.DrawRectangle;
import com.project_exceptions.BadParamsForGeoObject;
import com.project_exceptions.InputIsZero;

public class Rectangle extends TwoDimensionObjects {

    private final double sideA;
    private final double sideB;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Helper helper = new Helper();
    private String type;
    private DisplayAble displayAble;

    public Rectangle(String type, double sideA, double sideB) {
        super(type);
        this.type = type;
        this.sideA = sideA;
        this.sideB = sideB;
        validate();
        this.displayAble = new DisplayTwoDimens(this);
    }

    @Override
    public String getType() {
        return type;
    }

    public void display(){
        this.displayAble.display();
        Draw draw = new DrawRectangle(this);
       // draw.paint(null);
    }

    private void validate() throws IllegalArgumentException{
        double sides[] = {this.sideA,this.sideB};
        if (this.helper.validate(sides)){
            throw new InputIsZero();
        }
        if (sideA == sideB){
            throw new BadParamsForGeoObject();
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
