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
class Perimeter {

    double a;
    double b;
    double perimeter;

    public Perimeter(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double Calculate() {
        perimeter = 2 * (a + b);
        return perimeter;
    }

    void display() {
        System.out.println("Length : " + a + "\n" + "Breadth : " + b + "\n" + "Perimeter : " + perimeter);
    }

}

class Area extends Perimeter {

    double height;
    double area;

    public Area(double height, double a, double b) {
        super(a, b);
        this.height = height;

    }

    void doArea() {
        area = b * height;
    }

    void show() {
        super.display();
        System.out.println("Area :" + area);
    }

    public static void main(String[] args) {
        Area object = new Area(14.5, 45, 15);
        object.Calculate();
        object.doArea();
        object.show();

    }
}
/*
Mansi
run:
Length : 45.0
Breadth : 15.0
Perimeter : 120.0
Area :217.5
BUILD SUCCESSFUL (total time: 1 second)

*/