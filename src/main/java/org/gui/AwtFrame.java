package org.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;

public class AwtFrame extends Frame{
    public AwtFrame(String title) throws HeadlessException {
        super(title);
        setSize(300,300);
        setLayout(null);
        setBackground(Color.BLUE);
        add(new Button("Click Me"));
        setVisible(true);

    }

    public static void main(String[] args) {
        new AwtFrame("SE-412");
    }


}
