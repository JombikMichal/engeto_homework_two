package com.bmi_module.display;

public class HealthyWeight implements DisplayBMIResult {
    @Override
    public void display() {
        System.out.println("Test BMI result: healthy weight (well done!)");
    }
}
