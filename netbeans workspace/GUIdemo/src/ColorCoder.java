
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
 */
// Java Program to take RGBA value from 
// user and set it as background of panel 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorCoder extends JFrame implements ActionListener {

    // textfield to enter RGBA value 
    JTextField R, G, B, A;

    // panel 
    JPanel p;

    // constructor 
    ColorCoder() {
        super("colour");

        // create textfield 
        R = new JTextField(3);
        G = new JTextField(3);
        B = new JTextField(3);
        A = new JTextField(3);

        // create labels 
        JLabel l = new JLabel("Red= ");
        JLabel l1 = new JLabel("Green= ");
        JLabel l2 = new JLabel("Blue= ");
        JLabel l3 = new JLabel("Alpha= ");

        // create a panel 
        p = new JPanel();

        // create button 
        JButton b = new JButton("ok");
        JButton b1 = new JButton("brighter");
        JButton b2 = new JButton("Darker");

        // add ActionListener 
        b.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);

        // add components to panel 
        p.add(l);
        p.add(R);
        p.add(l1);
        p.add(G);
        p.add(l2);
        p.add(B);
        p.add(l3);
        p.add(A);
        p.add(b);
        p.add(b1);
        p.add(b2);

        setSize(500, 500);
        add(p);
        setVisible(true);
    }

    // if button is pressed 
    public void actionPerformed(ActionEvent evt) {
        String s = evt.getActionCommand();
        if (s.equals("ok")) {
            int r, g, b, a;

            // get rgba velue 
            r = Integer.parseInt(R.getText());
            g = Integer.parseInt(G.getText());
            b = Integer.parseInt(B.getText());
            a = Integer.parseInt(A.getText());

            // create a new Color 
            Color c = new Color(r, g, b, a);

            // set the color as background of panel 
            p.setBackground(c);
        } else if (s.equals("brighter")) {

            // getBackgroundColor 
            Color c = p.getBackground();

            // make the color brighter 
            c = c.brighter();

            // set the color as background of panel 
            p.setBackground(c);
        } else {

            // getBackgroundColor 
            Color c = p.getBackground();

            // make the color brighter 
            c = c.darker();

            // set the color as background of panel 
            p.setBackground(c);
        }
    }

    // Main Method 
    public static void main(String args[]) {
        ColorCoder c = new ColorCoder();
    }
}