package assignment3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/*
Name:Mansi Dobariya
AU1841131

 */

/**
 *
 * @author mansi
 */
class Record {

    public int SIZE = 5;

    String[] name = new String[SIZE];
    int[] rnk = new int[SIZE];

    public Record(String[] name, int[] rnk) {
        this.name = name;
        this.rnk = rnk;
    }

    public Record() {
    }

    public void readvalue() {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Enter name of %d 's Student", (i + 1));
            name[i] = s.next();
            // s.nextLine();
            System.out.printf("Enter Rank of %d 's Student", (i + 1));
            this.rnk[i] = s.nextInt();
            s.nextLine();
        }

    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Name : " + name[i] + "\n" + "Rank :" + rnk[i]);
        }
    }
}

public class Rank extends Record {

    int index;

    public Rank() {
        super();
    }

    public void highest() {
        index = this.rnk[0];

        for (int i = 0; i < SIZE; i++) {

            if (index <this.rnk[i]) {
                index =this.rnk[i];
            }

        }
        System.out.println("Highest Rank" + " " + index);
    }

    public static void main(String[] args) {
        Record student = new Record();
        student.readvalue();
        student.display();
        Rank Std = new Rank();
        Std.highest();
    }

}
/*
run:
Enter name of 1 's Studentmansi
Enter Rank of 1 's Student1
Enter name of 2 's Studentnancy
Enter Rank of 2 's Student2
Enter name of 3 's Studentdhatri
Enter Rank of 3 's Student3
Enter name of 4 's Studentnirva
Enter Rank of 4 's Student4
Enter name of 5 's Studentkhushi
Enter Rank of 5 's Student5
Name : mansi
Rank :6
Name : nancy
Rank :2
Name : dhatri
Rank :10
Name : nirva
Rank :4
Name : khushi
Rank :5
Highest Rank 10
BUILD SUCCESSFUL (total time: 31 seconds)

*/