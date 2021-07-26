
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class GuessNum {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            
        
        Random rand= new Random();
        int value=rand.nextInt(100);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value:");
        int val=input.nextInt();
        
        if(value==val)
        {
            System.out.println("Input is matched");
            
        } else{
            
        if(val>50){
        
            System.out.println("It's too high");
    } else
        {System.out.println("It's too low");
}
        }
    }
        
    }
}