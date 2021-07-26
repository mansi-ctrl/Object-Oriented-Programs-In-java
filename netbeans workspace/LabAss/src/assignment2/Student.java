/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
/*
Name:Mansi Dobariya
RollNo:AU1841131
Description: a Java program that displays the Student result entering by User

*/

import java.util.Scanner;

/**
 *
 * @author mansi
 */
public class Student {

    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", average=" + average + '}';
    }

    int studentID;
    String name;
    double m1;
    double m2;
    double m3;
    double average;

    public Student(int studentID, String name, double m1, double m2, double m3) {
        this.studentID = studentID;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void averageA() {
        average = 0;
        average = (m1 + m2 + m3) / 3;
    }

    void display() {
        System.out.println("Average = " + average);
    }

}

class StudentResult {

    public static void main(String[] args) {
        Student std[] = new Student[3];
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter StudntID(5 digits is valid)");
            int a = s.nextInt();
            s.nextLine();
            
            System.out.println("Enter name ");
            String b = s.nextLine();

            

            System.out.println("Enter marks of Subject1(out of 100)");
            int c = s.nextInt();
            System.out.println("Enter marks of Subject2(out of 100)");
            int d = s.nextInt();
            System.out.println("Enter marks of Subject3(out of 100)");
            int e = s.nextInt();

            std[i] = new Student(a, b, c, d, e);
            std[i].averageA();
            std[i].display();
            System.out.printf("Player %d", i + 1);
            System.out.println(std[i].toString());
        }

    }

   
}
/*
run:
Enter StudntID(5 digits is valid)
12345
Enter name 
djwhd
Enter marks of Subject1(out of 100)
45
Enter marks of Subject2(out of 100)
45
Enter marks of Subject3(out of 100)
45
Average = 45.0
Player 1Student{studentID=12345, name=djwhd, m1=45.0, m2=45.0, m3=45.0, average=45.0}
Enter StudntID(5 digits is valid)
45658
Enter name 
dhj
Enter marks of Subject1(out of 100)
45
Enter marks of Subject2(out of 100)
78
Enter marks of Subject3(out of 100)
47
Average = 56.666666666666664
Player 2Student{studentID=45658, name=dhj, m1=45.0, m2=78.0, m3=47.0, average=56.666666666666664}
Enter StudntID(5 digits is valid)
12365
Enter name 
ruigigiur
Enter marks of Subject1(out of 100)
45
Enter marks of Subject2(out of 100)
45
Enter marks of Subject3(out of 100)
78
Average = 56.0
Player 3Student{studentID=12365, name=ruigigiur, m1=45.0, m2=45.0, m3=78.0, average=56.0}
BUILD SUCCESSFUL (total time: 49 seconds)

*/