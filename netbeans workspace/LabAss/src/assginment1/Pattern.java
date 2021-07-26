/*
Mansi Dobariya
AU1841131
*/
import java.util.Scanner;

public class Pattern{
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int n = s.nextInt();
        int space;
        int i, j;
        space = n - 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;

        for (i = 1; i <= n - 1; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

/*
Enter number of rows
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/