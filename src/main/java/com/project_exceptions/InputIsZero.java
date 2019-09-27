package com.project_exceptions;

public class InputIsZero extends IllegalArgumentException {
    public InputIsZero() {
        super("Some input which you set is zero!");
    }
}
