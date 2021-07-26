/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
/*
Name:Mansi Dobariya
AU1841131

*/
import java.util.Scanner;

/**
 *
 * @author mansi
 */
class Detail {

    String name;
    String add;
    String telno;
    int rent;

    public Detail(String name, String add, String telno, int rent) {
        this.name = name;
        this.add = add;
        this.telno = telno;
        this.rent = rent;
    }

    void show() {
        System.out.println("Name :" + name+" \n"
                + "Address :" + add +" \n"+ "Telephone Number :" + telno+" \n"
                + "Rent per Month :" + rent);
    }

}

class Bill extends Detail {

    int n, amt;
    int pay;

    public Bill(String name, String add,String telno, int rent,int N, int Amt) {
          super(name,add,telno,rent);
          n=N;
          amt=Amt;
       }

//    public Bill(String name, String add,String telno, int rent) {
//        super(name, add, telno, rent);
//    }
    void cal() {
        if (n <= 1 && n >= 100) {

        } else if (n <= 101 && n >= 200) {
            n = 2 * n;
        } else if (n <= 201 && n >= 300) {
            n = 3 * n;
        } else {
            n = 5 * n;
        }
        pay = (n*amt) + rent;
        System.out.println(n*amt+""+rent);
                 System.out.println(" Total Payment is :" + pay);

    }

    
    @Override
    void show() {
        super.show();
         System.out.println(" Total Payment is :" + pay);

          }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String a = input.nextLine();
        System.out.println("Enter Address :");
        String b = input.nextLine();
        System.out.println("Enter Telephone Number :");
        String c = input.nextLine();
        //int c=input.nextInt();
        //System.out.println(c);
        System.out.println("Rent of month :");
        int d = input.nextInt();
        System.out.println("Numbers of calls :");
        int e = input.nextInt();
        System.out.println("Amount :");
        int f = input.nextInt();
      // Detail detail = new Detail( a, b, c, d);
       Bill bill= new  Bill(a,b,c,d,e,f);
       bill.cal();
       bill.show();
       
//detail.show();
//detail.cal();
//bill.show();
//detail.show();
    }

}

/*
Mansi
Output:
run:
Enter name: 
vfyhgku
Enter Address :
rfc
Enter Telephone Number :
656841
Rent of month :
1
Numbers of calls :
1
Amount :
1
Name :vfyhgku 
Address :rfc 
Telephone Number :656841 
Rent per Month :1
 Total Payment is :6
BUILD SUCCESSFUL (total time: 18 seconds)

*/
