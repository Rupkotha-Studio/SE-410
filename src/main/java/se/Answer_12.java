package se;

import javax.swing.*;
import java.awt.*;
public class Answer_12  {
    public Answer_12() throws HeadlessException {
        final JFrame f= new JFrame("CheckBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.LEFT);
       // label.setSize(400,400);
        label.setBackground(Color.BLACK);
//        f.setSize(200,200);
        var checkbox1 = new JCheckBox("RED");
        checkbox1.setBounds(150,100, 100,100);
        var checkbox2 = new JCheckBox("GREEN");
        checkbox2.setBounds(150,170, 100,100);


        var checkbox3 = new JCheckBox("BLUE");
        checkbox3.setBounds(150,200, 100,100);
        f.add(checkbox1); f.add(checkbox2); f.add(checkbox3); f.add(label);
        checkbox1.addItemListener(e->{
          f.getContentPane().setBackground(Color.RED);
        });
        checkbox2.addItemListener(e->{
            f.getContentPane().setBackground(Color.GREEN);
        });
        checkbox3.addItemListener(e->{
            f.getContentPane().setBackground(Color.BLUE);
        });

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Answer_12();
    }
}
