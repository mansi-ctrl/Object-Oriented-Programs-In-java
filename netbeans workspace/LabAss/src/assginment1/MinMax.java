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
public class MinMax {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("input is not there");
            return;
        }
        int m = Integer.parseInt(args[0]);

        for (String arg : args) {
            if (Integer.parseInt(arg) > m) {
                m = Integer.parseInt(arg);
            }
        }
        System.out.println("max is " + m);

        int n = Integer.parseInt(args[0]);
        for (String arg : args) {
            if (Integer.parseInt(arg) < n) {
                n = Integer.parseInt(arg);
            }
        }
        System.out.println("min is " + n);

//        int a=Integer.parseInt(args[0]);
//        int b=Integer.parseInt(args[1]);
//        int c=Integer.parseInt(args[2]);
//        if (a>b && a>c){
//            System.out.println("A is large number ");
//        }
//        else if(b>a && b>c){
//            System.out.println("B is large number");
//        }
//        else{
//            System.out.println("Cis large number");
//        }
    }
}

/*

F:\ooplab\netbeans workspace\tw1\ans3\src>java MinMax 58 96 100 -5 -150
max is 100
min is -150
*/