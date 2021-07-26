/*
Mansi Dobariya
AU1841131
*/
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class RetirementPlanning {
  /*  The program should ask the user for following inputs:
Money that the user needs on retirement.
How much money the user wants to contribute every year towards retirement fund?
Interest rate (in %)
After taking above inputs from the user, the program calculates the number of years in which the
user can retire from his job/occupation.*/
    public static void main(String[] args) {
        System.out.println("Enter Money That you need on Retirement");
        Scanner scan= new Scanner(System.in);
        int goal = scan.nextInt();
        System.out.println("How much money you want to contribute every year towards retirement fund?");
        int cont=scan.nextInt();
        System.out.println("Interest rate(in %):");
        double interestRate= scan.nextDouble();
        double balance=0;
        int year=0;
        while(balance < goal){
         balance += cont;
        double interest = balance * interestRate / 100;  
        balance += interest;
        year++; }
        System.out.println(" taking year/s is/are "+year);
    }
}

/*
Enter Money That you need on Retirement
16000
How much money you want to contribute every year towards retirement fund?
1000
Interest rate(in %):
10
 taking year/s is/are 10
*/
