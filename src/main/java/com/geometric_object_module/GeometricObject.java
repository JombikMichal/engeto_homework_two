package com.geometric_object_module;

public abstract class GeometricObject {
    private final String type;

    public GeometricObject(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
