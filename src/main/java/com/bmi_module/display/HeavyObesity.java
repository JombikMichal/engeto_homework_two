package com.bmi_module.display;

import com.bmi_module.BMI;

public class HeavyObesity implements DisplayBMIResult {
    @Override
    public void display(BMI bmi) {
        System.out.println("Test BMI result: " + bmi.getBodyMassIndex() + " = heavy obesity (You must eat less! Wtf are you doing?)");
    }


}
