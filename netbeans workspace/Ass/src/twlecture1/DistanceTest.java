/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*name :Mansi dobariya
AU1841131
Description:Distance in feet inches

*/
package twlecture1;

import java.util.Scanner;

/**
 *
 * @author mansi
 */
 class Distance {
    
public Distance(float feet, float inches, float meter, float cmeter) {
        this.feet = feet;
        this.inches = inches;
        this.meter = meter;
        this.cmeter = cmeter;
    }

    float feet, inches;
    float meter, cmeter;

    Distance() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display(float feet1, float inches1) {
        System.out.println("Distance is " + feet1 + " feet and " + inches1 + " inches");
    }

    void display1(float feet2, float inches2) {
        System.out.println("Distance is " + feet2 + " feet and " + inches2 + " inches");
    }

    void add(float feet1, float feet2, float inches1, float inches2) {
        float feetadd = feet1 + feet2 + ((inches1 + inches2) / 12);
        float dcm = (float) ((feetadd * 12) / 2.54);
        float dm = (float) dcm / 100;
        System.out.println("Adiition (in feet) : " + feetadd);
        System.out.println("Addition (in centimeter) : " + dcm);
        System.out.println("Additon (in meter) : " + dm);
    }

    void dm(float feet1, float feet2, float inches1, float inches2) {
        float feetadd = feet1 + feet2 + ((inches1 + inches2) / 12);
        //  float fee
        System.out.println("");
    }
}

 class DistanceTest{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Distance b = new Distance();
        System.out.println("Enter distance1 : ");
        System.out.print("feet : ");
        int feet1 = s.nextInt();
        System.out.print("inches : ");
        int inches1 = s.nextInt();
        //  System.out.println("Distance is "+ feet1 + " feet and "+inches1+" inches");
        b.display(feet1, inches1);

        System.out.println("Enter distance2 : ");
        System.out.print("feet : ");
        int feet2 = s.nextInt();
        System.out.print("inches : ");
        int inches2 = s.nextInt();
        b.display1(feet2, inches2);
        b.add(feet1, feet2, inches1, inches2);
    }
}
/*
run:
Enter distance1 : 
feet : 13
inches : 14
Distance is 13.0 feet and 14.0 inches
Enter distance2 : 
feet : 12
inches : 54
Distance is 12.0 feet and 54.0 inches
Adiition (in feet) : 30.666666
Addition (in centimeter) : 144.8819
Additon (in meter) : 1.4488189
BUILD SUCCESSFUL (total time: 12 seconds)

*/