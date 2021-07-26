/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Name:Mansi Dobariya
RollNo:AU1841131
Descrition: a Java program to define a BankAccount class 
to represent the savings bank account in a bank operated by customer
*/
package assignment2;

import java.util.Scanner;

/**
 *
 * @author mansi
 */
public class BankAccount {

    private int accountNo;
    private String customerName;
    private int balance ;
    Scanner scan = new Scanner(System.in);

    public BankAccount(int accountNo, String customerName) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        //this.balance = balance;
    }

    public void savingAccount(int a) {
        balance = a;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Current Balance="+balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Current Balance="+balance);
    }

    public void depositInterest() {
        System.out.println("Enter Principal");
        double p = scan.nextDouble();
        System.out.println("Enter Rate");
        double r = scan.nextDouble();
        System.out.println("Enter Time");
        int t = scan.nextInt();
        double interest = (p * r * t) / 100;
        System.out.println("Deposit Interest :" + interest);

        System.out.println("Current Balance="+balance);
        //balance+=balance*rate;
    }
}

class BankTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your BankAccount number");
        int a = s.nextInt();
        s.nextLine();
        System.out.println("Enter your name");
        String n = s.nextLine();
        if (123 == a && "abc".equals(n)) {
            BankAccount b = new BankAccount(a, n);
            b.savingAccount(1000);
            System.out.println("Enter your choice \n 1.Withdraw \n 2.deposit \n 3.depositinterest");
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Enter Amount");
                int a1 = s.nextInt();
                b.withdraw(a1);
                System.out.println("Loading....");
                System.out.println("Done");
                
            } else if (choice == 2) {
                System.out.println("Enter Amount");
                int a2 = s.nextInt();
                b.deposit(a2);
                System.out.println("Loading....");
                System.out.println("Done");

            } else if (choice == 3) {
                //System.out.println("Enter Rate");
                // double a3=s.nextDouble();
                b.depositInterest();
                System.out.println("Loading....");
                System.out.println("Done");

            } else {
                System.out.println("Wrong input");
            }

        } else {
            System.out.println("Wrong input");

        }

    }
}
/*
run:
Enter your BankAccount number
123
Enter your name
abc
Enter your choice 
 1.Withdraw 
 2.deposit 
 3.depositinterest
1
Enter Amount
125
Current Balance=875
Loading....
Done
BUILD SUCCESSFUL (total time: 14 seconds)

*/