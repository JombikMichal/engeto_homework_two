package com.project_exceptions;

public class BadParamsForGeoObject extends IllegalArgumentException {
    public BadParamsForGeoObject() {
        super("This is no Block but this is  Dice");
    }
}
