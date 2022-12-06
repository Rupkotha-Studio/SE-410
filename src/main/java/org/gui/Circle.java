package org.gui;

import javax.swing.*;
import java.awt.*;


public class Circle extends JFrame{
    public Circle(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setBackground(Color.GREEN);
        setVisible(true);
    }
    public void paint(Graphics gh)
    {
//        super.paint(gh);
//        //gh.drawOval(80,80,150,150);
        gh.setColor(Color.red);
        gh.fillOval(100,100,200,200);
    }

    public static void main(String[] args) {
        new Circle("Circle");
    }



}
