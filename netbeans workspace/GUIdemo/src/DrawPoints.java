/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */

import java.awt.*;
import javax.swing.*; 

public class DrawPoints extends JPanel {
  public void paintComponent(Graphics g) {
      
      g.drawLine(40 , 40 ,40, 40);    
      //g.drawString("Hello Students", 50,100);
  }
 
  public static void main(String[] args) {

    JFrame frame = new JFrame("Draw Points");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setBackground(Color.white);
    frame.setSize(200, 200);
 
    DrawPoints panel = new DrawPoints();
    frame.add(panel);
    frame.setVisible(true);
  }
}
