package com.geometric_object_module.real_geometric_objects;

import com.Helper;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.display.DisplayAble;
import com.geometric_object_module.display.DisplayTwoDimens;
import com.geometric_object_module.drawing.Draw;
import com.geometric_object_module.drawing.DrawRectangle;
import com.geometric_object_module.drawing.DrawSquere;
import com.project_exceptions.BadParamsForGeoObject;
import com.project_exceptions.InputIsZero;

public class Squere extends TwoDimensionObjects {

    private final double sideA;
    private CalculatorHolder calculatorHolder;
    private String type;
    private DisplayAble displayAble;

    public Squere(String type, double sideA) {
        super(type);
        calculatorHolder = new CalculatorHolder();
        this.type = type;
        this.sideA = sideA;
        validate();
        displayAble = new DisplayTwoDimens(this);
    }

    @Override
    public String getType() {
        return type;
    }


    @Override
    public void display(){
        this.displayAble.display();
        Draw draw = new DrawSquere(this);
       // draw.paint(null);
    }

    private void validate() throws IllegalArgumentException{
        double sides[] = {this.sideA};
        if (Helper.validate(sides)){
            throw new InputIsZero();
        }
    }

    @Override
    public double calculateContent(){
        return calculatorHolder.calculate(new Operands(this.sideA,2),'^');
    }

    @Override
    public double calculateCircuit(){
        return calculatorHolder.calculate(new Operands(this.sideA,4),'*');
    }

    public double getSideA() {
        return sideA;
    }
}
