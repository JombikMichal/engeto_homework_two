package com.geometric_object_module.real_geometric_objects;

import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import com.geometric_object_module.ThreeDimensionObjects;

public class Block extends ThreeDimensionObjects {

    private final double sideA;
    private final double sideB;
    private final double height;
    private CalculatorHolder calculatorHolder = new CalculatorHolder();

    public Block(String type, double sideA, double sideB, double height) {
        super(type);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        validate();
    }

    private void validate() throws IllegalArgumentException{
        if(this.sideA <= 0 || this.sideB <= 0 || this.height <= 0){
            throw new IllegalArgumentException("You set wrong input parameter because side is less than zero or equals zero");
        }
        if(this.sideA == this.sideB && this.sideB == this.height){
            throw new IllegalArgumentException("This is no Block but this is  Dice");
        }
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
