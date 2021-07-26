/*
Mansi Dobariya
AU1841131
*/
import java.util.Arrays;
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
public class RoateArray {
    
    public static void main(String[] args) {
        
        String temp;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements of Array:");
        n = s.nextInt();
        
        String input[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            input[i] = s1.nextLine();
        }
        System.out.println("Original array"+Arrays.toString(input));
         
        for (int i = 0; i < 1; i++) {
            temp =input[0];
            for (int j = 0; j <input.length-1; j++) {
                input[j]=input[j+1];
            }
            input[input.length-1]=temp;
        }
        System.out.println("Rotated Array"+Arrays.toString(input));
    }
}

/*
run:
Enter number of elements of Array:5
Enter elements:
1
4
7
8
5
Original array[1, 4, 7, 8, 5]
Rotated Array[4, 7, 8, 5, 1]
*/
