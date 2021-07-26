/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twlecture1;
/*
name :Mansi dobariya
AU1841131
description:Cricketer average

*/
import java.util.Scanner;

/**
 *
 * @author mansi
 */
class Cricket {

    String name;
    int runs;
    double innings;

    public String toString() {
        return " Cricketer {" + " name =" + name + ", runs= " + runs + ", innings= " + innings + '}';
    }
    double batAverage = 0;
//constuctor

    public Cricket(String name, int runs, double innings) {
        this.name = name;
        this.runs = runs;
        this.innings = innings;
    }

    //method
    double battingAverage() {
        batAverage = runs / innings;
        return batAverage;
    }

    void display() {
        System.out.println("BattingAverage =" + batAverage);
    }

}

public class CricketerScore {

    public static void main(String[] args) {
        Cricket p[] = new Cricket[5];
        double average[] = new double[5];
        for (int i = 0; i < 5; i++) {
            Scanner s = new Scanner(System.in);
            System.out.printf("Enter name of player %d\n", i + 1);
            String a = s.nextLine();
            System.out.println("Enter runs ");
            int b = s.nextInt();
            System.out.println("Enter innings");
            double c = s.nextDouble();

            p[i] = new Cricket(a, b, c);
            average[i] = p[i].battingAverage();
            p[i].display();
            System.out.printf("Player %d", i + 1);
            System.out.println(p[i].toString());
        }
        int l = 0, s = 0;
        for (int i = 0; i < 5; i++) {
            if (average[i] > average[l]) {
                l = i;
            }
        }
        System.out.println("Maximum average:" + average[l]);
        for (int i = 0; i < 5; i++) {
            if (average[i] < average[s]) {
                s = i;
            }
        }
        System.out.println("Minimum average:" + average[s]);

    }

}
/*
run:
Enter name of player 1
viraj
Enter runs 
45
Enter innings
14
BattingAverage =3.2142857142857144
Player 1 Cricketer { name =viraj, runs= 45, innings= 14.0}
Enter name of player 2
jay
Enter runs 

55
Enter innings
55
BattingAverage =1.0
Player 2 Cricketer { name =jay, runs= 55, innings= 55.0}
Enter name of player 3
uday
Enter runs 
58
Enter innings
47
BattingAverage =1.2340425531914894
Player 3 Cricketer { name =uday, runs= 58, innings= 47.0}
Enter name of player 4
nirva
Enter runs 
43
Enter innings
45
BattingAverage =0.9555555555555556
Player 4 Cricketer { name =nirva, runs= 43, innings= 45.0}
Enter name of player 5
iol
Enter runs 
42
Enter innings
12
BattingAverage =3.5
Player 5 Cricketer { name =iol, runs= 42, innings= 12.0}
Maximum average:3.5
Minimum average:0.9555555555555556
BUILD SUCCESSFUL (total time: 4 minutes 39 seconds)

*/