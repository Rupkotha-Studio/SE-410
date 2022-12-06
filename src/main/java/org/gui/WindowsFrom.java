package org.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowsFrom extends Frame {
    private JFrame frame;
    public WindowsFrom() throws HeadlessException {
        setBounds(100,100,500,500);
        setTitle("SE-410");
        var btn1=new Button("NORTH");
        var btn2=new Button("SOUTH");
        btn1.setBackground(Color.YELLOW);
        btn2.setBackground(Color.RED);
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        var btn3=new Button("EAST");
        btn3.setBackground(Color.GREEN);
        add(btn3,BorderLayout.EAST);
        var btn4=new Button("WEST");
        btn4.setBackground(Color.ORANGE);
        add(btn4,BorderLayout.WEST);
        var btn=new Button("Submit");
        btn.setSize(200,200);
        btn.addActionListener(e->{
            var sms=  JOptionPane.showConfirmDialog(null,"Please Confirm","Alert",JOptionPane.INFORMATION_MESSAGE);
            if (sms==0)
            {
                frame= new JFrame("Successfully Clicked");
                frame.setSize(800,800);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }else {
                System.out.println("failed to open");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
        btn.setBackground(Color.PINK);
        add(btn,BorderLayout.CENTER);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowsFrom();
    }
}
