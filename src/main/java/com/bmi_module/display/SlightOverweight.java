package com.bmi_module.display;

public class SlightOverweight implements DisplayBMIResult {
    @Override
    public void display() {
        System.out.println("Test BMI result: slight weight (You could eat less!)");
    }
}
