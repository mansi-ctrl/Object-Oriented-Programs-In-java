/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
/*
Name:Mansi Dobariya
AU1841131

*/
/**
 *
 * @author mansi
 */
class Circle {

    double raduis = 1.0;
    String color = "red";

    Circle() {

    }

    Circle(double raduis) {
        this.raduis = raduis;
    }

    Circle(double raduis, String color) {
        this.raduis = raduis;
        this.color = color;
    }

    double getRaduis() {
        return raduis;
    }

    void setRaduis(double a) {
        raduis = a;
    }

    String getColor() {
        return color;
    }

    void setColor(String b) {
        color = b;
    }

    double getArea() {
        return Math.PI * raduis * raduis;
    }

    @Override
    public String toString() {
        return "Circle{" + "raduis=" + raduis + ", color=" + color + '}';
    }
}

class Cylinder extends Circle {

    double height = 1.0;
    double surfaceArea;

    Cylinder() {
        super();
    }

    Cylinder(double raduis) {
        super(raduis);
    }

    Cylinder(double raduis, double height) {
        super(raduis);
        this.height = height;
    }

    Cylinder(double raduis, String color, double height) {
        super(raduis, color);
        this.height = height;
    }

    double getheight() {
        return height;
    }

    void setHeight(double h) {
        this.height = h;
    }

    double getVolume() {
        return Math.PI * raduis * raduis * height;
    }

    @Override
    double getArea() {
        surfaceArea = 2 * Math.PI * raduis * height + 2 * super.getArea();
        return surfaceArea;
    }
}

class CylinderTest {

    public static void main(String[] args) {
        Circle obj = new Circle();

        Cylinder object = new Cylinder(1, "red", 1);

        System.out.println("Raduis :" + object.raduis + "\n" + "Height :" + object.height + "\n"
                + "Color : " + object.color + "\n" + "Volume of Cylinder" + object.getVolume() + "\n"
                + "Surface area of Cylinder : " + object.getArea() + "\n" + "Area of Circle :" + obj.getArea());

    }
}
/*
Mansi
run:
Raduis :1.0
Height :1.0
Color : red
Volume of Cylinder3.141592653589793
Surface area of Cylinder : 12.566370614359172
Area of Circle :3.141592653589793
BUILD SUCCESSFUL (total time: 3 seconds)

*/