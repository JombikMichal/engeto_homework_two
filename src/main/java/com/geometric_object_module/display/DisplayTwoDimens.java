package com.geometric_object_module.display;

import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.real_geometric_objects.Squere;

public class DisplayTwoDimens implements DisplayAble {
    private TwoDimensionObjects o;

    public DisplayTwoDimens(TwoDimensionObjects o) {
        this.o = o;
    }

    @Override
    public void display() {
        try {
            System.out.println("RESULT: ");
            System.out.println("Your Object: " + o.getType());
            System.out.println("Content " + o.calculateContent() + " cm^2");
            System.out.println("Circuit " + o.calculateCircuit() + " cm");
            System.out.println("**********************************\n");
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
