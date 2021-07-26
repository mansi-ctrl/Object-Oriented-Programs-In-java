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

public class Loan {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Loan amount:");
        double amount=obj.nextDouble();
        System.out.println("Enter Loan Term (in years):");
        int term =obj.nextInt();
        System.out.println("Enter Interest Rate(months):");
        double rateA =obj.nextDouble();
        
       
        double  monthlyPayment;
        double rate = rateA /1200;
        monthlyPayment = (amount*rate)/(1-1/ Math.pow(1+rate,term*12));
        double totalpayment = monthlyPayment*term *12;
        System.out.println("Loan Amount="+ amount);
        System.out.println("Loan Term ="+ term);
        System.out.println("Interest Rate="+rate);
        System.out.println("Monthly payment in INR is "+monthlyPayment);
        System.out.println("Total payment in INR is "+ totalpayment);
    }
}

/*
Enter Loan amount:
25000
Enter Loan Term (in years):
2500
Enter Interest Rate(months):
10
Loan Amount=25000.0
Loan Term =2500
Interest Rate=0.008333333333333333
Monthly payment in INR is 208.33333333333334
Total payment in INR is 6250000.0
*/