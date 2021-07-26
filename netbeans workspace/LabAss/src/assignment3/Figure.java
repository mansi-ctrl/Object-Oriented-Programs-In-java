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
abstract class Figure {

    abstract double area();

}

class Rectangle extends Figure {

    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class circle extends Figure {

    double raduis;

    public circle(double raduis) {
        this.raduis = raduis;
    }

    @Override
    double area() {
        return Math.PI * raduis * raduis;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class AbstractAreas {

    public static void main(String[] args) {
        Figure figure;//reference var
        
        Rectangle r = new Rectangle(14.5, 50);
        circle c = new circle(25.6);
        //reference variable of abstract class to invoke sub-class 
	
        figure = r;
        System.out.println("Length of Rectangle : " + r.length + "\n" + "Breadth of Rectangle : "
                + r.breadth + "\n" + "Area of Rectangle : " + figure.area());
        figure = c;
        System.out.println("Raduis of Circle : " + c.raduis + "\n" + "Area of Circle : " + figure.area());
    }
}
/*
mansi
run:
Length of Rectangle : 14.5
Breadth of Rectangle : 50.0
Area of Rectangle : 725.0
Raduis of Circle : 25.6
Area of Circle : 2058.874161456607
BUILD SUCCESSFUL (total time: 13 seconds)

*/