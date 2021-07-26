/*
Mansi Dobariya
AU1841131
*/
import java.util.Scanner;

public class SortingByCities{
        public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names of cities you want to enter:");
        n = s.nextInt();
        
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names of cities in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println(names[i] + ",");
        }
        System.out.println(names[n - 1]);
    }

}

/*
Enter number of names of cities you want to enter:5
Enter all the names:
surat
ahmedabad
bharuch
delhi
goa
Names of cities in Sorted Order:
ahmedabad,
bharuch,
delhi,
goa,
surat
*/