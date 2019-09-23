package com.bmi_module.display;

public class Malnutrition implements DisplayBMIResult{
    @Override
    public void display() {
        System.out.println("Test BMI result: malnutrition (You must eat more!)");
    }
}
