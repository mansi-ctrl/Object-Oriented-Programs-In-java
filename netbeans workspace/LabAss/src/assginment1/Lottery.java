/*
Mansi Dobariya
AU1841131
*/
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mansi
 */
public class Lottery {

    public static void main(String[] args) {
        Random rand = new Random();
        int lottery = rand.nextInt(90) + 10;

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your lottery pick (two digits):");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2) {
            System.out.println("the award is $10,000.");
        } else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                && lotteryDigit2 == guessDigit2
                || lotteryDigit2 == guessDigit1) {
            System.out.println("the award is $3,000.");
        } else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                || lotteryDigit2 == guessDigit2
                || lotteryDigit2 == guessDigit1) {
            System.out.println("the the award is $1,000.");
        } else if (lottery != guess) {
            System.out.println("Sorry! Better luck next time");
        }
    }
}

/*
Enter your lottery pick (two digits):
55
Sorry! Better luck next time
*/