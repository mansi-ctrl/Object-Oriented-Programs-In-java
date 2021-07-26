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
public class EvenOdd {

    public static void main(String[] args) {

          int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements of Array:");
        n = s.nextInt();
        int j=0,k=0;
        int input[] = new int[n];
        int even[]=new  int[n]; 
        int odd[]=new int[n];
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            input[i] = s1.nextInt();
        }
        System.out.println("Original Array"+Arrays.toString(input));
        for (int i = 0; i < n; i++) {
            if( input[i]%2 == 0 ){
                even[k]=input[i];
                k++;
            }
            else{
                odd[j]=input[i];
                j++;
            }
        }
        
        System.out.print("New array"+Arrays.toString(even )+Arrays.toString(odd));
        
    }
        

    }

/*
run:
Enter number of elements of Array:4
Enter elements:
1
3
5
7
Original Array[1, 2, 3, 4]
New array[1, 3, 2, 4]


There is problem tha, both arrays are  printed in different arrays
*/