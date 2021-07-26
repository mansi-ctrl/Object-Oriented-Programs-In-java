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
public class SalesMan {
    public static void main(String[] args) {
        double comm=25000;
        double intialAmount=0.01,commission=0;
        double  salesAmount=intialAmount;
        
        do {
            salesAmount+=0.01;
            if(salesAmount>=10000.01)
            {commission=5000*0.08 + 5000*0.1 +(salesAmount - 10000)*0.12;}
            else if (salesAmount>=5000.01)
            {commission =5000*0.08 + (salesAmount - 5000)*0.10;}
            else
                commission =salesAmount *0.08;
        }
            while (commission<comm);
        System.out.println("The sales amount $ "+ (int)(salesAmount*100)/100.0+" is needed to make a commission of $ "+comm);
    }
    
}


/*

The sales amount $ 210833.34 is needed to make a commission of $ 25000.0

*/