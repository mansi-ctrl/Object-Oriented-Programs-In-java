
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
/*
Mansi Dobariya
AU1841131
*/
public class UserInputDemo {

    public static void main(String[] args) {
      
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("your name is " + name);
        int length = name.length();
        System.out.println("your name has " + length + " chars");
        System.out.println(" your name in uppercase is " + name.toUpperCase());
        
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("next year you will be " + (age + 1) + " years");
         
        System.out.println("Enter your cgpa");
        float cgpa = input.nextFloat();
        System.out.println("your cgpa is " + cgpa);
    }
}

/*
Enter your name
mansi
your name is mansi
your name has 5 chars
 your name in uppercase is MANSI
Enter your age
17
next year you will be 18 years
Enter your cgpa
5
your cgpa is 5.0
*/