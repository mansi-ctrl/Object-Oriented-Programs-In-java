/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twlecture1;
/*
name :Mansi dobariya
AU1841131
description:complex number add,sub
*/
import java.util.Scanner;

/**
 *
 * @author mansi
 */
public class ComplexNumber {

    int realPart1;
    int imaginaryPart1;
    int realPart2;
    int imaginaryPart2;

    public ComplexNumber(int realPart1,
            int imaginaryPart1,
            int realPart2, int imaginaryPart2) {
        this.realPart1 = realPart1;
        this.imaginaryPart1 = imaginaryPart1;

        this.realPart2 = realPart2;
        this.imaginaryPart2 = imaginaryPart2;
        System.out.println(realPart1 + "+" + "i" + imaginaryPart1);
        System.out.println(realPart2 + "+" + "i" + imaginaryPart2);

    }

    ComplexNumber() {
        realPart1 = 54;
        imaginaryPart1 = -25;
        realPart2 = 25;
        imaginaryPart2 = 45;

        System.out.println((realPart1) + "+" + "i" + (imaginaryPart1));
        System.out.println((realPart2) + "+" + "i" + (imaginaryPart2));

    }

    public void addSub() {
        int realpart00 = realPart1 + realPart2;
        int imaginarypart01 = imaginaryPart1 + imaginaryPart2;
        int realpart10 = realPart1 - realPart2;
        int imaginarypart11 = imaginaryPart1 - imaginaryPart2;
        System.out.println("Addition : " + (realpart00) + "+" + "i" + (imaginarypart01));
        System.out.println("Subtraction : " + (realpart10) + "+" + "i" + (imaginarypart11));

    }
}

class ComplexTest {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        c1.addSub();
        ComplexNumber c2 = new ComplexNumber(44, 62, 23, 31);
        c2.addSub();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter RealPart of number1:");
        int a = s.nextInt();
        System.out.println("Enter ImaginaryPart of number1:");
        int b = s.nextInt();
        System.out.println("Enter RealPart of number2:");
        int c = s.nextInt();
        System.out.println("Enter ImaginaryPart of number2:");
        int d = s.nextInt();
        ComplexNumber c3 = new ComplexNumber(a, b, c, d);
        c3.addSub();

    }
}
/*
run:
54+i-25
25+i45
Addition : 79+i20
Subtraction : 29+i-70
44+i62
23+i31
Addition : 67+i93
Subtraction : 21+i31
Enter RealPart of number1:
45
Enter ImaginaryPart of number1:
56
Enter RealPart of number2:
12
Enter ImaginaryPart of number2:
54
45+i56
12+i54
Addition : 57+i110
Subtraction : 33+i2
BUILD SUCCESSFUL (total time: 10 seconds)

*/