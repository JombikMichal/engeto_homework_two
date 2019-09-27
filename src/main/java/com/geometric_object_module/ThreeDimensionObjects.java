package com.geometric_object_module;

public abstract class ThreeDimensionObjects extends GeometricObject{

    public ThreeDimensionObjects(String type) {
        super(type);
    }

    public abstract double calculateVolume();
    public abstract double calculateSurface();
    public abstract void display();
}
