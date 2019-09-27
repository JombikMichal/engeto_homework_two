package com.geometric_object_module.real_geometric_objects;

import com.Helper;
import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.ThreeDimensionObjects;
import com.geometric_object_module.display.DisplayAble;
import com.geometric_object_module.display.DisplayThreeDimens;
import com.project_exceptions.InputIsZero;

public class Block extends ThreeDimensionObjects {

    private final double sideA;
    private final double sideB;
    private final double height;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Helper helper = new Helper();
    private DisplayAble displayAble;

    public Block(String type, double sideA, double sideB, double height) {
        super(type);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        //validate();
        this.displayAble = new DisplayThreeDimens(this);
    }

    private void validate() throws Exception{
        double sides[] = {this.sideA,this.sideB,this.height};
        if (this.helper.validate(sides)){
            throw new InputIsZero();
        }
        if(this.sideA == this.sideB && this.sideB == this.height){
            throw new IllegalArgumentException("This is no Block but this is  Dice");
        }
    }

    @Override
    public void display() {
        this.displayAble.display();
    }

    @Override
    public double calculateVolume() {
        if (this.sideA == this.sideB){
            return calculatorHolder.calculate(new Operands(new Squere("Squere",this.sideA).calculateContent(),this.height),'*');
        }
        return calculatorHolder.calculate(new Operands(new Rectangle("Rectangle",this.sideA,this.sideB).calculateContent(),this.height),'*');
    }

    @Override
    public double calculateSurface() {
        //S = 2 * (a*b + a*c + b*c)
        double ab = calculatorHolder.calculate(new Operands(this.sideA,this.sideB),'*');
        double ac  = calculatorHolder.calculate(new Operands(this.sideA,this.height),'*');
        double bc = calculatorHolder.calculate(new Operands(this.sideB,this.height),'*');
        return calculatorHolder.calculate(new Operands(calculatorHolder.calculate(new Operands(calculatorHolder.calculate(new Operands(ab,ac),'+'),bc),'+'),2),'*');

    }
}
