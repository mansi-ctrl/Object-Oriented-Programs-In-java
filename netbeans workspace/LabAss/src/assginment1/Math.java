
/*
Mansi Dobariya
AU1841131
*/
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mansi
 */
public class Math {
    public static void main(String[] args) 
    {
         int c=0;
        for (int i = 0; i < 5; i++) 
        {
            
            Random rand = new Random();
            int number1 = rand.nextInt(10);
            int number2 = rand.nextInt(10);

           

            int r = number1-number2;
            System.out.println("What is"+ number1+" - "+ number2 +"?");
            Scanner input=new Scanner(System.in);

            int answer = input.nextInt();
            if (r ==answer ) {
                c++;
            }

        }
        System.out.println("your score is : "+ c );
    }

  
}

/*
What is8 - 2?
 6
What is9 - 0?
9
What is6 - 0?
6
What is2 - 0?
2
What is0 - 8?
-8
your score is : 5
*/