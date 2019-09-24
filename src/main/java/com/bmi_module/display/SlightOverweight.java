package com.bmi_module.display;

import com.bmi_module.BMI;

public class SlightOverweight implements DisplayBMIResult {
    @Override
    public void display(BMI bmi) {
        System.out.println("Test BMI result: " + bmi.getBodyMassIndex() + " = slight weight (You could eat less!)");
    }
}
