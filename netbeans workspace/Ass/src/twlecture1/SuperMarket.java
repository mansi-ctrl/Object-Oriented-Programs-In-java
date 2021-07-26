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
name :Mansi dobariya
AU1841131
Description:SuperMarket ,want to add update delete
*/
package twlecture1;

import java.util.*;

import java.util.Scanner;

class Item {

    public int itemno;
    public String name;
    public int price;

    Scanner in = new Scanner(System.in);

    Item(int no, String na, int price) {
        itemno = no;
        name = na;
        price = price;
    }

    void updateItemNo() {
        System.out.println("Enter your new ItemNo : ");
        int no = in.nextInt();
        itemno = no;
        System.out.println("Successfully updated. \n");
    }

    void updateName() {
        System.out.println("Enter new name of your item : ");
        String n = in.nextLine();
        name = n;
        System.out.println("Successfully updated. \n");
    }

    void updatePrice() {
        System.out.println("Enter new price of your item : ");
        int p = in.nextInt();
        price = p;
        System.out.println("Successfully updated. \n");
    }
}

public class SuperMarket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList();
        items.add(new Item(12, "tea", 50));
        items.add(new Item(2, "coffe", 60));
        int x = 0;
        do {
            System.out.println("\n");
            for (int i = 0; i < items.size(); i++) {
                System.out.println("[itemno. : " + items.get(i).itemno + ", name : " + items.get(i).name + ", price : " + items.get(i).price);
            }
            System.out.println("\n");
            int choice = menu();
            switch (choice) {
                case 1:
                    items.add(choice_1());
                    x = 0;
                    break;

                case 2:
                    System.out.println("Enter Item number which you want to delete : ");
                    int ino = in.nextInt();
                    for (int i = 0; i < items.size(); i++) {
                        if (items.get(i).itemno == ino) {
                            items.remove(i);
                            System.out.println("Successfully deleted.");
                            break;
                        }
                    }
                    ;
                    x = 0;
                    break;

                case 3:
                    System.out.println("Enter product number which you want ot update : ");
                    ino = in.nextInt();
                    for (int i = 0; i < items.size(); i++) {
                        if (items.get(i).itemno == ino) {
                            ino = i;
                            break;
                        }
                    }
                    System.out.println("1.Item No. \n2.Name of Item \n3.Price of Item\nWhich perameter you want to change : ");
                    int ch1 = in.nextInt();
                    switch (ch1) {
                        case 1:
                            items.get(ino).updateItemNo();
                            break;
                        case 2:
                            items.get(ino).updateName();
                            break;
                        case 3:
                            items.get(ino).updatePrice();
                    }
                    x = 0;
                    break;

                case 4:
                    System.out.println("Which way you want to search : \n1.by id\n2.by name\n3.by price");
                    int ch2 = in.nextInt();
                    switch (ch2) {
                        case 1:
                            System.out.println("Enter item number : ");
                            int id = in.nextInt();
                            for (int i = 0; i < items.size(); i++) {
                                if (items.get(i).itemno == id) {
                                    System.out.println("\n[itemno. : " + items.get(i).itemno + ", name : " + items.get(i).name + ", price : " + items.get(i).price);
                                    break;
                                }
                            }
                            break;

                        case 2:
                            System.out.println("Enter item name : ");
                            in.next();
                            String na = in.nextLine();
                            for (int i = 0; i < items.size(); i++) {
                                if (items.get(i).name.equals(na)) {
                                    System.out.println("\n[itemno. : " + items.get(i).itemno + ", name : " + items.get(i).name + ", price : " + items.get(i).price + "\n");
                                    break;
                                }
                            }

                        case 3:
                            System.out.println("Enter item price : ");
                            int pr = in.nextInt();
                            for (int i = 0; i < items.size(); i++) {
                                if (items.get(i).price == pr) {
                                    System.out.println("\n[itemno. : " + items.get(i).itemno + ", name : " + items.get(i).name + ", price : " + items.get(i).price + "\n");
                                }
                            }
                    }
                    break;

                default:
                    x++;
                    break;
            }
        } while (x != 1);
    }

    static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("1.insert\n2.delete\n3.update\n4.search\nEnter your choice : ");
        int c = in.nextInt();
        return c;
    }

    static Item choice_1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter item number : ");
        int no = in.nextInt();
        in.nextLine();
        System.out.println("Enter item name : ");
        String na = in.nextLine();
        System.out.println("Enter item prize : ");
        int pri = in.nextInt();
        return (new Item(no, na, pri));
    }
}
/*
run:


[itemno. : 12, name : tea, price : 0
[itemno. : 2, name : coffe, price : 0


1.insert
2.delete
3.update
4.search
Enter your choice : 
1
Enter item number : 
45
Enter item name : 
hbhj
Enter item prize : 
54


[itemno. : 12, name : tea, price : 0
[itemno. : 2, name : coffe, price : 0
[itemno. : 45, name : hbhj, price : 0


1.insert
2.delete
3.update
4.search
Enter your choice : 
3
Enter product number which you want ot update : 
tea
*/