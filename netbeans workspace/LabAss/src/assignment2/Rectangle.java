/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
/*
Name:Mansi Dobariya
RollNo:AU1841131
Description: a Java program that defines the Rectangle class 
and creates objects of it. Design a Rectangle class 
*/

/**
 *
 * @author mansi
 */
public class Rectangle {

    private float length;
    private float width;

    public Rectangle() {
        length = (float) 1.0;
        width = (float) 1.0;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(float newLength) {
        length = newLength;

    }

    public float getLength() {
        return length;

    }

    public void setWidth(float newWidth) {
        width = newWidth;

    }

    public float getWidth() {
        return width;

    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

}

class RectangleCalculate {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("AREA of RECTANGLE = "
                + r1.getArea()
                + "PERIMETER OD RECTANGLE = "
                + r1.getPerimeter());
        Rectangle r2 = new Rectangle();
        r2.setLength(5);
        r2.setWidth(5);
        System.out.println("Length" + r2.getLength()
                + "Width" + r2.getWidth());
           System.out.print("AREA of RECTANGLE = " + r2.getArea()
                        + "PERIMETER of RECTANGLE = " + r2.getPerimeter());
    }
}
/*
run:
AREA of RECTANGLE = 1.0PERIMETER OD RECTANGLE = 4.0
Length5.0Width5.0
AREA of RECTANGLE = 25.0PERIMETER of RECTANGLE = 20.0BUILD SUCCESSFUL (total time: 3 seconds)

*/