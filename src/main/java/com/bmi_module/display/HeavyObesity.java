package com.bmi_module.display;

public class HeavyObesity implements DisplayBMIResult {
    @Override
    public void display() {
        System.out.println("Test BMI result: heavy obesity (You must eat less! Wtf are you doing?)");
    }
}
