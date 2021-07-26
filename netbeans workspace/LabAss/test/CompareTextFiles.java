/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class CompareTextFiles
{   
    public static void main(String[] args) throws IOException
    {   
        BufferedReader reader1 = new BufferedReader(new FileReader("F:\\sem1\\sem1-icp\\AU1841131_AU1841129_Real Astate property solutions\\project2.txt"));
         
        BufferedReader reader2 = new BufferedReader(new FileReader("F:\\sem1\\sem1-icp\\AU1841131_AU1841129_Real Astate property solutions\\project.txt"));
         
        String line1 = reader1.readLine();
         
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
        int lineNum = 1;
         
        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                 
                break;
            }
             
            line1 = reader1.readLine();
             
            line2 = reader2.readLine();
             
            lineNum++;
        }
         
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. They differ at line "+lineNum);
             
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
        }
         
        reader1.close();
         
        reader2.close();
    }
}