package com.project_exceptions;

public class InputIsZero extends Exception {
    public InputIsZero() {
        super("Some input which you set is zero!");
    }
}
