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
public class VowelConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Enter String");
        s = input.nextLine();
        System.out.println(s);
        int vowels = 0, consonants = 0, i;
        s = s.toLowerCase();
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch <= 'z' && ch >= 'a') {
                consonants++;
            } else {
            }
        }
        System.out.println("Consonants :"+ consonants);
        System.out.println("vowels :" + vowels);
    }
}

/*

Enter String
fsgyrhcbvekisoua
fsgyrhcbvekisoua
Consonants :11
vowels :5
*/