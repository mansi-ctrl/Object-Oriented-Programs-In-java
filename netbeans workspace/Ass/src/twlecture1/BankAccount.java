/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twlecture1;
/*
name :Mansi dobariya
AU1841131
description:BankAccount
*/
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author mansi
 */
class Saving_Account {

    public String name = "Mansi Dobariya";
    public int account_number = 958462;
    public double balance = 100000;
    ArrayList<Integer> transictions = new ArrayList<Integer>();
    public int t = 0;

    void withdraw_money(int money) {
        if (money > balance) {
            System.out.println("Not Enough balance");
        } else {
            transictions.add(0 - money);
            balance = balance - money;
            System.out.println("Balance of your account after withdraw :" + balance);
            t++;
            give_interest(t);
        }
    }

    public void deposit_money(int money) {
        if (money < 0) {
            System.out.println("Not Valid");
        } else {
            transictions.add(money);
            balance = balance + money;
            System.out.println("Balance of your account after Deposit :" + balance);
        }
    }

    void give_interest(int t) {
        if (t == 2) {
            System.out.println("Contrats! you completed 1 month and you get 3 %  interest on your current balance.");
            balance = balance + balance * 0.03;
            System.out.println("Current balance: " + balance);
        }
    }

    void display_account(Saving_Account sa) {
        System.out.println(" Name : " + sa.name + "" + "Account Number : " + sa.account_number + ""
                + "Balance : " + sa.balance);
    }

    void print_passbook() {
        System.out.println("Passbook : ");
        for (int i = 0; i < transictions.size(); i++) {
            if (transictions.get(i) > 0) {
                System.out.println((i + 1) + ". " + transictions.get(i) + " deposited");
            }
            if (transictions.get(i) < 0) {
                System.out.println((i + 1) + ". " + transictions.get(i) + " withdrawed");
            }
        }
    }
}

class Current_Account {

    public String name = "Mansi Dobariya";
    public int account_number = 958462;
    public double balance = 5000;
    ArrayList<Integer> transictions = new ArrayList<Integer>();

    void withdraw_money(int money) {
        if (balance - money < -50000) {
            System.out.println("Not enough Balance");
        } else {
            transictions.add(0 - money);
            balance = balance - money;
            System.out.println("Balance of your account after withdraw :" + balance);
        }
    }

    public void deposit_money(int money) {
        if (money < 0) {
            System.out.println("Not valid");
        } else {
            transictions.add(money);
            balance = balance + money;
            System.out.println("Balance of your account after Deposit :" + balance);
        }
    }

    void display_account(Current_Account ca) {
        System.out.println("\nName : " + ca.name + "\nAccount Number : " + ca.account_number + "\nBalance : " + ca.balance);
    }

    void print_passbook() {
        System.out.println("Passbook : ");
        for (int i = 0; i < transictions.size(); i++) {
            if (transictions.get(i) > 0) {
                System.out.println((i + 1) + ". " + transictions.get(i) + " deposited");
            }
            if (transictions.get(i) < 0) {
                System.out.println((i + 1) + ". " + transictions.get(i) + " withdrawed");
            }
        }
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Saving_Account sa = new Saving_Account();
        Current_Account ca = new Current_Account();
        System.out.println("Which Account you want to access : \n1.Saving Account\n2.Current Account");
        int c1 = in.nextInt();
        switch (c1) {
            case 1:
                saving_tasks(sa);
                break;

            case 2:
                current_tasks(ca);
                break;
        }
    }

    static void saving_tasks(Saving_Account sa) {
        Scanner in = new Scanner(System.in);
        sa.display_account(sa);
        int e = 0;
        do {
            System.out.println("\nWhat you want to do : \n1.Withdraw\n2.Deposite\n3.Print Passbook");
            int c2 = in.nextInt();
            switch (c2) {
                case 1:
                    if (sa.t < 10) {
                        System.out.println("\nEnter withdraw amount : ");
                        int money = in.nextInt();
                        sa.withdraw_money(money);
                    } else {
                        System.out.println("\nYou withdrawed 10 times" + ""
                                + "So you can't withdraw more in this month. Try next month. OK!!");
                    }
                    System.out.println("\nDo you want to do tasks again.(y/n) : ");
                    String ans = in.next();
                    if (ans.equals("y")) {
                        e = 0;
                    } else {
                        e++;
                    }
                    break;

                case 2:
                    System.out.println("Enter deposite amount : ");
                    int money = in.nextInt();
                    sa.deposit_money(money);
                    System.out.println("\nDo you want to do tasks again.(y/n) : ");
                    ans = in.next();
                    if (ans.equals("y")) {
                        e = 0;
                    } else {
                        e++;
                    }
                    break;

                case 3:
                    sa.print_passbook();
                    System.out.println("\nDo you want to do tasks again.(y/n) : ");
                    ans = in.next();
                    if (ans.equals("y")) {
                        e = 0;
                    } else {
                        e++;
                    }
                    break;
            }
        } while (e == 0);
    }

    static void current_tasks(Current_Account ca) {
        Scanner in = new Scanner(System.in);
        ca.display_account(ca);
        int e = 0;
        do {
            System.out.println("\nWhat you want to do : \n1.Withdraw\n2.Deposite\n3.Print Passbook");
            int c2 = in.nextInt();
            switch (c2) {
                case 1:
                    System.out.println("\nEnter withdraw amount : ");
                    int money = in.nextInt();
                    ca.withdraw_money(money);
                    System.out.println("\nDo you want to do tasks again.(y/n) : ");
                    String ans = in.next();
                    if (ans.equals("y")) {
                        e = 0;
                    } else {
                        e++;
                    }
                    break;

                case 2:
                    System.out.println("Enter deposite amount : ");
                    money = in.nextInt();
                    ca.deposit_money(money);
                    System.out.println("\nDo you want to do tasks again.(y/n) : ");
                    ans = in.next();
                    if (ans.equals("y")) {
                        e = 0;
                    } else {
                        e++;
                    }
                    break;

                case 3:
                    ca.print_passbook();
                    System.out.println("\nDo you want to do tasks again.(y/n) : ");
                    ans = in.next();
                    if (ans.equals("y")) {
                        e = 0;
                    } else {
                        e++;
                    }
                    break;
            }
        } while (e == 0);
    }
}
/*
run:
Which Account you want to access : 
1.Saving Account
2.Current Account
1
 Name : Mansi DobariyaAccount Number : 958462Balance : 100000.0

What you want to do : 
1.Withdraw
2.Deposite
3.Print Passbook
1

Enter withdraw amount : 
456
Balance of your account after withdraw :99544.0

Do you want to do tasks again.(y/n) : 
y

What you want to do : 
1.Withdraw
2.Deposite
3.Print Passbook
2
Enter deposite amount : 
584
Balance of your account after Deposit :100128.0

Do you want to do tasks again.(y/n) : 
y

What you want to do : 
1.Withdraw
2.Deposite
3.Print Passbook
3
Passbook : 
1. -456 withdrawed
2. 584 deposited

Do you want to do tasks again.(y/n) : 
n
BUILD SUCCESSFUL (total time: 29 seconds)

*/