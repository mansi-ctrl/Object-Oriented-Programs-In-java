/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
/*
Name:Mansi Dobariya
RollNo:AU1841131
description:e a Java program that defines the Circle class 
*/

/**
 *
 * @author mansi
 */
public class Circle {
    
    private double raduis;
    private String colour="blue";

    public Circle() {
        raduis =1.0;
        //colour = "blue";
                }
     public Circle(double r){
         raduis =r;
         //colour="blue";
     }
     public double  getraduis(){
         return raduis;
     }
     public double getArea(){
         return raduis*raduis*Math.PI;
     }
    
}
class CircleCalculate{
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println("Raduis = "+c1.getraduis()+" Area = "+c1.getArea());
        Circle c2=new Circle(3.14);
        System.out.println("Raduis = "+c2.getraduis()+" Area = "+c2.getArea());
    }
}
/*
run:
Raduis = 1.0 Area = 3.141592653589793
Raduis = 3.14 Area = 30.974846927333925
BUILD SUCCESSFUL (total time: 2 seconds)

*/