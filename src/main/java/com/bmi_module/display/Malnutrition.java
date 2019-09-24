package com.bmi_module.display;

import com.bmi_module.BMI;

public class Malnutrition implements DisplayBMIResult{
    @Override
    public void display(BMI bmi) {
        System.out.println("Test BMI result: " + bmi.getBodyMassIndex() + " = malnutrition (You must eat more!)");
    }
}
