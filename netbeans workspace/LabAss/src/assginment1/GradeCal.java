/*
Mansi Dobariya
AU1841131
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class GradeCal {

    public static void main(String[] args) {
        int rollNos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int marks[] = {350, 100, 550, 600, 560, 700, 640, 400, 590, 580};
        double percentage[] = new double[10];
        String grade[] = new String[10];

        for (int i = 0; i < 10; i++) {
            percentage[i] = marks[i] * 100 / 700;
            if (percentage[i] >= 70 && percentage[i] <= 100) {
                grade[i] = "DIST";
            } else if (percentage[i] >= 60 && percentage[i] < 70) {
                grade[i] = "FIRST";
            } else if (percentage[i] >= 50 && percentage[i] < 60) {
                grade[i] = "SECOND";
            } else if (percentage[i] >= 35 && percentage[i] < 50) {
                grade[i] = "THIRD";
            } else {
                grade[i] = "FAIL";
            }

        }
        System.out.println(" ROLLNumber   Marks   Percentage   Grade");
        for (int i = 0; i < 10; i++) {
            System.out.println("        " + rollNos[i] + "     " + marks[i] + "       " + percentage[i] + "        " + grade[i]);

        }
    }
}

/*

 ROLLNumber   Marks   Percentage   Grade
        1     350       50.0        SECOND
        2     100       14.0        FAIL
        3     550       78.0        DIST
        4     600       85.0        DIST
        5     560       80.0        DIST
        6     700       100.0        DIST
        7     640       91.0        DIST
        8     400       57.0        SECOND
        9     590       84.0        DIST
        10     580       82.0        DIST
BUILD SUCCESSFUL (total time: 0 seconds)
 */
