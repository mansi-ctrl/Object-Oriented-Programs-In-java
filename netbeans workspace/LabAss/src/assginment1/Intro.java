/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class Intro {

    public static void main(String[] args) {
        int a = 10;
        short b = 1;
        long c = 100;
        float d = 2.5f;
        double e = 5.55;
        String f = "124563";
        boolean g = true;
        char h = 'c';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //type convertion
        System.out.println("float to int " + (int) d);
        System.out.println("double to  float " + (float) e);
        System.out.println("string to int " + Integer.parseInt(f));
        System.out.println("string to float " + Float.parseFloat(f));
        System.out.println("Int to string " + String.valueOf(a));
//        System.out.println("Float to string " String.valueOf(d));
    }

}
/*
run:
10
1
100
2.5
5.55
124563
true
c
float to int 2
double to  float 5.55
string to int 124563
string to float 124563.0
Int to string 10
 */
