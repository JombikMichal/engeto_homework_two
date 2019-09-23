package com.bmi_module.display;

public class Obesity implements DisplayBMIResult {
    @Override
    public void display() {
        System.out.println("Test BMI result: obesity (You must eat less! Now!)");
    }
}
