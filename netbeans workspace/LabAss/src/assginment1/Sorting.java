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
public class Sorting {
       public static boolean Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
            }
       return true;
    }
public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		  System.out.println("Enter string");
                  String str=input.nextLine();
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+Unique_str(str));
	}		
}

/*
Enter string
jensi
Original String : jensi
String has all unique characters: true
*/
