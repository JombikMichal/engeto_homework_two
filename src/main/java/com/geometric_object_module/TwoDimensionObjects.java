package com.geometric_object_module;

public abstract class TwoDimensionObjects extends GeometricObject{


    public TwoDimensionObjects(String type) {
        super(type);
    }

    public abstract double calculateContent();
    public abstract double calculateCircuit();
    public abstract void display();
}
