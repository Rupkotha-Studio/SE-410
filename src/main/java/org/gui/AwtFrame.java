package org.gui;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.time.Duration;

public class AwtFrame extends Frame{
    public AwtFrame(String title) throws HeadlessException {
        super(title);
        setSize(300,300);
        setLayout(null);
        setBackground(Color.BLUE);
        add(new Button("Click Me"));
        setVisible(true); }
    public static void main(String[] args) {
        new AwtFrame("SE-412");
    }
}

class Circles extends JFrame {
    public Circles() throws HeadlessException {
        setTitle("Drawing a Circle");
        setSize(500, 300);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        int diameter=300;
        int xpos=180,ypos=100;
        g.fillOval(xpos,ypos,diameter,diameter);
        Font f1 = new Font("Arial",Font.BOLD,18);
        g.setColor(Color.black);
        g.setFont(f1);
        String s="Durjoy Acharya";
        g.drawString(s,xpos+(diameter/2)-(s.length()/2),ypos+(diameter/2));
    }
    public static void main(String[] args) {
      new Circles();
      //  new AwtFrame("Advanced Java");
    }
}