package com.calculator_module.operands;

public class Operands {
    private double left;
    private double right;


    public Operands(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public Operands() {
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }
}
