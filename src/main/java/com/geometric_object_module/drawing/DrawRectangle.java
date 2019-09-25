package com.geometric_object_module.drawing;

import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.real_geometric_objects.Rectangle;

import javax.swing.*;
import java.awt.*;

public class DrawRectangle extends JFrame implements Draw{

    private Rectangle rectangle;
    private final int a;
    private final int b;

    public DrawRectangle(Rectangle rectangle) {
        setTitle("Drawing image for: "+rectangle.getType());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.a = (int)rectangle.getSideA();
        this.b = (int)rectangle.getSideB();
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect((this.getWidth()/2) - this.a/2,(this.getHeight()/2) - this.b/2, this.a,this.b);
    }
}
