package com.geometric_object_module.display;

import com.geometric_object_module.ThreeDimensionObjects;

public class DisplayThreeDimens implements DisplayAble {
    private ThreeDimensionObjects o;

    public DisplayThreeDimens(ThreeDimensionObjects o) {
        this.o = o;
    }

    @Override
    public void display() {
        try {
            System.out.println("RESULT: ");
            System.out.println("Your Object: " + o.getType());
            System.out.println("Volume: " + o.calculateVolume() + " cm^3");
            System.out.println("Surface: " + o.calculateSurface() + " cm^2");
            System.out.println("**********************************\n");
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
