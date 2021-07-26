/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;
/*Name:Mansi Dobariya
RollNo:AU1841131
Description: a Java program to create Student Result Entering By user 
/**
 *
 * @author mansi
 */
public class STUDENTResult {
    int RollNo;
    int m1;
    int m2;
    int m3;
    int total;
    double per;

    public STUDENTResult(int RollNo, int m1, int m2, int m3) {
        this.RollNo = RollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.total = total;
    }
    void display(){
        total=m1+m2+m3;
        System.out.println("Roll no: "+RollNo+"\n"+"Marks of Subject1 ="+m1+"\n"
                +"Marks of subject2 ="+m2+"\n"+"Marks of subject3 ="+m3+"\n"+"Total ="+total);
    }
    void percentage(){
    per=(total*100)/300;
        System.out.println("Percentage:"+per+"\n");
    }
    
    
}
class StudentTest{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        STUDENTResult std[]=new STUDENTResult[10];
       
        
        std[0]=new STUDENTResult(1,90,90,90);
        std[1]=new STUDENTResult(2,90,90,90);
        std[2]=new STUDENTResult(3,90,90,90);
        std[3]=new STUDENTResult(4,90,90,90);
        std[4]=new STUDENTResult(5,90,90,90);
        std[5]=new STUDENTResult(6,90,90,90);
        std[6]=new STUDENTResult(7,90,90,90);
        std[7]=new STUDENTResult(8,90,90,90);
        std[8]=new STUDENTResult(9,90,90,90);
        std[9]=new STUDENTResult(10,90,90,90);
        
         System.out.println("Enter Roll number of student(Between 1 to 10)");
        int a=scan.nextInt();
        std[a-1].display();
        std[a-1].percentage();
    }
}
/*
run:
Enter Roll number of student(Between 1 to 10)
4
Roll no: 4
Marks of Subject1 =90
Marks of subject2 =90
Marks of subject3 =90
Total =270
Percentage:90.0

BUILD SUCCESSFUL (total time: 7 seconds)

*/