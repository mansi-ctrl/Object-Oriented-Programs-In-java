/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twlecture1;

/*
name :Mansi dobariya
AU1841131
Description:Inheritance used
*/
/**
 *
 * @author mansi
 */
class Circle {

    public double radius;
    public double area;
    public double circumference;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public double getArea() {
        area = radius * radius * Math.PI;
        return area;
    }

    public double getCircumference() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }
}

class Cylinder extends Circle {

    public double height;
    public double volume;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return getCircumference() * height;
    }

    public double getVolume() {
        volume = Math.PI * radius * radius * height;
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Radius of Cylinder 1 : " + c1.getRadius());
        System.out.println("Height of cylinder 1 : " + c1.getHeight());
        System.out.println("Area of Cylinder 1 :  " + c1.getArea());
        System.out.println("Volume of Cylinder 1 : " + c1.getVolume());
        System.out.println("");
        Cylinder c2 = new Cylinder(3.0, 4.0);
        System.out.println("Radius of Cylinder 2 : " + c2.getRadius());
        System.out.println("Height of cylinder 2 : " + c2.getHeight());
        System.out.println("Area of Cylinder 2 :  " + c2.getArea());
        System.out.println("Volume of Cylinder 2 : " + c2.getVolume());
        System.out.println("");
    }
}
/*
run:
Radius of Cylinder 1 : 1.0
Height of cylinder 1 : 1.0
Area of Cylinder 1 :  6.283185307179586
Volume of Cylinder 1 : 3.141592653589793

Radius of Cylinder 2 : 4.0
Height of cylinder 2 : 3.0
Area of Cylinder 2 :  75.39822368615503
Volume of Cylinder 2 : 150.79644737231007

BUILD SUCCESSFUL (total time: 0 seconds)
*/