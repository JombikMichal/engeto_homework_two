package com.geometric_object_module.real_geometric_objects;

import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.drawing.Draw;
import com.geometric_object_module.drawing.DrawRectangle;
import com.geometric_object_module.drawing.DrawSquere;

public class Squere extends TwoDimensionObjects {

    private final double sideA;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private String type;

    public Squere(String type, double sideA) {
        super(type);
        this.type = type;
        this.sideA = sideA;
        validate();
    }

    @Override
    public String getType() {
        return type;
    }


    public void display(){
        Draw draw = new DrawSquere(this);
        draw.paint(null);
    }

    private void validate() throws IllegalArgumentException{
        if(this.sideA <= 0){
            throw new IllegalArgumentException("You set wrong input parameter because side is less than zero or equals zero");
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
