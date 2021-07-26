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
import java.awt.event.*;
 
public class KeyEventDemo extends Frame implements KeyListener {
 
   private TextField tfInput;  // Single-line TextField to receive tfInput key
   private TextArea taDisplay; // Multi-line TextArea to taDisplay result
 //  private TextField tF;
   public KeyEventDemo() {
      setLayout(new FlowLayout()); // "super" frame sets to FlowLayout
 
      add(new Label("Enter Text: "));
      tfInput = new TextField(10);
      add(tfInput);
      taDisplay = new TextArea(5, 40); // 5 rows, 40 columns
      add(taDisplay);
 
      tfInput.addKeyListener(this);
         // tfInput TextField (source) fires KeyEvent; and adds "this" object as a KeyEvent listener.
 
      setTitle("KeyEvent Demo"); // "super" Frame sets title
      setSize(400, 200);         // "super" Frame sets initial size
      setVisible(true);          // "super" Frame shows
   }
 
   public static void main(String[] args) {
      new KeyEventDemo();  
   }
 
   /** KeyEvent handlers */
   // Called back when a key has been typed (pressed and released)
   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
     // count++;
      
      
   }
  
   // Not Used, but need to provide an empty body for compilation
   @Override public void keyPressed(KeyEvent evt) {
 //System.out.println("Key Pressed..");
   }
   @Override public void keyReleased(KeyEvent evt) {
       //System.out.println("Key Released..");
   }
}

