package com.geometric_object_module.drawing;

import com.geometric_object_module.real_geometric_objects.Rectangle;
import com.geometric_object_module.real_geometric_objects.Squere;

import javax.swing.*;
import java.awt.*;

public class DrawSquere extends JFrame implements Draw {

    private Squere squere;
    private final int a;

    public DrawSquere(Squere squere) {
        setTitle("Drawing image for: "+squere.getType());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.a = (int)squere.getSideA();
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect((this.getWidth()/2) - this.a/2,(this.getHeight()/2) - this.a/2, this.a,this.a);
    }
}
