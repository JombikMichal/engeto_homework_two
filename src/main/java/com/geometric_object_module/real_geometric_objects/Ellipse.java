package com.geometric_object_module.real_geometric_objects;

import com.geometric_object_module.TwoDimensionObjects;

public class Ellipse extends TwoDimensionObjects {
    public Ellipse(String type) {
        super(type);
    }

    @Override
    public double calculateContent() {
        return 0;
    }

    @Override
    public double calculateCircuit() {
        return 0;
    }
}
