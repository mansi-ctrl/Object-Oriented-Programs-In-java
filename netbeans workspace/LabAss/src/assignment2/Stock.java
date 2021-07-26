/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
/*name:mansi
RollNo:AU1841131
Description: a Java program that defines the stock 

*/
/**
 *
 * @author mansi
 */
public class Stock {
   String symbol;
   String name;
   double  previousPrice;
   double   currentPrice;

    @Override
    public String toString() {
        return "Stock{" + "symbol=" + symbol + ", name=" + name + ", previousPrice=" + previousPrice + ", currentPrice=" + currentPrice + '}';
    }

    public Stock(String symbol, String name, double previousPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousPrice = previousPrice;
        this.currentPrice = currentPrice;
    }
    public float  getChangePercent(){
       return  (float) (((currentPrice - previousPrice)/previousPrice)*100);
    }
    
}
class StockTest{
    public static void main(String[] args) {
        Stock s=new Stock("RIL","Reliance Industries",1050.5,1150.5);
        System.out.println("the price-change percentage"+s.getChangePercent());
        System.out.println(s.toString());
    }
    
}

/*
run:
the price-change percentage9.519277
Stock{symbol=RIL, name=Reliance Industries, previousPrice=1050.5, currentPrice=1150.5}
BUILD SUCCESSFUL (total time: 2 seconds)

*/